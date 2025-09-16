 interface playable {
    void play();
    
}
class Guitar implements playable{
    public void play(){
        System.out.println("Playing Guitar");
    }
}
class Piano implements playable{
    public void play(){
        System.out.println("Playing Piano");
    }
}   public class Interface {

    
    public static void main(String[] args) {
        playable obj = new Guitar();
        obj.play();
        obj = new Piano();
        obj.play();
    }
}
