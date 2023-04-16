package kuaishou.perf.util.reflect.RefDouble;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.String;
import java.lang.Exception;

public class RefDouble	// class@001d0b
{
    public Field mField;

    public void RefDouble(Class p0,Field p1){
       super();
       Field declaredFiel = p0.getDeclaredField(p1.getName());
       this.mField = declaredFiel;
       declaredFiel.setAccessible(true);
    }
    public double get(Object p0){
       try{
          return this.mField.getDouble(p0);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public void set(Object p0,double p1){
       try{
          this.mField.setDouble(p0, p1);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
}
