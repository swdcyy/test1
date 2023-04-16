package com.kuaishou.android.model.mix.ImageMetaExt;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.j;
import java.lang.StringBuilder;
import com.kuaishou.android.model.mix.ImageMeta;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Integer;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import java.lang.Number;
import java.lang.Boolean;

public final class ImageMetaExt	// class@000ce4
{
    public static final float LONG_SINGLE_IMAGE_RADIO = 1.785714;

    public void ImageMetaExt(){
       super();
    }
    public static CDNUrl[] createCdn(ImageMeta$CDNInfo[] p0,String p1){
       String str;
       Object obj = null;
       CDNUrl[] obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, ImageMetaExt.class, "17");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (TextUtils.isEmpty(p1) || j.h(p0)) {
          return obj;
       }
       obj1 = new CDNUrl[p0.length];
       int len = p0.length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          object oobject = p0[i];
          ImageMeta$CDNInfo mCdn = oobject.mCdn;
          if (TextUtils.isEmpty(mCdn)) {
             str = p1;
          }else if(!mCdn.startsWith("http")){
             str = (oobject.mUseHttps != null)? "https://": "http://";
             str = str+mCdn+p1;
          }else {
             str = mCdn+p1;
          }
          int i2 = i1 + 1;
          obj1[i1] = new CDNUrl(mCdn, str, oobject.mIsFreeTraffic);
          i = i + 1;
          i1 = i2;
       }
       return obj1;
    }
    public static String[] getAtlasCdn(ImageMeta p0){
       ImageMeta mAtlas = p0.mAtlas;
       if (mAtlas != null) {
          ImageMeta$Atlas mCdnList = mAtlas.mCdnList;
          if (mCdnList != null && mCdnList.length > 0) {
             String[] stringArray = new String[mCdnList.length];
             int i = 0;
             ImageMeta$Atlas mCdnList1 = p0.mAtlas.mCdnList;
             while (i < mCdnList1.length) {
                stringArray[i] = mCdnList1[i].mCdn;
                i = i + 1;
             }
             return stringArray;
          }
       }
       return null;
    }
    public static int[] getAtlasIndices(ImageMeta p0){
       p0 = p0.mAtlas;
       if (p0 != null) {
          return p0.mIndices;
       }
       return null;
    }
    public static List getAtlasList(ImageMeta p0){
       ImageMeta obj = PatchProxy.applyOneRefs(p0, null, ImageMetaExt.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mAtlas;
       if (obj != null && obj.mList != null) {
          return new ArrayList(Arrays.asList(p0.mAtlas.mList));
       }
       return new ArrayList();
    }
    public static CDNUrl[] getAtlasMusicCdn(ImageMeta$Atlas p0){
       CDNUrl[] uCDNUrlArray = null;
       ImageMeta$Atlas obj = PatchProxy.applyOneRefs(p0, uCDNUrlArray, ImageMetaExt.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          obj = p0.mMusicCdnList;
          if (obj == null) {
             obj = p0.mCdnList;
          }
          uCDNUrlArray = ImageMetaExt.createCdn(obj, p0.mMusic);
       }
       return uCDNUrlArray;
    }
    public static CDNUrl[] getAtlasMusicCdn(ImageMeta p0){
       CDNUrl[] uCDNUrlArray = null;
       Object obj = PatchProxy.applyOneRefs(p0, uCDNUrlArray, ImageMetaExt.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = p0.mAtlas;
       if (p0 != null) {
          uCDNUrlArray = ImageMetaExt.getAtlasMusicCdn(p0);
       }
       return uCDNUrlArray;
    }
    public static float getAtlasMusicVolume(ImageMeta p0){
       p0 = p0.mAtlas;
       ImageMeta$Atlas mVolume = (p0 != null)? p0.mVolume: 0x3f800000;
       if (mVolume <= 0) {
          mVolume = 0x3f000000;
       }
       return mVolume;
    }
    public static List getAtlasPhotoCdn(ImageMeta p0,int p1){
       ImageMeta$Atlas obj1;
       ImageMetaExt imageMetaExt = ImageMetaExt.class;
       Object obj = null;
       if (PatchProxy.isSupport(imageMetaExt)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, imageMetaExt, "1");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       p0 = p0.mAtlas;
       if (p0 != null && (j.h(p0.mCdnList) || j.h(p0.mList))) {
          return obj;
       }else {
          obj1 = p0.mList;
          if (p1 >= obj1.length) {
             return obj;
          }else {
             ArrayList uArrayList = new ArrayList();
             ImageMeta$Atlas mCdnList = p0.mCdnList;
             int len = mCdnList.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = mCdnList[i];
                uArrayList.add(new CDNUrl(oobject.mCdn, ImageMetaExt.getCdnUrl(oobject.mCdn, obj1[p1]), oobject.mIsFreeTraffic));
             }
             return uArrayList;
          }
       }
    }
    public static ImageMeta$AtlasCoverSize getAtlasSize(ImageMeta p0,int p1){
       p0 = p0.mAtlas;
       if (p0 != null && p0.mCdnList != null) {
          ImageMeta$Atlas mSize = p0.mSize;
          if (mSize != null && p1 < mSize.length) {
             return mSize[p1];
          }
       }
       return null;
    }
    public static ImageMeta$AtlasCoverSize[] getAtlasSizes(ImageMeta p0){
       p0 = p0.mAtlas;
       if (p0 != null && p0.mCdnList != null) {
          return p0.mSize;
       }
       return null;
    }
    public static List getAtlasThumbCdn(ImageMeta p0,int p1){
       ImageMeta$Atlas obj1;
       ImageMetaExt imageMetaExt = ImageMetaExt.class;
       Object obj = null;
       if (PatchProxy.isSupport(imageMetaExt)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, imageMetaExt, "3");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       p0 = p0.mAtlas;
       if (p0 != null && (j.h(p0.mCdnList) || j.h(p0.mThumbList))) {
          return obj;
       }else {
          obj1 = p0.mThumbList;
          if (p1 >= obj1.length) {
             return obj;
          }else {
             ArrayList uArrayList = new ArrayList();
             ImageMeta$Atlas mCdnList = p0.mCdnList;
             int len = mCdnList.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = mCdnList[i];
                uArrayList.add(new CDNUrl(oobject.mCdn, ImageMetaExt.getCdnUrl(oobject.mCdn, obj1[p1]), oobject.mIsFreeTraffic));
             }
             return uArrayList;
          }
       }
    }
    public static String getCdnUrl(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ImageMetaExt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(p0)) {
          p1 = (!p0.startsWith("http"))? "http://"+p0+p1: p0+p1;
       }
    label_0043 :
       return p1;
    }
    public static CDNUrl getDefaultCdnUrl(ImageMeta$Atlas p0){
       Object obj = null;
       CDNUrl[] obj1 = PatchProxy.applyOneRefs(p0, obj, ImageMetaExt.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       obj1 = ImageMetaExt.getAtlasMusicCdn(p0);
       object oobject = (!j.h(obj1))? obj1[0]: new CDNUrl(p0.mCdn[0], p0.mMusic);
       return oobject;
    }
    public static String getMusicUrl(ImageMeta p0){
       p0 = p0.mAtlas;
       if (p0 != null) {
          return p0.mMusic;
       }
       return "";
    }
    public static List getSinglePhotoList(ImageMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageMetaExt.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ImageMeta$SinglePicture singlePictur = p0.getSinglePictureIfValid();
       if (singlePictur != null) {
          return new ArrayList(Arrays.asList(singlePictur.mList));
       }
       return null;
    }
    public static ImageMeta$AtlasCoverSize getSinglePicSize(ImageMeta p0){
       ImageMeta obj = PatchProxy.applyOneRefs(p0, null, ImageMetaExt.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mSinglePicture;
       if (obj != null && !j.h(obj.mSize)) {
          return p0.mSinglePicture.mSize[0];
       }
       return null;
    }
    public static CDNUrl[] getSinglePictureMusicCdn(ImageMeta$SinglePicture p0){
       ImageMeta$SinglePicture obj = PatchProxy.applyOneRefs(p0, null, ImageMetaExt.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mMusicCdnList;
       if (obj == null) {
          obj = p0.mCdnList;
       }
       return ImageMetaExt.createCdn(obj, p0.mMusic);
    }
    public static CDNUrl[] getSinglePictureMusicCdn(ImageMeta p0){
       CDNUrl[] uCDNUrlArray = null;
       Object obj = PatchProxy.applyOneRefs(p0, uCDNUrlArray, ImageMetaExt.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ImageMeta$SinglePicture singlePictur = p0.getSinglePictureIfValid();
       if (singlePictur != null) {
          uCDNUrlArray = ImageMetaExt.getSinglePictureMusicCdn(singlePictur);
       }
       return uCDNUrlArray;
    }
    public static float getSinglePictureMusicVolume(ImageMeta p0){
       float f;
       ImageMeta$SinglePicture obj = PatchProxy.applyOneRefs(p0, null, ImageMetaExt.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       obj = 0x3f800000;
       ImageMeta$SinglePicture singlePictur = p0.getSinglePictureIfValid();
       if (singlePictur != null) {
          obj = singlePictur.mVolume;
       }
       if (obj <= 0) {
          f = 0x3f000000;
       }
       return f;
    }
    public static List getSinglePicturePhotoCdn(ImageMeta p0){
       ImageMeta$SinglePicture obj = null;
       ArrayList obj1 = PatchProxy.applyOneRefs(p0, obj, ImageMetaExt.class, "2");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null) {
          return obj;
       }
       ImageMeta$SinglePicture singlePictur = p0.getSinglePictureIfValid();
       if (singlePictur != null && (j.h(singlePictur.mCdnList) || j.h(singlePictur.mList))) {
          return obj;
       }
       obj1 = new ArrayList();
       if (!j.h(singlePictur.mLocalUrlList)) {
          obj1.add(new CDNUrl("", singlePictur.mLocalUrlList[0], 0));
          return obj1;
       }else {
          obj = singlePictur.mCdnList;
          int len = obj.length;
          for (int i = 0; i < len; i = i + 1) {
             object oobject = obj[i];
             obj1.add(new CDNUrl(oobject.mCdn, ImageMetaExt.getCdnUrl(oobject.mCdn, singlePictur.mList[0]), oobject.mIsFreeTraffic));
          }
          return obj1;
       }
    }
    public static boolean isAtlasPhotos(ImageMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageMetaExt.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.isAtlasPhotos();
    }
    public static boolean isLongPhotos(ImageMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageMetaExt.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.isLongPhotos();
    }
    public static boolean isSinglePhoto(ImageMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ImageMetaExt.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.isSinglePhoto();
    }
}
