package dp2.f;
import lf3.g;
import dp2.i;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCKtvCurrentMusicOrderStarted;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jp2.c;
import kotlin.jvm.internal.a;
import qrd.l1;
import io.reactivex.subjects.PublishSubject;
import lf3.f;

public final class f implements g	// class@002570
{
    public final i b;
    public final KtvMusicOrderInfo c;

    public void f(i p0,KtvMusicOrderInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
       }else if(a.g(p0.liveStreamId, this.b.l.b()) && (a.g(p0.voicePartyId, this.b.l.d()) && (a.g(p0.ktvId, this.b.l.a()) && a.g(p0.musicOrderId, this.c.musicOrderId)))){
          this.b.c.onNext(l1.a);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
