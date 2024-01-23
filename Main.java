public class Main {
    public static void main(String[] args) {
        point p1= new point(1,2);
        point p2= new point(3,4);
        point p3= new point(5,6);
        point p4= new point(7,7);

        line l1= new line  (p1,p2);
        line l2= new line (p3,p4);

        System.out.println("length of line l1:"+l1.length);
        System.out.println("length of line l2:"+l2.length);

        if(l1.length> l2.length)
        {
            System.out.println("l1 is bigger then l2");
        } else if (l2.length> l1.length)
        {
            System.out.println("l2 is bigger than l1");

        }
        else if (l1.length == l2.length)
        {
            System.out.println("l1 and l2 is equal;");
        }


    }
}