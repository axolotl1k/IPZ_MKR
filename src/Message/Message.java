package Message;

public class Message implements Msg{
    private String msg;

    public Message(String msg) {
        this.msg = msg;
    }
    @Override
    public String toString(){
        return msg;
    }
    @Override
    public void sendMessage(){
        System.out.println("Повідомлення " + msg + " було успішно надіслано.");
    }

    @Override
    public void getFullDescription() {
        System.out.println("Звичайне повідомлення");
    }
}
