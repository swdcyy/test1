package com.yxcorp.gifshow.growth.survey.XinhuiSurveyManager$reportXinhuiSurveyResult$5$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import uqa.c;
import com.kwai.feature.api.feed.growth.model.XinhuiDetailSurveyReportModel;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONObject;
import e17.i;
import kotlin.jvm.internal.a;
import java.util.Objects;
import uqa.a;
import uqa.d;
import java.util.concurrent.Callable;
import brd.t;
import t45.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import uqa.f;
import erd.g;
import crd.b;

public final class XinhuiSurveyManager$reportXinhuiSurveyResult$5$1 extends Lambda implements a	// class@0014cf
{
    public final XinhuiDetailSurveyReportModel $it;
    public final c this$0;

    public void XinhuiSurveyManager$reportXinhuiSurveyResult$5$1(c p0,XinhuiDetailSurveyReportModel p1){
       this.this$0 = p0;
       this.$it = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       l1 a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, XinhuiSurveyManager$reportXinhuiSurveyResult$5$1.class, "1")) {
          return;
       }
       try{
          XinhuiDetailSurveyReportModel taskToast = this.$it.taskToast;
          if (!(TextUtils.isEmpty(taskToast) ^ 0x01)) {
             taskToast = objArray;
          }
          if (taskToast != null) {
             String str = new JSONObject(taskToast).optString("completeTipConfig");
             if (str != null) {
                if (TextUtils.isEmpty(str) ^ 0x01) {
                   objArray = str;
                }
                if (objArray != null) {
                   if (TextUtils.isEmpty(new JSONObject(objArray).optString("toastIcon"))) {
                      a.o(i.d(R.style.arg_RES_7f11066a, new JSONObject(objArray).optString("toastTitle")), "KSToast.applyStyle\(R.sty¡­.optString\(\"toastTitle\"\)\)");
                   }else {
                      c b = this.this$0.b;
                      Objects.requireNonNull(b);
                      if (!PatchProxy.applyVoidOneRefs(objArray, b, a.class, "5")) {
                         t.fromCallable(new d(objArray)).subscribeOn(d.c).observeOn(a.c()).subscribe(f.b);
                      }
                      a = l1.a;
                   }
                }
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
