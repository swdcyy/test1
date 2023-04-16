package a5.o$a;
import java.util.Comparator;
import a5.o;
import java.lang.Object;
import z1.e;
import java.lang.Float;

public class o$a implements Comparator	// class@0000ef
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       float f = p0.b.floatValue();
       float f1 = p1.b.floatValue();
       if (f1 - f > 0) {
          i = 1;
       }else if(f - f1 > 0){
          i = -1;
       }else {
          i = 0;
       }
       return i;
    }
}
