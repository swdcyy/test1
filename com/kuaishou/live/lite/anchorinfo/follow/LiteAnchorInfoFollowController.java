package com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowController$a;
import nsd.u;
import java.util.LinkedHashMap;
import or5.d;
import pg1.e;
import td3.o;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import q83.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowController$followStatusWatcher$1;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowController$followStatusWatcher$2;
import msd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xp5.g;
import java.util.Map;
import java.lang.Boolean;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import brd.t;
import q83.b;
import erd.o;
import q83.c;
import erd.r;
import q83.d;
import erd.g;
import crd.b;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowController$fetchFollowConfig$1;
import androidx.lifecycle.LifecycleOwner;
import u63.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem$FollowAnimation;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem$b;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$b;

public final class LiteAnchorInfoFollowController extends ViewController	// class@001e57
{
    public LiteAnchorInfoFollowItem j;
    public boolean k;
    public a l;
    public final d m;
    public final e n;
    public final o o;
    public final LiveActionTrigger p;
    public final LiveLiteAnchorInfoAreaService q;
    public final i r;
    public static final Map s;
    public static final LiteAnchorInfoFollowController$a t;

    static {
       LiteAnchorInfoFollowController.t = new LiteAnchorInfoFollowController$a(null);
       LiteAnchorInfoFollowController.s = new LinkedHashMap();
    }
    public void LiteAnchorInfoFollowController(d p0,e p1,o p2,LiveActionTrigger p3,LiveLiteAnchorInfoAreaService p4,i p5){
       a.p(p0, "infoService");
       a.p(p1, "followManager");
       a.p(p2, "userStatusManager");
       a.p(p3, "actionTrigger");
       a.p(p4, "anchorInfoAreaService");
       a.p(p5, "logPackageProvider");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.p = p3;
       this.q = p4;
       this.r = p5;
       this.k = true;
       this.l = new a(this.V2(), new LiteAnchorInfoFollowController$followStatusWatcher$1(this), new LiteAnchorInfoFollowController$followStatusWatcher$2(this));
    }
    public void F2(){
       LiteAnchorInfoFollowController liteAnchorIn = LiteAnchorInfoFollowController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liteAnchorIn, "4")) {
          return;
       }
       if (this.m.I() == null) {
          return;
       }
       if (a.g(LiteAnchorInfoFollowController.s.get(this.getLiveStreamId()), Boolean.TRUE)) {
          b.Z(LiveLiteLogTag.LITE_ANCHOR_INFO_FOLLOW, "get global follow flag, "+this.getLiveStreamId()+" = true");
          this.W2();
       }else if(PatchProxy.applyVoid(objArray, this, liteAnchorIn, "6")){
          a.a(this, new LiteAnchorInfoFollowController$fetchFollowConfig$1(this.o.T3().map(b.b).filter(c.b).subscribe(new d(this))));
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiteAnchorInfoFollowController.class, "5")) {
          return;
       }
       this.l.d();
       return;
    }
    public final User V2(){
       User obj = PatchProxy.apply(null, this, LiteAnchorInfoFollowController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m.I();
       a.m(obj);
       return obj;
    }
    public final void W2(){
       LiteAnchorInfoFollowController liteAnchorIn = LiteAnchorInfoFollowController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liteAnchorIn, "8")) {
          return;
       }
       if (this.V2().isFollowingOrFollowRequesting()) {
          return;
       }
       LiteAnchorInfoFollowController tj = this.j;
       if (tj != null) {
          if (tj != null) {
             tj.d();
          }
       }else {
          b.Z(LiveLiteLogTag.LITE_ANCHOR_INFO_FOLLOW, "addFollowItem");
          LiveStreamFeed liveStreamFe = PatchProxy.apply(objArray, this, liteAnchorIn, "1");
          if (liveStreamFe != PatchProxyResult.class) {
          }else {
             liveStreamFe = this.m.j0();
             a.m(liveStreamFe);
          }
          Object obj = liveStreamFe;
          User user = this.V2();
          LiteAnchorInfoFollowController tr = this.r;
          LiteAnchorInfoFollowController tn = this.n;
          LiteAnchorInfoFollowItem$FollowAnimation shimmer = (this.k != null)? LiteAnchorInfoFollowItem$FollowAnimation.Shimmer: LiteAnchorInfoFollowItem$FollowAnimation.EmptyAnim;
          LiteAnchorInfoFollowItem liteAnchorIn1 = new LiteAnchorInfoFollowItem(obj, user, tr, 254, "LITE_NICKNAME", tn, shimmer, this.l);
          this.q.b(tj);
          this.k = false;
          this.j = tj;
       }
       return;
    }
    public final String getLiveStreamId(){
       String obj = PatchProxy.apply(null, this, LiteAnchorInfoFollowController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m.getLiveStreamId();
       if (obj == null) {
          obj = "emptyLiveStreamId";
       }
       a.o(obj, "infoService.liveStreamId ?: \"emptyLiveStreamId\"");
       return obj;
    }
}
