package Message;

public class Compressor extends MessageDecorator{
    private String compressedMessage;
    public Compressor(Msg decoratedMessage) {
        super(decoratedMessage);
        compressedMessage = decoratedMessage.toString().replaceAll("\\s+", "");
    }

    @Override
    public String toString() {
        return compressedMessage.toString();
    }
    @Override
    public void sendMessage() {
        System.out.println("Стиснуте повідомлення " + compressedMessage.toString() + " було успішно надіслано.");
    }
    @Override
    public void getFullDescription() {
        super.getFullDescription();
        System.out.println("+Повідомлення стиснуто");
    }
}
