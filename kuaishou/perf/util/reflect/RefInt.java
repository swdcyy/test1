package kuaishou.perf.util.reflect.RefInt;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.String;
import java.lang.Exception;

public class RefInt	// class@001d0d
{
    public Field mField;

    public void RefInt(Class p0,Field p1){
       super();
       Field declaredFiel = p0.getDeclaredField(p1.getName());
       this.mField = declaredFiel;
       declaredFiel.setAccessible(true);
    }
    public int get(Object p0){
       try{
          return this.mField.getInt(p0);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public void set(Object p0,int p1){
       try{
          this.mField.setInt(p0, p1);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
       }
       return;
    }
}
