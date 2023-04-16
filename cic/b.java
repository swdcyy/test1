package cic.b;
import xxb.b$a;
import mhc.p1;
import com.yxcorp.gifshow.share.OperationModel;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class b extends b$a	// class@0005a4
{

    public void b(){
       super();
    }
    public t a(p1 p0,OperationModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "operation");
       a.p(p1, "model");
       t ot = t.just(p1);
       a.o(ot, "Observable.just\(model\)");
       return ot;
    }
}
