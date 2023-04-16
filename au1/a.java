package au1.a;
import au1.b;
import com.kuaishou.live.viewcontroller.ViewController;
import ws1.c;
import com.kuaishou.protobuf.livestream.nano.SCMultiPKPlayFashionSignal;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.protobuf.livestream.nano.MultiPKPlayFashionInfo;

public abstract class a extends ViewController implements b	// class@0002b2
{
    public Object j;
    public SCMultiPKPlayFashionSignal k;
    public c l;

    public void a(c p0){
       super();
       this.l = p0;
    }
    public final void U1(SCMultiPKPlayFashionSignal p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.k = p0;
       p0 = p0.playFashionInfo;
       if (p0 != null) {
          this.j = this.V2(p0);
       }
       return;
    }
    public abstract Object V2(MultiPKPlayFashionInfo p0);
    public final void n2(String p0){
    }
}
