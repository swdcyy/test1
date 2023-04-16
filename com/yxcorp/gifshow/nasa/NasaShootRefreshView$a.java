package com.yxcorp.gifshow.nasa.NasaShootRefreshView$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.k0;
import q87.c;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import com.kwai.library.widget.refresh.RefreshLayout$g;
import yqb.j;
import java.lang.Runnable;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.nasa.NasaShootRefreshView$b;

public class NasaShootRefreshView$a extends AnimatorListenerAdapter	// class@0020bd
{
    public final NasaShootRefreshView a;

    public void NasaShootRefreshView$a(NasaShootRefreshView p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaShootRefreshView$a.class, "2")) {
          return;
       }
       super.onAnimationEnd(p0);
       Object[] objArray = new Object[0];
       k0.C().w("NasaShootRefreshView", "onAnimationEnd", objArray);
       this.a.b.k();
       this.a.setTopButtonClickable(0);
       NasaShootRefreshView$a ta = this.a;
       NasaShootRefreshView g = ta.g;
       if (g != null) {
          g.onRefresh();
       }else {
          ta.postDelayed(new j(this), 100);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaShootRefreshView$a.class, "1")) {
          return;
       }
       NasaShootRefreshView i = this.a.i;
       if (i != null) {
          i.a();
       }
       return;
    }
}
