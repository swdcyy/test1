package aa6.b;
import b3b.a;
import com.kwai.framework.logger.uploader.a;
import com.kuaishou.android.vader.Channel;
import java.lang.String;
import java.lang.Class;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import com.kuaishou.android.vader.config.LogResponse;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import w96.d;
import q87.c;
import java.lang.StringBuilder;
import bw.a$b;
import java.lang.Boolean;
import com.kuaishou.client.log.packages.nano.ClientLog$BatchReportEvent;
import er.k;
import com.google.protobuf.nano.MessageNano;
import java.lang.Throwable;
import java.lang.Exception;
import bw.a$a;

public class b extends a implements a	// class@000034
{
    public String k;
    public String l;

    public void b(Channel p0){
       super(b.class.getSimpleName(), p0);
    }
    public LogResponse a(ClientLog$ReportEvent p0){
       LogResponse obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       try{
          if (a.a().c() && !TextUtils.isEmpty(this.h)) {
             Object[] objArray1 = new Object[i];
             d.C().w(this.b, "mKeepLogUploader upload", objArray1);
             this.m(p0, true);
          }
          obj = this.m(p0, i);
       }catch(java.lang.Exception e7){
          Object[] objArray = new Object[i];
          d.C().t("KuaiShouLogUploader", "upload Exception e="+e7, objArray);
       }
       return null;
    }
    public LogResponse b(a$b p0){
       LogResponse obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       try{
          if (a.a().c() && !TextUtils.isEmpty(this.h)) {
             Object[] objArray1 = new Object[i];
             d.C().w(this.b, "mKeepLogUploader upload", objArray1);
             this.n(p0, true);
          }
          obj = this.n(p0, i);
       }catch(java.lang.Exception e7){
          Object[] objArray = new Object[i];
          d.C().t("KuaiShouLogUploader", "upload Exception e="+e7, objArray);
       }
       return null;
    }
    public final LogResponse m(ClientLog$ReportEvent p0,boolean p1){
       LogResponse obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = null;
       try{
          ClientLog$BatchReportEvent uBatchReport = PatchProxy.applyOneRefs(p0, this, uob, "5");
          if (uBatchReport != patchProxyRe) {
          }else {
             uBatchReport = new ClientLog$BatchReportEvent();
             ClientLog$ReportEvent[] reportEventA = new ClientLog$ReportEvent[]{p0};
             uBatchReport.event = reportEventA;
          }
          if (!uBatchReport.event.length) {
             return obj;
          }else {
             return this.i(uBatchReport, this.k, p1, k.a(false));
          }
       }catch(java.lang.Exception e5){
          d.C().r(this.b, "exception", e5);
          this.h(e5);
          return obj;
       }
    }
    public final LogResponse n(a$b p0,boolean p1){
       LogResponse obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = null;
       try{
          a$a uoa = PatchProxy.applyOneRefs(p0, this, uob, "6");
          if (uoa != patchProxyRe) {
          }else {
             uoa = new a$a();
             a$b[] uobArray = new a$b[]{p0};
             uoa.a = uobArray;
          }
          if (!uoa.a.length) {
             return obj;
          }else {
             return this.i(uoa, this.l, p1, k.a(false));
          }
       }catch(java.lang.Exception e5){
          d.C().r(this.b, "exception", e5);
          this.h(e5);
          return obj;
       }
    }
}
