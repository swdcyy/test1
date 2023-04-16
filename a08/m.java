package a08.m;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.kwaishou.merchant.daccore.log.DyTroubleShooting;
import com.kwaishou.merchant.daccore.log.DACKeyNode;
import java.lang.String;
import java.util.Map;
import com.kwaishou.merchant.troubleshooting.core.model.RubasParams;

public final class m implements g	// class@000012
{
    public final b b;

    public void m(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m tb = this.b;
       Objects.requireNonNull(tb);
       DyTroubleShooting.j(tb.l, DACKeyNode.DAC_ENV_INIT, "observer page agreement error", p0, null, false, null, 112, null);
    }
}
