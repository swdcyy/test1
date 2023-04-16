package k2b.a1;
import java.lang.Runnable;
import com.yxcorp.gifshow.log.n;
import com.kuaishou.client.log.packages.nano.ClientLog$ReportEvent;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import b3b.a;
import k2b.o0;
import k2b.y;
import k2b.b3;
import er.m;
import com.kuaishou.android.vader.Channel;
import android.content.Context;
import w2b.a;
import ar.b;
import k2b.e3;
import com.yxcorp.utility.Log;
import com.kuaishou.client.log.packages.nano.ClientCommon$AdditionalSeqIdPackage;
import java.lang.StringBuilder;
import com.kuaishou.client.log.packages.nano.ClientCommon$CommonPackage;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.android.vader.config.LogResponse;
import java.lang.Exception;
import k2b.z1;

public final class a1 implements Runnable	// class@001b86
{
    public final n b;
    public final ClientLog$ReportEvent c;
    public final String d;
    public final int e;

    public void a1(n p0,ClientLog$ReportEvent p1,String p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       a1 tb = this.b;
       a1 tc = this.c;
       a1 td = this.d;
       a1 te = this.e;
       Objects.requireNonNull(tb);
       if (n.L.E1() == null || !y.c()) {
          Log.g("LogManager", "report add heart beat event£¬execute addLog");
          tb.m1(tc, true);
       }else {
          try{
             String str = b3.l(tc);
             b uob = e3.b(tb.a, tb.j, m.a, str, Channel.HIGH_FREQ);
             if (uob == null) {
                Log.g("LogManager", "report add heart beat event£¬execute addLog reason = idWrapper is null");
                tb.m1(tc, true);
             }else {
                tc.clientTimestamp = uob.b();
                tc.clientIncrementId = (long)uob.e();
                ClientCommon$AdditionalSeqIdPackage uAdditionalS = new ClientCommon$AdditionalSeqIdPackage();
                uAdditionalS.channel = 2;
                uAdditionalS.channelSeqId = (long)uob.a();
                uAdditionalS.customType = str;
                uAdditionalS.customSeqId = (long)uob.d();
                Log.g("LogManager", "report add heart beat event£¬idWrapper = "+uob.toString());
                tc.commonPackage.additionalSeqIdPackage = uAdditionalS;
                tc.sessionId = TextUtils.k(tb.getSessionId());
                if (!SystemUtil.L(tb.a)) {
                   tc.processName = TextUtils.k(SystemUtil.r(tb.a));
                }
                if (n.L.E1().a(tc) == null) {
                   Log.g("LogManager", "report add heart beat event£¬immediately uploader failure");
                   tb.m1(tc, true);
                }else {
                   Log.g("LogManager", "report add heart beat event£¬immediately uploader success");
                   y.e(td, te, uob.b());
                }
             }
          }catch(java.lang.Exception e2){
             Log.g("LogManager", "report add heart beat event£¬immediately uploader exception£º"+e2.toString());
             tb.m1(tc, true);
             z1.b(te, e2.getMessage());
          }
       }
    }
}
