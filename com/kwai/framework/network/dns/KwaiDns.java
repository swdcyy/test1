package com.kwai.framework.network.dns.KwaiDns;
import okhttp3.Dns;
import java.lang.Object;
import com.kwai.framework.network.dns.a;
import javax.inject.Provider;
import tpd.a;
import upd.a;
import wkd.b;
import hb6.b;
import java.util.concurrent.ExecutorService;
import t45.c;
import java.lang.String;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.net.InetAddress;
import java.util.Arrays;
import fg6.a;
import com.kwai.framework.network.dns.KwaiDns$DnsInfo;
import com.google.gson.Gson;
import ta6.c;
import java.lang.StringBuilder;
import q87.c;
import ekd.q;
import hb6.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import pb6.o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.lang.Throwable;
import java.lang.Boolean;
import o56.c;
import o56.a;
import xf6.l;
import uk.a;

public class KwaiDns implements Dns	// class@000c03
{
    public final Dns a;
    public final a b;
    public final b c;
    public ExecutorService d;

    public void KwaiDns(){
       super();
       this.a = Dns.SYSTEM;
       this.b = a.a(a.a);
       this.c = b.a(-1295466596);
       this.d = c.c();
    }
    public List lookup(String p0){
       Iterator obj2;
       List list;
       ArrayList uArrayList;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiDns kwaiDns = KwaiDns.class;
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, kwaiDns, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, this, kwaiDns, "3");
       if (obj != patchProxyRe) {
       }else {
          list = new ArrayList();
          Iterator obj1 = this.c.b(p0).iterator();
          while (obj1.hasNext()) {
             list.addAll(Arrays.asList(InetAddress.getAllByName(obj1.next())));
          }
          if (list.size() > 0) {
             Object[] objArray2 = new Object[0];
             c.C().w("KuaishouDNS", "Optimal dns config: "+a.a.q(new KwaiDns$DnsInfo(this, p0, list)), objArray2);
          }
       }
       if (q.f(obj)) {
          obj = PatchProxy.applyOneRefs(p0, this, kwaiDns, "4");
          if (obj != patchProxyRe) {
          }else {
             Future uFuture = this.d.submit(new e(this, p0));
             int b = b.a(0x3d855db5).c();
             try{
                long l = (long)b;
                list = uFuture.get(l, TimeUnit.MILLISECONDS);
             }catch(java.lang.Exception e2){
                if (e2 instanceof TimeoutException) {
                   Object[] objArray1 = new Object[0];
                   c.C().w("KuaishouDNS", "DNS timeout: "+p0+", timeoutMs: "+b, objArray1);
                }else {
                   c.C().v("KuaishouDNS", "DNS error: ", e2);
                }
                list = new ArrayList();
             }
          }
       }
    label_016e :
       return obj;
    }
}
