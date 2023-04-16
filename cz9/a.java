package cz9.a;
import mf5.v0$a;
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
import dz9.k;
import dz9.d;
import dz9.m;
import dz9.d0;
import dz9.l;
import dz9.p;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDownload;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationExtractText;
import dz9.z;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationSpeedSetting;
import com.yxcorp.gifshow.detail.common.negative.operation.item.OperationDanmakuSwitch;
import dz9.h;
import dz9.i;
import dz9.v;
import dz9.g;
import dz9.u;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class a extends v0$a	// class@001e4a
{
    public final m0 a;
    public final SlidePageConfig b;

    public void a(m0 p0,SlidePageConfig p1){
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super();
       this.a = p0;
       this.b = p1;
    }
    public List a(){
       w0[] obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new w0[16];
       obj[0] = new k(this.a, this.b);
       obj[1] = new d(this.a, this.b);
       obj[2] = new m(this.a, this.b);
       obj[3] = new d0(this.a, this.b);
       obj[4] = new l(this.a, this.b);
       obj[5] = new p(this.a, this.b);
       obj[6] = new OperationDownload(this.a);
       obj[7] = new OperationExtractText(this.a);
       obj[8] = new z(this.a);
       obj[9] = new OperationSpeedSetting(this.a);
       obj[10] = new OperationDanmakuSwitch(this.a, this.b);
       obj[11] = new h(this.a, this.b);
       obj[12] = new i(this.a, this.b);
       obj[13] = new v(this.a);
       obj[14] = new g(this.a);
       obj[15] = new u(this.a, this.b);
       return CollectionsKt__CollectionsKt.L(obj);
    }
}
