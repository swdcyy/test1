package gz9.l;
import z1.a;
import gz9.b;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils$H5PayCounterResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import uw9.o;
import q87.c;
import com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils;
import android.content.Context;

public final class l implements a	// class@002521
{
    public final b a;

    public void l(b p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          a.p(p0, "h5PayCounterResult");
          b e = this.a.e;
          String str = "mActivity";
          a.o(e, str);
          if (!e.isFinishing()) {
             String str1 = "PayCoursePaymentController";
             int i = 0;
             if (p0 == PayCourseUtils$H5PayCounterResult.SUCCESS) {
                objArray = new Object[i];
                o.C().w(str1, "h5 pay success", objArray);
                p0 = this.a;
                p0.b(p0.d());
             }else if(p0 == PayCourseUtils$H5PayCounterResult.FAIL){
                objArray = new Object[i];
                o.C().w(str1, "h5 pay fail", objArray);
                this.a.c();
             }else if(p0 == PayCourseUtils$H5PayCounterResult.TOSERVICE){
                if ((p0.getUrl()).length() > 0) {
                   i = 1;
                }
                if (i) {
                   b e1 = this.a.e;
                   a.o(e1, str);
                   PayCourseUtils.e.e(e1, p0.getUrl());
                }
             }
          }
       }
       return;
    }
}
