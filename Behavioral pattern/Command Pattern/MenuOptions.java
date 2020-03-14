public class MenuOptions implements ActionListenerCommand{  
   private Document doc;  
   public MenuOptions(Document doc) {  
        this.doc = doc;  
    }  
    public MenuOptions(ActionListenerCommand clickOpen, ActionListenerCommand clickSave) {
	// TODO Auto-generated constructor stub
}
	@Override  
    public void execute() {  
        doc.save();  
    }
	public void clickOpen() {
		// TODO Auto-generated method stub
		
	}
	public void clickSave() {
		// TODO Auto-generated method stub
		
	}  
}  
