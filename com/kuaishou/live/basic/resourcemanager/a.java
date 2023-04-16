package com.kuaishou.live.basic.resourcemanager.a;
import erd.o;
import com.kuaishou.live.basic.resourcemanager.c;
import jb7.a;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.basic.resourcemanager.LiveCommonResourceResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import pb7.a;
import java.io.File;
import com.kuaishou.live.basic.resourcemanager.c$a;
import r51.f;
import io.reactivex.g;
import r51.g;
import java.lang.Iterable;
import r51.k;

public final class a implements o	// class@000cf9
{
    public final c b;
    public final a c;
    public final DownloadTask$DownloadTaskType d;
    public final List e;

    public void a(c p0,a p1,DownloadTask$DownloadTaskType p2,List p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       a uoa = this;
       a b = uoa.b;
       a c = uoa.c;
       a d = uoa.d;
       a e = uoa.e;
       Collection uCollection = p0;
       Objects.requireNonNull(b);
       t ot = PatchProxy.applyFourRefs(uCollection, c, d, e, b, c.class, "6");
       if (ot != PatchProxyResult.class) {
       }else if(q.f(uCollection) && !q.f(e)){
          b.P(LiveLogTag.LIVE_RESOURCE.appendTag("LiveCommonResourceManager"), "handleMaterialDetailInfo, materialDetailInfoList size is wrong");
          LiveCommonResourceResult liveCommonRe = new LiveCommonResourceResult();
          liveCommonRe.mIsAllSuccess = false;
          ot = t.just(liveCommonRe);
       }else {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = uCollection.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             ot = PatchProxy.applyThreeRefs(obj, c, d, b, c.class, "9");
             if (ot != PatchProxyResult.class) {
             }else {
                File uFile = ResourceSdk.f.f(c.c(), obj);
                if (uFile.exists()) {
                   LiveLogTag lIVE_RESOURC = LiveLogTag.LIVE_RESOURCE;
                   lIVE_RESOURC.appendTag("LiveCommonResourceManager");
                   b.T(lIVE_RESOURC, "dealMaterialInfo, file.exists", "id:", obj.getMaterialId(), "path:", uFile.getAbsolutePath());
                   ot = t.just(new c$a(obj.getMaterialId(), uFile.getAbsolutePath()));
                }else {
                   ot = t.create(new f(b, obj, c, d));
                }
             }
             uArrayList.add(ot);
          }
          ot = t.zip(uArrayList, new g(b)).map(new k(b, e));
       }
       return ot;
    }
}
