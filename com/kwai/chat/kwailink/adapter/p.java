package com.kwai.chat.kwailink.adapter.p;
import android.os.RemoteCallbackList;
import java.lang.Object;
import com.kwai.chat.kwailink.adapter.p$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.log.a;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import com.kwai.chat.kwailink.adapter.p$a;
import q75.b;
import android.content.Intent;
import android.os.SystemClock;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import com.kwai.chat.kwailink.base.b;
import android.content.Context;
import java.lang.Exception;

public class p	// class@000a15
{
    public static final RemoteCallbackList a;
    public static final RemoteCallbackList b;
    public static boolean c;

    static {
       p.a = new RemoteCallbackList();
       p.b = new RemoteCallbackList();
       p.c = false;
    }
    public void p(){
       super();
    }
    public static boolean a(RemoteCallbackList p0,p$b p1){
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, p.class, "14");
       if (obj1 != PatchProxyResult.class) {
          return obj1.booleanValue();
       }
       _monitor_enter(p0);
       int i = p0.beginBroadcast();
       a.e("CallbackUtils", "callbackByAidl, the number of callbacks is "+i);
       int i1 = 0;
       ArrayList uArrayList = obj;
       boolean b = false;
       while (i1 < i) {
          IInterface broadcastIte = p0.getBroadcastItem(i1);
          try{
             p1.a(broadcastIte);
             b = true;
          }catch(android.os.RemoteException e0){
             a.e("CallbackUtils", "callbackByAidl, dead callback.");
             if (!uArrayList) {
                uArrayList = new ArrayList();
             }
             uArrayList.add(broadcastIte);
          }catch(java.lang.Exception e0){
             a.e("CallbackUtils", "callbackByAidl, exception");
          }
          i1 = i1 + 1;
       }
       p0.finishBroadcast();
       if (uArrayList != null) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             a.e("CallbackUtils", "callbackByAidl, unregister dead callback.");
             p0.unregister(iterator.next());
          }
       }
       _monitor_exit(p0);
       return b;
    }
    public static void b(p$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, p.class, "15")) {
          return;
       }
       if (b.a()) {
          a.g("CallbackUtils", "callbackByBroadcast, disabled broadcast for vivo");
          return;
       }else {
          String str = "callbackByBroadcast";
          try{
             a.e("CallbackUtils", str);
             Intent intent = p0.run();
             if (intent == null) {
                return;
             }else {
                intent.putExtra("extra_act_time", SystemClock.elapsedRealtime());
                intent.setPackage(b.a().c());
                b.b().sendBroadcast(intent);
             }
          }catch(java.lang.Exception e4){
             a.g("CallbackUtils", e4.toString());
          }
          return;
       }
    }
}
