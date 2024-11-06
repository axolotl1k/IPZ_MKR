package Message;

public class Coder extends MessageDecorator{
    private StringBuilder codedMessage;
    public Coder(Msg decoratedMessage, int shift) {
        super(decoratedMessage);
        codedMessage = new StringBuilder();
        for (char ch : decoratedMessage.toString().toCharArray()) {
            codedMessage.append((char) (ch + shift));
        }
    }

    @Override
    public String toString() {
        return codedMessage.toString();
    }
    @Override
    public void sendMessage() {
        System.out.println("Закодоване повідомлення " + codedMessage.toString() + " було успішно надіслано.");
    }
    @Override
    public void getFullDescription() {
        super.getFullDescription();
        System.out.println("+Повідомлення зашифровано");
    }
}
