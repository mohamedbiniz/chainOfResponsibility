public class Payement  implements OrderHandler {
    private OrderHandler nextHandler;
    public void nextHandler(OrderHandler handler) {
        this.nextHandler=handler;
    }

    public void HandleRequest(ActionHandler request) {
        if("payement".equalsIgnoreCase(request.getAction())){
            System.out.println("Pay your order");
        }else{
            nextHandler.HandleRequest(request);
        }
    }
}
