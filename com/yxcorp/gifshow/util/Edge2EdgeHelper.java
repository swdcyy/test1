package com.yxcorp.gifshow.util.Edge2EdgeHelper;
import com.yxcorp.gifshow.util.Edge2EdgeHelper$enableEdge2Edge$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.view.Window;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import a2.k;
import lnc.i5;
import android.view.View;
import com.yxcorp.gifshow.util.Edge2EdgeHelper$adaptEdge2Edge$1;
import msd.q;
import com.yxcorp.gifshow.util.l;
import java.lang.Boolean;
import android.app.Activity;
import a2.l;
import a2.j;
import p1.b;
import java.lang.Integer;

public final class Edge2EdgeHelper	// class@001ee8
{
    public static boolean a;
    public static final p b;
    public static final Edge2EdgeHelper c;

    static {
       Edge2EdgeHelper.c = new Edge2EdgeHelper();
       Edge2EdgeHelper.b = s.c(Edge2EdgeHelper$enableEdge2Edge$2.INSTANCE);
    }
    public void Edge2EdgeHelper(){
       super();
    }
    public static final void a(Window p0){
       a.p(p0, "window");
       if (Build$VERSION.SDK_INT >= 29) {
          k.a(p0, false);
          i5.j(p0, false);
          p0.setStatusBarColor(false);
          View decorView = p0.getDecorView();
          a.o(decorView, "window.decorView");
          l.b(decorView, Edge2EdgeHelper$adaptEdge2Edge$1.INSTANCE);
       }
       return;
    }
    public static final boolean b(){
       return Edge2EdgeHelper.b.getValue().booleanValue();
    }
    public static final int c(Activity p0){
       Integer integer;
       int i;
       if (p0 != null) {
          Window window = p0.getWindow();
          a.o(window, "it.window");
          l ol = j.a(window.getDecorView());
          if (ol != null) {
             b uob = ol.f(2);
             if (uob != null) {
                integer = Integer.valueOf(uob.d);
             label_0024 :
                if (integer != null) {
                   i = integer.intValue();
                label_002c :
                   return i;
                }
             }
          }
          integer = null;
          goto label_0024 ;
       }
       i = 0;
       goto label_002c ;
    }
}
