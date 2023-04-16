package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.e;
import java.lang.Runnable;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d$b;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.d;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.handleview.LiveAudienceGiftBoxHandleView;
import android.widget.FrameLayout;
import android.view.ViewPropertyAnimator;
import uz0.a;
import uz0.b;

public final class e implements Runnable	// class@000b4e
{
    public final d$b b;
    public final boolean c;
    public final String d;

    public void e(d$b p0,boolean p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       e tb = this.b;
       e td = this.d;
       a uoa = a.class;
       if (this.c != null) {
          d w = tb.a.w;
          Objects.requireNonNull(w);
          if (!PatchProxy.applyVoidOneRefs(td, w, uoa, "8")) {
             b.S(w.a, "[LiveAudienceGiftBoxHandleViewController][show]", "from", td);
             a c = w.c;
             Objects.requireNonNull(c);
             if (!PatchProxy.applyVoid(null, c, LiveAudienceGiftBoxHandleView.class, "2")) {
                c.b();
                c.setVisibility(0);
             }
          }
          tb.d();
       }else {
          d w1 = tb.a.w;
          Objects.requireNonNull(w1);
          if (!PatchProxy.applyVoidOneRefs(td, w1, uoa, "9")) {
             b.S(w1.a, "[LiveAudienceGiftBoxHandleViewController][hide]", "from", td);
             a c1 = w1.c;
             Objects.requireNonNull(c1);
             if (!PatchProxy.applyVoid(null, c1, LiveAudienceGiftBoxHandleView.class, "3")) {
                c1.b();
                c1.animate().withLayer().alpha(0).setDuration(300).withStartAction(new a(c1)).withEndAction(new b(c1)).start();
             }
          }
       }
       return;
    }
}
