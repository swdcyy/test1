package com.yxcorp.gifshow.camera.record.intelligentidentify.ui.d$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;

public class d$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@000e0c
{
    public final View b;
    public final Runnable c;

    public void d$a(View p0,Runnable p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, d$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.c.run();
       return;
    }
}
