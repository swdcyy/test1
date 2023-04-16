package b7.c;
import b7.a;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import com.alipay.android.phone.mrpc.core.aa;
import com.alipay.android.phone.mrpc.core.h;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import java.lang.Class;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.android.phone.mrpc.core.w;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import java.lang.Thread;
import b7.b;
import java.lang.Runnable;
import x6.a;
import org.json.JSONObject;
import java.lang.Boolean;

public class c implements a	// class@000ae4
{
    public w a;
    public BugTrackMessageService b;
    public DataReportService c;
    public static c d;
    public static DataReportResult e;

    public void c(Context p0,String p1){
       super();
       this.a = null;
       this.b = null;
       this.c = null;
       aa uoaa = new aa();
       uoaa.a(p1);
       h oh = new h(p0);
       this.a = oh;
       this.b = oh.a(BugTrackMessageService.class, uoaa);
       this.c = this.a.a(DataReportService.class, uoaa);
    }
    public static DataReportResult b(){
       return c.e;
    }
    public static DataReportResult c(DataReportResult p0){
       c.e = p0;
       return p0;
    }
    public DataReportResult a(DataReportRequest p0){
       DataReportResult uDataReportR = null;
       if (p0 == null) {
          return uDataReportR;
       }
       if (this.c != null) {
          c.e = uDataReportR;
          new Thread(new b(this, p0)).start();
          int i = 0x493e0;
          while (c.e == null && i >= 0) {
             Thread.sleep(50);
             i = i - 50;
          }
       }
       return c.e;
    }
    public boolean logCollect(String p0){
       boolean b = false;
       if (a.c(p0)) {
          return b;
       }
       c tb = this.b;
       if (tb != null) {
          String str = tb.logCollect(a.h(p0));
          if (!a.c(str)) {
             b = new JSONObject(str).get("success").booleanValue();
          }
       }
       return b;
    }
}
