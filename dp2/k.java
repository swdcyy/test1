package dp2.k;
import lf3.g;
import dp2.l;
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

public final class k implements g	// class@00257a
{
    public final l b;
    public final KtvMusicOrderInfo c;

    public void k(l p0,KtvMusicOrderInfo p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else if(a.g(p0.liveStreamId, this.b.c().b()) && (a.g(p0.voicePartyId, this.b.c().d()) && (a.g(p0.ktvId, this.b.c().a()) && a.g(p0.musicOrderId, this.c.musicOrderId)))){
          this.b.a.onNext(l1.a);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
