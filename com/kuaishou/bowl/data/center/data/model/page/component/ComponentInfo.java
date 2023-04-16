package com.kuaishou.bowl.data.center.data.model.page.component.ComponentInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;

public class ComponentInfo implements Serializable	// class@0011e8
{
    public String bundleUrl;
    public long cid;
    public String dataApi;
    public String downgradeName;
    public String forVer;
    public String md5;
    public String name;
    public String renderType;
    public String type;
    public String ver;
    public static final long serialVersionUID = 0xe668da496461afea;

    public void ComponentInfo(){
       super();
    }
    public boolean isTypeNative(){
       Object obj = PatchProxy.apply(null, this, ComponentInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("NATIVE").equals(this.renderType);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ComponentInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ComponentInfo{componentId="+this.cid+", componentName=\'"+this.name+'''+", componentRenderType=\'"+this.renderType+'''+", componentBundleURL=\'"+this.bundleUrl+'''+", componentType=\'"+this.type+'''+", componentVer=\'"+this.ver+'''+", componentForVer=\'"+this.forVer+'''+", componentMD5=\'"+this.md5+'''+", componentDataAPI=\'"+this.dataApi+'''+'}';
    }
}
