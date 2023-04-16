package j02.o$c;
import lf3.g;
import j02.o;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxRewardCartoon;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j02.u;
import java.lang.StringBuilder;
import java.util.List;
import com.kuaishou.android.live.log.b;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import lf3.f;

public final class o$c implements g	// class@002a28
{
    public final o b;

    public void o$c(o p0){
       this.b = p0;
       super();
    }
    public void H4(MessageNano p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$c.class, "1")) {
       }else {
          b.P(u.a, "SCLiveEncourageTreasureBoxRewardCartoon, "+p0);
          o$c tb = this.b;
          tb.r0(tb.w0()).setValue(p0);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}
