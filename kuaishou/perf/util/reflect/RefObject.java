package kuaishou.perf.util.reflect.RefObject;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.String;
import java.lang.Exception;

public class RefObject	// class@001d10
{
    public Field mField;

    public void RefObject(Class p0,Field p1){
       super();
       Field declaredFiel = p0.getDeclaredField(p1.getName());
       this.mField = declaredFiel;
       declaredFiel.setAccessible(true);
    }
    public Object get(Object p0){
       try{
          return this.mField.get(p0);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public void set(Object p0,Object p1){
       try{
          this.mField.set(p0, p1);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
}
