package com.kuaishou.bowl.data.center.data.model.page.PageDyComponentInfo;
import java.io.Serializable;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import java.lang.Boolean;

public class PageDyComponentInfo implements Serializable	// class@0011e5
{
    public String bundleId;
    public String bundleUrl;
    public String cid;
    public JsonElement commonData;
    public String downgradeName;
    public Map engineConfig;
    public PageComponentDataInfo$Field filedData;
    public String instanceId;
    public String name;
    public String renderType;
    public Map style;
    public TrackInfo trackInfo;
    public static final long serialVersionUID = 0x8d43e96121d8dcbf;

    public void PageDyComponentInfo(){
       super();
    }
    public Map getMapParams(){
       HashMap obj = PatchProxy.apply(null, this, PageDyComponentInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       obj.put("name", this.name);
       obj.put("renderType", this.renderType);
       obj.put("bundleUrl", this.bundleUrl);
       obj.put("cid", this.cid);
       obj.put("filedData", this.filedData);
       obj.put("style", this.style);
       obj.put("commonData", this.commonData);
       obj.put("engineConfig", this.engineConfig);
       return obj;
    }
    public boolean isTypeNative(){
       Object obj = PatchProxy.apply(null, this, PageDyComponentInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("NATIVE").equals(this.renderType);
    }
}
