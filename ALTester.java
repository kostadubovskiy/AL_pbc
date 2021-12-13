import java.util.ArrayList;

public class ALTester {
  ArrayList<Integer> _data = new ArrayList<Integer>(23);
  int _size;
   public ALTester () {
     for (Object i : _data) {
       i = Math.random() * 100;
     }
   }

   public boolean isSorted () {
     boolean sorted = true;
     for (int i = 0; i < _data.size(); i++) {
       if (_data.get(i) > _data.get(i+1)) {
         sorted = false;
       }
     }
     return sorted;
   }

}
