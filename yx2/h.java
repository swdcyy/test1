package yx2.h;
import co2.f2;
import qu2.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yx2.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class h	// class@004d62
{
    public final f2 a;
    public final a b;

    public void h(f2 p0,a p1){
       a.p(p0, "voicePartyContext");
       a.p(p1, "liveBasicContext");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final f2 d(){
       return this.a;
    }
    public final d e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "action2");
       return new d(p0, this.a, this.b);
    }
}
