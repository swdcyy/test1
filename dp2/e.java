package dp2.e;
import lf3.g;
import dp2.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCKtvMicSeatsInvitationInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jp2.c;
import kotlin.jvm.internal.a;
import hp2.o;
import io.reactivex.subjects.PublishSubject;
import lf3.f;

public final class e implements g	// class@00256f
{
    public final i b;

    public void e(i p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else if(a.g(p0.liveStreamId, this.b.l.b()) && (a.g(p0.voicePartyId, this.b.l.d()) && (a.g(p0.ktvId, this.b.l.a()) && a.g(String.valueOf(p0.guestUserId), this.b.l.c().a())))){
          SCKtvMicSeatsInvitationInfo token = p0.token;
          a.o(token, "it.token");
          e uoe = (token.length() > 0)? 1: null;
          if (uoe) {
             this.b.a.onNext(p0.token);
          }
       }
    label_0070 :
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
