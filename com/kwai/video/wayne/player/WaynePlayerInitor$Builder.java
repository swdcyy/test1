package com.kwai.video.wayne.player.WaynePlayerInitor$Builder;
import java.lang.Object;
import com.kwai.video.wayne.player.WaynePlayerInitor$1;
import com.kwai.video.wayne.player.config.module.AwesomeCacheParamsModule;
import com.kwai.video.wayne.player.WaynePlayerInitor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.util.DebugLog;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.hodor.KlogObserver$KlogParam;
import com.kwai.video.wayne.player.logreport.IKSLogReport;
import com.kwai.video.player.KlogObserver$KlogParam;
import com.kwai.video.wayne.player.WaynePlayerInitor$VodSoLoader;
import bi7.a;
import com.kwai.video.wayne.player.util.DebugLog$LogInterface;

public class WaynePlayerInitor$Builder	// class@000cb6
{
    public AwesomeCacheParamsModule awesomeCacheParamsModule;
    public KSConfigGetInterface configGetImpl;
    public KlogObserver$KlogParam hodorKLogParam;
    public IKSLogReport loggerImpl;
    public WaynePlayerInitor mWaynePlayerInitor;
    public KlogObserver$KlogParam playerkLogParam;
    public WaynePlayerInitor$VodSoLoader sInjectedSoLoader;
    public a vppResourceDownloader;
    public DebugLog$LogInterface wayneLogimpl;

    public void WaynePlayerInitor$Builder(){
       super();
    }
    public void WaynePlayerInitor$Builder(WaynePlayerInitor$1 p0){
       super();
    }
    public WaynePlayerInitor$Builder awesomeCacheParamsModule(AwesomeCacheParamsModule p0){
       this.awesomeCacheParamsModule = p0;
       return this;
    }
    public synchronized WaynePlayerInitor buildOnce(){
       Object obj = PatchProxy.apply(null, this, WaynePlayerInitor$Builder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mWaynePlayerInitor == null) {
          this.mWaynePlayerInitor = new WaynePlayerInitor(this, null);
       }else {
          DebugLog.e("WaynePlayerIniter", "WaynePlayerInitor has builded and then return the before one");
       }
       return this.mWaynePlayerInitor;
    }
    public WaynePlayerInitor$Builder configGetInterface(KSConfigGetInterface p0){
       this.configGetImpl = p0;
       return this;
    }
    public WaynePlayerInitor$Builder enableSdcardLoadSo(boolean p0){
       return this;
    }
    public WaynePlayerInitor$Builder hodorKLogParam(KlogObserver$KlogParam p0){
       this.hodorKLogParam = p0;
       return this;
    }
    public WaynePlayerInitor$Builder loggerImpl(IKSLogReport p0){
       this.loggerImpl = p0;
       return this;
    }
    public WaynePlayerInitor$Builder playerkLogParam(KlogObserver$KlogParam p0){
       this.playerkLogParam = p0;
       return this;
    }
    public WaynePlayerInitor$Builder sInjectedSoLoader(WaynePlayerInitor$VodSoLoader p0){
       this.sInjectedSoLoader = p0;
       return this;
    }
    public WaynePlayerInitor$Builder vppResourceDownloader(a p0){
       this.vppResourceDownloader = p0;
       return this;
    }
    public WaynePlayerInitor$Builder wayneLogimpl(DebugLog$LogInterface p0){
       this.wayneLogimpl = p0;
       return this;
    }
}
