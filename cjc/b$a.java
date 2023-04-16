package cjc.b$a;
import erd.o;
import cjc.b;
import com.yxcorp.gifshow.share.KwaiOperator;
import java.lang.Object;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;
import pic.h;

public final class b$a implements o	// class@0005b5
{
    public final b b;
    public final KwaiOperator c;

    public void b$a(b p0,KwaiOperator p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = this.b.B0(this.c);
       }
       return ot;
    }
}
