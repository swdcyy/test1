package com.kwai.sharelib.model.ShareAnyResponse$ShareAnyData;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import java.lang.String;
import zk.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonElement;
import ip7.d;
import java.lang.StringBuilder;

public class ShareAnyResponse$ShareAnyData implements Serializable, a	// class@0016ed
{
    public String mAppIconUrl;
    public String mAppName;
    public JsonElement mExtParamsObject;
    public String mShareChannel;
    public String mShareMethod;
    public String mShareMethodType;
    public String mShareMode;
    public ShareAnyResponse$ShareObject mShareObject;
    public String mSubBiz;
    public static final long serialVersionUID = 0x84cc4a2fa70c2520;

    public void ShareAnyResponse$ShareAnyData(){
       super();
    }
    public void afterDeserialize(){
       ShareAnyResponse$ShareAnyData tmShareObjec = this.mShareObject;
       if (tmShareObjec != null) {
          tmShareObjec.mExtParamsObject = this.mExtParamsObject;
       }
       return;
    }
    public g getExtParam(String[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShareAnyResponse$ShareAnyData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(this.mExtParamsObject, p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareAnyResponse$ShareAnyData.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShareAnyData{mShareMethod=\'"+this.mShareMethod+'''+", mShareMethodType=\'"+this.mShareMethodType+'''+", mShareMode=\'"+this.mShareMode+'''+", mShareChannel=\'"+this.mShareChannel+'''+", mSubBiz=\'"+this.mSubBiz+'''+", mAppName=\'"+this.mAppName+'''+", mAppIconUrl=\'"+this.mAppIconUrl+'''+", mShareObject="+this.mShareObject+", mExtParamsObject="+this.mExtParamsObject+'}';
    }
}
