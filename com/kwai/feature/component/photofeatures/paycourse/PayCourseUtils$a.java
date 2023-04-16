package com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils$a;
import n3d.a;
import z1.a;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.component.photofeatures.paycourse.PayCourseUtils$H5PayCounterResult;
import ekd.j0;

public final class PayCourseUtils$a implements a	// class@001227
{
    public final a b;

    public void PayCourseUtils$a(a p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       Object obj;
       PayCourseUtils$H5PayCounterResult h5PayCounter;
       if (PatchProxy.isSupport(PayCourseUtils$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, PayCourseUtils$a.class, "1")) {
          return;
       }
       PayCourseUtils$a tb = this.b;
       if (p2 != null) {
          PayCourseUtils e = PayCourseUtils.e;
          Objects.requireNonNull(e);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          obj = PatchProxy.applyOneRefs(p2, e, PayCourseUtils.class, "1");
          if (obj != patchProxyRe) {
          }else {
             int i = j0.b(p2, PayCourseUtils.a, 0);
             if (PatchProxy.isSupport(PayCourseUtils.class)) {
                h5PayCounter = PatchProxy.applyOneRefs(Integer.valueOf(i), e, PayCourseUtils.class, "2");
                if (h5PayCounter != patchProxyRe) {
                }else {
                label_0051 :
                   h5PayCounter = PayCourseUtils$H5PayCounterResult.SUCCESS;
                   if (i != h5PayCounter.getValue()) {
                      h5PayCounter = PayCourseUtils$H5PayCounterResult.FAIL;
                      if (i != h5PayCounter.getValue()) {
                         h5PayCounter = PayCourseUtils$H5PayCounterResult.TOSERVICE;
                         if (i != h5PayCounter.getValue()) {
                            h5PayCounter = PayCourseUtils$H5PayCounterResult.OTHER;
                         }
                      }
                   }
                }
             }else {
                goto label_0051 ;
             }
             obj = h5PayCounter;
             String str = j0.f(p2, PayCourseUtils.c);
             String str1 = "";
             if (str == null) {
                str = str1;
             }
             obj.setUrl(str);
             str = j0.f(p2, PayCourseUtils.b);
             if (str != null) {
                str1 = str;
             }
             obj.setMessage(str1);
          }
          if (obj != null) {
          label_0090 :
             tb.accept(obj);
             return;
          }
       }
       obj = PayCourseUtils$H5PayCounterResult.OTHER;
       goto label_0090 ;
    }
}
