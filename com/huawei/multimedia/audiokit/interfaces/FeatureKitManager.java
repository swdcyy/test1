package com.huawei.multimedia.audiokit.interfaces.FeatureKitManager;
import java.lang.Object;
import android.content.Context;
import com.huawei.multimedia.audiokit.interfaces.AudioFeaturesKit;
import java.lang.Integer;
import java.lang.String;
import com.huawei.multimedia.audiokit.utils.LogUtils;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit;
import com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback;
import android.content.ServiceConnection;
import android.content.Intent;
import com.kwai.plugin.dva.feature.core.hook.a;
import java.lang.SecurityException;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;

public class FeatureKitManager	// class@0006c4
{
    public IAudioKitCallback f;
    public static final Object a;
    public static final Object b;
    public static final Object c;
    public static final Object d;
    public static FeatureKitManager e;

    static {
       FeatureKitManager.a = new Object();
       FeatureKitManager.b = new Object();
       FeatureKitManager.c = new Object();
       FeatureKitManager.d = new Object();
    }
    public void FeatureKitManager(){
       super();
       this.f = null;
    }
    public static FeatureKitManager a(){
       Object b = FeatureKitManager.b;
       _monitor_enter(b);
       if (FeatureKitManager.e == null) {
          FeatureKitManager.e = new FeatureKitManager();
       }
       _monitor_exit(b);
       return FeatureKitManager.e;
    }
    public AudioFeaturesKit a(int p0,Context p1){
       Integer[] integerArray = new Integer[]{Integer.valueOf(p0)};
       LogUtils.b("HwAudioKit.FeatureKitManager", "createFeatureKit, type = {}", integerArray);
       if (p1 == null) {
          return null;
       }
       if (p0 != 1) {
          LogUtils.b("HwAudioKit.FeatureKitManager", "createFeatureKit, type error");
          return null;
       }else {
          HwAudioKaraokeFeatureKit hwAudioKarao = new HwAudioKaraokeFeatureKit(p1);
          hwAudioKarao.a(p1);
          return hwAudioKarao;
       }
    }
    public void a(int p0){
       Integer[] integerArray = new Integer[]{Integer.valueOf(p0)};
       LogUtils.b("HwAudioKit.FeatureKitManager", "onCallBack, result = {}", integerArray);
       Object a = FeatureKitManager.a;
       _monitor_enter(a);
       if (this.b() != null) {
          this.b().onResult(p0);
       }
       _monitor_exit(a);
       return;
    }
    public void a(Context p0,ServiceConnection p1,String p2){
       int i;
       Object c = FeatureKitManager.c;
       _monitor_enter(c);
       if (p0 == null) {
          _monitor_exit(c);
          return;
       }else {
          Intent intent = new Intent();
          intent.setClassName("com.huawei.multimedia.audioengine", p2);
          try{
             i = 1;
             LogUtils.b("HwAudioKit.FeatureKitManager", "bindService");
             a.a(p0, intent, p1, i);
          }catch(java.lang.SecurityException e5){
             String[] stringArray = new String[i];
             stringArray[0] = e5.getMessage();
             LogUtils.a("HwAudioKit.FeatureKitManager", "bindService, SecurityException, {}", stringArray);
          }
          _monitor_exit(c);
          return;
       }
    }
    public void a(IAudioKitCallback p0){
       this.f = p0;
    }
    public boolean a(Context p0){
       if (p0 == null) {
          return false;
       }
       try{
          PackageManager packageManag = p0.getPackageManager();
          if (packageManag == null || packageManag.getPackageInfo("com.huawei.multimedia.audioengine", false) != null) {
             return true;
          }
          LogUtils.b("HwAudioKit.FeatureKitManager", "packageInfo is null");
          return false;
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          LogUtils.a(e0, "isAudioKitSupport ,NameNotFoundException");
          return false;
       }
    }
    public IAudioKitCallback b(){
       return this.f;
    }
}
