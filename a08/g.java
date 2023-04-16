package a08.g;
import erd.g;
import com.kwaishou.merchant.daccore.b;
import java.lang.Object;
import java.util.Map;
import com.kwaishou.merchant.daccore.PendantHolder;
import java.lang.String;
import com.kwaishou.merchant.daccore.PendantEnvReadyLatch;

public final class g implements g	// class@00000c
{
    public final b b;

    public void g(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       b b = tb.b;
       if (b != null) {
          b.g().clear();
          b.g().putAll(p0);
       }
       tb.h.b("type_page_agreement");
       return;
    }
}
