package com.kwai.social.startup.relation.model.PymkConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PymkConfig implements Serializable	// class@0018b6
{
    public int mFollowingShowThreshold;
    public int mPymkStyle;
    public static int PYMK_STYLE_DEFAULT = 0;
    public static int PYMK_STYLE_USER_LIST = 1;
    public static int PYMK_STYLE_WITH_FEED = 2;
    public static final long serialVersionUID = 0x6d405f7a9771da15;

    public void PymkConfig(){
       super();
       this.mFollowingShowThreshold = 10;
       this.mPymkStyle = PymkConfig.PYMK_STYLE_DEFAULT;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PymkConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PymkConfig{mFollowingShowThreshold="+this.mFollowingShowThreshold+'}';
    }
}
