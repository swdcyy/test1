package com.kuaishou.live.redpacket.feature.common.popup.skin.config.resource.ResizeConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ResizeConfig implements Serializable	// class@000f43
{
    public int mResizeHeightDp;
    public int mResizeWidthDp;
    public static final long serialVersionUID = 0xb47f5e835f3ce7b1;

    public void ResizeConfig(int p0,int p1){
       super();
       this.mResizeWidthDp = p0;
       this.mResizeHeightDp = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ResizeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ResizeSize{mResizeWidthDp = "+this.mResizeWidthDp+", mResizeHeightDp ="+this.mResizeHeightDp+'}';
    }
}
