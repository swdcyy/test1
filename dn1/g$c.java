package dn1.g$c;
import lf3.g;
import dn1.g;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveHotspotRankShow;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Boolean;
import lf3.f;

public final class g$c implements g	// class@001fd6
{
    public final g b;

    public void g$c(g p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$c.class, "1")) {
       }else {
          g$c tb = this.b;
          MutableLiveData mutableLiveD = tb.r0(tb.w0());
          a.o(p0, "message");
          Objects.requireNonNull(this.b);
          boolean b = (p0.liveHotspotRankEntranceType == 2)? true: false;
          mutableLiveD.setValue(Boolean.valueOf(b));
          tb = this.b;
          tb.r0(tb.b).setValue(p0.text);
          tb = this.b;
          tb.f = p0.url;
          tb.r0(tb.u0()).setValue(p0.rankInfo);
          g$c tb1 = this.b;
          tb1.r0(tb1.x0()).setValue(Boolean.TRUE);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
