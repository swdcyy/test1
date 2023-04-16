package gp2.o;
import lf3.g;
import com.kuaishou.live.core.voiceparty.core.audience.theater.AudienceTheaterManager;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCTheaterNextEpisodeOrderInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lf3.f;

public final class o implements g	// class@002b80
{
    public final AudienceTheaterManager b;

    public void o(AudienceTheaterManager p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.x(p0);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
