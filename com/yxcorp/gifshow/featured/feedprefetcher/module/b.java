package com.yxcorp.gifshow.featured.feedprefetcher.module.b;
import erd.g;
import com.yxcorp.gifshow.featured.feedprefetcher.module.PhotoPrefetcherInitModule;
import mea.b;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.Objects;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.StringBuilder;
import pea.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.music.MusicStrategy;
import com.kuaishou.android.model.feed.ImageFeed;
import java.lang.ref.WeakReference;
import qvb.i;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import p5a.d;
import wkd.b;
import zy5.k;
import zy5.d;
import com.kuaishou.eve.kit.rerank.Constants;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.PrefetchPhotoInfo;
import com.yxcorp.gifshow.featured.feedprefetcher.g;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.DownloadPhotoInfo;
import o56.a;
import com.yxcorp.gifshow.featured.feedprefetcher.logger.PhotoPrefetchLogManager;
import yb6.d;
import lea.f;
import qea.u;
import sea.a;
import com.yxcorp.gifshow.featured.feedprefetcher.i$a;
import java.lang.Long;
import java.lang.Runnable;
import ekd.k1;
import tkd.b;
import tkd.d;
import uxb.m;
import ln5.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.u1;

public final class b implements g	// class@000fc6
{
    public final PhotoPrefetcherInitModule b;
    public final b c;
    public final String d;

