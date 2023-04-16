package l1.b$c;
import java.lang.Runnable;
import java.lang.Object;
import l1.b;
import java.lang.Boolean;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.RuntimeException;
import java.lang.String;

public class b$c implements Runnable	// class@0024ee
{
    public final Object b;
    public final Object c;

    public void b$c(Object p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void run(){
       try{
          Method d = b.d;
          int i = 1;
          int i1 = 0;
          int i2 = 2;
          if (d != null) {
             Object[] objArray = new Object[]{this.c,Boolean.FALSE,"AppCompat recreation"};
             d.invoke(this.b, objArray);
          }else {
             Object[] objArray1 = new Object[i2];
             objArray1[i1] = this.c;
             objArray1[i] = Boolean.FALSE;
             b.e.invoke(this.b, objArray1);
          }
       label_004b :
          return;
       }catch(java.lang.RuntimeException e0){
          if (e0.getClass() == RuntimeException.class && (e0.getMessage() == null || !(e0.getMessage()).startsWith("Unable to stop"))) {
             goto label_004b ;
          }else {
             throw e0;
          }
       }
    }
}
