package com.tachikoma.template.manage.template.TemplateInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;

public class TemplateInfo implements Serializable	// class@000dec
{
    public String mTemplateId;
    public String mTemplateMd5;
    public String mTemplateUrl;
    public String mTemplateVersion;
    public int mTemplateVersionCode;
    public static final long serialVersionUID = 0x3bb04c463ff989dc;

    public void TemplateInfo(){
       super();
    }
    public String getIdAndVersion(){
       Object obj = PatchProxy.apply(null, this, TemplateInfo.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mTemplateId+"_"+this.mTemplateVersionCode;
    }
    public boolean isJs(){
       TemplateInfo obj = PatchProxy.apply(null, this, TemplateInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mTemplateUrl;
       boolean b = (obj != null && obj.endsWith(".js"))? true: false;
       return b;
    }
    public boolean isValid(){
       Object obj = PatchProxy.apply(null, this, TemplateInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mTemplateId) && (!TextUtils.isEmpty(this.mTemplateMd5) && (!TextUtils.isEmpty(this.mTemplateUrl) && this.mTemplateVersionCode > null)))? true: false;
       return b;
    }
    public boolean isZip(){
       TemplateInfo obj = PatchProxy.apply(null, this, TemplateInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mTemplateUrl;
       boolean b = (obj != null && obj.endsWith(".zip"))? true: false;
       return b;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TemplateInfo.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "TemplateInfo{templateId=\'"+this.mTemplateId+'''+", version="+this.mTemplateVersionCode+", md5=\'"+this.mTemplateMd5+'''+", url=\'"+this.mTemplateUrl+'''+'}';
    }
}
