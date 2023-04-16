package com.huawei.multimedia.audiokit.interfaces.HwAudioKit;
import java.util.ArrayList;
import android.content.Context;
import com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback;
import java.lang.Object;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit$1;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit$2;
import com.huawei.multimedia.audiokit.interfaces.FeatureKitManager;
import com.huawei.multimedia.audioengine.IHwAudioEngine;
import android.os.IBinder;
import java.lang.String;
import android.os.IBinder$DeathRecipient;
import com.huawei.multimedia.audiokit.utils.LogUtils;
import java.lang.Boolean;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKit$FeatureType;
import java.lang.Integer;
import com.huawei.multimedia.audiokit.interfaces.AudioFeaturesKit;

public class HwAudioKit	// class@0006cc
{
    public Context b;
    public IHwAudioEngine c;
    public boolean d;
    public FeatureKitManager e;
    public IBinder f;
    public ServiceConnection g;
    public IBinder$DeathRecipient h;
    public static final List a;

    static {
       HwAudioKit.a = new ArrayList(0);
    }
    public void HwAudioKit(Context p0,IAudioKitCallback p1){
       super();
       this.b = null;
       this.c = null;
       this.d = false;
       this.f = null;
       this.g = new HwAudioKit$1(this);
       this.h = new HwAudioKit$2(this);
       FeatureKitManager uFeatureKitM = FeatureKitManager.a();
       this.e = uFeatureKitM;
       uFeatureKitM.a(p1);
       this.b = p0;
    }
    public static IHwAudioEngine a(HwAudioKit p0){
       return p0.c;
    }
    public static IHwAudioEngine a(HwAudioKit p0,IHwAudioEngine p1){
       p0.c = p1;
       return p1;
    }
    public static void a(HwAudioKit p0,IBinder p1){
       p0.a(p1);
    }
    public static void a(HwAudioKit p0,String p1,String p2){
       p0.a(p1, p2);
    }
    public static boolean a(HwAudioKit p0,boolean p1){
       p0.d = p1;
       return p1;
    }
    public static IBinder b(HwAudioKit p0,IBinder p1){
       p0.f = p1;
       return p1;
    }
    public static FeatureKitManager b(HwAudioKit p0){
       return p0.e;
    }
    public static Context c(HwAudioKit p0){
       return p0.b;
    }
    public static IBinder$DeathRecipient d(HwAudioKit p0){
       return p0.h;
    }
    public static IBinder e(HwAudioKit p0){
       return p0.f;
    }
    public void a(){
       String str = "HwAudioKit.HwAudioKit";
       LogUtils.b(str, "initialize");
       HwAudioKit tb = this.b;
       if (tb == null) {
          LogUtils.b(str, "mContext is null");
          this.e.a(7);
          return;
       }else if(!this.e.a(tb)){
          LogUtils.b(str, "not install AudioKitEngine");
          this.e.a(2);
          return;
       }else {
          this.a(this.b);
          return;
       }
    }
    public final void a(Context p0){
       Boolean[] uBooleanArra = new Boolean[]{Boolean.valueOf(this.d)};
       LogUtils.b("HwAudioKit.HwAudioKit", "bindService, mIsServiceConnected = {}", uBooleanArra);
       HwAudioKit te = this.e;
       if (te != null && this.d == null) {
          te.a(p0, this.g, "com.huawei.multimedia.audioengine.HwAudioEngineService");
       }
       return;
    }
    public final void a(IBinder p0){
       this.f = p0;
       if (p0 != null) {
          try{
             p0.linkToDeath(this.h, 0);
          }catch(android.os.RemoteException e0){
             this.e.a(5);
             LogUtils.a("HwAudioKit.HwAudioKit", "serviceLinkToDeath, RemoteException");
          }
       }
    }
    public final void a(String p0,String p1){
       String str = "serviceInit";
       try{
          LogUtils.b("HwAudioKit.HwAudioKit", str);
          HwAudioKit tc = this.c;
          if (tc != null && this.d != null) {
             tc.a(p0, p1);
          }
       }catch(android.os.RemoteException e4){
          String[] stringArray = new String[]{e4.getMessage()};
          LogUtils.a("HwAudioKit.HwAudioKit", "isFeatureSupported,RemoteException ex : {}", stringArray);
       }
       return;
    }
    public boolean a(HwAudioKit$FeatureType p0){
       if (p0 == null) {
          return false;
       }
       Integer[] integerArray = new Integer[]{Integer.valueOf(p0.a())};
       String str = "isFeatureSupported, type = {}";
       try{
          LogUtils.b("HwAudioKit.HwAudioKit", str, integerArray);
          HwAudioKit tc = this.c;
          if (tc != null && this.d != null) {
             return tc.a(p0.a());
          }
       }catch(android.os.RemoteException e6){
          String[] stringArray = new String[]{e6.getMessage()};
          LogUtils.a("HwAudioKit.HwAudioKit", "isFeatureSupported,RemoteException ex : {}", stringArray);
       }
       return false;
    }
    public AudioFeaturesKit b(HwAudioKit$FeatureType p0){
       HwAudioKit te = this.e;
       if (te != null && p0 != null) {
          return te.a(p0.a(), this.b);
       }
       return null;
    }
}
