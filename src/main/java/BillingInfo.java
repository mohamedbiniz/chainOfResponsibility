public class BillingInfo implements OrderHandler {
    private OrderHandler nextHandler;
    public void nextHandler(OrderHandler handler) {
        this.nextHandler=handler;
    }

    public void HandleRequest(ActionHandler request) {
        if("BillingInfo".equalsIgnoreCase(request.getAction())){
            System.out.println("Enter billing information ");
        }else{
            nextHandler.HandleRequest(request);
        }
    }
}