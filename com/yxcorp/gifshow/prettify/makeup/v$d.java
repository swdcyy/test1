package com.yxcorp.gifshow.prettify.makeup.v$d;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.prettify.makeup.v;
import android.view.View;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;

public class v$d implements ViewTreeObserver$OnGlobalLayoutListener	// class@00119c
{
    public final View b;
    public final Runnable c;
    public final v d;

    public void v$d(v p0,View p1,Runnable p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, v$d.class, "1")) {
          return;
       }
       if (this.b.getWidth() > 0 && this.b.getHeight() > 0) {
          this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.c.run();
       }
       return;
    }
}
