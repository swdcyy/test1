package kuaishou.perf.util.reflect.RefLong;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.String;
import java.lang.Exception;

public class RefLong	// class@001d0e
{
    public Field mField;

    public void RefLong(Class p0,Field p1){
       super();
       Field declaredFiel = p0.getDeclaredField(p1.getName());
       this.mField = declaredFiel;
       declaredFiel.setAccessible(true);
    }
    public long get(Object p0){
       try{
          return this.mField.getLong(p0);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public void set(Object p0,long p1){
       try{
          this.mField.setLong(p0, p1);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
}
