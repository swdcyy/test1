package com.kuaishou.live.common.core.component.pendant.pendantgroup.i$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;

public class i$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@00171f
{
    public final i b;

    public void i$a(i p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, i$a.class, "1")) {
          return;
       }
       this.b.ik("onGlobalLayout");
       if (this.b.e.getViewTreeObserver().isAlive()) {
          this.b.e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       }
       return;
    }
}
