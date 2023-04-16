package ap6.y2;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.lang.Object;
import java.util.Objects;
import java.lang.String;
import l85.b;
import dp6.b;
import hp6.b;

public final class y2 implements Callable	// class@000388
{
    public final g b;

    public void y2(g p0){
       this.b = p0;
    }
    public final Object call(){
       y2 tb = this.b;
       Objects.requireNonNull(tb);
       b.b("KwaiGroupObservables", "syncUserGroup start");
       return b.i(tb.c).l();
    }
}
