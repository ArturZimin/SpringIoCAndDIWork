package entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;


    /**
     *Внедрили 2 зависимости с помощью конструктора
     */
    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic,RockMusic rockMusic){
        this.classicalMusic=classicalMusic;
        this.rockMusic=rockMusic;
    }


    /**
     * внедрение с помощью поля без конструктора и сеттера (Spring using reflection API)
     */
   // @Autowired
    //private Music music;


    /**
     * внедрение спомощью конструктора
     * @param music
     */
  //  @Autowired
//    public MusicPlayer(Music music){
//        this.music=music;
//    }


    /**
     * внедрение с помощью setter
     */
//    @Autowired
//    public void setMusic(Music music){
//        this.music=music;
//    }


    public String playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
        return "Playing: "+ classicalMusic.getSong();
    }
}
