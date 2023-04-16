package gz9.j;
import erd.g;
import gz9.b;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.CoursePrepayResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.CoursePrepayResponse$CoursePrepayInfo;
import java.util.Objects;
import android.app.Activity;
import com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils;
import gz9.l;
import android.content.Context;
import z1.a;
import com.kwai.feature.api.feed.detail.router.DetailLogParam;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.PayCourseApiService;
import brd.t;
import cjd.e;
import erd.o;
import gz9.c;
import erd.a;
import gz9.d;
import gz9.e;
import crd.b;
import crd.a;

public final class j implements g	// class@00251f
{
    public final b b;

    public void j(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       String str;
       b e;
       b b;
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
       }else {
          a.p(p0, "response");
          if (p0.data.useH5PayCounter != null) {
             this.b.a();
             j tb = this.b;
             p0 = p0.data.payCounterUrl;
             a.o(p0, "response.data.payCounterUrl");
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uob, "11")) {
                uob = tb.e;
                str = "mActivity";
                a.o(uob, str);
                if (!uob.isFinishing()) {
                   e = tb.e;
                   a.o(e, str);
                   PayCourseUtils.e.d(e, p0, new l(tb));
                }
             }
          }else {
             p0 = this.b;
             Objects.requireNonNull(p0);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, p0, uob, "10")) {
                uob = p0.b;
                str = "mPhotoDetailParam";
                a.o(uob, str);
                String pageUrlParam = uob.getDetailLogParam().getPageUrlParam("utm_source");
                if (pageUrlParam != null) {
                   e = (pageUrlParam.length() > 0)? 1: 0;
                   if (e) {
                      objArray = pageUrlParam;
                   }
                   if (objArray != null) {
                   label_008b :
                      b = p0.b;
                      a.o(b, str);
                      p0.i.c(b.a(0x74d268f).addOrder(p0.d(), objArray, b.getDetailLogParam().getPageUrlParam("h5_page"), true, "photo").map(new e()).doFinally(new c(p0)).subscribe(new d(p0), new e(p0)));
                   }
                }
                objArray = "fromTrialPlay";
                goto label_008b ;
             }
          }
       }
       return;
    }
}
