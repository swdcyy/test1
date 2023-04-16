package com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$Companion;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$actions$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2;
import android.os.Handler;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.featurecenter.AppCachedFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$createFeatureProvider$1;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.List;
import trd.t;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$receiver$2$1;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$init$1;
import java.lang.Runnable;
import java.lang.Boolean;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import android.media.AudioManager;

public final class EveHeadSetMonitor extends FeatureMonitor	// class@001525
{
    public final p actions$delegate;
    public boolean blueToothHeadsetOn;
    public Handler handler;
    public int headSetState;
    public final p receiver$delegate;
    public boolean wiredHeadsetOn;
    public static final EveHeadSetMonitor$Companion Companion;

    static {
       EveHeadSetMonitor.Companion = new EveHeadSetMonitor$Companion(null);
    }
    public void EveHeadSetMonitor(Context p0){
       a.p(p0, "context");
       super(p0);
       this.actions$delegate = s.c(EveHeadSetMonitor$actions$2.INSTANCE);
       this.receiver$delegate = s.c(new EveHeadSetMonitor$receiver$2(this));
    }
    public static final Handler access$getHandler$p(EveHeadSetMonitor p0){
       p0 = p0.handler;
       if (p0 == null) {
          a.S("handler");
       }
       return p0;
    }
    public IFeatureProvider createFeatureProvider(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, EveHeadSetMonitor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feature");
       if (p0.hashCode() == 0x2f67a282) {
          obj = "headset";
          if (p0.equals(obj)) {
             return new AppCachedFeatureProvider(obj, new EveHeadSetMonitor$createFeatureProvider$1(this));
          }
       }
       throw new RuntimeException("EveHeadSetMonitor not expect feature:"+p0);
    }
    public List features(){
       Object obj = PatchProxy.apply(null, this, EveHeadSetMonitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.k("headset");
    }
    public final List getActions(){
       Object obj = PatchProxy.apply(null, this, EveHeadSetMonitor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.actions$delegate.getValue();
    }
    public final EveHeadSetMonitor$receiver$2$1 getReceiver(){
       Object obj = PatchProxy.apply(null, this, EveHeadSetMonitor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.receiver$delegate.getValue();
    }
    public void init(Handler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveHeadSetMonitor.class, "3")) {
          return;
       }
       a.p(p0, "handler");
       this.handler = p0;
       p0.post(new EveHeadSetMonitor$init$1(this));
       return;
    }
    public final boolean isBlueToothHeadsetOn(){
       BluetoothAdapter obj = PatchProxy.apply(null, this, EveHeadSetMonitor.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = BluetoothAdapter.getDefaultAdapter();
       boolean b = false;
       if (obj != null && obj.isEnabled()) {
          if (obj.getState() != 12) {
             return b;
          }else if(obj.getProfileConnectionState(2) != 2 && (obj.getProfileConnectionState(1) == 2 || obj.getProfileConnectionState(3) == 2)){
             b = true;
          }
       }
       return b;
    }
    public final void updateHeadSetState(Intent p0){
       boolean b1;
       if (PatchProxy.applyVoidOneRefs(p0, this, EveHeadSetMonitor.class, "6")) {
          return;
       }
       String action = (p0 != null)? p0.getAction(): null;
       if (("android.media.AUDIO_BECOMING_NOISY").equals(action)) {
          this.blueToothHeadsetOn = false;
          this.wiredHeadsetOn = false;
          EveLog.i$default("EveHeadSetMonitor updateHeadSetState with ACTION_AUDIO_BECOMING_NOISY"+", blueToothHeadsetOn:"+this.blueToothHeadsetOn+", wiredHeadsetOn:"+this.wiredHeadsetOn, false, 2, null);
       }else if(p0 != null){
          action = p0.getAction();
       }else {
          action = null;
       }
       if (("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED").equals(action)) {
          this.blueToothHeadsetOn = this.isBlueToothHeadsetOn();
          EveLog.i$default("EveHeadSetMonitor updateHeadSetState with blueTooth ACTION_CONNECTION_STATE_CHANGED"+", blueToothHeadsetOn:"+this.blueToothHeadsetOn+", wiredHeadsetOn:"+this.wiredHeadsetOn, false, 2, null);
       }else if(p0 != null){
          action = p0.getAction();
       }else {
          action = null;
       }
       if (("android.intent.action.HEADSET_PLUG").equals(action)) {
          action = "state";
          boolean b = (p0 != null)? p0.hasExtra(action): false;
          if (b) {
             b1 = (p0 != null && p0.getIntExtra(action, false) == 1)? true: false;
             this.wiredHeadsetOn = b1;
             EveLog.i$default("EveHeadSetMonitor updateHeadSetState with ACTION_HEADSET_PLUG"+", blueToothHeadsetOn:"+this.blueToothHeadsetOn+", wiredHeadsetOn:"+this.wiredHeadsetOn, false, 2, null);
          }
       }
       this.blueToothHeadsetOn = this.isBlueToothHeadsetOn();
       p0 = this.getContext().getSystemService("audio");
       if (!p0 instanceof AudioManager) {
          p0 = null;
       }
       b1 = (p0 != null)? p0.isWiredHeadsetOn(): false;
       this.wiredHeadsetOn = b1;
       EveLog.i$default("EveHeadSetMonitor updateHeadSetState, blueToothHeadsetOn:"+this.blueToothHeadsetOn+", wiredHeadsetOn:"+this.wiredHeadsetOn, false, 2, null);
       if (this.wiredHeadsetOn != null) {
          this.headSetState = 1;
       }else if(this.blueToothHeadsetOn != null){
          this.headSetState = 2;
       }else {
          this.headSetState = 0;
       }
       this.notifyFeatureChange("headset");
       return;
    }
}
