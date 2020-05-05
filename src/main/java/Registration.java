public class Registration implements OrderHandler {
    private OrderHandler nextHandler;
    public void nextHandler(OrderHandler handler) {
        this.nextHandler=handler;
    }

    public void HandleRequest(ActionHandler request) {
        if("registration".equalsIgnoreCase(request.getAction())){
            System.out.println("Register product from Registration");
        }else{
            nextHandler.HandleRequest(request);
        }
    }
}
