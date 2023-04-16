package com.kuaishou.live.gzone.v2.profile.e$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.live.gzone.v2.profile.e;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.view.ViewTreeObserver;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;

public class e$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@001cdf
{
    public final View b;
    public final e c;

    public void e$b(e p0,View p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, e$b.class, "1")) {
          return;
       }
       if (!this.c.t.isAdded()) {
          return;
       }
       this.b.getViewTreeObserver().removeGlobalOnLayoutListener(this);
       int i = n.c(a.B, 200.00f);
       if (this.b.getHeight() < i) {
          this.b.getLayoutParams().height = i;
          this.b.requestLayout();
       }
       return;
    }
}
