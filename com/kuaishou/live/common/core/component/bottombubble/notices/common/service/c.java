package com.kuaishou.live.common.core.component.bottombubble.notices.common.service.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i$c;
import brd.t;
import nc1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lp3.e;
import lp3.a;
import qx1.a;
import lp3.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i$a;
import lc1.f;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import v51.a;
import hf3.a;
import lf3.g;
import vf1.a;
import vf1.b;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.b;
import erd.r;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.a;
import brd.w;
import erd.c;
import nc1.b;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import hm3.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.bottombubble.notices.LiveCommentNoticeRemoveExperiment;
import xp5.g;

public class c extends g	// class@000f9b
{
    public final i$c k;
    public final t l;
    public b m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public final b r;

    public void c(i$c p0,t p1){
       super();
       this.n = false;
       this.o = false;
       this.p = false;
       this.q = false;
       this.r = new a(this);
       this.k = p0;
       this.l = p1;
    }
    public void Qo(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.h = this.Po().a(a.class);
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.Ro();
       this.h = null;
       return;
    }
    public void So(i$a p0,f p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       super.So(p0, p1);
       if (this.p == null && p1.d(LiveCommentNoticeChannelType.LONG_CONNECTION)) {
          a uoa = a.class;
          if (!PatchProxy.applyVoid(null, this, c.class, "7")) {
             this.Po().a(uoa).u().u0(682, SCCommentNotice.class, this.f);
             this.Po().a(uoa).u().u0(686, SCCommentNotice.class, this.f);
             this.p = true;
          }
       }
       if (this.o != null || (p1.d(LiveCommentNoticeChannelType.API_DELAY_INFO) && !PatchProxy.applyVoid(null, this, c.class, "6"))) {
          this.Po().a(a.class).Z9(this.r);
          this.o = true;
       }
    label_007d :
       if (this.n != null || (p1.d(LiveCommentNoticeChannelType.API_USER_STATUS) && !PatchProxy.applyVoid(null, this, c.class, "5"))) {
          LiveCommonLogTag cOMMENT_NOTI = LiveCommonLogTag.COMMENT_NOTICE;
          b.Z(cOMMENT_NOTI, "connectUserStatusAPI");
          if (this.k != null) {
             b.Z(cOMMENT_NOTI, "connectUserStatusAPI: connected");
             this.m = t.zip(this.k.a(), this.l.filter(b.b), a.a).subscribe(new b(this), e.b);
          }
          this.n = true;
       }
    label_00c5 :
       if (this.q != null || (p1.d(LiveCommentNoticeChannelType.PULL_REQUEST) && !PatchProxy.applyVoid(null, this, c.class, "4"))) {
          this.Po().a(a.class).u0(682, SCCommentNotice.class, this.g);
          this.q = true;
       }
    label_00ed :
       return;
    }
    public boolean Xo(LiveCommentNoticeBaseInfo p0){
       g obj = PatchProxy.applyOneRefs(p0, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.mEnableLiveModel == true) {
          return true;
       }
       if (LiveCommentNoticeRemoveExperiment.a(p0.mNoticeType)) {
          b.c0(LiveCommonLogTag.COMMENT_NOTICE, "onInterceptNotice filter and will not show", "noticeInfo", p0);
          return true;
       }else {
          obj = this.Po().a(g.class);
          LiveCommentNoticeBaseInfo mLiveStreamI = p0.mLiveStreamId;
          if (mLiveStreamI == null || (mLiveStreamI.isEmpty() || (p0.mLiveStreamId).equals(obj.getLiveStreamId()))) {
             return false;
          }
          b.d0(LiveCommonLogTag.COMMENT_NOTICE, "ignore unsupported comment notice, targetLiveStreamId don\'t match", "targetLiveStreamId", p0.mLiveStreamId, "currentLiveStreamId", obj.getLiveStreamId());
          return true;
       }
    }
    public void Zo(){
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, c.class, "9")) {
          return;
       }
       super.Zo();
       this.Po().a(uoa).u().o(682, this.f);
       this.Po().a(uoa).u().o(686, this.f);
       this.p = false;
       this.Po().a(a.class).o(682, this.g);
       this.q = false;
       c tm = this.m;
       if (tm != null && !tm.isDisposed()) {
          this.m.dispose();
       }
       this.Po().a(a.class).uh(this.r);
       return;
    }
}
