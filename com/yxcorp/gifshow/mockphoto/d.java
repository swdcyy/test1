package com.yxcorp.gifshow.mockphoto.d;
import java.lang.Object;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import com.kwai.feature.post.api.feature.upload.model.UploadResult;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import um6.a;
import com.kwai.feature.post.api.feature.encode.model.AtlasInfo;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import com.yxcorp.gifshow.util.PostUtils;
import qkd.b;
import iq.a;
import java.lang.StringBuilder;
import w46.b;
import java.lang.Throwable;
import ekd.b0;
import com.yxcorp.gifshow.util.BitmapUtil;
import q87.c;
import com.yxcorp.gifshow.model.CDNUrl;
import android.net.Uri;
import ekd.w0;
import com.kuaishou.android.model.mix.Location;
import com.yxcorp.gifshow.model.EditInfo;
import java.util.List;
import java.lang.Iterable;
import brd.t;
import com.yxcorp.gifshow.mockphoto.c;
import erd.o;
import brd.a0;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import r26.a;
import tkd.b;
import tkd.d;
import r16.e;
import r16.f;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.regex.Pattern;
import lnc.v5;
import java.util.regex.Matcher;
import android.media.MediaMetadataRetriever;
import com.kwai.feature.post.api.core.model.GSConfig;
import java.lang.IllegalStateException;
import ekd.x0;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.android.model.mix.CoverSize;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.postwork.PostStatus;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadRequest$UploadPostType;
import lnc.e4;
import java.lang.IllegalArgumentException;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import qa6.b;
import java.lang.System;
import com.kuaishou.android.model.feed.ImageFeed;
import kp.w1;
import com.kuaishou.android.model.feed.VideoFeed;
import tl8.d;
import da6.c;
import lnc.c0;
import e36.b;
import brd.m;
import e36.c;
import dlb.a;
import com.yxcorp.gifshow.mockphoto.b;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.kuaishou.android.model.mix.SameFrameInfo;
import com.yxcorp.gifshow.util.SameFrameExt$b;
import com.yxcorp.gifshow.util.SameFrameExt;
import lnc.a1;
import java.lang.Integer;
import java.util.Collection;
import ekd.q;
import com.kwai.gifshow.post.api.feature.stick.InteractStickerInfo;
import com.kwai.feature.post.api.feature.story.model.PhotoVisibility;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.mockphoto.a;
import com.kwai.components.feedmodel.feed.KaraokeModel;
import com.kwai.components.feedmodel.feed.KaraokeScoreInfo;
import com.kwai.components.feedmodel.feed.KaraokeModel$KaraokeInfo;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import com.kwai.components.feedmodel.feed.KaraokeChorusModel;
import qr4.i;
import pm6.p;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo;
import kotlin.jvm.internal.a;
import qr4.e$h;
import qr4.e$d;
import java.util.Objects;
import java.util.ArrayList;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo$Frame;
import qr4.e$d$a;
import qrd.l1;
import qr4.e$d$b;
import com.kwai.gifshow.post.api.core.model.TagStickerInfo$Location;
import nm6.e;
import com.kwai.framework.model.decompose.api.ObservableAndSyncableContainer;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.VideoMeta;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.kuaishou.android.model.mix.FollowShootModel;
import java.util.Iterator;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import t5b.a;
import s3b.a;
import ixc.c;
import com.kuaishou.android.model.mix.RecreationSettingInfo;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import com.kuaishou.android.model.mix.ExtMeta;
import java.lang.Void;
import com.yxcorp.gifshow.mockphoto.j;
import java.util.Map;
import wkd.b;
import dlb.f;
import dlb.d;
import com.yxcorp.gifshow.mockphoto.g;
import cjd.e;
import com.yxcorp.gifshow.mockphoto.f;
import com.yxcorp.gifshow.mockphoto.e;
import dlb.e;
import com.kwai.framework.cache.CacheManager;
import java.lang.reflect.Type;
import j80.c;
import lnc.d4;
import java.lang.reflect.Field;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import qr4.m$k0;
import qr4.m$e;
import qr4.m$e$a;

