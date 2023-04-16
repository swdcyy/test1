package com.kuaishou.live.core.show.topic.audience.n;
import k51.c;
import com.kuaishou.live.core.show.topic.audience.n$a;
import com.kuaishou.live.core.show.topic.audience.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.topic.audience.o;
import com.kuaishou.live.core.show.topic.audience.d;
import com.kuaishou.live.core.show.topic.audience.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qvb.q;
import qvb.a;
import java.util.Objects;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailHeaderView;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailRecommendView$a;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;
import ql2.u;
import com.kuaishou.live.core.show.topic.audience.h$b;
import com.kuaishou.live.core.show.topic.audience.d$b;
import com.kuaishou.live.core.show.topic.audience.o$b;
import com.kuaishou.live.core.show.topic.audience.k$b;

public class n extends c	// class@00120d
{
    public LiveAudienceTopicDetailHeaderView p;
    public LiveAudienceTopicDetailFragment q;
    public u r;
    public h$b s;
    public d$b t;
    public o$b u;
    public k$b v;
    public final q w;
    public static String sLivePresenterClassName = "LiveAudienceTopicDetailHeaderPresenter";

    public void n(){
       super();
       this.w = new n$a(this);
       this.U7(new h());
       this.U7(new o());
       this.U7(new d());
       this.U7(new k());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, n.class, "2")) {
          return;
       }
       this.r.h(this.w);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, n.class, "3")) {
          return;
       }
       this.r.f(this.w);
       n tp = this.p;
       if (tp != null) {
          Objects.requireNonNull(tp);
          if (!PatchProxy.applyVoid(objArray, tp, LiveAudienceTopicDetailHeaderView.class, "7")) {
             LiveAudienceTopicDetailHeaderView h = tp.H;
             Objects.requireNonNull(h);
             if (!PatchProxy.applyVoid(objArray, h, LiveAudienceTopicDetailRecommendView.class, "2")) {
                LiveAudienceTopicDetailRecommendView d = h.d;
                if (d != null) {
                   d.onDestroy();
                }
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, n.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.r8("PAGE_LIST");
       this.s = this.q8(h$b.class);
       this.t = this.q8(d$b.class);
       this.u = this.q8(o$b.class);
       this.v = this.q8(k$b.class);
       return;
    }
}
