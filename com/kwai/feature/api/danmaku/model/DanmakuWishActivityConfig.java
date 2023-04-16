package com.kwai.feature.api.danmaku.model.DanmakuWishActivityConfig;
import java.io.Serializable;
import java.lang.String;
import com.kwai.feature.api.danmaku.model.ExtraDanmakuDisplayInfo;
import java.lang.Object;
import nsd.u;

public final class DanmakuWishActivityConfig implements Serializable	// class@000e81
{
    public final String activityId;
    public final ExtraDanmakuDisplayInfo background;
    public final ExtraDanmakuDisplayInfo backgroundHost;
    public final ExtraDanmakuDisplayInfo left;
    public final ExtraDanmakuDisplayInfo right;

    public void DanmakuWishActivityConfig(String p0,ExtraDanmakuDisplayInfo p1,ExtraDanmakuDisplayInfo p2,ExtraDanmakuDisplayInfo p3,ExtraDanmakuDisplayInfo p4){
       super();
       this.activityId = p0;
       this.left = p1;
       this.right = p2;
       this.background = p3;
       this.backgroundHost = p4;
    }
    public void DanmakuWishActivityConfig(String p0,ExtraDanmakuDisplayInfo p1,ExtraDanmakuDisplayInfo p2,ExtraDanmakuDisplayInfo p3,ExtraDanmakuDisplayInfo p4,int p5,u p6){
       String str = (p5 & 0x01)? null: p0;
       ExtraDanmakuDisplayInfo uExtraDanmak = (p5 & 0x10)? null: p4;
       super(str, p1, p2, p3, uExtraDanmak);
       return;
    }
    public final String getActivityId(){
       return this.activityId;
    }
    public final ExtraDanmakuDisplayInfo getBackground(){
       return this.background;
    }
    public final ExtraDanmakuDisplayInfo getBackground(boolean p0){
       DanmakuWishActivityConfig tbackgroundH = (p0)? this.backgroundHost: this.background;
       return tbackgroundH;
    }
    public final ExtraDanmakuDisplayInfo getBackgroundHost(){
       return this.backgroundHost;
    }
    public final ExtraDanmakuDisplayInfo getLeft(){
       return this.left;
    }
    public final ExtraDanmakuDisplayInfo getRight(){
       return this.right;
    }
}
