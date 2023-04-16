package com.yxcorp.gifshow.camera.record.g;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.camera.record.h;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.camera.record.h$b;
import android.view.ViewTreeObserver;

public class g implements ViewTreeObserver$OnGlobalLayoutListener	// class@001d43
{
    public final View b;
    public final h c;

    public void g(h p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       Iterator iterator = this.c.e.iterator();
       while (iterator.hasNext()) {
          iterator.next().x(this.b, this.c.f(), this.c.g, 250);
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       return;
    }
}
