package com.kwai.video.krtc.AryaManager;
import com.kwai.video.krtc.utils.c;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.video.krtc.AryaContext;
import com.kwai.video.krtc.AryaAudioEngineProxyImp;
import com.kwai.video.krtc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.krtc.AryaManager$LogParam;
import com.kwai.video.krtc.utils.Log;
import com.kwai.video.krtc.AryaManager$1;
import com.kwai.video.krtc.observers.AryaLogObserver;
import com.kwai.video.krtc.a;
import android.content.Context;
import com.kwai.video.krtc.Arya;
import java.util.List;
import java.lang.StringBuilder;
import java.lang.Number;

public class AryaManager	// class@000739
{
    public a b;
    public a c;
    public List d;
    public AryaContext e;
    public static AryaManager a;

    static {
       c.a();
       AryaManager.a = null;
    }
    public void AryaManager(){
       super();
       this.b = null;
       this.c = null;
       this.d = null;
       this.e = null;
       this.d = new ArrayList();
       this.e = new AryaContext();
       this.b = new AryaAudioEngineProxyImp();
       this.c = new b();
    }
    public static AryaManager getInstance(){
       AryaManager uAryaManager = AryaManager.class;
       Object obj = PatchProxy.apply(null, null, uAryaManager, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (AryaManager.a == null) {
          _monitor_enter(uAryaManager);
          if (AryaManager.a == null) {
             AryaManager.a = new AryaManager();
          }
          _monitor_exit(uAryaManager);
       }
       return AryaManager.a;
    }
    public static String getInstanceId(){
       Object obj = PatchProxy.apply(null, null, AryaManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AryaManager.nativeGetInstanceId();
    }
    public static native String nativeGetInstanceId();
    public static void setLogParam(AryaManager$LogParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, AryaManager.class, "1")) {
          return;
       }
       if (p0 == null) {
          p0 = new AryaManager$LogParam();
       }
       Log.setLogParam(p0);
       a.a(p0, new AryaManager$1());
       return;
    }
    public Arya createArya(Context p0){
       Arya obj = PatchProxy.applyOneRefs(p0, this, AryaManager.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Arya(p0, this.b, this.e);
       _monitor_enter(AryaManager.class);
       if (this.d.isEmpty()) {
          this.b.a(p0);
       }
       this.d.add(obj);
       Log.i("AryaManager", "createArya:"+obj+" count:"+this.d.size());
       _monitor_exit(AryaManager.class);
       return obj;
    }
    public Arya createAryaWithOutAudioEngine(Context p0){
       Arya obj = PatchProxy.applyOneRefs(p0, this, AryaManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Arya(p0, this.c, this.e);
       Log.i("AryaManager", "arya without audio engine created "+obj);
       return obj;
    }
    public void destroyArya(Arya p0){
       AryaManager uAryaManager = AryaManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAryaManager, "5")) {
          return;
       }
       p0.uninit();
       if (p0.b()) {
          _monitor_enter(uAryaManager);
          this.d.remove(p0);
          Log.i("AryaManager", "destroyArya:"+p0+" count:"+this.d.size());
          if (this.d.isEmpty()) {
             this.b.a();
          }
          _monitor_exit(uAryaManager);
       }else {
          Log.i("AryaManager", "arya without audio engine destroy "+p0);
       }
       return;
    }
    public String getAryaVersion(){
       Object obj = PatchProxy.apply(null, this, AryaManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetAryaVersion();
    }
    public String getAryaVersionExt(){
       Object obj = PatchProxy.apply(null, this, AryaManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.nativeGetAryaVersionExt();
    }
    public int getCpuPercent(){
       Object obj = PatchProxy.apply(null, this, AryaManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetCpuPercent();
    }
    public int getMemoryKBytes(){
       Object obj = PatchProxy.apply(null, this, AryaManager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.nativeGetMemoryKBytes();
    }
    public native final String nativeGetAryaVersion();
    public native final String nativeGetAryaVersionExt();
    public native final int nativeGetCpuPercent();
    public native final int nativeGetMemoryKBytes();
}
