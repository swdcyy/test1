package com.kwai.video.waynelive.datasource.CDNModelListDatasource;
import com.kwai.video.waynelive.datasource.LiveBaseDatasource;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.yxcorp.gifshow.model.CDNUrl;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import com.kwai.video.waynelive.util.CommonUtil;
import java.lang.Exception;
import com.kwai.video.waynelive.debug.DebugLog;
import java.lang.StringBuilder;

public class CDNModelListDatasource extends LiveBaseDatasource	// class@000de0
{
    public List mCdnList;
    public List manifests;

    public void CDNModelListDatasource(List p0){
       super();
       this.manifests = new ArrayList();
       this.mDatasourceType = 2;
       this.mCdnList = p0;
       this.manifests = this.convert(p0);
    }
    public final List convert(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, CDNModelListDatasource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          CDNUrl uCDNUrl = iterator.next();
          try{
             obj.add(CommonUtil.cdnlist2manifest(uCDNUrl));
          }catch(java.lang.Exception e1){
             DebugLog.e("cdnlist2manifest ", e1.getMessage());
             goto label_0018 ;
          }
       }
       return obj;
    }
    public List getCurrentDatasource(){
       return this.manifests;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, CDNModelListDatasource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "CDNModelListDatasource";
       if (this.mCdnList != null) {
          for (int i = 0; i < this.mCdnList.size(); i = i + 1) {
             obj = obj+" index-"+i+": "+this.mCdnList.get(i).mUrl+" urltype:"+this.mCdnList.get(i).mUrlType;
          }
       }
       return obj;
    }
}
