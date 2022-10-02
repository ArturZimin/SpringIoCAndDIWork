package start;
import entity.ClassicalMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import entity.MusicPlayer;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );


        ClassicalMusic classicalMusic=context.getBean("musicBean",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());



        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer musicPlayer = new MusicPlayer(music);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean compare=musicPlayer==musicPlayer2;
//
//        System.out.println(compare);
//
//        System.out.println(musicPlayer);
//        System.out.println(musicPlayer2);
//        musicPlayer2.setVolume(100);
//        System.out.println(musicPlayer.getVolume());
//        System.out.println(musicPlayer2.getVolume());
//
//        musicPlayer.playMusic();
//
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}


