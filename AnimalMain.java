class AnimalMain{
    public static void main(String args[]){
        Animal a=new Animal();
        System.out.println("Animal contain legs="+(a.legs=4));
        System.out.println("Animal make sounds like="+(a.sound="bark"));
        System.out.println("Animal color="+(a.color="black"));
        a.eat();
        a.sleep();
    }
}