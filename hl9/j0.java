package hl9.j0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import ek9.m1;
import java.lang.Exception;
import q87.c;

public class j0	// class@0026d3
{

    public void j0(){
       super();
    }
    public static void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, j0.class, "1")) {
          return;
       }
       if (Build$VERSION.SDK_INT > 22) {
          return;
       }
       int i = 0;
       try{
          Field declaredFiel = Class.forName("android.text.TextLine").getDeclaredField("sCached");
          declaredFiel.setAccessible(true);
          Object obj = declaredFiel.get(objArray);
          if (obj != null) {
             int length = Array.getLength(obj);
             for (int i1 = 0; i1 < length; i1 = i1 + 1) {
                Array.set(obj, i1, objArray);
             }
          }
       }catch(java.lang.Exception e1){
          Object[] objArray1 = new Object[i];
          m1.C().t("TextLineCacheLeakUtils", e1.getMessage(), objArray1);
       }
       return;
    }
}
