package b7.b;
import java.lang.Runnable;
import b7.c;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import java.lang.Object;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import x6.a;

public class b implements Runnable	// class@000ae3
{
    public final DataReportRequest b;
    public final c c;

    public void b(c p0,DataReportRequest p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       c.c(this.c.c.reportData(this.b));
    }
}
