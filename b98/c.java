package b98.c;
import b98.a;
import android.view.Window;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import android.view.WindowManager$LayoutParams;
import java.lang.reflect.Constructor;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.Throwable;

public class c extends a	// class@00031f
{

    public void c(){
       super();
    }
    public void c(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       Log.g("FullScreenFit", "huawei applyO");
       WindowManager$LayoutParams attributes = p0.getAttributes();
       try{
          Class uClass = Class.forName("com.huawei.android.view.LayoutParamsEx");
          Class[] uClassArray = new Class[]{WindowManager$LayoutParams.class};
          Object[] objArray = new Object[]{attributes};
          Class[] uClassArray1 = new Class[]{Integer.TYPE};
          Object[] objArray1 = new Object[]{Integer.valueOf(0x10000)};
          uClass.getMethod("addHwFlags", uClassArray1).invoke(uClass.getConstructor(uClassArray).newInstance(objArray), objArray1);
       }catch(java.lang.Exception e8){
          Log.j("FullScreenFit", e8);
       }
       return;
    }
    public void e(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       Log.g("FullScreenFit", "disApplyO applyO");
       WindowManager$LayoutParams attributes = p0.getAttributes();
       try{
          Class uClass = Class.forName("com.huawei.android.view.LayoutParamsEx");
          Class[] uClassArray = new Class[]{WindowManager$LayoutParams.class};
          Object[] objArray = new Object[]{attributes};
          Class[] uClassArray1 = new Class[]{Integer.TYPE};
          Object[] objArray1 = new Object[]{Integer.valueOf(0x10000)};
          uClass.getMethod("clearHwFlags ", uClassArray1).invoke(uClass.getConstructor(uClassArray).newInstance(objArray), objArray1);
       }catch(java.lang.Exception e8){
          Log.j("FullScreenFit", e8);
       }
       return;
    }
}
