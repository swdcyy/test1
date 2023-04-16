package or1.d$a;
import pr1.f;
import or1.d;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatState;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.LiveScoreLineChatTeam;
import sq1.a;
import com.kuaishou.protobuf.livestream.nano.SCLiveScoreLineChatStatistic;

public final class d$a implements f	// class@003561
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(LiveScoreLineChatState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       a.p(p0, "lineChatState");
       this.a.v0(p0.status);
       LiveScoreLineChatState team = p0.team;
       if (team != null) {
          this.a.u0(team, p0.giftId);
       }
       if (p0.enableShowAttachGiftEntrance != null) {
          p0 = p0.giftToken;
          a.o(p0, "lineChatState.giftToken");
          this.a.f.f(p0.giftId, p0);
       }
       return;
    }
    public void c(SCLiveScoreLineChatStatistic p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "3")) {
          return;
       }
       a.p(p0, "lineStatisticSignal");
       SCLiveScoreLineChatStatistic team = p0.team;
       if (team != null) {
          this.a.u0(team, p0.giftId);
       }
       return;
    }
    public void d(LiveScoreLineChatState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
          return;
       }
       a.p(p0, "lineChatState");
       this.a.v0(p0.status);
       LiveScoreLineChatState team = p0.team;
       if (team != null) {
          this.a.u0(team, p0.giftId);
       }
       this.a.f.e();
       return;
    }
    public void e(){
    }
}
