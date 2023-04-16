package bm0.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import bm0.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bm0.f$b;
import im8.f;
import tkd.b;
import tkd.d;
import os5.d;
import android.app.Activity;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import com.yxcorp.utility.n;
import lm9.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import lm9.a$c;
import ekd.m1;
import java.lang.Integer;

public class f extends PresenterV2	// class@0003c2
{
    public f p;
    public int q;
    public View r;
    public LiveStreamFeed s;
    public boolean t;
    public LiveAudienceParam u;
    public final a$c v;

    public void f(){
       super();
       this.t = false;
       this.v = new f$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.p.set(new f$b(this));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       d.a(-2004767397).Mq(this.getActivity(), this.s);
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       LiveLogTag lIVE_TVC_AD = LiveLogTag.LIVE_TVC_AD;
       b.Z(lIVE_TVC_AD, "tryToEnterTvc");
       if (this.t != null) {
          b.Z(lIVE_TVC_AD, "has enterTvc, so return");
          return;
       }else {
          this.t = true;
          b.Z(lIVE_TVC_AD, "enterTvc");
          View[] viewArray = new View[true];
          viewArray[0] = this.r;
          n.Z(8, viewArray);
          int i = -2004767397;
          if (d.a(i).L1(this.getActivity())) {
             b.Z(lIVE_TVC_AD, "why here\(isSlideContainer\)???");
          }else if(d.a(i).Xq(this.getActivity())){
             b.Z(lIVE_TVC_AD, "try to build Tvc fragment");
             d.a(-1638991736).uS(this.u, this.s, this.q, this.v, this.getActivity());
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a22ac);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.w8("LIVE_TVC_LISTENER");
       this.q = this.r8("LIVE_ACTIVITY_FRAGMENT_CONTAINER_ID").intValue();
       return;
    }
}
