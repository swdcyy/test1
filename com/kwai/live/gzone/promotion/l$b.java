package com.kwai.live.gzone.promotion.l$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kwai.live.gzone.promotion.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import com.kwai.live.gzone.promotion.k;

public class l$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000dcd
{
    public final l b;

    public void l$b(l p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, l$b.class, "1")) {
          return;
       }
       this.b.w.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       l x = this.b.x;
       if (x != null && x.j() == 1) {
          this.b.x.E(0);
       }
       return;
    }
}
