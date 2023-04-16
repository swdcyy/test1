package com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenButtonItem;
import com.kwai.feature.api.live.floatingscreen.data.items.LiveFloatingScreenBaseItemData;
import java.lang.String;
import fr5.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class LiveFloatingScreenButtonItem extends LiveFloatingScreenBaseItemData	// class@000fc2
{
    public String buttonText;
    public String routerURL;
    public float webHeightPercent;
    public String webURL;

    public void LiveFloatingScreenButtonItem(){
       super();
       this.buttonText = "";
       this.routerURL = "";
       this.webURL = "";
       this.webHeightPercent = 0x3f4ccccd;
    }
    public final String getButtonText(){
       return this.buttonText;
    }
    public final String getRouterURL(){
       return this.routerURL;
    }
    public final float getWebHeightPercent(){
       return this.webHeightPercent;
    }
    public final String getWebURL(){
       return this.webURL;
    }
    public void registerResourceToPreload(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenButtonItem.class, "4")) {
          return;
       }
       a.p(p0, "preload");
       super.registerResourceToPreload(p0);
       return;
    }
    public final void setButtonText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenButtonItem.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.buttonText = p0;
       return;
    }
    public final void setRouterURL(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenButtonItem.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.routerURL = p0;
       return;
    }
    public final void setWebHeightPercent(float p0){
       this.webHeightPercent = p0;
    }
    public final void setWebURL(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFloatingScreenButtonItem.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.webURL = p0;
       return;
    }
}
