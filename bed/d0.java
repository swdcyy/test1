package bed.d0;
import erd.o;
import bed.q0;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import qm6.b$a;
import android.content.Context;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import bed.o0;
import brd.t;

public final class d0 implements o	// class@000403
{
    public final q0 b;

    public void d0(q0 p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       b$a uoa = new b$a(this.b.a, 0);
       if (p0 != q0.d) {
          uoa.J(p0);
          uoa.K(true);
       }else {
          uoa.a0(0);
       }
       return y6.s(RecordPostPlugin.class, LoadPolicy.SILENT_IMMEDIATE).w(new o0(uoa));
    }
}
