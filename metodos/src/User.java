public class User {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeDown();
        smartTv.volumeUp();;
        System.out.println("current Volume : " + smartTv.volume);
        
        System.out.println("TV on ? " + smartTv.on);
        System.out.println("current Channel : " + smartTv.channel);
        System.out.println("current Volume : " + smartTv.volume);

        smartTv.on();
        System.out.println("New Status -> TV on ? " + smartTv.on);
        smartTv.off();
        System.out.println("New Status -> TV off ? " + smartTv.on);
    }
}
