public enum Cost {

    Aeroplanes (20000),

    Buses (2000),

    Cars (1000),

    Dhows (100),

    Ferries (12000),

    Ships (22000),

    machinery (6000);

    public final int rates

    private Cost(int rates){
        this.cost=rates;
    }
}