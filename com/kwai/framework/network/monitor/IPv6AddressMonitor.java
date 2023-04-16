package com.kwai.framework.network.monitor.IPv6AddressMonitor;
import android.content.BroadcastReceiver;
import com.google.common.base.a;
import com.kwai.framework.network.monitor.Inet6AddressReporter;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.net.Inet6Address;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.content.Context;
import android.content.Intent;
import tb6.a;
import java.lang.Runnable;
import java.util.concurrent.Future;
import t45.c;

public class IPv6AddressMonitor extends BroadcastReceiver	// class@0017f7
{
    public final Inet6AddressReporter a;
    public final a b;
    public boolean c;

    public void IPv6AddressMonitor(){
       super();
       this.b = a.f(',');
       this.a = new Inet6AddressReporter();
    }
    public String a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       IPv6AddressMonitor obj = PatchProxy.apply(objArray, this, IPv6AddressMonitor.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       IPv6AddressMonitor ta = this.a;
       Objects.requireNonNull(ta);
       List list = PatchProxy.apply(objArray, ta, Inet6AddressReporter.class, "2");
       if (list != patchProxyRe) {
       }else {
          Inet6AddressReporter a = ta.a;
          a.lock();
          Inet6AddressReporter c = ta.c;
          ArrayList uArrayList = new ArrayList(u.Y(c, 10));
          Iterator iterator = c.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getHostAddress());
          }
          list = CollectionsKt___CollectionsKt.G5(uArrayList);
          a.unlock();
       }
       return obj.c(list);
    }
    public String b(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       IPv6AddressMonitor obj = PatchProxy.apply(objArray, this, IPv6AddressMonitor.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       IPv6AddressMonitor ta = this.a;
       Objects.requireNonNull(ta);
       List list = PatchProxy.apply(objArray, ta, Inet6AddressReporter.class, "1");
       if (list != patchProxyRe) {
       }else {
          Inet6AddressReporter a = ta.a;
          a.lock();
          Inet6AddressReporter b = ta.b;
          ArrayList uArrayList = new ArrayList(u.Y(b, 10));
          Iterator iterator = b.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().getHostAddress());
          }
          list = CollectionsKt___CollectionsKt.G5(uArrayList);
          a.unlock();
       }
       return obj.c(list);
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IPv6AddressMonitor.class, "4")) {
          return;
       }
       IPv6AddressMonitor ta = this.a;
       Objects.requireNonNull(ta);
       c.k(new a(ta));
       return;
    }
}
