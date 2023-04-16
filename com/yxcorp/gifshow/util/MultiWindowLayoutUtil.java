package com.yxcorp.gifshow.util.MultiWindowLayoutUtil;
import android.view.View;
import z1.a;
import ekd.i;
import java.lang.Boolean;
import java.lang.Object;
import com.yxcorp.gifshow.util.MultiWindowLayoutUtil$a;
import a2.z;
import a2.i0;
import lnc.z4;
import android.view.View$OnAttachStateChangeListener;
import java.lang.Integer;
import android.os.Build$VERSION;
import android.view.WindowInsets;
import android.app.Activity;
import android.view.Window;
import android.content.res.Resources;

public final class MultiWindowLayoutUtil	// class@001eff
{

    public static void a(View p0,a p1){
       if (p0 == null || !i.c()) {
          p1.accept(Integer.valueOf(0));
          return;
       }else {
          p0.setTag(R.id.apply_window_insets, Boolean.TRUE);
          i0.I0(p0, new MultiWindowLayoutUtil$a(p1));
          if (i0.X(p0)) {
             i0.p0(p0);
          }else {
             p0.addOnAttachStateChangeListener(new z4());
          }
          return;
       }
    }
    public static int b(View p0){
       if (Build$VERSION.SDK_INT >= 23) {
          WindowInsets rootWindowIn = p0.getRootWindowInsets();
          if (rootWindowIn != null) {
             return rootWindowIn.getSystemWindowInsetTop();
          }
       }
       return 0;
    }
    public static void c(Activity p0,boolean p1){
       if (p1) {
          p0.getWindow().clearFlags(1024);
          if (!i.c()) {
             return;
          }else {
             p0.getWindow().getDecorView().setSystemUiVisibility(0);
             p0.getWindow().setStatusBarColor(p0.getResources().getColor(R.color.arg_RES_7f061c09));
          }
       }
       return;
    }
    public static void d(View p0){
       if (p0 == null || (p0.getTag(0x7f0a0233) != null && i.c())) {
          p0.setTag(R.id.apply_window_insets, null);
          i0.I0(p0, null);
       }
    label_0019 :
       return;
    }
}
