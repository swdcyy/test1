package a2.u0$a;
import android.view.View;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.ReflectiveOperationException;
import a2.u0;
import java.lang.Object;
import android.graphics.Rect;
import a2.u0$b;
import p1.b;
import java.lang.IllegalAccessException;

public class u0$a	// class@0000ab
{
    public static Field a;
    public static Field b;
    public static Field c;
    public static boolean d;

    static {
       try{
          Field declaredFiel = View.class.getDeclaredField("mAttachInfo");
          u0$a.a = declaredFiel;
          declaredFiel.setAccessible(true);
          Class uClass = Class.forName("android.view.View$AttachInfo");
          Field declaredFiel1 = uClass.getDeclaredField("mStableInsets");
          u0$a.b = declaredFiel1;
          declaredFiel1.setAccessible(true);
          declaredFiel = uClass.getDeclaredField("mContentInsets");
          u0$a.c = declaredFiel;
          declaredFiel.setAccessible(true);
          u0$a.d = true;
       }catch(java.lang.ReflectiveOperationException e0){
          e0.getMessage();
       }
    }
    public static u0 a(View p0){
       if (u0$a.d && p0.isAttachedToWindow()) {
          View rootView = p0.getRootView();
          try{
             Rect obj = u0$a.a.get(rootView);
             if (obj != null) {
                Rect rect = u0$a.b.get(obj);
                obj = u0$a.c.get(obj);
                if (rect != null && obj != null) {
                   u0$b uob = new u0$b();
                   uob.c(b.c(rect));
                   uob.d(b.c(obj));
                   u0 ou0 = uob.a();
                   ou0.t(ou0);
                   ou0.d(p0.getRootView());
                   return ou0;
                }
             }
          }catch(java.lang.IllegalAccessException e4){
             e4.getMessage();
          }
       }
    }
}
