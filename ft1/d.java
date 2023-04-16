package ft1.d;
import erd.g;
import ft1.b;
import java.lang.Object;
import com.kuaishou.live.common.core.component.multipk.api.LiveMultiPkInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import android.util.Base64;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkVoteEnd;

public final class d implements g	// class@00239b
{
    public final b b;

    public void d(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          d tb = this.b;
          a.o(p0, "it");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, b.class, "28")) {
             String voteEndInfoP = p0.getVoteEndInfoPbStr();
             if (voteEndInfoP != null) {
                p0.setVoteEndInfo(SCLiveMultiPkVoteEnd.parseFrom(Base64.decode(voteEndInfoP, 0)));
             }
          }
       }
       return;
    }
}
