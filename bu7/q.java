package bu7.q;
import erd.g;
import com.kwai.tokenshare.KwaiTokenInitModule;
import java.lang.Object;
import ujc.e;

public final class q implements g	// class@000499
{
    public final KwaiTokenInitModule b;

    public void q(KwaiTokenInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onEventMainThread(p0);
    }
}
