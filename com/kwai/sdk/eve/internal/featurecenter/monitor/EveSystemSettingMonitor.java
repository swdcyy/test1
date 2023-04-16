package com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$Companion;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$volumeChangeReceiver$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$brightnessObserver$2;
import android.os.Handler;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.featurecenter.AppCachedFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$createFeatureProvider$2;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$createFeatureProvider$1;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$brightnessObserver$2$1;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$volumeChangeReceiver$2$1;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveSystemSettingMonitor$init$1;
import java.lang.Runnable;
import com.yxcorp.utility.SystemUtil;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveSystemSettingMonitor extends FeatureMonitor	// class@001534
{
    public final p brightnessObserver$delegate;
    public Handler handler;
    public int screenLight;
    public float volume;
    public final p volumeChangeReceiver$delegate;
    public static final EveSystemSettingMonitor$Companion Companion;

    static {
       EveSystemSettingMonitor.Companion = new EveSystemSettingMonitor$Companion(null);
    }
    public void EveSystemSettingMonitor(Context p0){
       a.p(p0, "context");
       super(p0);
       this.volumeChangeReceiver$delegate = s.c(new EveSystemSettingMonitor$volumeChangeReceiver$2(this));
       this.brightnessObserver$delegate = s.c(new EveSystemSettingMonitor$brightnessObserver$2(this));
    }
    public static final Handler access$getHandler$p(EveSystemSettingMonitor p0){
       p0 = p0.handler;
       if (p0 == null) {
          a.S("handler");
       }
       return p0;
    }
    public IFeatureProvider createFeatureProvider(String p0){
       AppCachedFeatureProvider uAppCachedFe;
       String obj = PatchProxy.applyOneRefs(p0, this, EveSystemSettingMonitor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feature");
       int i = p0.hashCode();
       if (i != -810883293) {
          if (i == -31401942) {
             obj = "screenlight";
             if (p0.equals(obj)) {
                uAppCachedFe = new AppCachedFeatureProvider(obj, new EveSystemSettingMonitor$createFeatureProvider$2(this));
             label_0047 :
                return uAppCachedFe;
             }
          }
       }else {
          obj = "volumn";
          if (p0.equals(obj)) {
             uAppCachedFe = new AppCachedFeatureProvider(obj, new EveSystemSettingMonitor$createFeatureProvider$1(this));
             goto label_0047 ;
          }
       }
       throw new RuntimeException("EveSystemSettingMonitor not expect feature:"+p0);
    }
    public List features(){
       String[] obj = PatchProxy.apply(null, this, EveSystemSettingMonitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"volumn","screenlight"};
       return CollectionsKt__CollectionsKt.L(obj);
    }
    public final EveSystemSettingMonitor$brightnessObserver$2$1 getBrightnessObserver(){
       Object obj = PatchProxy.apply(null, this, EveSystemSettingMonitor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.brightnessObserver$delegate.getValue();
    }
    public final EveSystemSettingMonitor$volumeChangeReceiver$2$1 getVolumeChangeReceiver(){
       Object obj = PatchProxy.apply(null, this, EveSystemSettingMonitor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.volumeChangeReceiver$delegate.getValue();
    }
    public void init(Handler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveSystemSettingMonitor.class, "3")) {
          return;
       }
       a.p(p0, "handler");
       this.handler = p0;
       p0.post(new EveSystemSettingMonitor$init$1(this, p0));
       return;
    }
    public final void updateBrightness(){
       if (PatchProxy.applyVoid(null, this, EveSystemSettingMonitor.class, "7")) {
          return;
       }
       this.screenLight = SystemUtil.x(this.getContext());
       EveLog.i$default("EveSystemSettingMonitor updateBrightness, brightness:"+this.screenLight, false, 2, null);
       this.notifyFeatureChange("screenlight");
       return;
    }
    public final void updateVolume(){
       if (PatchProxy.applyVoid(null, this, EveSystemSettingMonitor.class, "6")) {
          return;
       }
       this.volume = SystemUtil.i(this.getContext());
       EveLog.i$default("EveSystemSettingMonitor updateVolume, volume:"+this.volume, false, 2, null);
       this.notifyFeatureChange("volumn");
       return;
    }
}
