
class Turtle {
    public String name;
    public int hp = 50;
    public int attackPoint = 10;
    
    public void sayNameAndHp() {
        System.out.println("私の名前は" + this.name + "です");
        System.out.println("現在の体力は" + this.hp + "です");
    }

    public void sleep() {
        this.hp += 10;
    }

    public void bite(Turtle turtle) {
        turtle.hp -= this.attackPoint;
    }
    
 }