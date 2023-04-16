package com.yxcorp.gifshow.music.utils.kottor.KPresenterV2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import crd.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rsd.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import msd.p;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt;
import mqb.a;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.music.utils.kottor.KotterKnifeKt$optional$1;
import com.yxcorp.gifshow.music.utils.kottor.KPresenterV2$viewFinder$1;
import com.smile.gifshow.annotation.provider.v2.a;

public class KPresenterV2 extends PresenterV2	// class@00209a
{
    public a p;

    public void KPresenterV2(){
       super();
    }
    public final void P8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KPresenterV2.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.X7(p0);
       }
       return;
    }
    public final e R8(int p0){
       p obj;
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KPresenterV2 kPresenterV2 = KPresenterV2.class;
       if (PatchProxy.isSupport(kPresenterV2)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kPresenterV2, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.V8();
       KotterKnifeKt kotterKnifeK = KotterKnifeKt.class;
       if (PatchProxy.isSupport(kotterKnifeK)) {
          uoa = PatchProxy.applyTwoRefs(Integer.valueOf(p0), obj, null, kotterKnifeK, "27");
          if (uoa != patchProxyRe) {
          label_0044 :
             return uoa;
          }
       }
       a.p(obj, "finder");
       uoa = new a(new KotterKnifeKt$optional$1(obj, p0));
       goto label_0044 ;
    }
    public final e S8(int p0){
       KPresenterV2 kPresenterV2 = KPresenterV2.class;
       if (PatchProxy.isSupport(kPresenterV2)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, kPresenterV2, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return KotterKnifeKt.d(p0, this.V8());
    }
    public final p V8(){
       Object obj = PatchProxy.apply(null, this, KPresenterV2.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KPresenterV2$viewFinder$1(this);
    }
    public void b8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KPresenterV2.class, "6")) {
          return;
       }
       super.b8(p0);
       this.p = p0;
       return;
    }
}
