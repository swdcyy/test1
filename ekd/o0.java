package ekd.o0;
import android.app.Activity;
import java.lang.Class;
import java.lang.Integer;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.NoSuchMethodException;
import java.lang.Boolean;
import android.view.WindowManager$LayoutParams;
import java.lang.reflect.Field;
import java.lang.NoSuchFieldException;
import android.view.View;
import java.lang.Object;
import java.lang.IllegalAccessException;
import java.lang.IllegalArgumentException;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;

public class o0	// class@000d65
{
    public static Method a;
    public static Method b;
    public static Field c;
    public static int d;

    static {
       String str = "setStatusBarDarkIcon";
       Activity uActivity = Activity.class;
       int i = 1;
       try{
          Class[] uClassArray = new Class[i];
          uClassArray[0] = Integer.TYPE;
          o0.a = uActivity.getMethod(str, uClassArray);
       }catch(java.lang.NoSuchMethodException e4){
          e4.printStackTrace();
       }
       try{
          Class[] uClassArray1 = new Class[i];
          uClassArray1[0] = Boolean.TYPE;
          o0.b = uActivity.getMethod(str, uClassArray1);
       }catch(java.lang.NoSuchMethodException e0){
          e0.printStackTrace();
       }
       try{
          o0.c = WindowManager$LayoutParams.class.getField("statusBarColor");
       }catch(java.lang.NoSuchFieldException e0){
          e0.printStackTrace();
       }
       try{
          o0.d = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
       }catch(java.lang.NoSuchFieldException e0){
          e0.printStackTrace();
       }catch(java.lang.IllegalAccessException e0){
          e0.printStackTrace();
       }
    }
    public static boolean a(WindowManager$LayoutParams p0,String p1,boolean p2){
       try{
          Field declaredFiel = p0.getClass().getDeclaredField(p1);
          declaredFiel.setAccessible(true);
          int intx = declaredFiel.getInt(p0);
          Field declaredFiel1 = p0.getClass().getDeclaredField("meizuFlags");
          declaredFiel1.setAccessible(true);
          int intx1 = declaredFiel1.getInt(p0);
          if (p2) {
             intx = intx | intx1;
          label_0027 :
             if (intx1 != intx) {
                declaredFiel1.setInt(p0, intx);
                return true;
             }
          }else {
             intx = (~ intx) & intx1;
             goto label_0027 ;
          }
       }catch(java.lang.NoSuchFieldException e3){
          e3.printStackTrace();
       }catch(java.lang.IllegalAccessException e3){
          e3.printStackTrace();
       }catch(java.lang.IllegalArgumentException e3){
          e3.printStackTrace();
       }
       return false;
    }
    public static void b(Window p0,int p1){
       try{
          WindowManager$LayoutParams attributes = p0.getAttributes();
          Field c = o0.c;
          if (c != null && c.getInt(attributes) != p1) {
             o0.c.set(attributes, Integer.valueOf(p1));
             p0.setAttributes(attributes);
          }
       }catch(java.lang.IllegalAccessException e2){
          e2.printStackTrace();
       }
       return;
    }
    public static void c(Activity p0,boolean p1){
       Method b = o0.b;
       if (b != null) {
          int i = 1;
          try{
             Object[] objArray = new Object[i];
             objArray[0] = Boolean.valueOf(p1);
             b.invoke(p0, objArray);
          }catch(java.lang.IllegalAccessException e3){
             e3.printStackTrace();
          }catch(java.lang.reflect.InvocationTargetException e3){
             e3.printStackTrace();
          }
       }else {
          o0.e(p0.getWindow(), p1);
       }
    }
    public static void d(View p0,boolean p1){
       int systemUiVisi = p0.getSystemUiVisibility();
       int i = (p1)? o0.d | systemUiVisi: (~ o0.d) & systemUiVisi;
       if (i != systemUiVisi) {
          p0.setSystemUiVisibility(i);
       }
       return;
    }
    public static void e(Window p0,boolean p1){
       if (Build$VERSION.SDK_INT < 23) {
          o0.a(p0.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", p1);
       }else {
          View decorView = p0.getDecorView();
          if (decorView != null) {
             o0.d(decorView, p1);
             o0.b(p0, 0);
          }
       }
       return;
    }
}
