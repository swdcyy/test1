package j75.b;
import java.lang.Object;
import android.database.Cursor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.Closeable;
import java.io.Flushable;

public class b	// class@0019aa
{

    public void b(){
       super();
    }
    public static void a(Cursor p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          return;
       }
       try{
          if (p0 != null) {
             p0.close();
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void b(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       try{
          if (p0 != null) {
             if (p0 instanceof Flushable) {
                try{
                   p0.flush();
                }catch(java.lang.Exception e0){
                }
             }
             p0.close();
          }
       }catch(java.lang.Exception e0){
       }
    }
}
