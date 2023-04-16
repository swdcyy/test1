package d85.d;
import e85.a;
import java.lang.String;
import android.os.RemoteCallbackList;
import java.util.LinkedList;
import d85.c;
import java.lang.Object;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import q75.b;
import com.kwai.chat.kwailink.log.a;
import android.content.Intent;
import android.os.Parcelable;
import android.os.SystemClock;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import com.kwai.chat.kwailink.base.b;
import android.content.Context;
import java.lang.StringBuilder;
import android.os.IInterface;
import com.kwai.chat.kwailink.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.lang.Long;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
import java.util.concurrent.ScheduledFuture;
import d85.a;
import g85.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.lang.CharSequence;
import android.text.TextUtils;
import org.json.JSONArray;
import java.lang.Throwable;

public class d	// class@00147f
{
    public static final a a;
    public static List b;
    public static final RemoteCallbackList c;
    public static final RemoteCallbackList d;
    public static final List e;
    public static final List f;
    public static int g;
    public static ScheduledExecutorService h;
    public static final Runnable i;

    static {
       d.a = new a("kwailink_packet_dispatcher");
       d.b = null;
       d.c = new RemoteCallbackList();
       d.d = new RemoteCallbackList();
       d.e = new LinkedList();
       d.f = new LinkedList();
       d.g = -1;
       d.i = c.b;
    }
    public void d(){
       super();
    }
    public static boolean a(PacketData p0){
       String obj = PatchProxy.applyOneRefs(p0, null, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b.a()) {
          a.g("KwaiLinkPacketDispatcher", "deliveryPacketByBroadcast, disabled broadcast for vivo");
          return false;
       }else {
          obj = "deliveryPacketByBroadcast";
          try{
             a.e("KwaiLinkPacketDispatcher", obj);
             Intent intent = new Intent("com.kwai.chat.kwailink.ACTION_DISPATCH_MSG");
             intent.putExtra("extra_dispatch_msg", p0);
             intent.putExtra("extra_act_time", SystemClock.elapsedRealtime());
             intent.setPackage(b.a().c());
             b.b().sendBroadcast(intent);
             a.e("KwaiLinkPacketDispatcher", "deliveryPacketByBroadcast, succeed");
             return true;
          }catch(java.lang.Exception e0){
             a.e(v2, "deliveryPacketByBroadcast, fail");
             return v1;
          }
       }
    }
    public static boolean b(PacketData p0){
       ArrayList uArrayList = null;
       RemoteCallbackList obj = PatchProxy.applyOneRefs(p0, uArrayList, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = d.c;
       _monitor_enter(obj);
       int i = obj.beginBroadcast();
       a.e("KwaiLinkPacketDispatcher", "deliveryPacketByRemoteCallback, callback list size="+i);
       int i1 = 0;
       String str = null;
       while (i1 < i) {
          d broadcastIte = d.c.getBroadcastItem(i1);
          try{
             int i2 = 1;
             try{
                broadcastIte.d1(p0);
                a.e("KwaiLinkPacketDispatcher", "deliveryPacketByRemoteCallback, succeed, callback="+broadcastIte);
                str = true;
             }catch(android.os.RemoteException e0){
                str = 1;
                a.e("KwaiLinkPacketDispatcher", "deliveryPacketByRemoteCallback, fail, RemoteException happened");
                if (!uArrayList) {
                   uArrayList = new ArrayList();
                }
                uArrayList.add(broadcastIte);
             }catch(java.lang.Exception e0){
                str = 1;
                a.e("KwaiLinkPacketDispatcher", "deliveryPacketByRemoteCallback, fail, Exception happened");
             }
          }catch(android.os.RemoteException e0){
          }catch(java.lang.Exception e0){
          }
          i1 = i1 + 1;
       }
       d.c.finishBroadcast();
       if (uArrayList != null) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             d uod = iterator.next();
             a.e("KwaiLinkPacketDispatcher", "deliveryPacketByRemoteCallback, unregister deadCallback="+uod);
             d.c.unregister(uod);
          }
       }
       _monitor_exit(obj);
       return str;
    }
    public static void c(long p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), null, uod, "2")) {
          return;
       }
       d.e().schedule(d.i, p0, TimeUnit.MILLISECONDS);
       return;
    }
    public static void d(PacketData p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, d.class, "6")) {
          return;
       }
       d.e().execute(new a(p0));
       return;
    }
    public static ScheduledExecutorService e(){
       d uod = d.class;
       Object obj = PatchProxy.apply(null, null, uod, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.h == null) {
          _monitor_enter(uod);
          if (d.h == null) {
             d.h = Executors.newSingleThreadScheduledExecutor(new a("KwaiLinkPacketDispatcher"));
          }
          _monitor_exit(uod);
       }
       return d.h;
    }
    public static List f(){
       d uod = d.class;
       Object obj = PatchProxy.apply(null, null, uod, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (d.b == null) {
          _monitor_enter(uod);
          if (d.b == null) {
             d.b = d.g();
          }
          _monitor_exit(uod);
       }
       return d.b;
    }
    public static List g(){
       Object obj = PatchProxy.apply(null, null, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.b("KwaiLinkPacketDispatcher", "loadKlinkPushIds");
       String str = d.a.d("klink_push_id_list", "");
       LinkedList linkedList = new LinkedList();
       if (!TextUtils.isEmpty(str)) {
          JSONArray jSONArray = new JSONArray(str);
          for (int i = 0; i < jSONArray.length(); i = i + 1) {
             linkedList.add(Long.valueOf(jSONArray.getLong(i)));
          }
       }
       return linkedList;
    }
}
