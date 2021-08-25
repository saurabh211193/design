interface Broker {
    void Trade();
}
public class Stock {
    double rate;
    Broker broker;
    void SetBroker(Broker broker) {
        this.broker = broker;
    }
    public void changeRate(double newRate) {
        rate = newRate;
        //if(condition)
        broker.trade();
    }
}

public class Stock {
    double rate;
    Function trade;
    void SetBroker(Function trade) {
        this.trade = trade;
    }
    public void changeRate(double newRate) {
        rate = newRate;
        //if(condition)
        trade();
    }
}
