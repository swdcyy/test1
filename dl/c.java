package dl.c;
import dl.b;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.lang.Long;
import java.lang.Boolean;
import com.google.gson.JsonIOException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class c extends b	// class@001e6e
{
    public final Object b;
    public final Field c;
    public static Class d;

    public void c(){
       Object obj;
       super();
       try{
          int i = 0;
          Class uClass = Class.forName("sun.misc.Unsafe");
          c.d = uClass;
          Field declaredFiel = uClass.getDeclaredField("theUnsafe");
          declaredFiel.setAccessible(true);
          obj = declaredFiel.get(i);
       }catch(java.lang.Exception e0){
          obj = e0;
       }
       this.b = obj;
       try{
          Field declaredFiel1 = AccessibleObject.class.getDeclaredField("override");
          this.c = e0;
          return;
       }catch(java.lang.NoSuchFieldException e0){
       }
    }
    public void b(AccessibleObject p0){
       int i = 0;
       if (this.b != null && this.c != null) {
          try{
             Class[] uClassArray = new Class[]{Field.class};
             Object[] objArray = new Object[]{this.c};
             Class[] uClassArray1 = new Class[]{Object.class,Long.TYPE,Boolean.TYPE};
             Object[] objArray1 = new Object[]{p0,Long.valueOf(c.d.getMethod("objectFieldOffset", uClassArray).invoke(this.b, objArray).longValue()),Boolean.TRUE};
             c.d.getMethod("putBoolean", uClassArray1).invoke(this.b, objArray1);
             i = 1;
          }catch(java.lang.Exception e0){
          }
       }
       if (!i) {
          try{
             p0.setAccessible(1);
          }catch(java.lang.SecurityException e0){
             throw new JsonIOException("Gson couldn\'t modify fields for "+p0+"\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e0);
          }
       }
       return;
    }
}
