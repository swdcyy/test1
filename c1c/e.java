package c1c.e;
import c1c.a;
import c1c.e$a;
import nsd.u;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import b1c.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import b1c.a$d;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import b1c.b;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$d;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$b;

public final class e extends a	// class@0004f0
{
    public int j;
    public static final e$a k;

    static {
       e.k = new e$a(null);
    }
    public void e(l p0){
       a.p(p0, "callback");
       super(p0);
    }
    public int e(){
       return this.j;
    }
    public void g(a p0){
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "1")) {
          return;
       }
       a.p(p0, "filterProviderAction");
       FilterConfig uFilterConfi = p0.a();
       int i = 0;
       if (p0 instanceof a$d) {
          a uoa = a.D();
          StringBuilder str = "用户输入 ";
          String str1 = (uFilterConfi != null)? uFilterConfi.toSimpleString(): null;
          Object[] objArray = new Object[i];
          uoa.w("EffectBus-Filter_User", str+str1, objArray);
          a0 uoa0 = p0.b();
          if (!PatchProxy.applyVoidTwoRefs(uFilterConfi, uoa0, this, uoe, "2")) {
             this.m(true);
             this.j(uFilterConfi);
             b uob = new b();
             uob.e(uFilterConfi);
             uob.g(true);
             uob.h(uoa0);
             this.k(uob);
          }
       }else {
          Object[] objArray1 = new Object[i];
          a.D().w("EffectBus-Filter_User", "其它输入事件，不管魔表美妆是应用或者取消，都输出用户滤镜", objArray1);
          this.m(true);
          b uob1 = new b();
          FilterConfig uFilterConfi1 = this.b();
          if (uFilterConfi1 == null) {
             uFilterConfi1 = FilterConfig.getEmpty();
          }
          uob1.e(uFilterConfi1);
          uob1.g(true);
          uob1.h(a0.b.a());
          this.k(uob1);
       }
       return;
    }
    public void l(int p0){
       this.j = p0;
    }
}
