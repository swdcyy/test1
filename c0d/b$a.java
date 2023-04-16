package c0d.b$a;
import com.kuaishou.aegon.httpdns.HttpDnsResolver$a;
import c0d.b;
import java.lang.Object;
import com.kuaishou.aegon.httpdns.ResolveFinishedInfo;
import java.util.Random;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HttpdnsStatEvent;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HttpdnsStatEvent$IpEntity;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public class b$a implements HttpDnsResolver$a	// class@0004bf
{
    public final float a;
    public final b b;

    public void b$a(b p0,float p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(ResolveFinishedInfo p0){
       if (this.b.a.nextFloat() - this.a > 0) {
          return;
       }
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       ClientStat$HttpdnsStatEvent httpdnsStatE = new ClientStat$HttpdnsStatEvent();
       httpdnsStatE.host = TextUtils.k(p0.host);
       httpdnsStatE.errMsg = TextUtils.k(p0.errorMessage);
       httpdnsStatE.totalCostMs = p0.totalCostMs;
       httpdnsStatE.localResolvedTimeCostMs = p0.localCostMs;
       httpdnsStatE.networkResolvedTimeCostMs = p0.networkCostMs;
       httpdnsStatE.pingTimeCostMs = p0.pingCostMs;
       httpdnsStatE.localResolvedIps = b.e(p0.localResults);
       httpdnsStatE.networkResolvedIps = b.e(p0.networkResults);
       ClientStat$HttpdnsStatEvent$IpEntity[] httpdnsStatE1 = b.e(p0.finalResults);
       httpdnsStatE.finalIps = httpdnsStatE1;
       object oobject = (httpdnsStatE1.length > 0)? httpdnsStatE1[0]: null;
       httpdnsStatE.bestResult = oobject;
       httpdnsStatE.networkResolvedClientIp = TextUtils.k(p0.clientIp);
       httpdnsStatE.retryCnt = p0.retryCount;
       httpdnsStatE.extraInfo = TextUtils.k(p0.extraInfo);
       statPackage.httpdnsStatEvent = httpdnsStatE;
       b.a(0x4b316083).j(statPackage);
       return;
    }
}
