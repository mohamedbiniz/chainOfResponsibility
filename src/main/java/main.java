public class main {
    public static void main(String[] args) {
        OrderHandler r1=new ProductSelection();
        OrderHandler r2=new Registration();
        OrderHandler r3=new BillingInfo();
        OrderHandler r4=new Payement();
        OrderHandler r5=new Confirmation();

        r1.nextHandler(r2);
        r2.nextHandler(r3);
        r3.nextHandler(r4);
        r4.nextHandler(r5);

        ActionHandler action=new ActionHandler("selectionproduct");
        r1.HandleRequest(action);
        action=new ActionHandler("registration");
        r1.HandleRequest(action);
        action=new ActionHandler("BillingInfo");
        r1.HandleRequest(action);

        action=new ActionHandler("payement");
        r1.HandleRequest(action);

        action=new ActionHandler("confirmation");
        r1.HandleRequest(action);


    }
}
