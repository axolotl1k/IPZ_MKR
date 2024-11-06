import Message.*;

public class Main {
    public static void main(String[] args) {
        Msg message = new Message("Hello World");
        sout(message);

        Msg decoratedMessage1 = new Compressor(message);
        sout(decoratedMessage1);

        Msg decoratedMessage2 = new Coder(decoratedMessage1, 4);
        sout(decoratedMessage2);

        Msg decoratedMessage3 = new AddDate(decoratedMessage2, "06.11.2024");
        sout(decoratedMessage3);

        Msg decoratedMessage4 = new FullName(decoratedMessage3);
        sout(decoratedMessage4);
    }
    static void sout(Msg msg){
        System.out.println(msg);
        msg.sendMessage();
        msg.getFullDescription();
        System.out.println();
    }
}