public class d	// class@001de2
{

    public void d(){
       super();
    }
    public static boolean a(IUploadInfo p0,UploadResult p1,ImageMeta p2,CoverMeta p3,PhotoMeta p4,CommonMeta p5,boolean p6){
       AtlasInfo obj;
       b0 uob0;
       StringBuilder str1;
       String str2;
       String str3;
       int i;
       StringBuilder str4;
       CDNUrl uCDNUrl;
       CDNUrl[] uCDNUrlArray;
       Location location;
       PhotoMeta mEditInfo;
       List list;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5,Boolean.valueOf(p6)};
          obj = PatchProxy.apply(objArray, null, uod, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       try{
          if (p0.getKtvInfo() == null) {
             obj = p0.getAtlasInfo();
             p2.mAtlas = d.f(p0, obj);
             p2.mSinglePicture = d.g(obj, p0.getFilePath(), p6);
          }
          p5.mType = PhotoType.IMAGE.toInt();
          String str = d.i(p0);
          if (!TextUtils.x(str)) {
             File uFile = new File(str);
             File uFile1 = b.Y(PostUtils.p("mock_feed_cache_dir"), p4.mPhotoId, ".jpg");
             if (uFile1.exists() && !uFile1.delete()) {
                Object[] objArray1 = new Object[0];
                a.D().t("MockFeedHelper", "cacheCoverFile delete failed "+uFile1, objArray1);
             }
             try{
                PostUtils.c(uFile, uFile1);
                str = uFile1.getAbsolutePath();
             }catch(java.lang.Exception e14){
                PostUtils.D("MockFeedHelper", "buildImageFeed", e14);
             }
          }
       }catch(java.lang.Exception e8){
          PostUtils.D("MockFeedHelper", "buildImageFeed", e8);
          return 0;
       }
    }
    public static void b(a p0,IUploadInfo p1,UploadResult p2,CoverMeta p3,CommonMeta p4){
       Object[] objArray1;
       Object[] objArray2;
       String str1;
       String str2;
       int i;
       StringBuilder str3;
       CDNUrl uCDNUrl;
       Object[] objArray4;
       CoverSize uCoverSize;
       CDNUrl[] uCDNUrlArray;
       MediaMetadataRetriever mediaMetadat;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Bitmap uBitmap = null;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, uBitmap, uod, "9")) {
             return;
          }
       }
       String str = PatchProxy.applyOneRefs(p0, uBitmap, uod, "6");
       if (str != patchProxyRe) {
       }else {
          str = d.a(0x6758ee6d).oz(p0);
          objArray1 = new Object[0];
          a.D().w("MockFeedHelper", "updateCover:filePath="+str, objArray1);
       }
       objArray1 = new Object[0];
       a.D().w("MockFeedHelper", "buildVideoCover thumbPath: "+str, objArray1);
       if (TextUtils.x(str)) {
          objArray2 = new Object[0];
          a.D().w("MockFeedHelper", "buildVideoCover get thumbPath is null", objArray2);
          uBitmap = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.arg_RES_7f081aca);
       }else if(0.c().matcher(str).matches()){
          objArray1 = new Object[0];
          a.D().w("MockFeedHelper", "buildVideoCover get thumbPath is video", objArray1);
          Bitmap uBitmap1 = BitmapUtil.t(str, 720, 720, 0);
          if (uBitmap1 == null) {
             Throwable obj = PatchProxy.applyOneRefs(str, uBitmap, uod, "7");
             if (obj != patchProxyRe) {
                uBitmap = obj;
             }else {
                try{
                   try{
                      mediaMetadat = new MediaMetadataRetriever();
                      mediaMetadat.setDataSource(str);
                      uBitmap = mediaMetadat.getFrameAtTime();
                   label_00ec :
                      mediaMetadat.release();
                   }catch(java.lang.RuntimeException e1){
                   }
                   PostUtils.D("MockFeedHelper", "getVideoThumb failed "+str, obj);
                   if (mediaMetadat) {
                      goto label_00ec ;
                   }
                }catch(java.lang.RuntimeException e0){
                   obj = e0;
                   mediaMetadat = uBitmap;
                   goto label_00d6 ;
                }
             }
          }else {
             uBitmap = uBitmap1;
          }
          if (uBitmap == null) {
             objArray2 = new Object[0];
             a.D().w("MockFeedHelper", "buildVideoCover cant get cover using placeholder", objArray2);
             uBitmap = BitmapFactory.decodeResource(Resources.getSystem(), R.drawable.arg_RES_7f081aca);
          }
       }
       if (p2 != null && !0.c().matcher(str).matches()) {
          objArray2 = new Object[0];
          a.D().w("MockFeedHelper", "buildVideoCover get thumbPath is image", objArray2);
          p4.mType = PhotoType.IMAGE.toInt();
       }
       File uFile = b.Y(PostUtils.f(), "cover_"+p0.getCacheId(), ".jpg");
       Object[] objArray3 = new Object[0];
       a.D().w("MockFeedHelper", "buildVideoCover get cover cache: "+uFile.getAbsolutePath(), objArray3);
       if (!b.S(uFile)) {
          try{
             objArray2 = new Object[0];
             a.D().w("MockFeedHelper", "buildVideoCover create new coverCacheFile", objArray2);
             if (uBitmap != null) {
                BitmapUtil.Q(uBitmap, uFile.getAbsolutePath(), GSConfig.b());
             }else {
                objArray3 = new Object[0];
                a.D().w("MockFeedHelper", "buildVideoCover copy from "+str+" to: "+uFile.getAbsolutePath(), objArray3);
                PostUtils.c(new File(str), uFile);
             }
          }catch(java.lang.Exception e0){
             b.l0(uFile);
             PostUtils.D("MockFeedHelper", "buildVideoCover", e0);
          }
       }else {
          objArray2 = new Object[0];
          a.D().w("MockFeedHelper", "buildVideoCover coverCacheFile is valid", objArray2);
       }
    }
    public static QPhoto c(a p0,boolean p1){
       IUploadInfo obj2;
       QPhoto qPhoto1;
       IUploadInfo iUploadInfo1;
       String str5;
       CommonMeta mCaption;
       String str6;
       QPhoto obj4;
       d uod1;
       int i1;
       List interactStic;
       InteractStickerInfo interactStic1;
       int type;
       a ktvInfo;
       String str7;
       a uoa;
       String obj5;
       UploadResult uploadResult1;
       i photoMeta1;
       p op;
       TagStickerInfo tagStickerIn;
       PatchProxyResult patchProxyRe1;
       String str8;
       int i2;
       CDNUrl[] uCDNUrlArray;
       ImageMeta imageMeta;
       boolean b;
       Object[] obj6;
       object obj7;
       ImageFeed imageFeed2;
       d uod2;
       UploadResult uploadResult2;
       ExtMeta uExtMeta;
       Object[] objArray2;
       j a;
       e4 uoe4;
       StringBuilder filePath;
       a uoa1;
       int b1;
       File uFile;
       File uFile1;
       File uFile2;
       Map b2;
       int i3;
       VideoMeta videoMeta;
       Object[] objArray3;
       object oobject1;
       ArrayList obj8;
       a uoa2;
       Object[] objArray4;
       String str9;
       Object[] objArray5;
       FollowShootModel uFollowShoot;
       CDNUrl[] uCDNUrlArray1;
       b0 uob0;
       Iterator iterator;
       MagicEmoji$MagicFace magicFace;
       Location location;
       PhotoMeta mRecreationS;
       CDNUrl[] uCDNUrlArray2;
       e$h m;
       int len;
       int i4;
       p a1;
       e$d$b[] uod$bArray;
       TagStickerInfo$Location location1;
       int i5;
       TagStickerInfo$Location[] locationArra;
       ArrayList uArrayList;
       e$d a2;
       int i6;
       object oobject2;
       TagStickerInfo$Frame uFrame;
       KaraokeModel$KaraokeInfo karaokeInfo;
       KaraokeChorusModel karaokeChoru;
       KaraokeModel$KaraokeInfo karaokeInfo1;
       ImageMeta$CDNInfo[] uCDNInfoArra;
       ImageMeta$CDNInfo uCDNInfo;
       int realDuration;
       int i7;
       long l;
       Object[] objArray6;
       Object[] obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       String str = "2";
       String obj1 = null;
       if (PatchProxy.isSupport(uod)) {
          obj2 = PatchProxy.applyTwoRefs(obj, Boolean.valueOf(p1), obj1, uod, str);
          if (obj2 != patchProxyRe) {
             return obj2;
          }
       }
       if (obj == null) {
          return obj1;
       }else {
          boolean i = 0;
          Object[] objArray = new Object[i];
          String str1 = "MockFeedHelper";
          a.D().w(str1, "convertPostWork2QPhoto photo:"+p0.getCacheId()+" status: "+p0.getStatus(), objArray);
          obj2 = (p0.getStatus() == PostStatus.UPLOAD_COMPLETE)? p0.getUploadInfo(): p0.convertRequest2UploadInfo();
          IUploadInfo iUploadInfo = obj2;
          if (iUploadInfo == null || (!p1 || (iUploadInfo.getUploadPostType() == IUploadRequest$UploadPostType.SCHOOL || iUploadInfo.isStory()))) {
             obj = new Object[0];
             a.D().w(str1, "postWorkInfo not need show", obj);
             return null;
          }else {
             UploadResult uploadResult = iUploadInfo.getUploadResult();
             if (uploadResult != null) {
                String photoId = uploadResult.getPhotoId();
                QPhoto qPhoto = e4.b().c(photoId);
                if (qPhoto != null) {
                   Object[] objArray1 = new Object[i];
                   a.D().s(str1, "Got cached photo "+photoId, objArray1);
                   qPhoto.setFeedStatus(p0.getStatus());
                   qPhoto.setPostWorkInfoId(p0.getId());
                   qPhoto.setMockFeedMagicFaceRecoId(iUploadInfo.getMockFeedMagicFaceRecoId());
                   qPhoto.setMockFeedMagicFaceRecoTaskId(iUploadInfo.getSessionId());
                   qPhoto.setShowFlowFeedback(iUploadInfo.isShowFlowFeedback());
                   UploadResult mMockCollect = uploadResult.mMockCollectInfo;
                   if (!PatchProxy.applyVoidTwoRefs(qPhoto, mMockCollect, obj1, uod, "19")) {
                      PhotoMeta photoMeta = qPhoto.getPhotoMeta();
                      if (photoMeta == null) {
                         PostUtils.D(str1, "fillMockFeedWithMockCollectInfo\(\) photo has no photometa", new IllegalArgumentException());
                      }else {
                         d.e(photoMeta, mMockCollect);
                      }
                   }
                   return qPhoto;
                }else {
                   qPhoto1 = qPhoto;
                }
             }else {
                qPhoto1 = obj1;
             }
             object oobject = (iUploadInfo.getAtlasInfo() != null || b.M(iUploadInfo.getFilePath()))? 1: null;
             User user = b.a(QCurrentUser.me());
             user.mVerified = i;
             String str2 = String.valueOf(System.currentTimeMillis());
             ImageFeed imageFeed = (oobject)? w1.i(str2, user): w1.k(str2, user);
             ImageFeed imageFeed1 = imageFeed;
             String str3 = imageFeed1.a(CommonMeta.class);
             PostStatus postStatus = imageFeed1.a(PhotoMeta.class);
             postStatus.putExtra("key_is_memory_2020", Boolean.valueOf(iUploadInfo.isAnnualAlbum()));
             str2 = iUploadInfo.getCaption();
             SameFrameInfo obj3 = PatchProxy.applyOneRefs(str2, obj1, uod, "5");
             String str4 = "";
             if (obj3 != patchProxyRe) {
                str2 = obj3;
             }else if(TextUtils.x(str2)){
                try{
                   str2 = (str2.replaceAll(c0.a.pattern(), str4)).trim();
                }catch(java.lang.Exception e0){
                   PostUtils.D(str1, "removeAtUserId", e0);
                }
             }
          }
       }
    }
    public static boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(p0) && b.S(new File(p0)))? true: false;
       return b;
    }
    public static void e(PhotoMeta p0,PhotoMeta p1){
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = null;
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, obj2, d.class, "20")) {
          return;
       }
       Field[] declaredFiel = PhotoMeta.class.getDeclaredFields();
       PhotoMeta photoMeta = new PhotoMeta();
       int len = declaredFiel.length;
       int i = 0;
       while (i < len) {
          object oobject = declaredFiel[i];
          boolean b = true;
          try{
             oobject.setAccessible(b);
             Object obj3 = oobject.get(obj1);
             Object obj4 = oobject.get(photoMeta);
             Object[] objArray = new Object[0];
             a.D().w("MockFeedHelper", "fillMockFeedWithMockCollectInfo\(\) name="+oobject.getName()+", mock="+obj3+", base="+obj4, objArray);
             if (obj3 != null) {
                boolean b1 = (obj3.getClass() == String.class || obj3.getClass().isPrimitive())? true: false;
                if (!b1) {
                   try{
                      Object[] obj5 = obj3.getClass().getField("TYPE").get(obj2);
                      if (obj5 instanceof Class) {
                         b1 = obj5.isPrimitive();
                      }
                   }catch(java.lang.NoSuchFieldException e0){
                      objArray = new Object[0];
                      a.D().A("MockFeedHelper", "NoSuchFieldException: name="+oobject.getName(), objArray);
                   }
                }
             }
          }catch(java.lang.IllegalAccessException e0){
             PostUtils.D("MockFeedHelper", "fillMockFeedWithMockCollectInfo\(\) cant access this field, name="+oobject.getName(), e0);
          }
          i = i + 1;
          obj2 = null;
       }
       return;
    }
    public static ImageMeta$Atlas f(IUploadInfo p0,AtlasInfo p1){
       Object[] objArray;
       m$e d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object obj = null;
       AtlasInfo obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uod, "13");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (p1 != null) {
          obj1 = p1.mMixedType;
          int i = 1;
          if (obj1 == i || obj1 == 2) {
             ImageMeta$Atlas uAtlas = new ImageMeta$Atlas();
             uAtlas.mType = p1.mMixedType;
             ImageMeta$CDNInfo[] uCDNInfoArra = new ImageMeta$CDNInfo[i];
             uAtlas.mCdnList = uCDNInfoArra;
             ImageMeta$CDNInfo uCDNInfo = new ImageMeta$CDNInfo();
             uCDNInfo.mCdn = "";
             int i1 = 0;
             uAtlas.mCdnList[i1] = uCDNInfo;
             if (!TextUtils.x(p1.mMusicFilePath)) {
                uAtlas.mMusic = p1.mMusicFilePath;
                uAtlas.mVolume = p1.mMusicVolume;
             }
             String[] stringArray = new String[p1.mDonePictures.size()];
             uAtlas.mList = stringArray;
             ImageMeta$AtlasCoverSize[] uAtlasCoverS = new ImageMeta$AtlasCoverSize[p1.mDonePictures.size()];
             uAtlas.mSize = uAtlasCoverS;
             i = p1.mDonePictures.size();
             for (int i2 = 0; i2 < i; i2 = i2 + 1) {
                File uFile = new File(p1.mDonePictures.get(i2));
                uAtlas.mList[i2] = w0.c(uFile).toString();
                uAtlas.mSize[i2] = new ImageMeta$AtlasCoverSize();
                b0 uob0 = BitmapUtil.E(uFile.getAbsolutePath());
                ImageMeta$Atlas mSize = uAtlas.mSize;
                mSize[i2].mWidth = (float)uob0.a;
                mSize[i2].mHeight = (float)uob0.b;
             }
             if (p0.getPhotoMeta() != null) {
                i photoMeta = p0.getPhotoMeta();
                p1 = PatchProxy.applyOneRefs(photoMeta, obj, uod, "18");
                if (p1 != patchProxyRe) {
                   obj = p1;
                }else {
                   photoMeta = photoMeta.b;
                   String str = "MockFeedHelper";
                   if (photoMeta == null) {
                      objArray = new Object[i1];
                      a.D().w(str, "generateAtlasIndices: photoMeta.videoInfo == null", objArray);
                   }else {
                      m$k0 v = photoMeta.v;
                      if (v == null) {
                         objArray = new Object[i1];
                         a.D().w(str, "generateAtlasIndices: photoMeta.videoInfo.atlas == null", objArray);
                      }else {
                         d = v.d;
                         if (d == null) {
                            objArray = new Object[i1];
                            a.D().w(str, "generateAtlasIndices: photoMeta.videoInfo.atlas.croppedElement == null", objArray);
                         }else {
                            obj = new int[d.length];
                            for (; i1 < d.length; i1 = i1 + 1) {
                               obj[i1] = d[i1].d;
                            }
                         }
                      }
                   }
                }
                uAtlas.mIndices = obj;
             }
             return uAtlas;
          }
       }
       return obj;
    }
    public static ImageMeta$SinglePicture g(AtlasInfo p0,String p1,boolean p2){
       ImageMeta$CDNInfo[] uCDNInfoArra;
       ImageMeta$CDNInfo uCDNInfo;
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), null, d.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 3;
       if (p0 == null || (p0.mMixedType != i || (p0 == null && TextUtils.x(p1)))) {
          return null;
       }else {
          ImageMeta$SinglePicture singlePictur = new ImageMeta$SinglePicture();
          singlePictur.mType = i;
          Object[] objArray = new Object[0];
          a.D().w("MockFeedHelper", "generateSinglePicture\(\) filePath="+p1+" postWorkInfo isUploadComplete="+p2, objArray);
          if (p0 != null && (!TextUtils.x(p0.mMusicFilePath) && p2)) {
             File uFile = new File(p0.mMusicFilePath);
             File uFile1 = b.X(PostUtils.g("[>|45|>]"), uFile.getName());
             try{
                PostUtils.c(uFile, uFile1);
                singlePictur.mMusic = uFile1.getAbsolutePath();
                singlePictur.mVolume = p0.mMusicVolume;
             }catch(java.lang.Exception e7){
                PostUtils.D("MockFeedHelper", "generateSinglePicture", e7);
             }
          }
       }
    }
    public static SimpleMagicFace h(List p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, d.class, "16");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (!q.f(p0)) {
          obj = p0.get(0);
       }
       return obj;
    }
    public static String i(IUploadInfo p0){
       Object[] objArray;
       File obj = PatchProxy.applyOneRefs(p0, null, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getCoverFile();
       if (obj != null && obj.exists()) {
          return obj.getAbsolutePath();
       }
       AtlasInfo atlasInfo = p0.getAtlasInfo();
       if (atlasInfo != null) {
          String coverFilePat = atlasInfo.getCoverFilePath();
          if (d.d(coverFilePat)) {
             objArray = new Object[0];
             a.D().w("MockFeedHelper", "atlasInfo use cover file:"+coverFilePat, objArray);
             return coverFilePat;
          }else if(!q.f(atlasInfo.mDonePictures)){
             coverFilePat = atlasInfo.mDonePictures.get(0);
             if (d.d(coverFilePat)) {
                objArray = new Object[0];
                a.D().w("MockFeedHelper", "atlasInfo use done file:"+coverFilePat, objArray);
                return coverFilePat;
             }
          }
          if (!q.f(atlasInfo.mPictureFiles)) {
             String str = atlasInfo.mPictureFiles.get(0);
             if (d.d(str)) {
                objArray = new Object[0];
                a.D().w("MockFeedHelper", "atlasInfo use origin file:"+str, objArray);
                return str;
             }
          }
       }
       a ktvInfo = p0.getKtvInfo();
       if (ktvInfo != null && ktvInfo.isSinglePicSongMode()) {
          return ktvInfo.getOutputCoverPath();
       }else {
          return p0.getFilePath();
       }
    }
}
