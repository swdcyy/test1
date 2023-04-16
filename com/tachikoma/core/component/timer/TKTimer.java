package com.tachikoma.core.component.timer.TKTimer;
import android.os.Handler$Callback;
import java.lang.Object;
import java.util.HashMap;
import android.os.Handler;
import aq8.a;
import android.os.HandlerThread;
import android.os.Looper;
import com.tkruntime.v8.V8Function;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import no8.a;
import com.tachikoma.core.component.timer.TKTimer$d;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.JsValueRef;
import tx4.y;
import android.os.Message;
import java.lang.Integer;
import com.tachikoma.core.component.timer.TKTimer$a;
import java.lang.Runnable;
import iq8.x;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.tachikoma.core.bridge.d;
import java.lang.Throwable;
import wp8.a;
import java.util.Map;
import android.os.SystemClock;
import com.tachikoma.core.component.timer.TKTimer$c;
import java.util.ArrayList;
import java.util.Collection;
import hq8.b;
import hq8.a;
import java.util.List;
import iq8.o;
import com.tachikoma.core.component.timer.TKTimer$b;
import no8.e;
import oo8.s;

public class TKTimer implements Handler$Callback	// class@000dad
{
    public final Handler mHandler;
    public long mLastReportTime;
    public final Map mPendingTimerAction;
    public final HashMap mTimerInfo;
    public static final long DURATION_REPORTER = 0x36ee80;
    public static final int MSG_TIME_ADD = 1000;
    public static final int MSG_TIME_CALLBACK = 1002;
    public static final int MSG_TIME_CLEAR = 1001;
    public static final int MSG_TIME_DESTROY = 1003;
    public static final int MSG_TIME_REMOVE_PENDING_TIMER_ACTION = 1004;
    public static Boolean sEnableOptSetInterval;
    public static long sId;

