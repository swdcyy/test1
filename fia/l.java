package fia.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import kotlin.jvm.internal.a;
import brd.t;
import cha.a;
import fia.l$a;
import kga.c;
import erd.g;
import crd.b;
import cia.w;

public final class l extends PresenterV2	// class@00291b
{
    public a p;
    public w q;
    public SwipeLayout r;

    public void l(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       this.r = w9.c(this.getActivity());
       l tp = this.p;
       if (tp == null) {
          a.S("mFollowViewPagerState");
       }
       this.X7(tp.c().subscribe(new l$a(this), c.a));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       Object obj = this.r8("NIRVANA_FOLLOW_VIEW_PAGER_STATE");
       a.o(obj, "inject\(FollowAccessIds.N¡­_FOLLOW_VIEW_PAGER_STATE\)");
       this.p = obj;
       obj = this.q8(w.class);
       a.o(obj, "inject\(FollowSlideInjectAdapter::class.java\)");
       this.q = obj;
       return;
    }
}
