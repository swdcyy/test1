package lv8.h;
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
import java.lang.reflect.InvocationTargetException;
import android.view.Window;
import android.os.Build$VERSION;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalArgumentException;

public class h	// class@002db2
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
          h.a = uActivity.getMethod(str, uClassArray);
       }catch(java.lang.NoSuchMethodException e4){
          e4.printStackTrace();
       }
       try{
          Class[] uClassArray1 = new Class[i];
          uClassArray1[0] = Boolean.TYPE;
          h.b = uActivity.getMethod(str, uClassArray1);
       }catch(java.lang.NoSuchMethodException e0){
          e0.printStackTrace();
       }
       try{
          h.c = WindowManager$LayoutParams.class.getField("statusBarColor");
       }catch(java.lang.NoSuchFieldException e0){
          e0.printStackTrace();
       }
       try{
          h.d = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);
       }catch(java.lang.NoSuchFieldException e0){
          e0.printStackTrace();
       }catch(java.lang.IllegalAccessException e0){
          e0.printStackTrace();
       }
    }
    public static void a(Activity p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oh, "1")) {
          return;
       }
       if (!PatchProxy.isSupport(oh) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.TRUE, null, h.class, "6")) {
          Method b = h.b;
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
             h.d(p0.getWindow(), p1);
          }
       }
    }
    public static void b(View p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oh, "3")) {
          return;
       }
       int systemUiVisi = p0.getSystemUiVisibility();
       int i = (p1)? h.d | systemUiVisi: (~ h.d) & systemUiVisi;
       if (i != systemUiVisi) {
          p0.setSystemUiVisibility(i);
       }
       return;
    }
    public static void c(Window p0,int p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oh, "4")) {
          return;
       }
       try{
          WindowManager$LayoutParams attributes = p0.getAttributes();
          Field c = h.c;
          if (c != null && c.getInt(attributes) != p1) {
             h.c.set(attributes, Integer.valueOf(p1));
             p0.setAttributes(attributes);
          }
       }catch(java.lang.IllegalAccessException e4){
          e4.printStackTrace();
       }
       return;
    }
    public static void d(Window p0,boolean p1){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, oh, "5")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          h.e(p0.getAttributes(), "MEIZU_FLAG_DARK_STATUS_BAR_ICON", p1);
       }else {
          View decorView = p0.getDecorView();
          if (decorView != null) {
             h.b(decorView, p1);
             h.c(p0, 0);
          }
       }
       return;
    }
    public static boolean e(WindowManager$LayoutParams p0,String p1,boolean p2){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, h.class, "2");
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
}
