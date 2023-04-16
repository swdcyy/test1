package e2a.b;
import java.lang.Runnable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import e2a.c;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.detail.network.feedback.log.a;

public final class b implements Runnable	// class@00205d
{
    public final String b;
    public final List c;
    public final String d;

    public void b(String p0,List p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       c uoc = new c();
       uoc.mFeedbackDetail = this.b;
       uoc.mNetworkFeedbackReasons = this.c;
       uoc.mSessionId = this.d;
       String str = a.a.q(uoc);
       u1.R("USER_ERROR_REPORT", str, 14);
       a.a("logNetworkFeedback:"+str);
    }
}
