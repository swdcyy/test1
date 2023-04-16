package com.yxcorp.gifshow.follow.stagger.selector.presenter.c$a;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.yxcorp.gifshow.follow.stagger.selector.FollowFilterAction;
import mrd.a;

public class c$a implements SlidingPaneLayout$d	// class@00123e
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       p0.v = true;
    }
    public void b(View p0,float p1){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, c$a.class, "1")) {
          return;
       }
       c$a ta = this.a;
       if (ta.v != null) {
          ta.s.onNext(FollowFilterAction.SMOOTH_COLLAPSE);
       }
       ta.v = false;
       return;
    }
    public void c(View p0){
       p0.v = false;
    }
}
