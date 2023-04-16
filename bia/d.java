package bia.d;
import vga.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import xl8.b;
import java.lang.Boolean;
import java.lang.Float;
import java.lang.Integer;
import java.util.ArrayList;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import vga.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;

public final class d implements b	// class@0003c3
{
    public final b a;
    public final b b;
    public BaseFragment c;
    public GifshowActivity d;
    public final b e;
    public final b f;
    public final b g;
    public final b h;

    public void d(GifshowActivity p0){
       a.p(p0, "activity");
       super();
       Boolean fALSE = Boolean.FALSE;
       this.f = new b(fALSE);
       this.g = new b(Float.valueOf(0x3f800000));
       this.d = p0;
       this.a = new b(fALSE);
       this.h = new b(fALSE);
       this.b = new b(Integer.valueOf(0));
       this.e = new b(new ArrayList());
    }
    public void d(BaseFragment p0){
       a.p(p0, "fragment");
       super();
       Boolean fALSE = Boolean.FALSE;
       this.f = new b(fALSE);
       this.g = new b(Float.valueOf(0x3f800000));
       this.c = p0;
       this.a = new b(fALSE);
       this.h = new b(fALSE);
       this.b = new b(Integer.valueOf(0));
       this.e = new b(new ArrayList());
    }
    public void a(){
       a.a(this);
    }
    public final int b(){
       Object obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj == PatchProxyResult.class) {
          obj = this.b.a();
          a.o(obj, "mFollowLiveTipsNumber.value");
       }
       return obj.intValue();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj == PatchProxyResult.class) {
          obj = this.a.a();
          a.o(obj, "mLiveTipsEntranceShowState.value");
       }
       return obj.booleanValue();
    }
    public final void d(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "11")) {
          return;
       }
       this.h.d(Boolean.valueOf(p0));
       return;
    }
    public final void e(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "7")) {
          return;
       }
       this.a.d(Boolean.valueOf(p0));
       return;
    }
    public final void f(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "9")) {
          return;
       }
       this.b.d(Integer.valueOf(p0));
       return;
    }
    public final void g(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "14")) {
          return;
       }
       this.e.d(p0);
       return;
    }
}
