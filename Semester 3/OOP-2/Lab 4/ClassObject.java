class B{
    int fun(int height, int width){
        return height*width;
    }
}

public class ClassObject {
    public static void main(String[] args) {
        //ClassObject object = new ClassObject();
        
        B obj = new B();
        
        System.out.println(obj.fun(40,50));
        
    }
}
