package ft1.b$b;
import lf3.g;
import ft1.b;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkVoteEnd;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ut1.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kuaishou.live.common.core.component.multipk.utils.LiveMultiPkDebugLogKt;
import zs1.b;
import com.kuaishou.android.live.log.b;
import lf3.f;

public final class b$b implements g	// class@002398
{
    public final b b;

    public void b$b(b p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       int b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          a.p(p0, "voteEnd");
          b$b tb = this.b;
          Objects.requireNonNull(tb);
          b uob = b.class;
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "17")) {
             SCLiveMultiPkVoteEnd pkId = p0.pkId;
             Object obj = PatchProxy.applyOneRefs(pkId, tb, uob, "4");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                b = 1;
                int i = (pkId == null || !pkId.length())? 1: 0;
                b = (b ^ i) & TextUtils.n(pkId, tb.i.e());
             }
             if (b) {
                b.S(LiveMultiPkDebugLogKt.b(), "onReceivePkVoteEnd", "param", tb.n.p());
                tb.r(p0, tb.i);
             }
          }
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
