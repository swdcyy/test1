package com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import java.io.Serializable;
import gv.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.bowl.data.center.data.model.MaterialMapItem;
import zk.d;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.Long;
import com.kuaishou.bowl.data.center.data.model.RuleMatcherInfo;

public class MaterialDataItem implements Serializable, k	// class@0011bf
{
    public List belonging;
    public List controlInfo;
    public String currentPage;
    public String dynamicType;
    public boolean handlerByRNLive;
    public MaterialBaseInfo materialBaseInfo;
    public long materialId;
    public Map materialMap;
    public MountInfo mountInfo;
    public String pageCode;
    public String pendantCode;
    public int priority;
    public RenderInfo renderInfo;
    public String resourceId;
    public String resourceType;
    public RuleMatcherInfo ruleMatcherInfo;
    public boolean showAfterCallBack;
    public long templateId;
    public int templateInstanceId;
    public String token;
    public List triggerTimings;
    public String triggerType;
    public String version;
    public static final long serialVersionUID = 0x3fc3232be6dfcd1;

    public void MaterialDataItem(){
       super();
    }
    public String getId(){
       Object obj = PatchProxy.apply(null, this, MaterialDataItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(this.materialId);
    }
    public MaterialMap getMaterialMap(){
       String str = "data";
       String str1 = "datas";
       MaterialMap obj = PatchProxy.apply(null, this, MaterialDataItem.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new MaterialMap();
          if (this.materialMap.get(str1) != null) {
             List list = this.materialMap.get(str1);
             ArrayList uArrayList = new ArrayList();
             if (list != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Map map = iterator.next();
                   if (map == null || map.get(str) == null) {
                      continue ;
                   }
                   MaterialMapItem materialMapI = new MaterialMapItem();
                   materialMapI.uniqueId = map.get("uniqueId");
                   d uod = new d();
                   uod.d();
                   materialMapI.data = uod.b().x(map.get(str)).r();
                   uArrayList.add(materialMapI);
                }
             }
             obj.datas = uArrayList;
          }
          obj.templateDataType = this.materialMap.get("templateDataType").longValue();
          return obj;
       }catch(java.lang.Exception e0){
       }
    }
    public RuleMatcherInfo getRuleMatcherModel(){
       return this.ruleMatcherInfo;
    }
    public String getToken(){
       return this.token;
    }
    public String getVersion(){
       return this.version;
    }
}
