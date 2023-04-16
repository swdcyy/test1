package ck.k;
import android.content.Context;
import java.lang.String;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import w0.x;

public final class k	// class@000d2e
{
    public static final int[] a;
    public static final int[] b;

    static {
       int[] ointArray = new int[]{0x7f04021c};
       k.a = ointArray;
       int[] ointArray1 = new int[]{0x7f04021e};
       k.b = ointArray1;
    }
    public static void a(Context p0){
       k.e(p0, k.a, "Theme.AppCompat");
    }
    public static void b(Context p0,AttributeSet p1,int p2,int p3){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.I5, p2, p3);
       typedArray.recycle();
       if (typedArray.getBoolean(1, false)) {
          k.c(p0);
       }
       k.a(p0);
       return;
    }
    public static void c(Context p0){
       k.e(p0, k.b, "Theme.MaterialComponents");
    }
    public static void d(Context p0,AttributeSet p1,int[] p2,int p3,int p4,int[] p5){
       boolean i;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.I5, p3, p4);
       boolean b = false;
       if (!typedArray.getBoolean(2, b)) {
          typedArray.recycle();
          return;
       }else if(p5 == null || !p5.length){
          i = -1;
          if (typedArray.getResourceId(b, i) != i) {
             b = 1;
          }
          i = b;
       }else {
          i = k.f(p0, p1, p2, p3, p4, p5);
       }
       typedArray.recycle();
       if (i) {
          return;
       }else {
          throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents \(or a descendant\).");
       }
    }
    public static void e(Context p0,int[] p1,String p2){
       if (k.g(p0, p1)) {
          return;
       }
       throw new IllegalArgumentException("The style on this component requires your app theme to be "+p2+" \(or a descendant\).");
    }
    public static boolean f(Context p0,AttributeSet p1,int[] p2,int p3,int p4,int[] p5){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, p2, p3, p4);
       int len = p5.length;
       p3 = 0;
       while (true) {
          if (p3 < len) {
             if (typedArray.getResourceId(p5[p3], -1) == -1) {
                break ;
             }else {
                p3++;
             }
          }else {
             typedArray.recycle();
             return true;
          }
       }
       typedArray.recycle();
       return false;
    }
    public static boolean g(Context p0,int[] p1){
       TypedArray typedArray = p0.obtainStyledAttributes(p1);
       typedArray.recycle();
       return typedArray.hasValue(0);
    }
    public static TypedArray h(Context p0,AttributeSet p1,int[] p2,int p3,int p4,int[] p5){
       k.b(p0, p1, p3, p4);
       k.d(p0, p1, p2, p3, p4, p5);
       return p0.obtainStyledAttributes(p1, p2, p3, p4);
    }
    public static x i(Context p0,AttributeSet p1,int[] p2,int p3,int p4,int[] p5){
       k.b(p0, p1, p3, p4);
       k.d(p0, p1, p2, p3, p4, p5);
       return x.v(p0, p1, p2, p3, p4);
    }
}