    public void TKTimer(){
       super();
       this.mTimerInfo = new HashMap();
       this.mLastReportTime = 0;
       this.mHandler = new Handler(a.b().a().getLooper(), this);
       this.mPendingTimerAction = new HashMap();
    }
    public final int addTimer(V8Function p0,long p1,String p2,boolean p3,String p4){
       String obj;
       int i = 0;
       if (PatchProxy.isSupport(TKTimer.class)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,Boolean.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, TKTimer.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == null) {
          return i;
       }else if(a.c.booleanValue()){
          obj = (p3)? "setInterval": "setTimeout";
          p0.setFunctionName(obj);
       }
       TKTimer$d uod = new TKTimer$d(p1, p3, y.b(p0, null), p2, p4);
       int i1 = obj.hashCode();
       obj.a = i1;
       this.mHandler.sendMessage(this.mHandler.obtainMessage(1000, obj));
       this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1002, obj), p1);
       return i1;
    }
    public void clearInterval(int p0){
       if (PatchProxy.isSupport(TKTimer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKTimer.class, "2")) {
          return;
       }
       this.clearTimer(p0);
       return;
    }
    public void clearTimeout(int p0){
       if (PatchProxy.isSupport(TKTimer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKTimer.class, "4")) {
          return;
       }
       this.clearTimer(p0);
       return;
    }
    public final void clearTimer(int p0){
       if (PatchProxy.isSupport(TKTimer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKTimer.class, "7")) {
          return;
       }
       this.mHandler.sendMessage(this.mHandler.obtainMessage(1001, Integer.valueOf(p0)));
       return;
    }
    public void destroy(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKTimer.class, "5")) {
          return;
       }
       this.mHandler.sendMessage(this.mHandler.obtainMessage(1003, p0));
       return;
    }
    public final void handAddTimer(TKTimer$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKTimer.class, "9")) {
          return;
       }
       this.mTimerInfo.put(Integer.valueOf(p0.a), p0);
       return;
    }
    public final void handleClearTimer(int p0){
       if (PatchProxy.isSupport(TKTimer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TKTimer.class, "10")) {
          return;
       }
       TKTimer$d uod = this.mTimerInfo.remove(Integer.valueOf(p0));
       if (uod == null) {
          return;
       }
       x.f(new TKTimer$a(this, uod));
       return;
    }
    public final void handleDestroyTimer(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKTimer.class, "11")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       Iterator iterator = this.mTimerInfo.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (uEntry == null) {
             continue ;
          }else {
             TKTimer$d value = uEntry.getValue();
             if (value != null && p0.equals(value.f)) {
                this.mHandler.removeCallbacksAndMessages(value);
                iterator.remove();
             }
          }
       }
       return;
    }
    public boolean handleMessage(Message p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TKTimer.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       switch (p0.what){
           case 1000:
             this.handAddTimer(p0.obj);
             break;
           case 1001:
             this.handleClearTimer(p0.obj.intValue());
             break;
           case 1002:
             this.handlerTimerCallback(p0.obj);
             break;
           case 1003:
             this.handleDestroyTimer(p0.obj);
             break;
           case 1004:
             this.handlerRemovePendingTimerAction(p0.obj.longValue());
             break;
           default:
       }
       return false;
    }
    public final void handlerRemovePendingTimerAction(long p0){
       if (PatchProxy.isSupport(TKTimer.class) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, TKTimer.class, "13")) {
          return;
       }
       this.mPendingTimerAction.remove(Long.valueOf(p0));
       return;
    }
    public final void handlerTimerCallback(TKTimer$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKTimer.class, "12")) {
          return;
       }
       if (p0 != null && this.mTimerInfo.containsValue(p0)) {
          long l = TKTimer.sId + 1;
          TKTimer.sId = l;
          long l1 = SystemClock.elapsedRealtime();
          TKTimer$c uoc = new TKTimer$c();
          uoc.id = l;
          uoc.now = l1;
          uoc.tKJsContextTag = p0.f;
          uoc.bundleId = p0.g;
          uoc.key = p0.a;
          uoc.interval = p0.c;
          TKTimer$d d = p0.d;
          uoc.repeat = d;
          boolean b = true;
          d = (d != null && (p0.b != null && this.isEnableOptSetInterval()))? 1: null;
          if (!d) {
             if (p0.d != null) {
                p0.b = b;
             }
             this.mPendingTimerAction.put(Long.valueOf(l), uoc);
             if (this.mPendingTimerAction.size() > 15 && (l1 - this.mLastReportTime) - 0x36ee80 > 0) {
                this.mLastReportTime = l1;
                ArrayList uArrayList = new ArrayList(this.mPendingTimerAction.values());
                if (!PatchProxy.applyVoidOneRefs(uArrayList, null, b.class, "1")) {
                   o.a(new a(uArrayList));
                }
             }
             x.f(new TKTimer$b(this, p0, l));
          }
          if (p0.d == null) {
             this.mTimerInfo.remove(Integer.valueOf(p0.a));
          }else {
             this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1002, p0), p0.c);
          }
       }
       return;
    }
    public final boolean isEnableOptSetInterval(){
       Boolean obj = PatchProxy.apply(null, this, TKTimer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TKTimer.sEnableOptSetInterval == null && e.b().d() != null) {
          TKTimer.sEnableOptSetInterval = Boolean.valueOf(e.b().d().d("tkEnableOptSetInterval", b));
       }
       obj = TKTimer.sEnableOptSetInterval;
       if (obj != null && obj.booleanValue()) {
          b = true;
       }
       return b;
    }
    public int setInterval(V8Function p0,long p1,String p2,String p3){
       if (PatchProxy.isSupport(TKTimer.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Long.valueOf(p1), p2, p3, this, TKTimer.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.addTimer(p0, p1, p2, true, p3);
    }
    public int setTimeout(V8Function p0,long p1,String p2,String p3){
       if (PatchProxy.isSupport(TKTimer.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Long.valueOf(p1), p2, p3, this, TKTimer.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return this.addTimer(p0, p1, p2, false, p3);
    }
}
