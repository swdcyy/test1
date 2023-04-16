package aw2.a;
import com.kuaishou.live.core.voiceparty.teampk.stage.VoicePartyTeamPkPrepareContainerView$a;
import com.kuaishou.live.core.voiceparty.teampk.stage.AudienceTeamPkStageViewController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bw2.a;
import aw2.c;
import aw2.h;

public final class a implements VoicePartyTeamPkPrepareContainerView$a	// class@0002d2
{
    public final AudienceTeamPkStageViewController a;

    public void a(AudienceTeamPkStageViewController p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.a.y.b(2, 1);
       this.a.B.a(2);
       return;
    }
    public void b(){
       h.a(this);
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.a.y.b(1, 1);
       this.a.B.a(1);
       return;
    }
}
