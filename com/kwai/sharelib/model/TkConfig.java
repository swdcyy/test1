package com.kwai.sharelib.model.TkConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class TkConfig implements Serializable	// class@0016fb
{
    public Boolean isRetryNative;
    public JsonObject mTkContent;
    public String mTkTemplateId;
    public String mViewArea;
    public static final long serialVersionUID = 0x102022fdd32ae516;

    public void TkConfig(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TkConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TkConfig{mViewArea=\'"+this.mViewArea+'''+", mTkTemplateId=\'"+this.mTkTemplateId+'''+", isRetryNative="+this.isRetryNative+", mTkContent="+this.mTkContent+'}';
    }
}