    public void b(PhotoPrefetcherInitModule p0,b p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       ArrayList uArrayList;
       int i3;
       long l1;
       Iterator iterator1;
       ArrayList uArrayList2;
       QPhoto qPhoto1;
       b uob = this;
       b b = uob.b;
       b c = uob.c;
       b d = uob.d;
       HomeFeedResponse homeFeedResp = p0;
       Objects.requireNonNull(b);
       int i = 0;
       int i1 = (q.f(homeFeedResp.mQPhotos))? 0: homeFeedResp.mQPhotos.size();
       String str = " size:";
       b.g("InitModule load data success llsid:"+homeFeedResp.mLlsid+str+i1+" prefetchLimit:"+c.mPrefetchLimit);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.applyOneRefs(homeFeedResp, b, PhotoPrefetcherInitModule.class, "22");
       if (obj != patchProxyRe) {
       }else {
          b.g("InitModule filterDuplicatedPhoto");
          obj = null;
          String str3 = PatchProxy.applyOneRefs(homeFeedResp, b, PhotoPrefetcherInitModule.class, "25");
          if (str3 != patchProxyRe) {
          }else if(q.f(homeFeedResp.mQPhotos)){
             str3 = obj;
          }else {
             uArrayList2 = new ArrayList();
             iterator1 = homeFeedResp.mQPhotos.iterator();
             while (iterator1.hasNext()) {
                QPhoto qPhoto2 = iterator1.next();
                if (qPhoto2 == null) {
                   continue ;
                }else {
                   qPhoto1 = qPhoto2.mEntity;
                   if (qPhoto1 instanceof VideoFeed) {
                      VideoFeed mPhotoMeta = qPhoto1.mPhotoMeta;
                      if (mPhotoMeta != null) {
                         PhotoMeta mMusicStrate = mPhotoMeta.mMusicStrategy;
                         if (mMusicStrate != null && mMusicStrate.mIsNeedMuted != null) {
                            continue ;
                         }
                      }
                   }
                   if (qPhoto1 instanceof ImageFeed) {
                      ImageFeed mPhotoMeta1 = qPhoto1.mPhotoMeta;
                      if (mPhotoMeta1 != null) {
                         PhotoMeta mMusicStrate1 = mPhotoMeta1.mMusicStrategy;
                         if (mMusicStrate1 != null && mMusicStrate1.mIsNeedMuted != null) {
                            continue ;
                         }
                      }
                   }
                   uArrayList2.add(qPhoto2);
                }
             }
          }
          homeFeedResp.mQPhotos = str3;
          if (q.f(str3)) {
             b.g("InitModule filterDuplicatedPhoto response is empty");
          }else {
             PhotoPrefetcherInitModule x = b.x;
             if (x == null || x.get() == null) {
                b.g("InitModule filterDuplicatedPhoto pageList is null");
                b.r0();
             }
             x = b.x;
             if (x == null || x.get() == null) {
                b.g("InitModule filterDuplicatedPhoto pageList is still null");
                obj = b.q0(homeFeedResp);
             }else {
                List items = b.x.get().getItems();
                if (q.f(items)) {
                   b.g("InitModule filterDuplicatedPhoto pageList is empty");
                   obj = b.q0(homeFeedResp);
                }else {
                   obj = c.e();
                   obj = (obj != null)? obj.mEnableHlsPrefetch: null;
                   uArrayList2 = new ArrayList();
                   Iterator iterator2 = homeFeedResp.mQPhotos.iterator();
                   while (iterator2.hasNext()) {
                      qPhoto1 = iterator2.next();
                      if (qPhoto1 == null) {
                         b.g("InitModule filterDuplicatedPhoto, photo is null");
                      }else if(!qPhoto1.isVideoType()){
                         b.g("InitModule filter non video type");
                      }else if(obj == null && d.a(qPhoto1) == 9){
                         b.g("InitModule filterHlsPhoto");
                      }else if(items.contains(qPhoto1) || b.a(-275376108).k(qPhoto1.getPhotoId())){
                         b.g("InitModule filterDuplicatedPhoto has duplicated "+qPhoto1.getUserName()+" "+qPhoto1.getPhotoId());
                      }else if(Constants.a()){
                         b.p0(qPhoto1, homeFeedResp, uArrayList2);
                      }else {
                         b.l0(qPhoto1, homeFeedResp, uArrayList2);
                      }
                   }
                   uArrayList = uArrayList2;
                label_01a7 :
                   if (!q.f(uArrayList)) {
                      b.g("InitModule load data success no duplicated photo start prefetch");
                      HomeFeedResponse mLlsid = homeFeedResp.mLlsid;
                      if (!PatchProxy.applyVoidThreeRefs(uArrayList, mLlsid, d, b, PhotoPrefetcherInitModule.class, "14")) {
                         iterator1 = uArrayList.iterator();
                         int i4 = 0x31d4e985;
                         while (iterator1.hasNext()) {
                            QPhoto qPhoto = iterator1.next();
                            PrefetchPhotoInfo prefetchPhot = new PrefetchPhotoInfo();
                            prefetchPhot.mPhotoId = qPhoto.getPhotoId();
                            prefetchPhot.mPhotoHetu = g.g(qPhoto);
                            prefetchPhot.mLlsid = mLlsid;
                            prefetchPhot.mPhotoType = qPhoto.getType();
                            prefetchPhot.mMediaType = d.a(qPhoto);
                            DownloadPhotoInfo uDownloadPho = new DownloadPhotoInfo();
                            prefetchPhot.mDownloadPhotoInfo = uDownloadPho;
                            uDownloadPho.mAppVer = a.m;
                            uDownloadPho.mReason = d;
                            b.a(i4).f(prefetchPhot);
                         }
                         b.a(i4).g();
                      }
                      mLlsid = homeFeedResp.mLlsid;
                      obj = c.mPrefetchLimit;
                      List list = (uArrayList.size() > obj)? uArrayList.subList(i, obj): uArrayList;
                      HomeFeedResponse mCursor = homeFeedResp.mCursor;
                      HomeFeedResponse mLlsid1 = homeFeedResp.mLlsid;
                      HomeFeedResponse homeFeedResp1 = mCursor;
                      HomeFeedResponse homeFeedResp2 = mLlsid1;
                      HomeFeedResponse homeFeedResp3 = mLlsid1;
                      HomeFeedResponse homeFeedResp4 = mCursor;
                      if (!PatchProxy.applyVoidFourRefs(mLlsid, list, homeFeedResp1, homeFeedResp2, b, PhotoPrefetcherInitModule.class, "15")) {
                         StringBuilder str2 = "InitModule prefetchWithPhotos id: "+mLlsid+" cursor: "+homeFeedResp4+" llsid: "+homeFeedResp3+str;
                         i3 = (q.f(list))? 0: list.size();
                         b.g(str2+i3);
                         long l = d.a();
                         if (!q.f(list)) {
                            ArrayList uArrayList1 = new ArrayList();
                            Iterator iterator = list.iterator();
                            while (iterator.hasNext()) {
                               f uof = v5;
                               f uof1 = v5;
                               uof = new f(iterator.next(), l, homeFeedResp4, homeFeedResp3);
                               uArrayList1.add(uof1);
                               l = l;
                            }
                            l1 = l;
                            b.a(-622777217).d(uArrayList1);
                            b.u0(uArrayList1, mLlsid, l1, new a(b));
                         }else {
                            l1 = l;
                         }
                         if (!PatchProxy.isSupport(PhotoPrefetcherInitModule.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l1), b, PhotoPrefetcherInitModule.class, "17")) {
                            b.w0();
                            long l2 = l1;
                            b.g("InitModule delayPrefetch lastPrefetchTime:"+l2);
                            uob = c.e();
                            if (uob != null && uob.mNextPrefetchIntervalMs - null > 0) {
                               long l3 = uob.mNextPrefetchIntervalMs - (d.a() - l2);
                               b.g("InitModule delayPrefetch nextPrefetchDelayTime:"+l3+"ms");
                               if (l3 - null > 0) {
                                  k1.r(b.z, l3);
                               }
                            }
                         }
                      }
                   label_0337 :
                      d.a(0x214156f5).aD(homeFeedResp.mIsNewRefluxUser);
                      d uod = new d();
                      uod.a = "prefetch";
                      RxBus.f.b(uod);
                   }
                   int i2 = (q.f(uArrayList))? 0: uArrayList.size();
                   i3 oi3 = i3.f();
                   oi3.d("reason", d);
                   oi3.c("totalSize", Integer.valueOf(i1));
                   oi3.c("afterFilterSize", Integer.valueOf(i2));
                   String str1 = oi3.e();
                   u1.R("PREFETCH_PHOTO_REQUEST", str1, 14);
                   b.s = false;
                   return;
                }
             }
          }
       }
       uArrayList = obj;
       goto label_01a7 ;
    }
}
