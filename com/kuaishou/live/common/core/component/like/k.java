package com.kuaishou.live.common.core.component.like.k;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.i;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import go1.f;
import mo1.a;
import com.kuaishou.live.common.core.component.like.d;
import erd.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class k extends AnimatorListenerAdapter	// class@00146e
{
    public final i a;

    public void k(i p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       k ta = this.a;
       i p = ta.P;
       Objects.requireNonNull(ta);
       b uob = PatchProxy.applyOneRefs(p, ta, i.class, "8");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = t.timer(3000, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new f(ta, p), d.b);
       }
       ta.K = uob;
       ta = this.a;
       ta.X7(ta.K);
       ta.t = false;
       return;
    }
}
