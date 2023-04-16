package c1c.a;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import c1c.a$b;
import nsd.u;
import msd.l;
import java.lang.Object;
import kotlin.jvm.internal.a;
import rsd.a;
import java.lang.Boolean;
import c1c.a$a;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.kwai.robust.PatchProxy;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import b1c.b;
import b1c.a;
import java.lang.Integer;
import java.lang.Float;
import d1c.c;
import w46.b;
import rsd.f;

public abstract class a	// class@0004e8
{
    public boolean a;
    public FilterConfig b;
    public FilterConfig c;
    public final f d;
    public b e;
    public c f;
    public final l g;
    public static final n[] h;
    public static final a$b i;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(a.class, "isInUsing", "isInUsing\(\)Z", 0))};
       a.h = onArray;
       a.i = new a$b(null);
    }
    public void a(l p0){
       a.p(p0, "queryOriginFilterCallback");
       super();
       this.g = p0;
       this.d = new a$a(Boolean.FALSE, Boolean.FALSE, this);
    }
    public final void a(FilterConfig p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "5")) {
          return;
       }
       a uoa1 = a.D();
       StringBuilder str = "记忆滤镜的原始力度，对应的滤镜输入为 ";
       String str1 = (p0 != null)? p0.toSimpleString(): null;
       Object[] objArray = new Object[0];
       uoa1.E("EffectBus-Filter_Base", "[filter][keypath] ", str+str1, objArray);
       if (FilterConfig.isEmptyOrNull(p0)) {
          this.c = null;
          Object[] objArray1 = new Object[0];
          a.D().w("EffectBus-Filter_Base", "记忆滤镜的原始力度， 无需备份", objArray1);
          p0 = null;
       }else {
          FilterConfig uFilterConfi = PatchProxy.applyOneRefs(p0, this, uoa, "7");
          if (uFilterConfi == PatchProxyResult.class) {
             uFilterConfi = this.g.invoke(p0);
          }
          this.c = uFilterConfi;
          a.m(p0);
          Object[] objArray2 = new Object[0];
          a.D().w("EffectBus-Filter_Base", "记忆滤镜的原始力度， 备份滤镜"+p0.toSimpleString(), objArray2);
       }
       this.b = p0;
       return;
    }
    public final FilterConfig b(){
       return this.b;
    }
    public final FilterConfig c(){
       return this.c;
    }
    public final b d(){
       return this.e;
    }
    public abstract int e();
    public final boolean f(){
       return this.a;
    }
    public abstract void g(a p0);
    public final void h(FilterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       FilterConfig uFilterConfi = null;
       Integer integer = (p0 != null)? Integer.valueOf(p0.mFilterId): uFilterConfi;
       a tc = this.c;
       Integer integer1 = (tc != null)? Integer.valueOf(tc.mFilterId): uFilterConfi;
       if (!(a.g(integer, integer1) ^ 0x01)) {
          Float uFloat = (p0 != null)? Float.valueOf(p0.mIntensity): uFilterConfi;
          a tb = this.b;
          if (tb != null) {
             uFilterConfi = Float.valueOf(tb.mIntensity);
          }
          if (a.f(uFloat, uFilterConfi) ^ 0x01) {
          label_0046 :
             Object[] objArray = new Object[0];
             a.D().w("EffectBus-Filter_Base", "当前滤镜与之前滤镜不同，尝试进行滤镜恢复", objArray);
             a tc1 = this.c;
             if (tc1 != null) {
                this.i(tc1);
             }
          }
       }else {
          goto label_0046 ;
       }
       return;
    }
    public final void i(FilterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a tf = this.f;
       FilterConfig uFilterConfi = (tf != null)? tf.m(p0.mFilterId): null;
       int i = 0;
       if (uFilterConfi == null || uFilterConfi.isEmptyFilter()) {
          Object[] objArray = new Object[i];
          a.D().t("EffectBus-Filter_Base", "restoreIntensityError:"+p0.mFilterId, objArray);
          return;
       }else if(!uFilterConfi.mIntensity - p0.mIntensity && uFilterConfi.mChangeIntensityByMagic == null){
          return;
       }else {
          Object[] objArray1 = new Object[i];
          a.D().A("EffectBus-Filter_Base", "恢复原始滤镜力度"+uFilterConfi.toSimpleString()+" -> "+p0.mIntensity, objArray1);
          uFilterConfi.mIntensity = p0.mIntensity;
          uFilterConfi.mChangeIntensityByMagic = i;
          a tf1 = this.f;
          if (tf1 != null) {
             tf1.A();
          }
          return;
       }
    }
    public final void j(FilterConfig p0){
       this.b = p0;
    }
    public final void k(b p0){
       this.e = p0;
    }
    public abstract void l(int p0);
    public final void m(boolean p0){
       this.a = p0;
    }
    public String toString(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, uoa, "8");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "FilterStateProvider\(priority="+this.e()+", isProviderEnabled="+this.a+", "+"isInUsing=";
       Boolean uBoolean = PatchProxy.apply(objArray, this, uoa, "1");
       if (uBoolean == patchProxyRe) {
          uBoolean = this.d.a(this, a.h[0]);
       }
       return obj+uBoolean.booleanValue()+", outState="+this.e+')';
    }
}
