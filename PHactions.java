public interface PHactions{
   //inventory, environ, and gui implement actions
   public static void getItem();
   public static void moveSelf();
   public static void use(); //use item on ... use object i.e close door
   public static void selfAction(); //apply action to self
   public static void examine();
}