package bj8.a;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import android.view.Window;
import android.os.Build$VERSION;
import zi8.w0;
import bj8.e;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.Exception;
import android.content.Context;
import zi8.m1;

public class a	// class@000376
{

    public void a(){
       super();
    }
    public static void a(Activity p0,int p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, a.class, "8")) {
          return;
       }
       Window window = p0.getWindow();
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 1280;
       if (p2 && sDK_INT >= 23) {
          i = 9472;
          window.clearFlags(0x4000000);
          window.addFlags(Integer.MIN_VALUE);
          if (w0.e()) {
             a.b(p0, true);
          }else if(w0.d()){
             e.c(p0, true);
          }
       }
       window.getDecorView().setSystemUiVisibility(i);
       window.setStatusBarColor(p1);
       window.setNavigationBarColor(window.getNavigationBarColor());
       return;
    }
    public static boolean b(Activity p0,boolean p1){
       Class obj;
       int i;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "10");
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
    public static void c(Activity p0,int p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), null, a.class, "4")) {
          return;
       }
       a.d(p0, p1, p2, true);
       return;
    }
    public static void d(Activity p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, a.class, "7")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          p0.getWindow().addFlags(Integer.MIN_VALUE);
          p0.getWindow().addFlags(0x4000000);
          return;
       }else {
          a.a(p0, p1, p2);
          if (!p3) {
             p0.findViewById(0x1020002).setPadding(0, m1.o(p0), 0, 0);
          }
          return;
       }
    }
}
