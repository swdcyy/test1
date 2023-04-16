package com.kwai.component.misc.wallpaper.c;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.download.DownloadTask$DownloadRequest;
import com.yxcorp.download.DownloadTask$DownloadBizExtra;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kwai.component.misc.wallpaper.WallPaperDownloadUtil$WallpaperDownloadType;
import wc5.d;
import android.view.View$OnClickListener;
import com.yxcorp.download.DownloadManager;
import com.yxcorp.download.b;
import wc5.n;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.google.common.base.Optional;
import com.kwai.component.misc.wallpaper.b;
import ok.h;
import java.lang.Integer;
import wc5.m;
import com.google.common.collect.Lists;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import ekd.q;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.concurrent.atomic.AtomicBoolean;
import wc5.e;
import java.util.Iterator;
import com.kwai.component.misc.wallpaper.e;

public final class c implements g	// class@0009e0
{
    public final QPhoto b;
    public final GifshowActivity c;

    public void c(QPhoto p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       Object obj1;
       c uoc = this;
       c b = uoc.b;
       c c = uoc.c;
       DownloadPhotoInfoResponse uDownloadPho = p0;
       WallPaperDownloadUtil wallPaperDow = WallPaperDownloadUtil.class;
       if (PatchProxy.applyVoidThreeRefs(uDownloadPho, b, c, null, WallPaperDownloadUtil.class, "9")) {
       }else {
          int i = 0x7f11066a;
          if (uDownloadPho.mPhotoDownloadDeny != null) {
             i.a(i, R.string.arg_RES_7f100ecc);
          }else {
             String str = ":ks-components:misc";
             Object obj = null;
             int i1 = 0x7f105153;
             boolean b1 = true;
             int i2 = 0;
             if (b.isVideoType()) {
                if (!PatchProxy.applyVoidTwoRefs(c, b, obj, wallPaperDow, "14")) {
                   String videoUrl = b.getVideoUrl();
                   if (TextUtils.x(videoUrl)) {
                      i.a(i, i1);
                   }else {
                      File uFile = new File(WallPaperDownloadUtil.h(), WallPaperDownloadUtil.g(b));
                      if (uFile.exists()) {
                         WallPaperDownloadUtil.d(c, b, videoUrl, obj, uFile.getAbsolutePath());
                      }else {
                         DownloadTask$DownloadRequest uDownloadReq = new DownloadTask$DownloadRequest(videoUrl).setDestinationDir(uFile.getParent()).setDestinationFileName(uFile.getName());
                         uDownloadReq.setBizInfo(str, "feed_wallpaper_video", obj);
                         uDownloadReq.setDownloadTaskType(DownloadTask$DownloadTaskType.IMMEDIATE);
                         uDownloadReq.setNeedCDNReport(b1);
                         uDownloadReq.setIsNotForceReDownload(b1);
                         b[] uobArray = new b[b1];
                         n on = new n(WallPaperDownloadUtil.a(c, WallPaperDownloadUtil$WallpaperDownloadType.VIDEO, new d(videoUrl)), c, b, uFile, videoUrl);
                         uobArray[i2] = b1.l(c);
                         DownloadManager.n().E(uDownloadReq, uobArray);
                      }
                   }
                }
             }else if(b.isAtlasPhotos()){
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                if (!PatchProxy.applyVoidTwoRefs(c, b, obj, wallPaperDow, "10")) {
                   File uFile1 = new File(WallPaperDownloadUtil.h(), WallPaperDownloadUtil.g(b));
                   String absolutePath = uFile1.getAbsolutePath();
                   if (uFile1.exists()) {
                      WallPaperDownloadUtil.d(c, b, "", obj, absolutePath);
                   }else {
                      int i3 = Optional.fromNullable(b.getAtlasList()).transform(b.b).or(Integer.valueOf(i2)).intValue();
                      if (i3 <= 0) {
                         i.a(i, i1);
                      }else {
                         ImmutableList immutableLis = PatchProxy.applyOneRefs(b, obj, wallPaperDow, "11");
                         if (immutableLis != patchProxyRe) {
                         }else if(!b.isAtlasPhotos()){
                            obj1 = obj;
                         label_0137 :
                            AtomicBoolean obj2 = PatchProxy.applyOneRefs(b, obj, wallPaperDow, "12");
                            if (obj2 != patchProxyRe) {
                            }else if(!b.isAtlasPhotos()){
                               ArrayList uArrayList1 = new ArrayList();
                               int i5 = Optional.fromNullable(b.getAtlasList()).transform(b.b).or(Integer.valueOf(i2)).intValue();
                               int i6 = 0;
                               while (true) {
                                  if (i6 < i5) {
                                     List atlasPhotosC = b.getAtlasPhotosCdn(i6);
                                     if (!q.f(atlasPhotosC)) {
                                        uArrayList1.add(atlasPhotosC.get(i2).getUrl());
                                        i6 = i6 + 1;
                                     }
                                  }else {
                                     obj2 = ImmutableList.copyOf(uArrayList1);
                                  }
                               }
                            }
                            obj2 = obj;
                            if (!q.f(obj1) && (!q.f(obj2) && (obj1.size() != i3 || obj2.size() != i3))) {
                               i.a(i, i1);
                            }else {
                               ArrayList uArrayList = new ArrayList();
                               for (int i4 = 0; i4 < i3; i4 = i4 + 1) {
                                  File uFile2 = new File(obj1.get(i4));
                                  DownloadTask$DownloadRequest uDownloadReq1 = new DownloadTask$DownloadRequest(obj2.get(i4)).setDestinationDir(uFile2.getParent()).setDestinationFileName(uFile2.getName());
                                  uDownloadReq1.setBizInfo(str, "feed_wall_paper", obj);
                                  uDownloadReq1.setNeedCDNReport(b1);
                                  uDownloadReq1.setIsNotForceReDownload(b1);
                                  uArrayList.add(uDownloadReq1);
                               }
                               ProgressFragment progressFrag = WallPaperDownloadUtil.a(c, WallPaperDownloadUtil$WallpaperDownloadType.ATLAS, obj);
                               obj2 = new AtomicBoolean(i2);
                               e uoe = i1;
                               AtomicBoolean uAtomicBoole = obj2;
                               e uoe1 = i1;
                               AtomicBoolean uAtomicBoole1 = obj2;
                               uoe = new e(uAtomicBoole, progressFrag, c, b, absolutePath);
                               progressFrag.Bh(uoe1);
                               float f = 80.00f / (float)i3;
                               Iterator iterator = uArrayList.iterator();
                               while (iterator.hasNext()) {
                                  b[] uobArray1 = new b[b1];
                                  uoe = obj;
                                  e uoe2 = obj;
                                  b[] uobArray2 = uobArray1;
                                  uoe = new e(uAtomicBoole1, obj1, f, progressFrag, i3, c, b, absolutePath);
                                  uobArray2[0] = uoe2.l(c);
                                  DownloadManager.n().E(iterator.next(), uobArray2);
                                  uoe2 = 1;
                               }
                            }
                         }else {
                            immutableLis = ImmutableList.copyOf(Lists.h(b.getAtlasList(), new m(WallPaperDownloadUtil.h().getAbsolutePath())));
                         }
                         obj1 = immutableLis;
                         goto label_0137 ;
                      }
                   }
                }
             }else {
                i.a(i, i1);
             }
          }
       }
       return;
    }
}
