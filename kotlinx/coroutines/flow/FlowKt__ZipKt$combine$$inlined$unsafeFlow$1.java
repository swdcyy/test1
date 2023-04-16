package kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import jtd.d;
import msd.q;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1;
import msd.r;
import kotlinx.coroutines.flow.internal.CombineKt;
import csd.b;
import qrd.l1;

public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 implements d	// class@001ad8
{
    public final d a;
    public final d b;
    public final q c;

    public void FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(d p0,d p1,q p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public Object b(e p0,c p1){
       p0 = CombineKt.d(p0, this.a, this.b, new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1$lambda$1(null, this), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
