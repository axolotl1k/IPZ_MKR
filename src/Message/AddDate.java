package Message;

public class AddDate extends MessageDecorator{
    private String date;
    public AddDate(Msg decoratedMessage, String date) {
        super(decoratedMessage);
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString() + " " + date;
    }

    @Override
    public void sendMessage() {
        System.out.println("Повідомлення " + super.toString() + " " + date + " було успішно надіслано.");
    }
    @Override
    public void getFullDescription() {
        super.getFullDescription();
        System.out.println("+До повідомлення додано дато");
    }
}
