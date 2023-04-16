package e2.b;
import android.widget.CompoundButton;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Object;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public final class b	// class@001ed1
{
    public static Field a;
    public static boolean b;

    public static Drawable a(CompoundButton p0){
       boolean b;
       Field a;
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getButtonDrawable();
       }
       if (!b.b) {
          b = true;
          try{
             Field declaredFiel = CompoundButton.class.getDeclaredField("mButtonDrawable");
             b.a = declaredFiel;
             declaredFiel.setAccessible(b);
             b.b = e0;
          }catch(java.lang.NoSuchFieldException e0){
          }
       }
    }
    public static void b(CompoundButton p0,ColorStateList p1){
       p0.setButtonTintList(p1);
    }
    public static void c(CompoundButton p0,PorterDuff$Mode p1){
       p0.setButtonTintMode(p1);
    }
}
