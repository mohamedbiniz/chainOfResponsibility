public class Confirmation implements OrderHandler {
    private OrderHandler nextHandler;
    public void nextHandler(OrderHandler handler) {
        this.nextHandler=handler;
    }

    public void HandleRequest(ActionHandler request) {
        if("confirmation".equalsIgnoreCase(request.getAction())){
            System.out.println("your order has been ordred successfuly ");
        }else{
            nextHandler.HandleRequest(request);
        }
    }
}
