package com.kuaishou.live.common.core.component.comments.e;
import k51.c;
import ne1.p;
import com.kuaishou.live.common.core.component.comments.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveRichTextFeedPush$SCLiveRichTextFeedPush;
import lf3.g;
import com.kuaishou.livestream.message.nano.SCActionSignal;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import lp3.e;
import n81.a;
import lp3.c;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessageOld;
import ca1.b;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import qx1.a;

public class e extends c	// class@001078
{
    public m p;
    public e q;
    public final g r;
    public final g s;
    public a t;
    public static String sLivePresenterClassName = "LiveRichTextFeedPushPresenter";

    public void e(){
       super();
       this.r = new p(this);
       this.s = new d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.p.u().u0(702, LiveRichTextFeedPush$SCLiveRichTextFeedPush.class, this.r);
       this.p.u().u0(510, SCActionSignal.class, this.s);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.p.u().o(702, this.r);
       this.p.u().o(510, this.s);
       return;
    }
    public final void P8(LiveStreamRichTextFeed$RichTextFeed[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "7")) {
          return;
       }
       if (this.q.b()) {
          return;
       }
       a uoa = this.q.a(a.class);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uoa.R0(b.a(p0[i]));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.r8("LIVE_SERVICE_MANAGER");
       if (this.p.u5() != LiveSceneType.Escrow) {
          this.t = this.q.a(a.class);
       }
       return;
    }
}
