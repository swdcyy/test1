package kuaishou.perf.util.reflect.RefConstructors;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.reflect.Constructor;

public class RefConstructors	// class@001d0a
{
    public Constructor[] mCtors;

    public void RefConstructors(Class p0,Field p1){
       super();
       Constructor[] declaredCons = p0.getDeclaredConstructors();
       this.mCtors = declaredCons;
       int len = declaredCons.length;
       int i = 0;
       while (i < len) {
          object oobject = declaredCons[i];
          if (oobject != null && !oobject.isAccessible()) {
             oobject.setAccessible(true);
          }
          i = i + 1;
       }
       return;
    }
    public Constructor[] get(){
       return this.mCtors;
    }
}
