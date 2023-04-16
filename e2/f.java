package e2.f;
import android.widget.PopupWindow;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Integer;
import java.lang.reflect.Method;
import android.view.View;

public final class f	// class@001ed5
{
    public static Method a;
    public static boolean b;
    public static Method c;
    public static boolean d;
    public static Field e;
    public static boolean f;

    public static void a(PopupWindow p0,boolean p1){
       Field e;
       try{
          if (Build$VERSION.SDK_INT >= 23) {
             p0.setOverlapAnchor(p1);
          }else if(!f.f){
             boolean b = true;
             try{
                Field declaredFiel = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f.e = declaredFiel;
                declaredFiel.setAccessible(b);
                f.f = e0;
             }catch(java.lang.NoSuchFieldException e0){
             }
          }
       label_0029 :
          return;
       }catch(java.lang.IllegalAccessException e0){
       }
    }
    public static void b(PopupWindow p0,int p1){
       Object[] objArray;
       if (Build$VERSION.SDK_INT >= 23) {
          p0.setWindowLayoutType(p1);
          return;
       }else {
          int i = 1;
          if (!f.b) {
             try{
                Class[] uClassArray = new Class[i];
                uClassArray[0] = Integer.TYPE;
                Method declaredMeth = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", uClassArray);
                f.a = declaredMeth;
                declaredMeth.setAccessible(i);
                f.b = i;
             }catch(java.lang.Exception e0){
             }
          }
       }
    }
    public static void c(PopupWindow p0,View p1,int p2,int p3,int p4){
       p0.showAsDropDown(p1, p2, p3, p4);
    }
}
