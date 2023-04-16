package h93.a;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.service.ServiceProvider;
import xp5.i;
import e93.a;
import vq5.d;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardServiceImpl;
import xp5.g;
import androidx.lifecycle.LifecycleOwner;
import g93.b;
import f93.c;

public final class a extends ViewController	// class@002d2f
{
    public b j;
    public c k;
    public final ServiceProvider l;
    public final i m;
    public final a n;
    public final d o;
    public final LiveLiteGuidanceMessageQueueManager p;
    public final a q;
    public final a r;

    public void a(ServiceProvider p0,i p1,a p2,d p3,LiveLiteGuidanceMessageQueueManager p4,a p5,a p6){
       a.p(p0, "benefitCardServiceProvider");
       a.p(p1, "liveLogPackageProvider");
       a.p(p2, "liteAudienceInfoManager");
       a.p(p3, "liveRouterManager");
       a.p(p4, "liveLiteGuidanceMessageQueueManager");
       a.p(p5, "liveReceiveCommentNoticeService");
       a.p(p6, "liveLiteBottomBubbleService");
       super();
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.o = p3;
       this.p = p4;
       this.q = p5;
       this.r = p6;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       String liveStreamId = this.n.getLiveStreamId();
       if (liveStreamId == null) {
          liveStreamId = "";
       }
       LiveLiteBenefitCardServiceImpl liveLiteBene = new LiveLiteBenefitCardServiceImpl(liveStreamId, this.m, this.p, this.r);
       this.k = liveLiteBene;
       this.l.b(this, liveLiteBene);
       liveStreamId = this.n.getLiveStreamId();
       String str = (liveStreamId != null)? liveStreamId: "";
       a to = this.o;
       a tk = this.k;
       if (tk == null) {
          a.S("commercialBenefitCardService");
       }
       b uob = new b(this, str, to, tk, this.q);
       this.j = liveLiteBene;
       return;
    }
}
