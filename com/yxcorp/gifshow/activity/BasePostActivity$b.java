package com.yxcorp.gifshow.activity.BasePostActivity$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.activity.BasePostActivity;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.kwai.feature.post.api.util.g;
import android.view.Window;
import android.view.View;
import android.view.ViewTreeObserver;

public class BasePostActivity$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001333
{
    public final Runnable b;
    public final BasePostActivity c;

    public void BasePostActivity$b(BasePostActivity p0,Runnable p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, BasePostActivity$b.class, "1")) {
          return;
       }
       boolean i = g.c(this.c);
       BasePostActivity.M = i;
       i = (i > 0)? true: false;
       BasePostActivity.L = i;
       this.c.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       BasePostActivity$b tb = this.b;
       if (tb != null) {
          tb.run();
       }
       return;
    }
}
