package c1c.c;
import c1c.a;
import c1c.c$a;
import nsd.u;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0$e;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import b1c.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import b1c.a$b;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import xyb.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Boolean;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import q87.c;
import b1c.b;
import b1c.a$d;

public final class c extends a	// class@0004ec
{
    public int j;
    public MagicEmoji$MagicFace k;
    public static final c$a l;

    static {
       c.l = new c$a(null);
    }
    public void c(l p0){
       a.p(p0, "callback");
       super(p0);
       this.j = a0$e.c.a();
    }
    public int e(){
       return this.j;
    }
    public void g(a p0){
       Object[] objArray1;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "1")) {
          return;
       }
       a.p(p0, "filterProviderAction");
       String str = "EffectBus-Filter_Magic";
       int i = 0;
       if (p0 instanceof a$b) {
          a$b uob = p0;
          a$b b = uob.b;
          boolean b1 = uob.b();
          FilterConfig uFilterConfi = p0.a();
          a uoa = a.D();
          StringBuilder str1 = "魔表输入 ";
          SimpleMagicFace mName = (b != null)? b.mName: null;
          str1 = str1+mName+", "+"魔表是否禁用滤镜？"+b1+"， "+"魔表关联滤镜？";
          String str2 = (uFilterConfi != null)? uFilterConfi.toSimpleString(): null;
          Object[] objArray = new Object[i];
          uoa.E(str, "[filter][keypath] ", str1+str2, objArray);
          if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidThreeRefs(b, Boolean.valueOf(b1), uFilterConfi, this, c.class, "2")) {
             this.h(uFilterConfi);
             this.a(uFilterConfi);
             if (b != null) {
                objArray1 = 1;
                if (uFilterConfi == null || (uFilterConfi.isKeepCurrentFilter() != objArray1 || b1)) {
                   if (MagicBaseConfig.same(b, this.k)) {
                      Object[] objArray2 = new Object[i];
                      a.D().w(str, "与上次魔表相同", objArray2);
                   }
                   this.k = b;
                   this.m(objArray1);
                   b uob1 = new b();
                   uob1.h(a0$e.c);
                   if (b1) {
                      uob1.f(objArray1);
                      uob1.e(null);
                   }else {
                      uob1.e(uFilterConfi);
                   }
                   this.k(uob1);
                }
             }
             objArray1 = new Object[i];
             a.D().E(str, "[filter][keypath] ", "取消魔表或者A类魔表关联滤镜为使用当前", objArray1);
             this.m(i);
             this.k = b;
             this.k(null);
          }
       }else if(p0 instanceof a$d){
          Object[] objArray3 = new Object[i];
          a.D().w(str, "魔表响应用户输入，重置魔表状态", objArray3);
          if (!PatchProxy.applyVoid(null, this, uoc, "3")) {
             if (this.f()) {
                this.m(i);
             }
             this.k(null);
          }
       }else {
          objArray1 = new Object[i];
          a.D().w(str, "魔表不响应美妆以及外部带入滤镜事件", objArray1);
       }
       return;
    }
    public void l(int p0){
       this.j = p0;
    }
}
