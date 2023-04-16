package bj8.e;
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
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;

public class e	// class@00037a
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
          e.a = uActivity.getMethod(str, uClassArray);
       }catch(java.lang.NoSuchMethodException e4){
          e4.printStackTrace();
       }
       try{
          Class[] uClassArray1 = new Class[i];
          uClassArray1[0] = Boolean.TYPE;
          e.b = uActivity.getMethod(str, uClassArray1);
       }catch(java.lang.NoSuchMethodException e0){
          e0.printStackTrace();
       }
       try{
          e.c = WindowManager$LayoutParams.class.getField("statusBarColor");
       }catch(java.lang.NoSuchFieldException e0){
          e0.printStackTrace();
       }
       try{
          e.d = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
       }catch(java.lang.NoSuchFieldException e0){
          e0.printStackTrace();
       }catch(java.lang.IllegalAccessException e0){
          e0.printStackTrace();
       }
    }
    public void e(){
       super();
    }
    public static boolean a(WindowManager$LayoutParams p0,String p1,boolean p2){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, e.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       try{
          Field declaredFiel = p0.getClass().getDeclaredField(p1);
          declaredFiel.setAccessible(true);
          int intx = declaredFiel.getInt(p0);
          Field declaredFiel1 = p0.getClass().getDeclaredField("meizuFlags");
          declaredFiel1.setAccessible(true);
          int intx1 = declaredFiel1.getInt(p0);
          if (p2) {
             intx = intx | intx1;
          label_0049 :
             if (intx1 != intx) {
                declaredFiel1.setInt(p0, intx);
                return true;
             }
          }else {
             intx = (~ intx) & intx1;
             goto label_0049 ;
          }
       }catch(java.lang.NoSuchFieldException e7){
          e7.printStackTrace();
       }catch(java.lang.IllegalAccessException e7){
          e7.printStackTrace();
       }catch(java.lang.IllegalArgumentException e7){
          e7.printStackTrace();
       }
       return false;
    }
    public static void b(Window p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, uoe, "7")) {
          return;
       }
       try{
          WindowManager$LayoutParams attributes = p0.getAttributes();
          Field c = e.c;
          if (c != null && c.getInt(attributes) != p1) {
             e.c.set(attributes, Integer.valueOf(p1));
             p0.setAttributes(attributes);
          }
       }catch(java.lang.IllegalAccessException e4){
          e4.printStackTrace();
       }
       return;
    }
    public static void c(Activity p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoe, "4")) {
          return;
       }
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.TRUE, null, e.class, "9")) {
          Method b = e.b;
          if (b != null) {
             int i = 1;
             try{
                Object[] objArray = new Object[i];
                objArray[0] = Boolean.valueOf(p1);
                b.invoke(p0, objArray);
             }catch(java.lang.IllegalAccessException e7){
                e7.printStackTrace();
             }catch(java.lang.reflect.InvocationTargetException e7){
                e7.printStackTrace();
             }
          }else {
             e.e(p0.getWindow(), p1);
          }
       }
    }
    public static void d(View p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoe, "6")) {
          return;
       }
       int systemUiVisi = p0.getSystemUiVisibility();
       int i = (p1)? e.d | systemUiVisi: (~ e.d) & systemUiVisi;
       if (i != systemUiVisi) {
          p0.setSystemUiVisibility(i);
       }
       return;
    }
    public static void e(Window p0,boolean p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoe, "8")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          e.a(p0.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", p1);
       }else {
          View decorView = p0.getDecorView();
          if (decorView != null) {
             e.d(decorView, p1);
             e.b(p0, 0);
          }
       }
       return;
    }
}
