package lk.ijse;

public class Boy {
    public void chatwithGirl(){
       Agrement agrement = new Girl();
        agrement.chat();
    }
    public void test(){
        Agrement agrement= new Girl();
        agrement.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatwithGirl();
    }
}
