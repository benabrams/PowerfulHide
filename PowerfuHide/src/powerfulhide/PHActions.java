package powerfulhide;

public interface PHActions{
   //inventory, environ, and gui implement actions
   public void getItem();
   public void moveSelf();
   public void pushAction(); //use item on ... use object i.e close door
   public void selfAction(); //apply action to self
   public void pullAction();
   public void examine();
}