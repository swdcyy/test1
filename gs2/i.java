package gs2.i;
import com.kuaishou.live.viewcontroller.ViewController;
import qu2.a;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.live.core.voiceparty.music.m;
import ne1.h;
import hf3.a;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ix2.c;
import ix2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.SCKtvRecommendToSing;
import gs2.i$a;
import lf3.g;

public final class i extends ViewController	// class@002b99
{
    public final c j;
    public final a k;
    public final AudienceVoicePartyManager l;
    public final KtvManager m;
    public final m n;
    public final h o;
    public final a p;
    public final LiveVoicePartyKtvMusicDownloadHelper q;

    public void i(a p0,AudienceVoicePartyManager p1,KtvManager p2,m p3,h p4,a p5,LiveVoicePartyKtvMusicDownloadHelper p6){
       a.p(p0, "liveContext");
       a.p(p1, "voicePartyManager");
       a.p(p2, "ktvManager");
       a.p(p3, "orderMusicService");
       a.p(p4, "liveCommentsFeedService");
       a.p(p5, "longConnection");
       a.p(p6, "musicDownloadHelper");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       this.o = p4;
       this.p = p5;
       this.q = p6;
       this.j = d.a(p5);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.j.a(479, SCKtvRecommendToSing.class, new i$a(this));
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.j.b();
       return;
    }
}
