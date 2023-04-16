package com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenDataWithMount;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenCommonData$a;
import nsd.u;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenBackgroundData;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBorderData;
import java.util.List;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenEffectData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.data.LiveFloatingScreenSurfaceData;
import fr5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenBaseItemData;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveFloatingScreenCommonData extends LiveFloatingScreenDataWithMount	// class@000fba
{
    public LiveFloatingScreenBackgroundData backgroundData;
    public LiveFloatingScreenBorderData borderData;
    public List contentItems;
    public LiveFloatingScreenEffectData effectData;
    public LiveFloatingScreenSurfaceData surfaceData;
    public static final LiveFloatingScreenCommonData$a Companion;
    public static final long serialVersionUID;

    static {
       LiveFloatingScreenCommonData.Companion = new LiveFloatingScreenCommonData$a(null);
    }
    public void LiveFloatingScreenCommonData(){
       super();
    }
    public final LiveFloatingScreenBackgroundData getBackgroundData(){
       return this.backgroundData;
    }
    public final LiveFloatingScreenBorderData getBorderData(){
       return this.borderData;
    }
    public final List getContentItems(){
       return this.contentItems;
    }
    public final LiveFloatingScreenEffectData getEffectData(){
       return this.effectData;
    }
    public final LiveFloatingScreenSurfaceData getSurfaceData(){
       return this.surfaceData;
    }
    public void registerResourceToPreload(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenCommonData.class, "1")) {
          return;
       }
       a.p(p0, "preload");
       LiveFloatingScreenCommonData tcontentItem = this.contentItems;
       if (tcontentItem != null) {
          Iterator iterator = tcontentItem.iterator();
          while (iterator.hasNext()) {
             iterator.next().registerResourceToPreload(p0);
          }
       }
       tcontentItem = this.backgroundData;
       if (tcontentItem != null) {
          tcontentItem.registerResourceToPreload(p0);
       }
       tcontentItem = this.surfaceData;
       if (tcontentItem != null) {
          tcontentItem.registerResourceToPreload(p0);
       }
       return;
    }
    public final void setBackgroundData(LiveFloatingScreenBackgroundData p0){
       this.backgroundData = p0;
    }
    public final void setBorderData(LiveFloatingScreenBorderData p0){
       this.borderData = p0;
    }
    public final void setContentItems(List p0){
       this.contentItems = p0;
    }
    public final void setEffectData(LiveFloatingScreenEffectData p0){
       this.effectData = p0;
    }
    public final void setSurfaceData(LiveFloatingScreenSurfaceData p0){
       this.surfaceData = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveFloatingScreenCommonData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveFloatingScreenCommonData\(contentItems="+this.contentItems+", backgroundData="+this.backgroundData+", surfaceData="+this.surfaceData+", borderData="+this.borderData+", effectData="+this.effectData+')';
    }
}
