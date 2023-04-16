package com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenMountData;
import java.io.Serializable;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenMountData$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveFloatingScreenMountData implements Serializable	// class@000fc6
{
    public int mountDisplayType;
    public int mountHeight;
    public String mountResKey;
    public int mountResType;
    public int mountType;
    public CDNUrl[] mountUrls;
    public int mountWidth;
    public static final LiveFloatingScreenMountData$a Companion;
    public static final long serialVersionUID;

    static {
       LiveFloatingScreenMountData.Companion = new LiveFloatingScreenMountData$a(null);
    }
    public void LiveFloatingScreenMountData(){
       super();
       this.mountResKey = "";
    }
    public static void getMountType$annotations(){
    }
    public final int getMountDisplayType(){
       return this.mountDisplayType;
    }
    public final int getMountHeight(){
       return this.mountHeight;
    }
    public final String getMountResKey(){
       return this.mountResKey;
    }
    public final int getMountResType(){
       return this.mountResType;
    }
    public final int getMountType(){
       return this.mountType;
    }
    public final CDNUrl[] getMountUrls(){
       return this.mountUrls;
    }
    public final int getMountWidth(){
       return this.mountWidth;
    }
    public final void setMountDisplayType(int p0){
       this.mountDisplayType = p0;
    }
    public final void setMountHeight(int p0){
       this.mountHeight = p0;
    }
    public final void setMountResKey(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenMountData.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mountResKey = p0;
       return;
    }
    public final void setMountResType(int p0){
       this.mountResType = p0;
    }
    public final void setMountType(int p0){
       this.mountType = p0;
    }
    public final void setMountUrls(CDNUrl[] p0){
       this.mountUrls = p0;
    }
    public final void setMountWidth(int p0){
       this.mountWidth = p0;
    }
}
