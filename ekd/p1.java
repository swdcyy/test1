package ekd.p1;
import android.view.View;
import android.view.ViewGroup;
import a2.i0;
import androidx.viewpager.widget.ViewPager;
import android.view.ViewParent;
import ekd.p1$a;
import java.lang.Runnable;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.String;
import java.lang.Object;
import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.content.res.Resources;
import cw9.c;
import java.lang.Math;
import android.view.LayoutInflater;
import com.yxcorp.utility.n;
import ag6.a;
import android.graphics.Paint;
import android.app.Activity;
import android.view.Window;

public final class p1	// class@000d6b
{

    public static boolean a(View p0,int p1,int p2,int p3){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (p0 instanceof ViewGroup) {
          ViewGroup viewGroup = p0;
          int i = viewGroup.getChildCount() - 1;
          while (true) {
             if (i >= 0) {
                View childAt = viewGroup.getChildAt(i);
                int i1 = childAt.getLeft() + (int)i0.M(childAt);
                int i2 = childAt.getRight() + (int)i0.M(childAt);
                int i3 = childAt.getTop() + (int)i0.N(childAt);
                int i4 = childAt.getBottom() + (int)i0.N(childAt);
                if (p2 >= i1 && (p2 < i2 && (p3 >= i3 && p3 < i4))) {
                   i1 = p2 - i1;
                   i2 = p3 - i3;
                   if (p1.a(childAt, p1, i1, i2)) {
                      return 1;
                   }
                }
             label_0052 :
                i = i - 1;
             }
          }
       }
       if (p0 instanceof ViewPager) {
          if (p0.getCurrentItem() || p1 > 0) {
             b = true;
          }
          return b;
       }else {
          return i0.d(p0, p1);
       }
    }
    public static View b(ViewGroup p0){
       return p1.h(p0, 0x7f0d03f9);
    }
    public static void c(View p0,int p1,int p2,int p3,int p4){
       p1$a uoa = new p1$a(p0, p1, p2, p3, p4);
       p0.getParent().post(v7);
    }
    public static float d(Context p0){
       float f = (float)ViewConfiguration.get(p0).getScaledEdgeSlop();
       WindowManager systemServic = p0.getSystemService("window");
       if (systemServic != null) {
          DisplayMetrics uDisplayMetr = new DisplayMetrics();
          systemServic.getDefaultDisplay().getMetrics(uDisplayMetr);
          float f1 = (float)uDisplayMetr.widthPixels;
          float f2 = (f * 0x3f800000) / (0x3f800000 * f1);
          if ((float)Math.floor((double)(f1 / c.c(p0.getResources()).density)) - 0x43f00000 >= 0) {
             if (f2 - 0.15f >= 0) {
             label_0052 :
                return f;
             }
          }else {
             float f3 = 0x3d8f5c29;
             if (f2 - f3 >= 0) {
             }
          }
          f = f1 * 0.15f;
          goto label_0052 ;
       }else {
          goto label_0052 ;
       }
    }
    public static LayoutInflater e(Context p0){
       return LayoutInflater.from(p0);
    }
    public static int f(Context p0){
       return n.A(p0);
    }
    public static View g(Context p0,int p1){
       return p1.e(p0).inflate(p1, null);
    }
    public static View h(ViewGroup p0,int p1){
       return a.c(p1.e(p0.getContext()), p1, p0, false);
    }
    public static View i(ViewGroup p0,int p1,boolean p2){
       return a.c(p1.e(p0.getContext()), p1, p0, p2);
    }
    public static void j(View p0,int p1){
       Paint paint = null;
       try{
          p0.setLayerType(p1, paint);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void k(Activity p0){
       Window window = p0.getWindow();
       window.getDecorView().setSystemUiVisibility(1280);
       window.setStatusBarColor(0);
    }
}
