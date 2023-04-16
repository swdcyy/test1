package com.yxcorp.gifshow.growth.kpop.ext.fsvideo.FSVideoActivity$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.FSVideoActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.Window;
import android.app.Activity;
import kotlin.jvm.internal.a;
import android.view.View;
import java.util.Objects;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import lnc.b5;
import android.content.Context;
import com.yxcorp.utility.n;

public final class FSVideoActivity$b implements Runnable	// class@0013fd
{
    public final FSVideoActivity b;

    public void FSVideoActivity$b(FSVideoActivity p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FSVideoActivity$b.class, "1")) {
          return;
       }
       Window window = this.b.getWindow();
       a.o(window, "window");
       View decorView = window.getDecorView();
       a.o(decorView, "window.decorView");
       decorView = decorView.getRootView();
       if (decorView != null) {
          int[] ointArray = new int[2];
          decorView.getLocationOnScreen(ointArray);
          int i = 1;
          if (ointArray[i] > 10) {
             FSVideoActivity$b tb = this.b;
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(objArray, tb, FSVideoActivity.class, "7")) {
                tb.getWindow().clearFlags(1024);
                i.i(tb, 0xff000000, i, i);
                decorView = tb.findViewById(R.id.fs_status_bg);
                decorView.setBackgroundColor(0xff000000);
                a.o(decorView, "view");
                ViewGroup$LayoutParams layoutParams = decorView.getLayoutParams();
                int i1 = (b5.a(tb))? 0: n.A(tb);
                layoutParams.height = i1;
                decorView.setLayoutParams(layoutParams);
             }
          }
       }
       return;
    }
}
