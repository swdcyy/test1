package com.kuaishou.gifshow.kuaishan.logic.a;
import io.reactivex.g;
import java.util.List;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialGroupInfo;
import java.util.Collection;
import com.kwai.middleware.resourcemanager.material.cache.model.MaterialDetailInfo;
import u80.e;
import w46.b;
import com.kwai.feature.post.api.feature.kuaishan.model.KSException;
import java.lang.Throwable;
import brd.g;
import com.kwai.middleware.resourcemanager.ResourceSdk;
import pb7.a;
import java.io.File;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;
import java.lang.Integer;
import com.kuaishou.gifshow.kuaishan.logic.a$b;
import com.kuaishou.gifshow.kuaishan.logic.a$a;
import erd.f;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import x80.h;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$b;
import com.kwai.robust.PatchProxyResult;
import com.kwai.middleware.resourcemanager.material.download.MaterialDownloadConfig;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import nsd.u;
import com.kwai.middleware.resourcemanager.download.config.DownloadConfig;
import gb7.c;
import com.kwai.middleware.resourcemanager.download.BaseResourceDownloadHelper;

public final class a implements g	// class@0019fd
{
    public final List b;

    public void a(List p0){
       this.b = p0;
       super();
    }
    public final void subscribe(v p0){
       Object[] objArray;
       MaterialDetailInfo materialDeta1;
       Object[] objArray1;
       Object obj = this;
       KSDownloadHelperX obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a.class, str)) {
          return;
       }
       a.p(obj1, "emitter");
       a b = obj.b;
       int i = -13;
       StringBuilder str1 = "KS_Hodor";
       int i1 = 0;
       if (b == null || b.isEmpty()) {
          objArray = new Object[i1];
          e.D().t(str1, "Download AeBuiltInRes failed due to empty MaterialGroupInfo list", objArray);
          obj1.onError(new KSException(i, "Download AeBuiltInRes failed due to empty MaterialGroupInfo list"));
          return;
       }else {
          Iterator iterator = obj.b.iterator();
          while (true) {
             boolean b1 = true;
             Integer integer = null;
             if (iterator.hasNext()) {
                MaterialGroupInfo materialGrou = iterator.next();
                List detailInfoLi = materialGrou.getDetailInfoList();
                detailInfoLi = (detailInfoLi == null || detailInfoLi.isEmpty())? 1: null;
                if (!detailInfoLi) {
                   List detailInfoLi1 = materialGrou.getDetailInfoList();
                   MaterialDetailInfo materialDeta = (detailInfoLi1 != null)? detailInfoLi1.get(i1): integer;
                   materialDeta1 = materialDeta;
                }
             }else {
                materialDeta1 = integer;
             }
             if (materialDeta1 == null) {
                objArray = new Object[i1];
                e.D().t(str1, "Download AeBuiltInRes failed due to empty MaterialDetailInfo", objArray);
                obj1.onError(new KSException(i, "Download AeBuiltInRes failed due to empty MaterialDetailInfo"));
                return;
             }else {
                File uFile = ResourceSdk.f.f("FLASH_FILTER", materialDeta1);
                if (uFile.exists()) {
                   objArray1 = new Object[i1];
                   e.D().w(str1, "Download AeBuiltInRes completed with local cache "+uFile.getAbsolutePath(), objArray1);
                   String absolutePath = uFile.getAbsolutePath();
                   a.o(absolutePath, "resFile.absolutePath");
                   KSDownloadHelperX.o.a().r(absolutePath);
                   obj1.onNext(Integer.valueOf(100));
                   p0.onComplete();
                   return;
                }else {
                   a$b uob = new a$b(obj1);
                   obj1.setCancellable(a$a.a);
                   Object[] objArray2 = new Object[i1];
                   e.D().w(str1, "downloadAeBuiltInRes: start download", objArray2);
                   obj1 = KSDownloadHelperX.o.a();
                   Objects.requireNonNull(obj1);
                   if (!PatchProxy.applyVoidTwoRefs(materialDeta1, uob, obj1, KSDownloadHelperX.class, "3")) {
                      a.p(materialDeta1, "materialDetail");
                      a.p(uob, "listener");
                      obj1.i.add(uob);
                      if (obj1.k == null) {
                         obj1.k = b1;
                         h oh = new h(obj1);
                         KSDownloadHelperX j = obj1.j;
                         Objects.requireNonNull(j);
                         MaterialDownloadConfig materialDown = PatchProxy.applyTwoRefs(materialDeta1, oh, j, KSDownloadHelperX$b.class, str);
                         if (materialDown != PatchProxyResult.class) {
                         }else {
                            a.p(materialDeta1, "info");
                            e uoe = e.D();
                            str1 = "downloadTemplate\(\) called with: info = ["+materialDeta1.getId()+','+materialDeta1.getGroupId()+','+materialDeta1.getMd5()+',';
                            List resourceUrls = materialDeta1.getResourceUrls();
                            if (resourceUrls != null) {
                               integer = Integer.valueOf(resourceUrls.size());
                            }
                            objArray1 = new Object[i1];
                            uoe.w("[RMDownload] BaseHelper", str1+integer+']', objArray1);
                            MaterialDownloadConfig materialDown1 = new MaterialDownloadConfig(j.k, materialDeta1, j.l, null, DownloadTask$DownloadTaskType.IMMEDIATE, 8, null);
                            j.d(uoe, oh);
                         }
                         obj1.l = materialDown.getId();
                         break ;
                      }
                   }
                   break ;
                }
             }
          }
          return;
       }
    }
}
