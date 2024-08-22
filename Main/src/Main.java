class Boy{
    public Boy(){}
    public Boy(int ...x){}
}
class Main{
    public static void main(String[] args) {
        Boy b1 = new Boy(10,20);
        Boy b2 = new Boy(10,20,30,40,50,60);
    }
}