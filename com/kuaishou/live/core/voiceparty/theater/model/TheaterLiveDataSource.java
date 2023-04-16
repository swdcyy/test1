package com.kuaishou.live.core.voiceparty.theater.model.TheaterLiveDataSource;
import java.io.Serializable;
import com.kuaishou.live.core.voiceparty.theater.model.TheaterLiveDataSource$a;
import nsd.u;
import java.lang.Object;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.video.waynelive.datasource.LiveDataSource;
import com.kwai.robust.PatchProxyResult;

public final class TheaterLiveDataSource implements Serializable	// class@00196f
{
    public boolean enableHardwareDecoder;
    public List liveAdaptiveManifests;
    public List multiResolutionPlayUrls;
    public List playUrls;
    public List webRTCAdaptiveManifests;
    public static final TheaterLiveDataSource$a Companion;
    public static final long serialVersionUID;

    static {
       TheaterLiveDataSource.Companion = new TheaterLiveDataSource$a(null);
    }
    public void TheaterLiveDataSource(){
       super();
       this.enableHardwareDecoder = true;
       this.playUrls = CollectionsKt__CollectionsKt.E();
       this.liveAdaptiveManifests = CollectionsKt__CollectionsKt.E();
       this.multiResolutionPlayUrls = CollectionsKt__CollectionsKt.E();
       this.webRTCAdaptiveManifests = CollectionsKt__CollectionsKt.E();
    }
    public final boolean getEnableHardwareDecoder(){
       return this.enableHardwareDecoder;
    }
    public final List getLiveAdaptiveManifests(){
       return this.liveAdaptiveManifests;
    }
    public final List getMultiResolutionPlayUrls(){
       return this.multiResolutionPlayUrls;
    }
    public final List getPlayUrls(){
       return this.playUrls;
    }
    public final List getWebRTCAdaptiveManifests(){
       return this.webRTCAdaptiveManifests;
    }
    public final void setEnableHardwareDecoder(boolean p0){
       this.enableHardwareDecoder = p0;
    }
    public final void setLiveAdaptiveManifests(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterLiveDataSource.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.liveAdaptiveManifests = p0;
       return;
    }
    public final void setMultiResolutionPlayUrls(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterLiveDataSource.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.multiResolutionPlayUrls = p0;
       return;
    }
    public final void setPlayUrls(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterLiveDataSource.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.playUrls = p0;
       return;
    }
    public final void setWebRTCAdaptiveManifests(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TheaterLiveDataSource.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.webRTCAdaptiveManifests = p0;
       return;
    }
    public final LiveDataSource toLiveDataSource(){
       Object obj = PatchProxy.apply(null, this, TheaterLiveDataSource.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveDataSource(this.playUrls, this.liveAdaptiveManifests, this.multiResolutionPlayUrls, this.webRTCAdaptiveManifests);
    }
}
