package b09.e;
import q09.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.playend.tachikoma.AdPlayEndTKPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import q09.a$a;
import com.kuaishou.android.model.ads.ReplaceTemplateData;
import com.kuaishou.android.model.ads.ReplaceTemplateData$ReplacePlayEndInfo;
import java.lang.CharSequence;
import x49.l;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.l$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import java.util.Objects;
import a59.f;

public final class e implements a	// class@00034d
{
    public final AdPlayEndTKPresenter a;

    public void e(AdPlayEndTKPresenter p0){
       this.a = p0;
       super();
    }
    public void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       a.p(p0, "throwable");
       a$a.a(this, p0);
       return;
    }
    public void e(ReplaceTemplateData p0){
       AdPlayEndTKPresenter k;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       a.p(p0, "data");
       if (!this.a.S8()) {
          return;
       }
       p0 = p0.mPlayEndInfo;
       ReplaceTemplateData$ReplacePlayEndInfo mTemplateId = (p0 != null)? p0.mTemplateId: null;
       l$a uoa = (mTemplateId == null || !mTemplateId.length())? 1: null;
       if (uoa) {
          return;
       }else {
          uoa = l.a;
          PhotoAdvertisement photoAdverti = k.B(AdPlayEndTKPresenter.P8(this.a));
          a.m(photoAdverti);
          String str = "CommercialFeedExt.getPhotoAd\(mPhoto\)!!";
          a.o(photoAdverti, str);
          PhotoAdvertisement$TkTemplateInfo tkTemplateIn = uoa.a(mTemplateId, photoAdverti);
          if (tkTemplateIn != null) {
             PhotoAdvertisement photoAdverti1 = k.B(AdPlayEndTKPresenter.P8(this.a));
             a.m(photoAdverti1);
             a.o(photoAdverti1, str);
             PhotoAdvertisement$TkTemplateData tkTemplateDa = uoa.b(mTemplateId, photoAdverti1);
             if (tkTemplateDa != null) {
                e ta = this.a;
                ta.G = tkTemplateIn;
                ta.H = tkTemplateDa;
                Objects.requireNonNull(ta);
                if (!PatchProxy.applyVoidTwoRefs(tkTemplateIn, tkTemplateDa, ta, AdPlayEndTKPresenter.class, "20")) {
                   k = ta.K;
                   if (k != null) {
                      k.m(tkTemplateDa);
                   }
                   AdPlayEndTKPresenter k1 = ta.K;
                   if (k1 != null) {
                      k1.l(tkTemplateIn);
                   }
                }
             }
          }
          return;
       }
    }
}
