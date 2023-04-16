package fhd.f;
import jhc.d;
import java.lang.Object;
import java.util.HashMap;
import fhd.f$a;
import jhc.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j33.e;
import jhc.f;
import jhc.h;
import xgc.k;
import bhd.c;
import ahd.a;
import dhd.b;
import jhc.g;
import ahd.b;
import ahd.f;
import ahd.h;
import ahd.d;
import ahd.c;
import ahd.j;
import ahd.n;
import ahd.k;
import ahd.e;
import ahd.m;
import chd.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import com.yxcorp.gifshow.settings.stencil.entity.SettingItemStencil;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Map;
import fhd.h;
import kotlin.collections.CollectionsKt__CollectionsKt;
import fhd.e;
import fhd.g;

public final class f implements d	// class@000e40
{
    public final HashMap a;

    public void f(){
       super();
       this.a = new HashMap();
       f$a uoa = new f$a(this);
       if (PatchProxy.applyVoidOneRefs(uoa, null, e.class, "1")) {
       }else if(PatchProxy.applyVoidOneRefs(uoa, null, e.class, "1")){
          uoa.b(new e());
       }
       if (!PatchProxy.applyVoidOneRefs(uoa, null, k.class, "1")) {
          uoa.b(new k());
       }
       this.g(new c());
       this.g(new a());
       this.h(new b());
       this.g(new b());
       this.g(new f());
       this.g(new h());
       this.g(new d());
       this.g(new c());
       this.g(new j());
       this.g(new n());
       this.g(new k());
       this.g(new e());
       this.g(new m());
       this.g(new e());
       return;
    }
    public List e(BaseFragment p0,Object p1,String p2){
       List list1;
       List list = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          a.p(p0, "targetFragment");
          a.p(p1, "data");
          a.p(p2, "pageKey");
          h oh = this.a.get(p1.getItemKey());
          if (oh != null) {
             list1 = oh.c(p0, p1, p2);
             if (list1 != null) {
             label_003d :
                list = list1;
             }
          }
          list1 = CollectionsKt__CollectionsKt.E();
          goto label_003d ;
       }
       return list;
    }
    public final void f(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "4")) {
          return;
       }
       this.a.put(p0.b(), p0);
       return;
    }
    public final void g(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.f(new e(p0));
       return;
    }
    public final void h(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       this.f(new g(p0));
       return;
    }
}
