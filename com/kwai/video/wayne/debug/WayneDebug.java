package com.kwai.video.wayne.debug.WayneDebug;
import android.content.BroadcastReceiver;
import com.kwai.video.wayne.debug.WayneDebug$Companion;
import nsd.u;
import kotlin.LazyThreadSafetyMode;
import com.kwai.video.wayne.debug.WayneDebug$Companion$instance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import android.content.IntentFilter;
import com.kwai.video.wayne.player.util.DebugLog;
import kotlin.jvm.internal.a;
import android.content.Context;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.ref.WeakReference;
import com.kwai.video.wayne.debug.CmdExecutor;
import java.util.HashSet;
import java.util.Map$Entry;

public final class WayneDebug extends BroadcastReceiver	// class@000c97
{
    public final Map mCmdExecutors;
    public boolean mInitialized;
    public static final WayneDebug$Companion Companion;
    public static final p instance$delegate;

    static {
       WayneDebug.Companion = new WayneDebug$Companion(null);
       WayneDebug.instance$delegate = s.b(LazyThreadSafetyMode.SYNCHRONIZED, WayneDebug$Companion$instance$2.INSTANCE);
    }
    public void WayneDebug(){
       super();
       this.mCmdExecutors = new HashMap();
    }
    public void WayneDebug(u p0){
       super();
    }
    public final void initialize(){
       if (PatchProxy.applyVoid(null, this, WayneDebug.class, "2")) {
          return;
       }
       if (this.mInitialized == null && WaynePlayerInitor.isApkInDebug()) {
          this.mInitialized = true;
          IntentFilter intentFilter = new IntentFilter();
          intentFilter.addAction("action_kp_mid_debug");
          DebugLog.i("KpMidDebug", "initialize success");
          Context aPP_CONTEXT = WaynePlayerInitor.APP_CONTEXT;
          a.o(aPP_CONTEXT, "WaynePlayerInitor.APP_CONTEXT");
          UniversalReceiver.e(aPP_CONTEXT.getApplicationContext(), this, intentFilter);
       }
       return;
    }
    public void onReceive(Context p0,Intent p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WayneDebug.class, "1")) {
          return;
       }
       if (p1 != null && TextUtils.equals(p1.getAction(), "action_kp_mid_debug")) {
          String stringExtra = p1.getStringExtra("cmd");
          String str = (stringExtra == null || !stringExtra.length())? 1: null;
          if (str) {
             return;
          }else {
             String stringExtra1 = p1.getStringExtra("params");
             if (stringExtra1 == null) {
                stringExtra1 = "";
             }
             DebugLog.i("KpMidDebug", "receive debug cmd: "+stringExtra+", params: "+stringExtra1);
             Set set = this.mCmdExecutors.get(stringExtra);
             if (set != null) {
                Iterator iterator = set.iterator();
                while (iterator.hasNext()) {
                   CmdExecutor uCmdExecutor = iterator.next().get();
                   if (uCmdExecutor != null) {
                      uCmdExecutor.exec(stringExtra, stringExtra1);
                   }
                }
             }
          }
       }
       return;
    }
    public final void registerCmdExecutor(String p0,CmdExecutor p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WayneDebug.class, "3")) {
          return;
       }
       a.p(p0, "cmd");
       a.p(p1, "executor");
       if (!WaynePlayerInitor.isApkInDebug()) {
          return;
       }
       Set set = this.mCmdExecutors.get(p0);
       if (set == null) {
          set = new HashSet();
          this.mCmdExecutors.put(p0, set);
       }
       set.add(new WeakReference(p1));
       return;
    }
    public final void unregisterCmdExecutor(CmdExecutor p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneDebug.class, "4")) {
          return;
       }
       a.p(p0, "executor");
       if (!WaynePlayerInitor.isApkInDebug()) {
          return;
       }
       Iterator iterator = this.mCmdExecutors.entrySet().iterator();
       while (iterator.hasNext()) {
          Iterator iterator1 = iterator.next().getValue().iterator();
          while (iterator1.hasNext()) {
             if (a.g(iterator1.next().get(), p0)) {
                iterator1.remove();
             }
          }
       }
       return;
    }
}
