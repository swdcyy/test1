package bp2.a;
import lf3.g;
import bp2.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveVoicePartyPkStatistic;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zo2.c;
import kotlin.jvm.internal.a;
import hp2.f;
import ip2.a;
import lf3.f;

public final class a implements g	// class@000425
{
    public final c b;

    public void a(c p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.d(new c(p0));
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
