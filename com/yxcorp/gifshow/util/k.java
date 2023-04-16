package com.yxcorp.gifshow.util.k;
import android.app.Activity;
import android.os.Build$VERSION;
import android.view.Window;
import android.view.View;
import android.view.WindowInsets;
import android.view.DisplayCutout;
import lnc.g1;
import java.lang.Runnable;
import t45.c;

public class k	// class@001f87
{

    public static void a(Activity p0){
       if (Build$VERSION.SDK_INT >= 28) {
          boolean b = (p0.getWindow().getDecorView().getRootWindowInsets().getDisplayCutout() != null)? true: false;
          c.a(new g1(b));
       }
       return;
    }
}
