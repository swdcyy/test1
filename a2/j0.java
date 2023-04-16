package a2.j0;
import android.os.Build$VERSION;
import android.view.ViewConfiguration;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import android.content.Context;
import java.lang.Object;
import java.lang.Integer;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;

public final class j0	// class@000074
{
    public static Method a;

    static {
       try{
          if (Build$VERSION.SDK_INT == 25) {
             Class[] uClassArray = new Class[0];
             j0.a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", uClassArray);
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static float a(ViewConfiguration p0,Context p1){
       TypedValue typedValue;
       if (Build$VERSION.SDK_INT >= 25) {
          Method a = j0.a;
          if (a != null) {
             int i = 0;
             try{
                Object[] objArray = new Object[i];
                return (float)a.invoke(p0, objArray).intValue();
             }catch(java.lang.Exception e0){
             }
          }
       }
    }
    public static float b(ViewConfiguration p0,Context p1){
       if (Build$VERSION.SDK_INT >= 26) {
          return p0.getScaledHorizontalScrollFactor();
       }
       return j0.a(p0, p1);
    }
    public static int c(ViewConfiguration p0){
       if (Build$VERSION.SDK_INT >= 28) {
          return p0.getScaledHoverSlop();
       }
       return (p0.getScaledTouchSlop() / 2);
    }
    public static int d(ViewConfiguration p0){
       return p0.getScaledPagingTouchSlop();
    }
    public static float e(ViewConfiguration p0,Context p1){
       if (Build$VERSION.SDK_INT >= 26) {
          return p0.getScaledVerticalScrollFactor();
       }
       return j0.a(p0, p1);
    }
    public static boolean f(ViewConfiguration p0,Context p1){
       if (Build$VERSION.SDK_INT >= 28) {
          return p0.shouldShowMenuShortcutsWhenKeyboardPresent();
       }
       Resources resources = p1.getResources();
       int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
       boolean b = (identifier && resources.getBoolean(identifier))? true: false;
       return b;
    }
}
