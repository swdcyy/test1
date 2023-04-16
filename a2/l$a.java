package a2.l$a;
import android.view.View;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.ReflectiveOperationException;
import a2.l;
import java.lang.Object;
import android.graphics.Rect;
import a2.l$b;
import p1.b;
import java.lang.IllegalAccessException;

public class l$a	// class@00007a
{
    public static Field a;
    public static Field b;
    public static Field c;
    public static boolean d;

    static {
       try{
          Field declaredFiel = View.class.getDeclaredField("mAttachInfo");
          l$a.a = declaredFiel;
          declaredFiel.setAccessible(true);
          Class uClass = Class.forName("android.view.View$AttachInfo");
          Field declaredFiel1 = uClass.getDeclaredField("mStableInsets");
          l$a.b = declaredFiel1;
          declaredFiel1.setAccessible(true);
          declaredFiel = uClass.getDeclaredField("mContentInsets");
          l$a.c = declaredFiel;
          declaredFiel.setAccessible(true);
          l$a.d = true;
       }catch(java.lang.ReflectiveOperationException e0){
          e0.getMessage();
       }
    }
    public static l a(View p0){
       if (l$a.d && p0.isAttachedToWindow()) {
          View rootView = p0.getRootView();
          try{
             Rect obj = l$a.a.get(rootView);
             if (obj != null) {
                Rect rect = l$a.b.get(obj);
                obj = l$a.c.get(obj);
                if (rect != null && obj != null) {
                   l$b uob = new l$b();
                   uob.b(b.c(rect));
                   uob.c(b.c(obj));
                   l ol = uob.a();
                   ol.k(ol);
                   ol.d(p0.getRootView());
                   return ol;
                }
             }
          }catch(java.lang.IllegalAccessException e4){
             e4.getMessage();
          }
       }
    }
}
