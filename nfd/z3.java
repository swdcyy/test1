package nfd.z3;
import java.lang.Object;
import android.view.Window;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.lang.reflect.Method;
import java.lang.Exception;
import android.view.View;
import android.os.Build$VERSION;
import com.yxcorp.utility.RomUtils;
import ekd.o0;

public class z3	// class@001e2e
{

    public void z3(){
       super();
    }
    public static boolean a(Window p0,boolean p1){
       Class obj;
       int i;
       z3 oz3 = z3.class;
       if (PatchProxy.isSupport(oz3)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, oz3, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p0.getClass();
       try{
          i = 0;
          Class uClass = Class.forName("android.view.MiuiWindowManager$LayoutParams");
          int intx = uClass.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(uClass);
          Class[] uClassArray = new Class[2];
          Class tYPE = Integer.TYPE;
          uClassArray[i] = tYPE;
          uClassArray[1] = tYPE;
          Method method = obj.getMethod("setExtraFlags", uClassArray);
          Object[] objArray = new Object[2];
          int i1 = (p1)? intx: 0;
          objArray[i] = Integer.valueOf(i1);
          objArray[1] = Integer.valueOf(intx);
          method.invoke(p0, objArray);
          return 1;
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          return i;
       }
    }
    public static void b(Window p0,boolean p1){
       z3 oz3 = z3.class;
       if (PatchProxy.isSupport(oz3) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oz3, "1")) {
          return;
       }
       View decorView = p0.getDecorView();
       int i = 1280;
       if (Build$VERSION.SDK_INT >= 23) {
          p0.clearFlags(0x4000000);
          p0.addFlags(Integer.MIN_VALUE);
          if (p1) {
             i = 9472;
             if (RomUtils.q()) {
                z3.a(p0, true);
             }else if(RomUtils.o()){
                o0.e(p0, true);
             }
          }
       }
       if (decorView != null) {
          decorView.setSystemUiVisibility(i);
       }
       p0.setStatusBarColor(0);
       return;
    }
}
