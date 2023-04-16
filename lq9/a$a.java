package lq9.a$a;
import lq9.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lq9.a;
import com.kwai.feature.api.corona.util.CostReportWriterToDownload;
import java.util.Objects;
import com.kwai.feature.api.corona.util.CostReportWriterToDownload$a;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import android.content.Context;

public final class a$a implements d	// class@002e94
{

    public void a$a(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       CostReportWriterToDownload a = a.a;
       if (a != null) {
          a.c("", true);
       }
       return;
    }
    public void onBegin(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, a$a.class, str)) {
          return;
       }
       a c = a.c;
       a.a(c, objArray);
       CostReportWriterToDownload$a g = CostReportWriterToDownload.g;
       Objects.requireNonNull(g);
       CostReportWriterToDownload uCostReportW = PatchProxy.apply(objArray, g, CostReportWriterToDownload$a.class, str);
       if (uCostReportW != PatchProxyResult.class) {
       }else {
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          uCostReportW = new CostReportWriterToDownload(uApplication, "cost_report.csv", "");
       }
       a.a(c, uCostReportW);
       return;
    }
}
