package ekd.i;
import android.app.Activity;
import android.view.Window;
import android.view.View;
import android.os.Build$VERSION;
import com.yxcorp.utility.RomUtils;
import ekd.o0;
import android.content.Context;
import com.yxcorp.utility.n;
import java.lang.Exception;
import android.view.ViewParent;
import android.view.WindowManager$LayoutParams;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.lang.reflect.Method;

public class i	// class@000d52
{

    public static void a(Activity p0,int p1,boolean p2){
       int i;
       Window window = p0.getWindow();
       View view = i.d(window);
       i = 1280;
       if (Build$VERSION.SDK_INT >= 23) {
          window.clearFlags(0x4000000);
          window.addFlags(Integer.MIN_VALUE);
          if (p2) {
             i = 9472;
             if (RomUtils.q()) {
                i.f(p0, true);
             }else if(RomUtils.o()){
                o0.c(p0, true);
             }
          }
       }
       if (view != null) {
          view.setSystemUiVisibility(i);
       }
       window.setStatusBarColor(p1);
       window.setNavigationBarColor(window.getNavigationBarColor());
       return;
    }
    public static void b(Context p0,View p1){
       p1.setPadding(p1.getPaddingLeft(), n.A(p0), p1.getPaddingRight(), p1.getPaddingBottom());
    }
    public static boolean c(){
       boolean b = (Build$VERSION.SDK_INT >= 23)? true: false;
       return b;
    }
    public static View d(Window p0){
       View decorView;
       try{
          decorView = p0.getDecorView();
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          decorView = null;
       }
       if (decorView != null) {
          return decorView;
       }
       View view = p0.findViewById(0x1020002);
       while (view != null && view.getParent() instanceof View) {
          view = view.getParent();
       }
       return view;
    }
    public static boolean e(Activity p0){
       int i;
       boolean b = false;
       if (i.c()) {
          i = 1280;
          View view = i.d(p0.getWindow());
          if (view != null && (view.getSystemUiVisibility() & i) == i) {
             int i1 = ((p0.getWindow().getAttributes().flags & 1024) == 1024)? 1: 0;
             if (!i1) {
                b = true;
             }
          }
       }
       return b;
    }
    public static boolean f(Activity p0,boolean p1){
       int i;
       Class class = p0.getWindow().getClass();
       try{
          i = 0;
          Class uClass = Class.forName("android.view.MiuiWindowManager$LayoutParams");
          int intx = uClass.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(uClass);
          Class[] uClassArray = new Class[2];
          Class tYPE = Integer.TYPE;
          uClassArray[i] = tYPE;
          uClassArray[1] = tYPE;
          Method method = class.getMethod("setExtraFlags", uClassArray);
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
    public static void g(Activity p0,int p1){
       Window window = p0.getWindow();
       if (Build$VERSION.SDK_INT >= 23) {
          View view = i.d(window);
          if (view != null) {
             view.setSystemUiVisibility(8192);
          }
       }
       window.clearFlags(0x4000000);
       window.addFlags(Integer.MIN_VALUE);
       if (RomUtils.q()) {
          i.f(p0, true);
       }else if(RomUtils.o()){
          o0.c(p0, true);
       }
       window.setStatusBarColor(p1);
       return;
    }
    public static void h(Activity p0,int p1,boolean p2){
       i.i(p0, p1, p2, true);
    }
    public static void i(Activity p0,int p1,boolean p2,boolean p3){
       if (!i.c()) {
          return;
       }
       i.a(p0, p1, p2);
       if (!p3) {
          View view = p0.findViewById(0x1020002);
          if (view != null) {
             view.setPadding(0, n.A(p0), 0, 0);
          }
       }
       return;
    }
    public static void j(Activity p0,View p1,boolean p2){
       if (i.c()) {
          i.i(p0, 0, p2, true);
          p1.setTranslationY((float)n.A(p0));
       }
       return;
    }
}
