package kuaishou.perf.util.reflect.RefStaticInt;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.String;

public class RefStaticInt	// class@001d11
{
    public Field mField;

    public void RefStaticInt(Class p0,Field p1){
       super();
       Field declaredFiel = p0.getDeclaredField(p1.getName());
       this.mField = declaredFiel;
       declaredFiel.setAccessible(true);
    }
    public int get(){
       try{
          return this.mField.getInt(null);
       }catch(java.lang.Exception e0){
          return 0;
       }
    }
    public void set(int p0){
       try{
          this.mField.setInt(null, p0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
