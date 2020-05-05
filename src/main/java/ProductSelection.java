public class ProductSelection implements OrderHandler {
    private OrderHandler nextHandler;
    public void nextHandler(OrderHandler handler) {
        this.nextHandler=handler;
    }

    public void HandleRequest(ActionHandler request) {
         if("selectionProduct".equalsIgnoreCase(request.getAction())){
             System.out.println("Select product from ProductSelection");
         }else{
             nextHandler.HandleRequest(request);
         }
    }
}
