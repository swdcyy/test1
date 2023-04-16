package com.yxcorp.gifshow.base.BaseKsaActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.utility.n;
import android.content.Context;
import ekd.l1;
import android.view.Window;
import kotlin.jvm.internal.a;
import android.view.WindowManager$LayoutParams;
import android.os.Build$VERSION;
import android.view.View;
import android.util.TypedValue;
import android.content.res.Resources$Theme;

public abstract class BaseKsaActivity extends RxFragmentActivity	// class@001c4a
{
    public j c;
    public HashMap d;

    public void BaseKsaActivity(){
       super();
    }
    private final void F2(){
       if (PatchProxy.applyVoid(null, this, BaseKsaActivity.class, "2")) {
          return;
       }
       if (n.I(this)) {
          return;
       }
       if (l1.a(this)) {
          Window window = this.getWindow();
          a.h(window, "window");
          int i = 1024;
          window = (window.getAttributes().flags & i)? 1: null;
          this.getWindow().clearFlags(i);
          this.getWindow().addFlags(2048);
          if (Build$VERSION.SDK_INT >= 23 && window) {
             window = this.getWindow();
             a.h(window, "window");
             View decorView = window.getDecorView();
             a.h(decorView, "window.decorView");
             decorView.setSystemUiVisibility(8192);
             TypedValue typedValue = new TypedValue();
             this.getTheme().resolveAttribute(R.attr.arg_RES_7f0400f4, typedValue, true);
             Window window1 = this.getWindow();
             a.h(window1, "window");
             window1.setStatusBarColor(typedValue.data);
          }
       }
    label_0079 :
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, BaseKsaActivity.class, "1")) {
          return;
       }
       super.onResume();
       this.F2();
       return;
    }
}
