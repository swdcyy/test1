package bl.h;
import bl.p;
import bl.g;
import java.lang.reflect.Constructor;
import java.lang.Object;
import java.lang.AssertionError;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import java.lang.reflect.InvocationTargetException;

public class h implements p	// class@0002f6
{
    public final Constructor a;
    public final g b;

    public void h(g p0,Constructor p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public Object a(){
       String str = "Failed to invoke ";
       Object[] objArray = null;
       try{
          return this.a.newInstance(objArray);
       }catch(java.lang.InstantiationException e2){
          throw new RuntimeException(str+this.a+v0, e2);
       }catch(java.lang.reflect.InvocationTargetException e2){
          throw new RuntimeException(str+this.a+v0, e2.getTargetException());
       }catch(java.lang.IllegalAccessException e0){
          throw new AssertionError(e0);
       }
    }
}
