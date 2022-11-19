public enum MessageFactory {

    MESSAGE_ONE {
        @Override
        public MessageOne getInstance() {
            return new MessageOne(MESSAGE_ONE.name());
        }

    },
    MESSAGE_TWO {
        @Override
        public MessageTwo getInstance() {
            return new MessageTwo(MESSAGE_TWO.name());
        }

    };

    abstract AbstractMessage getInstance();

    public static AbstractMessage getMessage(String messageType) {
        return MessageFactory.valueOf(messageType).getInstance();
    }

    public static void main(String[] args) {
        String messageType = "MESSAGE_ONE"; // Input variable

        AbstractMessage abstractMessage = MessageFactory.getMessage(messageType);

        if (abstractMessage instanceof MessageOne) {
            System.out.println("MessageOne instance");
        } else if (abstractMessage instanceof MessageTwo) {
            System.out.println("MessageTwo instance");
        }

        abstractMessage.init("init");
        abstractMessage.execute();
    }
}