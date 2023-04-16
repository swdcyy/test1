package androidx.core.graphics.drawable.a;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.graphics.drawable.InsetDrawable;
import q1.e;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.ColorFilter;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.Integer;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import q1.d;
import q1.g;

public final class a	// class@000717
{
    public static Method a;
    public static boolean b;
    public static Method c;
    public static boolean d;

    public static void a(Drawable p0,Resources$Theme p1){
       p0.applyTheme(p1);
    }
    public static boolean b(Drawable p0){
       return p0.canApplyTheme();
    }
    public static void c(Drawable p0){
       if (Build$VERSION.SDK_INT >= 23) {
          p0.clearColorFilter();
       }else {
          p0.clearColorFilter();
          if (p0 instanceof InsetDrawable) {
             a.c(p0.getDrawable());
          }else if(p0 instanceof e){
             a.c(p0.b());
          }else if(p0 instanceof DrawableContainer){
             DrawableContainer$DrawableContainerState constantStat = p0.getConstantState();
             if (constantStat != null) {
                int i = 0;
                int childCount = constantStat.getChildCount();
                while (i < childCount) {
                   Drawable child = constantStat.getChild(i);
                   if (child != null) {
                      a.c(child);
                   }
                   i = i + 1;
                }
             }
          }
       }
       return;
    }
    public static int d(Drawable p0){
       return p0.getAlpha();
    }
    public static ColorFilter e(Drawable p0){
       return p0.getColorFilter();
    }
    public static int f(Drawable p0){
       Method c;
       Object[] objArray;
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.getLayoutDirection();
       }
       if (!a.d) {
          boolean b = true;
          try{
             Class[] uClassArray = new Class[0];
             Method declaredMeth = Drawable.class.getDeclaredMethod("getLayoutDirection", uClassArray);
             a.c = declaredMeth;
             declaredMeth.setAccessible(b);
             a.d = e0;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public static void g(Drawable p0,Resources p1,XmlPullParser p2,AttributeSet p3,Resources$Theme p4){
       p0.inflate(p1, p2, p3, p4);
    }
    public static boolean h(Drawable p0){
       return p0.isAutoMirrored();
    }
    public static void i(Drawable p0){
       p0.jumpToCurrentState();
    }
    public static void j(Drawable p0,boolean p1){
       p0.setAutoMirrored(p1);
    }
    public static void k(Drawable p0,float p1,float p2){
       p0.setHotspot(p1, p2);
    }
    public static void l(Drawable p0,int p1,int p2,int p3,int p4){
       p0.setHotspotBounds(p1, p2, p3, p4);
    }
    public static boolean m(Drawable p0,int p1){
       Object[] objArray;
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.setLayoutDirection(p1);
       }
       if (!a.b) {
          try{
             Class[] uClassArray = new Class[]{Integer.TYPE};
             Method declaredMeth = Drawable.class.getDeclaredMethod("setLayoutDirection", uClassArray);
             a.a = declaredMeth;
             declaredMeth.setAccessible(1);
             a.b = true;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
    }
    public static void n(Drawable p0,int p1){
       p0.setTint(p1);
    }
    public static void o(Drawable p0,ColorStateList p1){
       p0.setTintList(p1);
    }
    public static void p(Drawable p0,PorterDuff$Mode p1){
       p0.setTintMode(p1);
    }
    public static Drawable q(Drawable p0){
       if (p0 instanceof e) {
          p0 = p0.b();
       }
       return p0;
    }
    public static Drawable r(Drawable p0){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0;
       }
       if (!p0 instanceof d) {
          return new g(p0);
       }
       return p0;
    }
}
