package kuaishou.perf.util.reflect.RefFloat;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.String;
import java.lang.Exception;

public class RefFloat	// class@001d0c
{
    public Field mField;

    public void RefFloat(Class p0,Field p1){
       super();
       Field declaredFiel = p0.getDeclaredField(p1.getName());
       this.mField = declaredFiel;
       declaredFiel.setAccessible(true);
    }
    public float get(Object p0){
       try{
          return this.mField.getFloat(p0);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public void set(Object p0,float p1){
       try{
          this.mField.setFloat(p0, p1);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
}
