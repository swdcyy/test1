package com.kwai.video.waynelive.datasource.URLModelListDatasource;
import com.kwai.video.waynelive.datasource.LiveBaseDatasource;
import java.util.List;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.kuaishou.android.live.model.LiveAdaptiveManifest;
import com.kwai.video.waynelive.util.CommonUtil;
import java.lang.Exception;
import com.kwai.video.waynelive.debug.DebugLog;

public class URLModelListDatasource extends LiveBaseDatasource	// class@000df0
{
    public List mUrlList;
    public List manifests;

    public void URLModelListDatasource(List p0){
       super();
       this.manifests = new ArrayList();
       this.mDatasourceType = 2;
       this.mUrlList = p0;
       this.manifests = this.convert(p0);
    }
    public final List convert(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, URLModelListDatasource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          try{
             obj.add(CommonUtil.cdnlist2manifest(str));
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
}
