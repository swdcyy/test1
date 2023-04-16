package com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PhotoAdvertisement$TkTemplateInfo implements Serializable	// class@000a32
{
    public int initType;
    public int source;
    public String templateId;
    public String templateMd5;
    public String templateUrl;
    public String templateVersion;
    public int templateVersionCode;
    public int tmpVer;
    public static final long serialVersionUID = 0xa5320a264c51b8e2;

    public void PhotoAdvertisement$TkTemplateInfo(){
       super();
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, PhotoAdvertisement$TkTemplateInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.templateId+"-"+this.templateVersionCode;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhotoAdvertisement$TkTemplateInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TkTemplateInfo{templateId=\'"+this.templateId+'''+", templateVersion=\'"+this.templateVersion+'''+", source="+this.source+", tmpVer="+this.tmpVer+'}';
    }
}
