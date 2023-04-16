package g33.d;
import io.reactivex.g;
import com.kuaishou.live.external.p;
import y3.f;
import java.lang.Object;
import brd.v;
import com.kuaishou.live.external.q;
import java.lang.String;
import qs5.e;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;

public final class d implements g	// class@002a4e
{
    public final p b;
    public final f c;

    public void d(p p0,f p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       d tb = this.b;
       LivePluginManager.h(false, new q(tb, tb.toString(), p0, this.c));
    }
}
