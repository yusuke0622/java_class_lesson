class Main {
    
   public static void main(String[] args) {
    Turtle turtleA = new Turtle();
    turtleA.name = "かめじろう";
    Turtle turtleB = new Turtle();
    turtleB.name = "かめたろう";
    // かめじろうのbiteメソッドを実行し、かめじろうのhpを10減少させる
    turtleA.bite(turtleB);
    // かめたろうのbiteメソッド3回を実行し、かめたろうのhpを30減少させる
    turtleB.bite(turtleA);
    turtleB.bite(turtleA);
    turtleB.bite(turtleA);
    // かめじろうのsayNameAndHpメソッドを実行する
    turtleA.sleep();
    //　かめたろう、かめじろうのHp確認
    turtleA.sayNameAndHp();
    turtleB.sayNameAndHp();
   }

}