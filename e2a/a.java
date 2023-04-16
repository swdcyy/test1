package e2a.a;
import java.lang.Runnable;
import dy6.a;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.detail.network.feedback.log.NetworkFeedbackDetectResult;
import com.kwai.library.network.detector.model.NetworkDetectConfig;
import java.util.Map;
import java.util.Collection;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.detail.network.feedback.log.a;

public final class a implements Runnable	// class@00205c
{
    public final a b;
    public final String c;

    public void a(a p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       NetworkFeedbackDetectResult networkFeedb = new NetworkFeedbackDetectResult();
       networkFeedb.mConfigId = tb.a.id;
       a b = tb.b;
       if (b != null && !b.isEmpty()) {
          networkFeedb.mNetworkDetectTaskResults = tb.b.values();
       }
       networkFeedb.mSessionId = tc;
       String str = a.a.q(networkFeedb);
       u1.R("NETWORK_DETECT_DETAIL", str, 14);
       a.a("logNetworkDetectResult:"+str);
       return;
    }
}
