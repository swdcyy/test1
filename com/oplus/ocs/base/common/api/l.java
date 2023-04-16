package com.oplus.ocs.base.common.api.l;
import android.os.Handler$Callback;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import android.os.Looper;
import java.lang.Object;
import com.oplus.ocs.base.common.a;
import android.os.HandlerThread;
import java.lang.String;
import com.oplus.ocs.base.common.api.Api$ClientKey;
import java.util.Map;
import com.oplus.ocs.base.common.api.OplusApi;
import com.oplus.ocs.base.common.api.Api;
import com.oplus.ocs.base.common.CapabilityInfo;
import com.oplus.ocs.base.common.api.CapabilityApiClient;
import com.oplus.ocs.base.common.api.OnConnectionFailedListener;
import android.os.Handler;
import com.oplus.ocs.base.utils.d;
import com.oplus.ocs.base.common.api.OplusApiClient;
import com.oplus.ocs.base.common.api.TaskListenerHolder;
import java.lang.StringBuilder;
import java.lang.Class;
import com.oplus.ocs.base.utils.a;
import android.os.IBinder;
import com.oplus.ocs.base.common.AuthResult;
import android.os.Message;
import com.oplus.ocs.base.common.api.OnConnectionSucceedListener;
import com.oplus.ocs.base.common.api.l$4;
import com.oplus.ocs.base.internal.ClientSettings;
import com.oplus.ocs.base.common.api.m;
import com.oplus.ocs.base.common.api.Api$ApiOptions;
import com.oplus.ocs.base.common.api.l$1;
import com.oplus.ocs.base.common.api.j;
import com.oplus.ocs.base.common.api.l$2;
import com.oplus.ocs.base.common.api.i;

public class l implements Handler$Callback	// class@000af3
{
    public Context a;
    public a b;
    public Looper e;
    public static Map c;
    public static final String d;
    public static l f;

    static {
       l.d = "l";
       l.c = new ConcurrentHashMap();
    }
    public void l(Context p0,Looper p1){
       super();
       this.a = (p0.getApplicationContext() != null)? p0.getApplicationContext(): p0;
       this.e = p1;
       this.b = new a(this.e, this);
       return;
    }
    public static l a(Context p0){
       if (l.f == null) {
          _monitor_enter(l.class);
          if (l.f == null) {
             HandlerThread handlerThrea = new HandlerThread("OplusApiManager", 9);
             handlerThrea.start();
             l.f = (handlerThrea.getLooper() != null)? new l(p0, handlerThrea.getLooper()): new l(p0, Looper.getMainLooper());
          }
       label_0034 :
          _monitor_exit(l.class);
       }
       return l.f;
    }
    public static void a(Api$ClientKey p0){
       l.c.remove(p0);
    }
    public static void a(OplusApi p0){
       CapabilityInfo capabilityIn = CapabilityApiClient.getCapabilityInfo(p0.getApi());
       if (capabilityIn != null) {
          p0.checkAuthResult(capabilityIn);
       }
       return;
    }
    public static void a(OplusApi p0,OnConnectionFailedListener p1,Handler p2){
       d.a(p0, "oplusApi not be null");
       if (l.c.containsKey(p0.getApi().getClientKey())) {
          OplusApiClient oplusApiClie = l.c.get(p0.getApi().getClientKey());
          if (oplusApiClie != null) {
             oplusApiClie.setOnConnectionFailedListener(p1, p2);
          }
       }
       return;
    }
    public static void a(OplusApi p0,TaskListenerHolder p1){
       a.a(l.d, "addQueue "+p0.getClass().getSimpleName());
       d.a(p0, "oplusApi not be null");
       if (l.c.containsKey(p0.getApi().getClientKey())) {
          OplusApiClient oplusApiClie = l.c.get(p0.getApi().getClientKey());
          if (oplusApiClie != null) {
             oplusApiClie.addQueue(p1);
          }
       }
       return;
    }
    public static IBinder b(OplusApi p0){
       d.a(p0, "oplusApi not be null");
       if (l.c.containsKey(p0.getApi().getClientKey())) {
          OplusApiClient oplusApiClie = l.c.get(p0.getApi().getClientKey());
          if (oplusApiClie != null) {
             return oplusApiClie.getRemoteService();
          }
       }
       return null;
    }
    public static int c(OplusApi p0){
       d.a(p0, "oplusApi not be null");
       if (l.c.containsKey(p0.getApi().getClientKey())) {
          OplusApiClient oplusApiClie = l.c.get(p0.getApi().getClientKey());
          if (oplusApiClie != null) {
             return oplusApiClie.getRemoteVersion();
          }
       }
       return 0;
    }
    public static AuthResult d(OplusApi p0){
       d.a(p0, "oplusApi not be null");
       if (l.c.containsKey(p0.getApi().getClientKey())) {
          OplusApiClient oplusApiClie = l.c.get(p0.getApi().getClientKey());
          if (oplusApiClie != null) {
             return oplusApiClie.getAuthResult();
          }
       }
       return null;
    }
    public static boolean e(OplusApi p0){
       d.a(p0, "oplusApi not be null");
       if (l.c.containsKey(p0.getApi().getClientKey())) {
          OplusApiClient oplusApiClie = l.c.get(p0.getApi().getClientKey());
          if (oplusApiClie != null) {
             return oplusApiClie.isConnected();
          }
       }
       return false;
    }
    public final void a(Api p0){
       Message message = this.b.obtainMessage();
       message.what = 0;
       message.obj = p0;
       this.b.sendMessage(message);
    }
    public final void a(OplusApi p0,OnConnectionSucceedListener p1,Handler p2){
       d.a(p0, "oplusApi not be null");
       if (l.c.containsKey(p0.getApi().getClientKey())) {
          OplusApiClient oplusApiClie = l.c.get(p0.getApi().getClientKey());
          if (oplusApiClie != null) {
             if (p0.isConnected()) {
                Looper mainLooper = (p2 == null)? Looper.getMainLooper(): p2.getLooper();
                new l$4(this, mainLooper, p1).sendEmptyMessage(0);
                return;
             }else {
                oplusApiClie.setOnConnectionSucceedListener(p1, p2);
             }
          }
       }
       return;
    }
    public final void a(OplusApi p0,ClientSettings p1){
       d.a(p0, "oplusApi not be null");
       d.a(p1, "clientsettings not be null");
       if (!l.c.containsKey(p0.getApi().getClientKey())) {
          m om = new m(this.a, p0.getApi(), p0.a, p1);
          om.setOnClearListener(new l$1(this, p0));
          om.setOnCapabilityAuthListener(new l$2(this, p0));
          l.c.put(p0.getApi().getClientKey(), om);
          this.a(p0.getApi());
       }
       return;
    }
    public boolean handleMessage(Message p0){
       a.a(l.d, "handle message "+p0.what);
       Message what = p0.what;
       if (what != null) {
          if (what == 1) {
             p0 = p0.obj;
             if (p0 != null && p0.getClientKey() != null) {
                OplusApiClient oplusApiClie = l.c.get(p0.getClientKey());
                if (oplusApiClie != null) {
                   oplusApiClie.disconnect();
                   l.a(p0.getClientKey());
                }
             }
          }
       }else {
          p0 = p0.obj;
          if (p0 != null && p0.getClientKey() != null) {
             OplusApiClient oplusApiClie1 = l.c.get(p0.getClientKey());
             if (oplusApiClie1 != null) {
                oplusApiClie1.connect();
             }
          }
       }
       return false;
    }
}
