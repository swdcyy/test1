package com.kuaishou.live.basic.resourcemanager.c;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.util.List;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.basic.resourcemanager.LiveCommonResourceResult;
import jb7.a;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import jb7.b;
import com.kwai.middleware.resourcemanager.cache.type.CachePolicy;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import t45.d;
import brd.z;
import r51.j;
import erd.o;
import com.kuaishou.live.basic.resourcemanager.a;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class c	// class@000cfc
{

    public void c(){
       super();
    }
    public t a(String p0,DownloadTask$DownloadTaskType p1,List p2){
       a obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p2)) {
          b.P(LiveLogTag.LIVE_RESOURCE.appendTag("LiveCommonResourceManager"), "getLiveResource, resIds is empty");
          return t.just(new LiveCommonResourceResult());
       }else {
          obj = new a(p0, 1, Object.class);
          return ResourceSdk.f.b(obj).a(CachePolicy.NETWORK_ELSE_CACHE).subscribeOn(d.b).map(new j(this, p2)).flatMap(new a(this, obj, p1, p2)).observeOn(d.a);
       }
    }
    public final List b(Result p0,List p1){
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       List list = p0.a();
       if (q.f(list)) {
          b.P(LiveLogTag.LIVE_RESOURCE.appendTag("LiveCommonResourceManager"), "handleMaterialGroupInfo, materialGroupInfoList is empty");
          return obj;
       }else {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             Object obj1 = iterator.next();
             if (!PatchProxy.applyVoidThreeRefs(obj1, obj, p1, this, c.class, "5") && (obj1 != null && !q.f(obj1.getDetailInfoList()))) {
                Iterator iterator1 = obj1.getDetailInfoList().iterator();
                while (iterator1.hasNext()) {
                   MaterialDetailInfo materialDeta = iterator1.next();
                   if (materialDeta != null && (!TextUtils.x(materialDeta.getMaterialId()) && p1.contains(materialDeta.getMaterialId()))) {
                      obj.add(materialDeta);
                   }else {
                      continue ;
                   }
                }
             }
          }
          return obj;
       }
    }
}
