package com.kuaishou.live.preview.item.bottomcard.handler.l;
import ok3.n;
import com.kuaishou.live.preview.item.bottomcard.handler.m;
import com.kuaishou.live.preview.item.bottomcard.model.LivePreviewBottomCardModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.entity.QPhoto;
import gk3.b;
import nk3.v;
import java.util.Map;
import nk3.w;
import java.util.Objects;
import gk3.a;
import tk3.c$a;
import tk3.g;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.router.social.profile.ProfileStartParam;
import tkd.b;
import tkd.d;
import vu5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class l implements n	// class@000d8a
{
    public final LivePreviewBottomCardModel a;
    public final m b;

    public void l(m p0,LivePreviewBottomCardModel p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, l.class, "1")) {
          return;
       }
       u1.u(1, this.b.d(), this.b.c());
       l tb = this.b;
       if (tb.c != null) {
          w.e(300, tb.a.d(), 0, v.a(this.a), v.c(this.a));
       }
       m a = this.b.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoid(objArray, a, b.class, "2")) {
          a.e.a("FOLLOW_BTN", new a(a));
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       int i = 1;
       u1.u(i, this.b.f(), this.b.e());
       ProfileStartParam profileStart = ProfileStartParam.k(this.b.a.d().mEntity);
       if (this.b.c != null) {
          profileStart.o(i);
          w.e(284, this.b.a.d(), 0, v.a(this.a), v.c(this.a));
       }
       d.a(-1718536792).Y7(this.b.a.b(), profileStart);
       return;
    }
}
