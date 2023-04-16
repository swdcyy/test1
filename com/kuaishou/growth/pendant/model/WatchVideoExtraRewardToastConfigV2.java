package com.kuaishou.growth.pendant.model.WatchVideoExtraRewardToastConfigV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.WatchVideoExtraRewardToastConfigV2$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class WatchVideoExtraRewardToastConfigV2 implements Serializable	// class@000695
{
    public int mRewardType;
    public int mStage;
    public String mToastText;
    public static final WatchVideoExtraRewardToastConfigV2$a Companion;
    public static final long serialVersionUID;

    static {
       WatchVideoExtraRewardToastConfigV2.Companion = new WatchVideoExtraRewardToastConfigV2$a(null);
    }
    public void WatchVideoExtraRewardToastConfigV2(){
       super();
    }
    public final int getMRewardType(){
       return this.mRewardType;
    }
    public final int getMStage(){
       return this.mStage;
    }
    public final String getMToastText(){
       return this.mToastText;
    }
    public final void setMRewardType(int p0){
       this.mRewardType = p0;
    }
    public final void setMStage(int p0){
       this.mStage = p0;
    }
    public final void setMToastText(String p0){
       this.mToastText = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, WatchVideoExtraRewardToastConfigV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "WatchVideoExtraRewardToastConfig{mToastText=\'"+this.mToastText+'''+", mRewardType="+this.mRewardType+", mStage="+this.mStage+'}';
    }
}
