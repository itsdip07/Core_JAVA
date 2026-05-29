class Cofee {
    public static void cofee_details(String cofee_name, int cost, int quentity) {
        System.out.println("The cofee name is : " + cofee_name);
        System.out.println("The cost of the cofee is :" + cost);
        System.out.println("Cofee Quentity : " + quentity);
    }
    public static void main(String[] args) {
        cofee_details("Black", 30, 1);
    }
}