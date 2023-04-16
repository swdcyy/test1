package k2b.u;
import ok.x;
import com.yxcorp.gifshow.log.g;
import java.lang.Object;
import java.util.Objects;
import com.kwai.sdk.switchconfig.a;
import k2b.v;
import java.lang.reflect.Type;
import el.a;
import java.lang.String;
import java.util.List;

public final class u implements x	// class@001bbe
{
    public final g b;

    public void u(g p0){
       this.b = p0;
    }
    public final Object get(){
       u tb = this.b;
       Objects.requireNonNull(tb);
       return a.t().getValue("expTagBlackList", new v(tb).getType(), null);
    }
}
