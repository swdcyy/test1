package aa.b;
import ia.a;
import java.lang.Object;
import java.lang.Integer;

public class b implements a	// class@000109
{
    public int a;
    public int b;

    public void b(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public Object getItem(int p0){
       if (p0 >= 0 && p0 < this.getItemsCount()) {
          return Integer.valueOf((this.a + p0));
       }
       return Integer.valueOf(0);
    }
    public int getItemsCount(){
       return ((this.b - this.a) + 1);
    }
    public int indexOf(Object p0){
       try{
          return (p0.intValue() - this.a);
       }catch(java.lang.Exception e0){
          return -1;
       }
    }
}
