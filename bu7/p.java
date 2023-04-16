package bu7.p;
import erd.g;
import com.kwai.tokenshare.KwaiTokenInitModule;
import java.lang.Object;
import eda.v;

public final class p implements g	// class@000498
{
    public final KwaiTokenInitModule b;

    public void p(KwaiTokenInitModule p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.onQrCodeInitCompleteEvent(p0);
    }
}
