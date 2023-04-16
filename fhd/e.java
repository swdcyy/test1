package fhd.e;
import fhd.h;
import jhc.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import jhc.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ehc.b;
import trd.t;
import fhd.h$a;
import java.lang.Boolean;

public final class e implements h	// class@000e3e
{
    public final String a;
    public final f b;

    public void e(f p0){
       a.p(p0, "creator");
       super();
       this.b = p0;
       this.a = p0.b();
    }
    public List a(BaseFragment p0,SettingItemStencil p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       return t.k(this.b.a(p0, p1));
    }
    public String b(){
       return this.a;
    }
    public List c(BaseFragment p0,SettingItemStencil p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "targetFragment");
       a.p(p1, "data");
       a.p(p2, "pageKey");
       return h$a.a(this, p0, p1, p2);
    }
    public boolean d(SettingItemStencil p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "data");
       return this.b.c(p0);
    }
    public List e(BaseFragment p0,Object p1,String p2){
       return this.c(p0, p1, p2);
    }
}
