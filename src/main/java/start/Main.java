package start;
import entity.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

/**
 * теперь внедрили зависимость внутри других зависимостей
 * computer->musicPlayer->classicalMusicAndRockMusic
 * внедрение зависимостей идет в правильном порядкеЛ
 */
        Computer computer=context.getBean("computer",Computer.class);
        System.out.println(computer);

//MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
//musicPlayer.playMusic();

      // ClassicalMusic classicalMusic=context.getBean("classicalMusic",ClassicalMusic.class);

//
//        MusicPlayer musicPlayer=new MusicPlayer(classicalMusic);
//        musicPlayer.playMusic();
//
//        RockMusic rockMusic=context.getBean("rockMusic", RockMusic.class);
//        MusicPlayer musicPlayer1=new MusicPlayer(rockMusic);
//        musicPlayer1.playMusic();



        context.close();



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


