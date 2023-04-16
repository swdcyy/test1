package kuaishou.perf.util.reflect.RefStaticObject;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.String;
import java.lang.Exception;

public class RefStaticObject	// class@001d13
{
    public Field mField;

    public void RefStaticObject(Class p0,Field p1){
       super();
       Field declaredFiel = p0.getDeclaredField(p1.getName());
       this.mField = declaredFiel;
       declaredFiel.setAccessible(true);
    }
    public Object get(){
       Object obj = null;
       try{
          obj = this.mField.get(obj);
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return obj;
    }
    public void set(Object p0){
       try{
          this.mField.set(null, p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
    public Class type(){
       return this.mField.getType();
    }
}
