package b98.e;
import b98.a;
import android.view.Window;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.Throwable;

public class e extends a	// class@000321
{

    public void e(){
       super();
    }
    public void c(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       String str = "xiaomi applyO";
       try{
          Log.g("FullScreenFit", str);
          Class[] uClassArray = new Class[]{Integer.TYPE};
          Object[] objArray = new Object[]{Integer.valueOf(1792)};
          Window.class.getMethod("addExtraFlags", uClassArray).invoke(p0, objArray);
       }catch(java.lang.Exception e8){
          Log.j("FullScreenFit", e8);
       }
       return;
    }
    public void e(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       String str = "xiaomi disApplyO";
       try{
          Log.g("FullScreenFit", str);
          Class[] uClassArray = new Class[]{Integer.TYPE};
          Object[] objArray = new Object[]{Integer.valueOf(1792)};
          Window.class.getMethod("clearExtraFlags ", uClassArray).invoke(p0, objArray);
       }catch(java.lang.Exception e8){
          Log.j("FullScreenFit", e8);
       }
       return;
    }
}
