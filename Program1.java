class Program1 extends ConsoleProgram {

   /**
  * Saying happy birthday to anyone
  * @author: Simon
  */
  
  public void run(){
    String sreCelebrant;
    sreCelebrant = readLine("Whose birthday is it today?");
    happy();
    happy();
    dear(sreCelebrant);
    happy();
}

  private void happy(){
    System.out.println("Happy Birthday to you!");
  }

  private void dear(String strName){
    System.out.println("Happy Birthday dear " + strName + "!");
  }

}
