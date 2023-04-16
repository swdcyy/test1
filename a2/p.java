package a2.p;
import android.view.MenuItem;
import a2.b;
import t1.b;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public final class p	// class@000095
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;

    public static MenuItem a(MenuItem p0,b p1){
       b uob;
       if (p0 instanceof b) {
          uob = p0.a(p1);
       }
       return uob;
    }
    public static void b(MenuItem p0,char p1,int p2){
       if (p0 instanceof b) {
          p0.setAlphabeticShortcut(p1, p2);
       }else if(Build$VERSION.SDK_INT >= 26){
          p0.setAlphabeticShortcut(p1, p2);
       }
       return;
    }
    public static void c(MenuItem p0,CharSequence p1){
       if (p0 instanceof b) {
          p0.setContentDescription(p1);
       }else if(Build$VERSION.SDK_INT >= 26){
          p0.setContentDescription(p1);
       }
       return;
    }
    public static void d(MenuItem p0,ColorStateList p1){
       if (p0 instanceof b) {
          p0.setIconTintList(p1);
       }else if(Build$VERSION.SDK_INT >= 26){
          p0.setIconTintList(p1);
       }
       return;
    }
    public static void e(MenuItem p0,PorterDuff$Mode p1){
       if (p0 instanceof b) {
          p0.setIconTintMode(p1);
       }else if(Build$VERSION.SDK_INT >= 26){
          p0.setIconTintMode(p1);
       }
       return;
    }
    public static void f(MenuItem p0,char p1,int p2){
       if (p0 instanceof b) {
          p0.setNumericShortcut(p1, p2);
       }else if(Build$VERSION.SDK_INT >= 26){
          p0.setNumericShortcut(p1, p2);
       }
       return;
    }
    public static void g(MenuItem p0,CharSequence p1){
       if (p0 instanceof b) {
          p0.setTooltipText(p1);
       }else if(Build$VERSION.SDK_INT >= 26){
          p0.setTooltipText(p1);
       }
       return;
    }
}
