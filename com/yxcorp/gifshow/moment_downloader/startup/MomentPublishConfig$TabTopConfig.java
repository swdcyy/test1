package com.yxcorp.gifshow.moment_downloader.startup.MomentPublishConfig$TabTopConfig;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ra6.a;
import java.util.Map;

public class MomentPublishConfig$TabTopConfig implements Serializable	// class@001fc8
{
    public String mConfigId;
    public String mIconUrl;
    public Map mTextMap;
    public static final long serialVersionUID = 0xd282394247171309;

    public void MomentPublishConfig$TabTopConfig(){
       super();
    }
    public String getText(){
       Object obj = PatchProxy.apply(null, this, MomentPublishConfig$TabTopConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = a.d();
       if (i == 1) {
          return this.mTextMap.get("zh-cn");
       }
       if (i != 2) {
          return this.mTextMap.get("en-us");
       }
       return this.mTextMap.get("zh-tw");
    }
}
