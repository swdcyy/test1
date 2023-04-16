package com.kuaishou.live.common.core.component.bottombubble.notices.a;
import k51.c;
import java.util.HashSet;
import com.kuaishou.live.common.core.component.bottombubble.notices.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import lp3.i;
import xp5.i;
import lp3.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.c;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.highlight.a;
import u91.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e;
import d61.g;
import java.lang.Boolean;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveFollowGuideConfig;
import java.lang.reflect.Type;
import wg3.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.follow.c;
import kd1.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.a;
import uc1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.recharge.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.conversiontask.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.serviceaccount.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.fansgrouppk.a;
import dd1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.increasefans.a;
import rc1.a;
import gd1.c;
import id1.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler;
import com.kuaishou.live.common.core.component.bottombubble.notices.wish.a;
import hm1.a;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService;
import com.kwai.feature.api.live.service.basic.baseinfo.LiveSceneInfoService$LiveSceneInfo;
import com.kuaishou.live.common.core.component.bottombubble.notices.gzone.e;
import java.util.Collection;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i;
import java.util.Iterator;
import lc1.b;
import java.util.List;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.i$a;
import com.kuaishou.live.common.core.component.turbomode.OptimizedElement;
import brd.t;
import qy1.a;
import t45.d;
import brd.z;
import fc1.a;
import erd.g;
import crd.b;
import bq5.h;
import nc1.j;
import bq5.e;

public class a extends c	// class@000f87
{
    public i p;
    public a q;
    public final Set r;
    public e s;
    public static String sLivePresenterClassName = "LiveAudienceCommentNoticePresenter";

    public void a(){
       super();
       this.r = new HashSet();
       this.s = new a$a(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       a tr = this.r;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HashSet hashSet = PatchProxy.apply(objArray, this, uoa, "5");
       if (hashSet != patchProxyRe) {
       }else {
          hashSet = new HashSet();
          ClientContent$LiveStreamPackage liveStreamPa = this.P8().a(i.class).a();
          hashSet.add(new c(this.P8(), this.getContext(), liveStreamPa));
          hashSet.add(new a(this.P8(), this.getContext()));
          hashSet.add(new a(this.P8(), liveStreamPa));
          boolean b = false;
          if (this.P8().a(b.class).H5("kswitch", "enableNewLiveSubscribe", b)) {
             hashSet.add(new e(this.P8()));
          }
          Object obj = PatchProxy.apply(objArray, objArray, g.class, "8");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             LiveConfigStartupResponse$LiveFollowGuideConfig liveFollowGu = a.q(LiveConfigStartupResponse$LiveFollowGuideConfig.class);
             if (liveFollowGu != null) {
                b = liveFollowGu.mEnableGuideFollowEnhance;
             }
          }
          if (b == null) {
             hashSet.add(new c(this.P8()));
          }
          hashSet.add(new b(this.P8()));
          hashSet.add(new a(this.P8(), this.getContext()));
          hashSet.add(new c(this.P8()));
          hashSet.add(new b(this.P8(), this.getContext()));
          hashSet.add(new a(this.P8(), this.getContext()));
          hashSet.add(new b(this.P8()));
          hashSet.add(new g(this.P8(), liveStreamPa));
          hashSet.add(new a(this.P8()));
          hashSet.add(new c(this.P8()));
          hashSet.add(new a(this.P8(), this.getContext(), liveStreamPa));
          hashSet.add(new a(this.P8(), this.getContext()));
          hashSet.add(new c(this.P8()));
          hashSet.add(new d(this.P8(), this.getContext()));
          hashSet.add(new LiveTkNoticeHandler(this.P8()));
          hashSet.add(new a(this.P8()));
          hashSet.add(new a(this.P8(), this.getContext()));
          if (this.P8().a(LiveSceneInfoService.class).Me().liveType == 4) {
             hashSet.add(new e(this.P8()));
          }
       }
       tr.addAll(hashSet);
       i oi = this.P8().a(i.class);
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          oi.xa(uob, uob.b());
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          uoa = this.q;
          if (uoa != null) {
             this.X7(uoa.vo(OptimizedElement.COMMENT_NOTICE).observeOn(d.a).distinctUntilChanged().subscribe(new a(this)));
          }
       }
       h oh = this.P8().c(h.class);
       if (oh != null) {
          oh.a9(j.class, this.s);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       i oi = this.P8().a(i.class);
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          oi.mm(uob, uob.b());
          uob.dispose();
       }
       this.r.clear();
       h oh = this.P8().c(h.class);
       if (oh != null) {
          oh.A7(this.s);
       }
       return;
    }
    public final i P8(){
       return this.p;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.p = oi;
       this.q = oi.c(a.class);
       return;
    }
}
