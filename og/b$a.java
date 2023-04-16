package og.b$a;
import erd.g;
import og.b;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.lang.Object;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasStartResult$Data;
import og.a;
import f55.g;

public final class b$a implements g	// class@002790
{
    public final b b;
    public final long c;
    public final JsSelectMixMediasResultBase d;

    public void b$a(b p0,long p1,JsSelectMixMediasResultBase p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (p0.mDuration == null) {
          p0.mDuration = (int)this.c;
       }
       a.d.g(this.d, p0, this.b.b);
       return;
    }
}
