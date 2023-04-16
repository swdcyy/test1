package com.kuaishou.live.ad.fanstop.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.ad.fanstop.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ds5.e;
import sr5.a;
import ds5.c;
import ds5.a;
import wkd.b;
import mxb.f0;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Integer;
import com.kuaishou.live.ad.fanstop.h$b;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import xq5.c;
import s91.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import tl8.d;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import mxb.j0;
import mxb.i0;
import pl0.m0;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import erd.g;

public class h extends PresenterV2	// class@0009a6
{
    public a p;
    public LiveAudienceParam q;
    public int r;
    public c s;

    public void h(){
       super();
       this.r = 1;
       this.s = new h$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       if (this.p != null && this.P8()) {
          this.p.l1().gd(this.s);
          if (!this.p.v()) {
             return;
          }else if(this.q != null){
             Object obj = b.a(-762347696).x1(this.q.mPhoto, "key_enteraction");
             if (obj instanceof Integer) {
                this.r = obj.intValue();
             }
          }
          this.p.h1().P4(new h$b(this));
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, h.class, "4")) {
          return;
       }
       h tp = this.p;
       if (tp != null && (!tp.v() && (this.P8() && !this.p.g1().e()))) {
          this.R8();
       }
    label_002b :
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.p.l1().fo(this.s);
       return;
    }
    public final boolean P8(){
       boolean b;
       h obj = PatchProxy.apply(null, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       if (obj != null) {
          LiveAudienceParam mPhoto = obj.mPhoto;
          if (mPhoto != null && mPhoto.get("AD") != null) {
             b = true;
          label_0027 :
             return b;
          }
       }
       b = false;
       goto label_0027 ;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, h.class, "6")) {
          return;
       }
       h tp = this.p;
       if (tp != null && (tp.j0() != null && this.p.j0().isLiveStream())) {
          LiveStreamFeedWrapper mEntity = this.p.j0().mEntity;
          i0.a().e(67, mEntity).d(new m0(mEntity)).a();
       }
    label_0040 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       this.q = this.r8("LIVE_AUDIENCE_PARAM");
       return;
    }
}
