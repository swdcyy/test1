package g7a.k$a;
import d6a.a;
import g7a.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import qvb.q;
import qvb.j;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import hn5.f0;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import g7a.u0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p0;
import tkd.b;
import tkd.d;
import gx5.d;
import qvb.i;

public final class k$a extends a	// class@0023e0
{
    public final k b;

    public void k$a(k p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "2")) {
          return;
       }
       k.W8(this.b).g(this.b.z);
       k$a tb = this.b;
       k w = tb.w;
       if (w != null) {
          w.f(tb.y);
       }
       k.R8(this.b).M.onNext(Boolean.TRUE);
       return;
    }
    public void i2(){
       int i;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k$a.class, "1")) {
          return;
       }
       k.W8(this.b).i(this.b.z);
       k$a tb = this.b;
       Objects.requireNonNull(tb);
       k$a obj = PatchProxy.apply(objArray, tb, ok, "6");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          k q = tb.q;
          String str1 = "mPhoto";
          if (q == null) {
             a.S(str1);
          }
          PhotoMeta photoMeta = q.getPhotoMeta();
          photoMeta = (photoMeta != null)? photoMeta.mViewCount: null;
          f0 uof0 = b.a(0x238e5b38);
          k q1 = tb.q;
          if (q1 == null) {
             a.S(str1);
          }
          int i1 = uof0.d(q1.getPhotoId());
          if (photoMeta < i1) {
             i = i1;
          }
       }
       tb.x = i;
       MilanoContainerEventBus l = k.R8(this.b).L;
       obj = this.b;
       k x = obj.x;
       Objects.requireNonNull(obj);
       if (PatchProxy.isSupport(ok)) {
          str = PatchProxy.applyOneRefs(Integer.valueOf(x), obj, ok, "7");
          if (str != patchProxyRe) {
          label_0096 :
             l.onNext(str);
             NasaSlideParam nasaSlidePar = k.S8(this.b).getNasaSlideParam();
             a.o(nasaSlidePar, "mNasaBizParam.nasaSlideParam");
             if (!u0.a(k.V8(this.b), nasaSlidePar.isFromViewerKwaiLink(), k.S8(this.b).getNasaSlideParam().shouldShowViewerTab())) {
                k.R8(this.b).K.onNext(CollectionsKt__CollectionsKt.E());
                return;
             }else if(k.V8(this.b).getRecentViewers() != null){
                k$a tb1 = this.b;
                List recentViewer = k.V8(tb1).getRecentViewers();
                a.m(recentViewer);
                a.o(recentViewer, "mPhoto.recentViewers!!");
                k.R8(this.b).K.onNext(tb1.X8(recentViewer));
                return;
             }else if(!p0.C(this.b.getContext())){
                k.R8(this.b).K.onNext(CollectionsKt__CollectionsKt.E());
                return;
             }else {
                this.b.w = d.a(-1188553266).SA(k.V8(this.b), Integer.valueOf(3));
                k$a tb2 = this.b;
                ok = tb2.w;
                if (ok != null) {
                   ok.h(tb2.y);
                }
                k w = this.b.w;
                if (w != null) {
                   w.a();
                }
                return;
             }
          }
       }
       str = a1.r(R.string.arg_RES_7f104632, TextUtils.N((long)x));
       a.o(str, "CommonUtil.string\(\n     ¡­viewCount.toLong\(\)\)\n    \)");
       goto label_0096 ;
    }
}
