package cz9.b;
import mf5.s0$a;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mf5.w0;
import lf5.c;
import dz9.a0;
import dz9.b0;
import dz9.w;
import dz9.x;
import dz9.n;
import dz9.o;
import dz9.k;
import dz9.p;
import dz9.l;
import dz9.d0;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSubscribeSwitch;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationExtractText;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDownload;
import dz9.e;
import dz9.c0;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch;
import dz9.i;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationAutoPlaySwitch;
import dz9.m;
import dz9.y;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class b extends s0$a	// class@001e4b
{
    public final m0 a;
    public final SlidePageConfig b;

    public void b(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super();
       this.a = p0;
       this.b = p1;
    }
    public List a(){
       w0[] obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new w0[21];
       obj[0] = new c();
       obj[1] = new a0(this.a);
       obj[2] = new b0(this.a);
       obj[3] = new w(this.a);
       obj[4] = new x(this.a);
       obj[5] = new n(this.a, this.b);
       obj[6] = new o(this.a, this.b);
       obj[7] = new k(this.a, this.b);
       obj[8] = new p(this.a, this.b);
       obj[9] = new l(this.a, this.b);
       obj[10] = new d0(this.a, this.b);
       obj[11] = new OperationSubscribeSwitch(this.a, this.b);
       obj[12] = new OperationExtractText(this.a);
       obj[13] = new OperationDownload(this.a);
       obj[14] = new e(this.a);
       obj[15] = new c0();
       obj[16] = new OperationDanmakuSwitch(this.a, this.b);
       obj[17] = new i(this.a, this.b);
       obj[18] = new OperationAutoPlaySwitch(this.a, this.b);
       obj[19] = new m(this.a, this.b);
       obj[20] = new y(this.a);
       return CollectionsKt__CollectionsKt.L(obj);
    }
}
