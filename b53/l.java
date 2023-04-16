package b53.l;
import lf3.g;
import com.kuaishou.live.gzone.barrage.h;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ca1.a;
import da1.a;
import java.util.List;
import b53.b;
import lf3.f;

public final class l implements g	// class@000316
{
    public final h b;

    public void l(h p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "4")) {
       }else {
          tb.C.Cm(tb.N.c(p0).a());
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
