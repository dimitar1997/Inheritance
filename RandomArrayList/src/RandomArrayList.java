import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayList<T>  extends ArrayList <T>{
   private Random rnd;

    public RandomArrayList() {
        this.rnd = new Random();
    }

    public Object getRandomElements(){
       int index = this.rnd.nextInt(super.size());
       Object element = super.get(index);
       super.remove(index);
       return element;
   }
}
