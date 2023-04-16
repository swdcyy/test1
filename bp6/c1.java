package bp6.c1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.internal.v;
import java.lang.Object;
import java.lang.String;
import com.kwai.imsdk.internal.client.i;
import qo6.a;
import rp6.w;
import java.util.Objects;
import l85.c;
import java.lang.System;
import com.kwai.imsdk.internal.util.d;
import sp6.a;
import sp6.b;
import com.kwai.imsdk.internal.client.t;
import ih0.a$a;
import l85.b;
import android.util.Pair;
import java.lang.Integer;
import android.content.Context;
import a75.a;
import j75.h;
import com.kwai.imsdk.internal.client.MessageSDKErrorCode$ERROR;
import com.kwai.imsdk.m;
import com.kwai.chat.kwailink.data.PacketData;
import nq6.s;
import java.lang.StringBuilder;
import com.kwai.imsdk.callback.KwaiIMException;
import java.lang.Exception;
import up6.f;
import java.util.Map;
import com.kwai.imsdk.internal.util.b;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import qo6.i1;
import rp6.g;
import java.util.Collection;
import qo6.v1;
import tp6.b;
import tp6.c;

public final class c1 implements Callable	// class@000507
{
    public final v b;

    public void c1(v p0){
       this.b = p0;
    }
    public final Object call(){
       w b;
       Pair pair;
       int i;
       Iterator iterator;
       w ow = w.e(i.t(this.b.a).a);
       Objects.requireNonNull(ow);
       c uoc = new c("KwaiMessageManager#syncSessionList");
       long l = System.currentTimeMillis();
       w a = ow.a;
       a uoa = b.c(a, d.d(a));
       b = ow.b;
       if (b - null && (l - b > 0 && (l - b) - (long)t.o(ow.a).l().i < 0)) {
          b.a(uoc.d("request too frequently"));
          pair = new Pair(Integer.valueOf(0), "request too frequently");
       }else {
          ow.b = System.currentTimeMillis();
          if (!h.a(a.a())) {
             MessageSDKErrorCode$ERROR nO_NETWORK = MessageSDKErrorCode$ERROR.NO_NETWORK;
             pair = new Pair(Integer.valueOf(nO_NETWORK.code), nO_NETWORK.msg);
          }else {
             i = 1;
             m.G(ow.a).M0(i);
             PacketData packetData = ow.o();
             String str = "";
             if (packetData == null) {
                s.t(ow.a).F(d.d(ow.a)+str, new KwaiIMException(-1, "response is null"), uoa);
                uoa.e();
                pair = new Pair(Integer.valueOf(-1), "UNKNOWN: response null");
             }else if(!b.f(f.f(ow.a).h())){
                iterator = f.f(ow.a).h().entrySet().iterator();
                while (iterator.hasNext()) {
                   Map$Entry uEntry = iterator.next();
                   if (uEntry != null && uEntry.getValue() != null) {
                      uEntry.getValue().onStart();
                   }
                }
             }
             Set set = g.d(ow.a).g();
             if (!b.c(set)) {
                long l1 = d.d(ow.a);
                iterator = set.iterator();
                while (iterator.hasNext()) {
                   v1 ov1 = iterator.next();
                   if (ov1 == null) {
                      continue ;
                   }
                   ov1.a(l1);
                }
             }
             if (packetData.c()) {
                s.t(ow.a).F(d.d(ow.a)+str, new KwaiIMException(packetData.c(), packetData.e()), uoa);
                uoa.e();
             }
             b uob = new b();
             uob.e(i);
             uob.c(packetData);
             uob.a();
             pair = new Pair(Integer.valueOf(packetData.c()), packetData.e());
          }
       }
       return pair;
    }
}
