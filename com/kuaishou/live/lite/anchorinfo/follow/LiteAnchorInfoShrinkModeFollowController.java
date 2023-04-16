package com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController;
import com.kuaishou.live.viewcontroller.ViewController;
import or5.d;
import pg1.e;
import o83.f;
import xp5.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import q83.a;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$1;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$2;
import msd.a;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem$FollowAnimation;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoFollowItem$b;
import xp5.g;
import q83.j;
import com.kuaishou.live.lite.anchorinfo.follow.LiteAnchorInfoShrinkModeFollowController$registerToAnchorInfoShrinkMode$2;
import z1.k;

public final class LiteAnchorInfoShrinkModeFollowController extends ViewController	// class@001e60
{
    public final a j;
    public final LiteAnchorInfoFollowItem k;
    public final d l;
    public final f m;

    public void LiteAnchorInfoShrinkModeFollowController(d p0,e p1,f p2,i p3){
       LiveStreamFeed liveStreamFe;
       a.p(p0, "infoService");
       a.p(p1, "followManager");
       a.p(p2, "anchorInfoAreaShrinkService");
       a.p(p3, "logPackageProvider");
       super();
       this.l = p0;
       this.m = p2;
       a uoa = new a(this.V2(), new LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$1(this), new LiteAnchorInfoShrinkModeFollowController$followStatusWatcher$2(this));
       this.j = uoa;
       Object obj = PatchProxy.apply(null, this, LiteAnchorInfoShrinkModeFollowController.class, "1");
       if (obj != PatchProxyResult.class) {
          liveStreamFe = obj;
       }else {
          LiveStreamFeed liveStreamFe1 = p0.j0();
          a.m(liveStreamFe1);
          liveStreamFe = liveStreamFe1;
       }
       LiteAnchorInfoFollowItem liteAnchorIn = new LiteAnchorInfoFollowItem(liveStreamFe, this.V2(), p3, 257, "LITE_NICK_SLIDE", p1, LiteAnchorInfoFollowItem$FollowAnimation.EmptyAnim, uoa);
       this.k = this.V2();
       return;
    }
    public void F2(){
       LiteAnchorInfoShrinkModeFollowController liteAnchorIn = LiteAnchorInfoShrinkModeFollowController.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liteAnchorIn, "4")) {
          return;
       }
       if (this.l.I() == null) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liteAnchorIn, "7")) {
          this.m.b(new j(this), true, new LiteAnchorInfoShrinkModeFollowController$registerToAnchorInfoShrinkMode$2(this));
       }
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiteAnchorInfoShrinkModeFollowController.class, "5")) {
          return;
       }
       this.j.d();
       return;
    }
    public final User V2(){
       User obj = PatchProxy.apply(null, this, LiteAnchorInfoShrinkModeFollowController.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l.I();
       a.m(obj);
       return obj;
    }
}
