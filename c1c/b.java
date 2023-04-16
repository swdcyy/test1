package c1c.b;
import c1c.a;
import c1c.b$a;
import nsd.u;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$c;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import b1c.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import b1c.a$a;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import xyb.a;
import java.lang.StringBuilder;
import java.lang.Boolean;
import b1c.b;
import q87.c;
import java.util.Objects;
import b1c.a$d;

public final class b extends a	// class@0004ea
{
    public int j;
    public static final b$a k;

    static {
       b.k = new b$a(null);
    }
    public void b(l p0){
       a.p(p0, "callback");
       super(p0);
       this.j = a0$c.c.a();
    }
    public int e(){
       return this.j;
    }
    public void g(a p0){
       Object[] objArray1;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       a.p(p0, "filterProviderAction");
       String str = "EffectBus-Filter_EXTERNAL";
       if (p0 instanceof a$a) {
          a$a uoa = p0.a();
          a$a c = p0.c;
          a uoa1 = a.D();
          StringBuilder str1 = "使用外部带入滤镜 ";
          String str2 = (uoa != null)? uoa.toSimpleString(): null;
          Object[] objArray = new Object[0];
          uoa1.E(str, "[filter][keypath] ", str1+str2+", 是否取消: "+c, objArray);
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(uoa, Boolean.valueOf(c), this, uob, "2")) {
             if (c != null) {
                this.m(0);
                this.k(null);
             }else if(FilterConfig.isEmptyOrNull(uoa)){
                objArray1 = new Object[0];
                a.D().w(str, "外部带入滤镜为空，忽略本次", objArray1);
             }else {
                this.m(true);
                uob = new b();
                Objects.requireNonNull(a0.b);
                uob.h(a0$c.c);
                uob.g(true);
                uob.e(uoa);
                this.k(uob);
             }
          }
       }else if(p0 instanceof a$d){
          if (!p0.b().b()) {
             this.m(0);
             objArray1 = new Object[0];
             a.D().w(str, " 用户滤镜事件到达，禁用外部带入滤镜 Provider", objArray1);
          }
       }else {
          this.m(0);
          objArray1 = new Object[0];
          a.D().w(str, "其它输入事件到达，禁用外部带入滤镜 Provider", objArray1);
       }
       return;
    }
    public void l(int p0){
       this.j = p0;
    }
}
