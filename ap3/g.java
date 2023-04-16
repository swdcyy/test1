package ap3.g;
import erd.g;
import android.app.Activity;
import o63.a;
import java.lang.Object;
import com.kuaishou.live.report.LiveReportEntranceResponse;
import d61.g;
import com.kuaishou.live.report.LiveReportEntranceResponse$ReportEntranceInfo;
import kq3.a;
import kq3.b;
import android.content.Context;
import java.lang.String;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kuaishou.live.webview.LiveWebViewActivity;
import android.content.Intent;

public final class g implements g	// class@000296
{
    public final Activity b;
    public final a c;

    public void g(Activity p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       if (!g.h(tb)) {
          p0 = p0.mReportEntranceInfo;
          if (p0 != null) {
             p0 = p0.mUrl;
             if (tc != null) {
                a uoa = a.b(tb);
                uoa.h = tc;
                b.a(uoa);
             }
             tb.startActivity(LiveWebViewActivity.G3(tb, p0).a());
          }
       }
       return;
    }
}
