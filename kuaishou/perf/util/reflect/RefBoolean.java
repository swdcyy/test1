package kuaishou.perf.util.reflect.RefBoolean;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.String;
import java.lang.Exception;

public class RefBoolean	// class@001d07
{
    public Field mField;

    public void RefBoolean(Class p0,Field p1){
       super();
       Field declaredFiel = p0.getDeclaredField(p1.getName());
       this.mField = declaredFiel;
       declaredFiel.setAccessible(true);
    }
    public boolean get(Object p0){
       try{
          return this.mField.getBoolean(p0);
       }catch(java.lang.Exception e0){
          return false;
       }
    }
    public void set(Object p0,boolean p1){
       try{
          this.mField.setBoolean(p0, p1);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
}
