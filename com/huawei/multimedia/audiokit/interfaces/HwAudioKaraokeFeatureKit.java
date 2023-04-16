package com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit;
import com.huawei.multimedia.audiokit.interfaces.AudioFeaturesKit;
import android.content.Context;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$1;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$2;
import com.huawei.multimedia.audiokit.interfaces.FeatureKitManager;
import com.huawei.multimedia.audioengine.IHwAudioKaraokeFeature;
import android.os.IBinder;
import java.lang.String;
import android.os.IBinder$DeathRecipient;
import com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$ParameName;
import java.io.Serializable;
import java.lang.Integer;
import java.lang.Object;
import com.huawei.multimedia.audiokit.utils.LogUtils;
import android.os.RemoteException;
import java.lang.Boolean;
import android.content.ServiceConnection;

public class HwAudioKaraokeFeatureKit extends AudioFeaturesKit	// class@0006c8
{
    public Context a;
    public FeatureKitManager b;
    public boolean c;
    public IHwAudioKaraokeFeature d;
    public IBinder e;
    public ServiceConnection f;
    public IBinder$DeathRecipient g;

    public void HwAudioKaraokeFeatureKit(Context p0){
       super();
       this.b = null;
       this.c = false;
       this.e = null;
       this.f = new HwAudioKaraokeFeatureKit$1(this);
       this.g = new HwAudioKaraokeFeatureKit$2(this);
       this.b = FeatureKitManager.a();
       this.a = p0;
    }
    public static IHwAudioKaraokeFeature a(HwAudioKaraokeFeatureKit p0){
       return p0.d;
    }
    public static IHwAudioKaraokeFeature a(HwAudioKaraokeFeatureKit p0,IHwAudioKaraokeFeature p1){
       p0.d = p1;
       return p1;
    }
    public static void a(HwAudioKaraokeFeatureKit p0,IBinder p1){
       p0.a(p1);
    }
    public static void a(HwAudioKaraokeFeatureKit p0,String p1){
       p0.a(p1);
    }
    public static boolean a(HwAudioKaraokeFeatureKit p0,boolean p1){
       p0.c = p1;
       return p1;
    }
    public static IBinder b(HwAudioKaraokeFeatureKit p0,IBinder p1){
       p0.e = p1;
       return p1;
    }
    public static FeatureKitManager b(HwAudioKaraokeFeatureKit p0){
       return p0.b;
    }
    public static Context c(HwAudioKaraokeFeatureKit p0){
       return p0.a;
    }
    public static IBinder$DeathRecipient d(HwAudioKaraokeFeatureKit p0){
       return p0.g;
    }
    public static IBinder e(HwAudioKaraokeFeatureKit p0){
       return p0.e;
    }
    public int a(HwAudioKaraokeFeatureKit$ParameName p0,int p1){
       if (p0 == null) {
          return 1807;
       }
       int i = 1;
       try{
          Serializable[] serializable = new Serializable[]{p0.a(),Integer.valueOf(p1)};
          LogUtils.b("HwAudioKit.HwAudioKaraokeFeatureKit", "parame.getParameName\(\) = {}, parameValue = {}", serializable);
          HwAudioKaraokeFeatureKit td = this.d;
          if (td != null && this.c != null) {
             return td.a(p0.a(), p1);
          }
       }catch(android.os.RemoteException e7){
          String[] stringArray = new String[i];
          stringArray[0] = e7.getMessage();
          LogUtils.a("HwAudioKit.HwAudioKaraokeFeatureKit", "setParameter,RemoteException ex : {}", stringArray);
       }
       return -2;
    }
    public int a(boolean p0){
       Boolean[] uBooleanArra = new Boolean[]{Boolean.valueOf(p0)};
       String str = "enableKaraokeFeature, enable = {}";
       try{
          LogUtils.b("HwAudioKit.HwAudioKaraokeFeatureKit", str, uBooleanArra);
          HwAudioKaraokeFeatureKit td = this.d;
          if (td != null && this.c != null) {
             return td.a(p0);
          }
       }catch(android.os.RemoteException e6){
          String[] stringArray = new String[]{e6.getMessage()};
          LogUtils.a("HwAudioKit.HwAudioKaraokeFeatureKit", "enableKaraokeFeature,RemoteException ex : {}", stringArray);
       }
       return -2;
    }
    public void a(Context p0){
       LogUtils.b("HwAudioKit.HwAudioKaraokeFeatureKit", "initialize");
       if (p0 == null) {
          LogUtils.b("HwAudioKit.HwAudioKaraokeFeatureKit", "initialize, context is null");
          return;
       }else if(!this.b.a(p0)){
          this.b.a(2);
          LogUtils.b("HwAudioKit.HwAudioKaraokeFeatureKit", "initialize, not install AudioEngine");
          return;
       }else {
          this.b(p0);
          return;
       }
    }
    public final void a(IBinder p0){
       this.e = p0;
       if (p0 != null) {
          try{
             p0.linkToDeath(this.g, 0);
          }catch(android.os.RemoteException e0){
             this.b.a(1002);
             LogUtils.a("HwAudioKit.HwAudioKaraokeFeatureKit", "serviceLinkToDeath, RemoteException");
          }
       }
    }
    public final void a(String p0){
       try{
          HwAudioKaraokeFeatureKit td = this.d;
          if (td != null && this.c != null) {
             td.a(p0);
          }
       }catch(android.os.RemoteException e3){
          String[] stringArray = new String[]{e3.getMessage()};
          LogUtils.a("HwAudioKit.HwAudioKaraokeFeatureKit", "isFeatureSupported,RemoteException ex : {}", stringArray);
       }
       return;
    }
    public final void b(Context p0){
       LogUtils.b("HwAudioKit.HwAudioKaraokeFeatureKit", "bindService");
       HwAudioKaraokeFeatureKit tb = this.b;
       if (tb != null && this.c == null) {
          tb.a(p0, this.f, "com.huawei.multimedia.audioengine.HwAudioKaraokeFeatureService");
       }
       return;
    }
}
