package lk.ijse;

public class Boy implements IF{
    Agrement agrement = new Girl();

    public void chatwithGirl(){
       //Agrement agrement = new Girl();
        agrement.chat();
    }
    public void test(){
       // Agrement agrement= new Girl();
        agrement.chat();
    }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.inject(new Girl());
        boy.chatwithGirl();
    }

    @Override
    public void inject(Agrement a) {

    }
}
