package a08.e;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import java.lang.String;
import d08.a;
import java.lang.Object;
import java.lang.Throwable;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import java.util.Map;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import l08.c;

public final class e implements g	// class@00000a
{
    public final b b;
    public final String c;
    public final a d;

    public void e(b p0,String p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       e tb = this.b;
       DyTroubleShooting.k(tb.l, this.c, DACKeyNode.COMPONENT_SHOULD_SHOW, "getPendantInfo error", p0, null, false, null, 224, null);
       tb.l(tb.b(this.d, null));
    }
}
