package entity;

public class ClassicalMusic implements Music{

    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
        //если скоуп по умолчанию или примо указан синглтон то спринг вызовет его один раз!
    }

    public void initMethod(){
        System.out.println("init is running!");
    }

    public void destroyMethod(){
        System.out.println("destroy is running");
    }

    @Override
    public String getSong() {
        return "Classical music";
    }
}
