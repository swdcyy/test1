package com.kwai.social.startup.relation.model.PymkAutoRefreshConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PymkAutoRefreshConfig implements Serializable	// class@0018b5
{
    public int mRecoPortal;
    public long mRefreshTimeInterval;
    public static final long serialVersionUID = 0x29919e8ea2830a81;

    public void PymkAutoRefreshConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PymkAutoRefreshConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PymkAutoRefreshConfig{mRecoPortal="+this.mRecoPortal+", mRefreshTimeInterval="+this.mRefreshTimeInterval+'}';
    }
}
