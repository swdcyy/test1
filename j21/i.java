package j21.i;
import vf1.b;
import j21.k;
import java.lang.Object;
import com.kuaishou.live.core.show.delayinfo.LiveAudienceDelayInfosResponse;
import com.kwai.robust.PatchProxyResult;
import j21.e;
import j21.g;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.core.show.delayinfo.LiveNearbyGuideConfig$LiveNearbyGuideCommentConfig;
import j21.f;
import j21.h;
import com.kuaishou.live.core.show.delayinfo.LiveAuthorToPasserbyGuideConfig$GuideCommentConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fq5.b;
import t02.a0;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker;
import com.kuaishou.live.common.core.component.comments.model.LiveAudienceGuideMessage;
import com.kuaishou.live.basic.model.QLiveMessage;
import n81.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import j21.a;
import j21.b;
import ok.h;
import java.lang.Boolean;
import v91.b;

public final class i implements b	// class@002a40
{
    public final k b;

    public void i(k p0){
       this.b = p0;
    }
    public final void x6(LiveAudienceDelayInfosResponse p0){
       i tb = this.b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       if (tb.P != null) {
       }else {
          LiveNearbyGuideConfig$LiveNearbyGuideCommentConfig liveNearbyGu = k0.b(p0, e.a, g.a).orNull();
          LiveAuthorToPasserbyGuideConfig$GuideCommentConfig guideComment = k0.b(p0, f.a, h.a).orNull();
          if (liveNearbyGu != null) {
             if (!PatchProxy.applyVoidOneRefs(liveNearbyGu, tb, ok, "7")) {
                User user = tb.N.b().I();
                LiveAudienceGuideMessage liveAudience = PatchProxy.applyTwoRefs(liveNearbyGu, user, null, LiveCommentsMocker.class, "15");
                if (liveAudience != patchProxyRe) {
                }else {
                   liveAudience = new LiveAudienceGuideMessage(liveNearbyGu, user);
                }
                tb.M.R0(liveAudience);
                a.b(tb.N.b().a(), "NEARBY_GUIDE");
             }
          }else if(guideComment != null){
             Boolean uBoolean = PatchProxy.applyOneRefs("commentArea_authorHello", tb, ok, "3");
             if (uBoolean == patchProxyRe) {
                uBoolean = tb.a9("commentArea_authorHello").transform(b.b).or(Boolean.FALSE);
             }
             if (uBoolean.booleanValue()) {
                if (!PatchProxy.applyVoidOneRefs(guideComment, tb, ok, "8")) {
                   LiveAudienceGuideMessage liveAudience1 = PatchProxy.applyOneRefs(guideComment, tb, ok, "9");
                   if (liveAudience1 != patchProxyRe) {
                   }else {
                      liveAudience1 = new LiveAudienceGuideMessage(guideComment, tb.N.b().I());
                   }
                   tb.M.R0(liveAudience1);
                   a.b(tb.N.b().a(), "PASSERBY_GUIDE");
                }
                if (!PatchProxy.applyVoidOneRefs("commentArea_authorHello", tb, ok, "5")) {
                   Optional optional = tb.a9("commentArea_authorHello");
                   if (optional.isPresent()) {
                      optional.get().a();
                   }
                }
             }
          }
       }
       return;
    }
}
