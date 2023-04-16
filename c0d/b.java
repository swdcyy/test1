package c0d.b;
import c0d.a;
import com.yxcorp.gifshow.log.h;
import java.lang.Object;
import java.util.Random;
import c0d.b$a;
import com.kuaishou.aegon.httpdns.HttpDnsResolver$a;
import com.kuaishou.aegon.httpdns.HttpDnsResolver;
import java.util.List;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$HttpdnsStatEvent$IpEntity;
import com.kuaishou.aegon.httpdns.ResolvedIP;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import uk.a;
import java.util.ArrayList;
import java.util.Iterator;
import c0d.d;
import com.yxcorp.httpdns.ResolverType;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.google.gson.JsonElement;

public class b implements a	// class@0004c0
{
    public final Random a;

    public void b(h p0,float p1){
       super();
       this.a = new Random();
       HttpDnsResolver.setLogger(new b$a(this, p1));
    }
    public static ClientStat$HttpdnsStatEvent$IpEntity[] e(List p0){
       int i = p0.size();
       ClientStat$HttpdnsStatEvent$IpEntity[] httpdnsStatE = new ClientStat$HttpdnsStatEvent$IpEntity[i];
       for (int i1 = 0; i1 < p0.size() && i1 < i; i1 = i1 + 1) {
          httpdnsStatE[i1] = new ClientStat$HttpdnsStatEvent$IpEntity();
          httpdnsStatE[i1].ip = TextUtils.k(p0.get(i1).mIP);
          httpdnsStatE[i1].host = TextUtils.k(p0.get(i1).mHost);
          httpdnsStatE[i1].resolver = TextUtils.k(p0.get(i1).mResolver);
          httpdnsStatE[i1].rttMs = p0.get(i1).mRtt;
          httpdnsStatE[i1].expireDate = p0.get(i1).mExpiredDate;
       }
       return httpdnsStatE;
    }
    public List a(String p0){
       if (TextUtils.x(p0) || a.c(p0)) {
          return new ArrayList();
       }
       List list = HttpDnsResolver.resolve(p0);
       ArrayList uArrayList = new ArrayList();
       if (list != null && !list.isEmpty()) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             ResolvedIP resolvedIP = iterator.next();
             if (resolvedIP == null) {
                continue ;
             }
             d uod = new d(resolvedIP.mHost, resolvedIP.mIP, ResolverType.HTTP, resolvedIP.mTtl);
             v8.e = resolvedIP.mResolver;
             uArrayList.add(v8);
          }
       }
       return uArrayList;
    }
    public void b(List p0){
       HttpDnsResolver.increasePriority(p0);
    }
    public void c(String p0){
    }
    public void d(JsonObject p0){
       HttpDnsResolver.updateConfig(new Gson().p(p0));
    }
    public void initialize(){
    }
    public void onBackground(){
    }
    public void onForeground(){
    }
}
