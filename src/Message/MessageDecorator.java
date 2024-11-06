package Message;

public abstract class MessageDecorator implements Msg{
    protected Msg decoratedMessage;

    public MessageDecorator(Msg decoratedMessage) {
        this.decoratedMessage = decoratedMessage;
    }

    @Override
    public String toString() {
        return decoratedMessage.toString();
    }

    @Override
    public void sendMessage() {
        decoratedMessage.sendMessage();
    }
    @Override
    public void getFullDescription() {
        decoratedMessage.getFullDescription();
    }
}
