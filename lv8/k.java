package lv8.k;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import android.content.Context;
import lv8.c;
import android.os.Build$VERSION;
import com.kwai.robust.PatchProxyResult;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.Exception;
import ca7.o;
import lv8.h;

public class k	// class@002db5
{

    public static void a(Activity p0,int p1,boolean p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, k.class, "1")) {
          return;
       }
       k.b(p0, p1, p2, true);
       return;
    }
    public static void b(Activity p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, k.class, "2")) {
          return;
       }
       if (!k.c()) {
          return;
       }
       k.e(p0, p1, p2);
       if (!p3) {
          p0.findViewById(0x1020002).setPadding(0, c.a(p0), 0, 0);
       }
       return;
    }
    public static boolean c(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
    public static boolean d(Activity p0,boolean p1){
       Class obj;
       int i;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, ok, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p0.getWindow().getClass();
       try{
          i = 0;
          Class uClass = Class.forName("android.view.MiuiWindowManager$LayoutParams");
          int intx = uClass.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(uClass);
          Class[] uClassArray = new Class[2];
          Class tYPE = Integer.TYPE;
          uClassArray[i] = tYPE;
          uClassArray[1] = tYPE;
          Method method = obj.getMethod("setExtraFlags", uClassArray);
          Window window = p0.getWindow();
          Object[] objArray = new Object[2];
          int i1 = (p1)? intx: 0;
          objArray[i] = Integer.valueOf(i1);
          objArray[1] = Integer.valueOf(intx);
          method.invoke(window, objArray);
          return 1;
       }catch(java.lang.Exception e8){
          e8.printStackTrace();
          return i;
       }
    }
    public static void e(Activity p0,int p1,boolean p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, k.class, "3")) {
          return;
       }
       Window window = p0.getWindow();
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 1280;
       if (p2 && sDK_INT >= 23) {
          i = 9472;
          window.clearFlags(0x4000000);
          window.addFlags(Integer.MIN_VALUE);
          if (o.c()) {
             k.d(p0, true);
          }else if(o.b()){
             h.a(p0, true);
          }
       }
       window.getDecorView().setSystemUiVisibility(i);
       window.setStatusBarColor(p1);
       window.setNavigationBarColor(window.getNavigationBarColor());
       return;
    }
}
