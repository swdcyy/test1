package og.a$c;
import erd.g;
import f55.g;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasResultBase;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.KwaiException;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasErrorResult;
import qrd.l1;
import com.kwai.imsdk.internal.data.FailureException;
import android.content.res.Resources;
import lnc.a1;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import o56.a;
import k2b.u1;

public final class a$c implements g	// class@00278a
{
    public final g b;
    public final JsSelectMixMediasResultBase c;

    public void a$c(g p0,JsSelectMixMediasResultBase p1){
       a.p(p0, "callback");
       a.p(p1, "task");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void accept(Object p0){
       JsSelectMixMediasErrorResult jsSelectMixM;
       a.p(p0, "it");
       if (p0 instanceof KwaiException) {
          jsSelectMixM = new JsSelectMixMediasErrorResult();
          KwaiException kwaiExceptio = p0;
          jsSelectMixM.mErrorMessage = kwaiExceptio.mErrorMessage;
          jsSelectMixM.mResult = kwaiExceptio.getErrorCode();
          jsSelectMixM.copyFrom(this.c);
          this.b.onSuccess(jsSelectMixM);
       }else if(p0 instanceof FailureException){
          jsSelectMixM = new JsSelectMixMediasErrorResult();
          FailureException uFailureExce = p0;
          jsSelectMixM.mErrorMessage = uFailureExce.getErrorMsg();
          jsSelectMixM.mResult = uFailureExce.getResultCode();
          jsSelectMixM.copyFrom(this.c);
          this.b.onSuccess(jsSelectMixM);
       }else {
          a$c tb = this.b;
          jsSelectMixM = new JsSelectMixMediasErrorResult();
          String message = p0.getMessage();
          Resources resources = (message == null || !message.length())? 1: null;
          message = (resources)? a1.m().getString(R.string.arg_RES_7f104f9d): p0.getMessage();
          jsSelectMixM.mErrorMessage = message;
          jsSelectMixM.mResult = 441;
          jsSelectMixM.copyFrom(this.c);
          tb.onSuccess(jsSelectMixM);
       }
       StringWriter stringWriter = new StringWriter();
       p0.printStackTrace(new PrintWriter(stringWriter));
       p0 = new ClientEvent$ExceptionEvent();
       p0.message = stringWriter.toString();
       p0.type = 2;
       String r = a.r;
       String str = "";
       if (r == null) {
          r = str;
       }
       p0.androidPatchBaseVersion = r;
       r = a.o;
       if (r != null) {
          str = r;
       }
       p0.androidPatchVersion = str;
       u1.d0(p0);
       return;
    }
}
