package com.yxcorp.gifshow.featured.feedprefetcher.PhotoPrefetchDataUtil;
import com.yxcorp.gifshow.featured.feedprefetcher.PhotoPrefetchDataUtil$stidWhiteList$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import pea.b;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import kp.r1;
import java.util.Objects;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import go5.a;
import wkd.b;
import zy5.k;
import zy5.d;

public final class PhotoPrefetchDataUtil	// class@000f98
{
    public static final p a;
    public static final PhotoPrefetchDataUtil b;

    static {
       PhotoPrefetchDataUtil.b = new PhotoPrefetchDataUtil();
       PhotoPrefetchDataUtil.a = s.c(PhotoPrefetchDataUtil$stidWhiteList$2.INSTANCE);
    }
    public void PhotoPrefetchDataUtil(){
       super();
    }
    public static final int a(QPhoto p0){
       boolean b;
       PhotoPrefetchDataUtil photoPrefetc1;
       Object obj2;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoPrefetchDataUtil photoPrefetc = PhotoPrefetchDataUtil.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, photoPrefetc, "3");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       int i = 0;
       if (p0 == null) {
          b.b("PhotoPrefetch", "getPhotoValidState null");
          return i;
       }else {
          StidContainerProto$StidContainer obj1 = PatchProxy.applyOneRefs(p0, null, photoPrefetc, "2");
          int i1 = 1;
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             obj1 = r1.P1(p0.getEntity());
             if (obj1 != null) {
                StidContainerProto$StidContainer stRecoId = obj1.stRecoId;
                if (stRecoId != null) {
                   stRecoId = (stRecoId.length() > 0)? 1: null;
                   if (stRecoId == i1) {
                   label_0058 :
                      photoPrefetc1 = PhotoPrefetchDataUtil.b;
                      Objects.requireNonNull(photoPrefetc1);
                      obj2 = PatchProxy.apply(null, photoPrefetc1, photoPrefetc, "1");
                      if (obj2 != patchProxyRe) {
                      }else {
                         obj2 = PhotoPrefetchDataUtil.a.getValue();
                      }
                      Iterator iterator = obj2.iterator();
                      obj2 = 0;
                      while (iterator.hasNext()) {
                         String str = iterator.next();
                         StidContainerProto$StidContainer stRecoId1 = obj1.stRecoId;
                         if (stRecoId1 == null || StringsKt__StringsKt.O2(stRecoId1, str, i, 2, null) != i1) {
                            stRecoId1 = obj1.stRecoStgyId;
                            if (stRecoId1 == null || StringsKt__StringsKt.O2(stRecoId1, str, i, 2, null) != i1) {
                               b1 = false;
                            label_009a :
                               if (b1) {
                                  obj2 = 1;
                               }
                            }
                         }
                         b1 = true;
                         goto label_009a ;
                      }
                      if (obj2 == i1) {
                         b = true;
                      }
                   }
                }
                stRecoId = obj1.stRecoStgyId;
                if (stRecoId != null) {
                   photoPrefetc1 = (stRecoId.length() > 0)? 1: null;
                   if (photoPrefetc1 == i1) {
                      goto label_0058 ;
                   }
                }
                obj2 = 0;
                goto label_009f ;
             }
             b = false;
          }
          if (b && (p0.isVideoType() && (!p0.isShowed() && (!p0.isAd() && (!p0.isLiveStream() && (!a.a(p0) && (!p0.isEyeMax() && (!p0.isLongPhotos() && (!p0.isImageType() && !b.a(-275376108).d(p0)))))))))) {
             i = 1;
          }
       label_00e6 :
          if (!i) {
             i1 = -1;
          }
          return i1;
       }
    }
}
