package Message;

public class FullName extends MessageDecorator{
    private String fullName = " ПІБ: Слюсар Олександр Андрійович";
    public FullName(Msg decoratedMessage) {
        super(decoratedMessage);
    }

    @Override
    public String toString() {
        return super.toString() + fullName;
    }
    @Override
    public void sendMessage() {
        System.out.println("Повідомлення " + super.toString() + fullName + " було успішно надіслано.");
    }
    @Override
    public void getFullDescription() {
        super.getFullDescription();
        System.out.println("+До повідомлення додано ПІБ");
    }
}
