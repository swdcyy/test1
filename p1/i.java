package p1.i;
import p1.h;
import java.lang.Object;
import android.graphics.Typeface;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.String;

public class i extends h	// class@0028a0
{

    public void i(){
       super();
    }
    public Typeface k(Object p0){
       try{
          Object obj = Array.newInstance(this.g, 1);
          Array.set(obj, 0, p0);
          Object[] objArray = new Object[]{obj,"sans-serif",Integer.valueOf(-1),Integer.valueOf(-1)};
          return this.m.invoke(null, objArray);
       }catch(java.lang.IllegalAccessException e6){
       }catch(java.lang.reflect.InvocationTargetException e6){
       }
       throw new RuntimeException(e6);
    }
    public Method w(Class p0){
       Class[] uClassArray = new Class[]{Array.newInstance(p0, 1).getClass(),String.class,p0,p0};
       p0 = Integer.TYPE;
       Method declaredMeth = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", uClassArray);
       declaredMeth.setAccessible(1);
       return declaredMeth;
    }
}
