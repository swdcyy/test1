package com.kuaishou.android.model.mix.ImageMeta;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta$CDNInfo;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.lang.Integer;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import java.lang.Boolean;

public class ImageMeta implements Serializable	// class@000ce3
{
    public ImageMeta$Atlas mAtlas;
    public boolean mSinglePicMakeAtlasStructure;
    public ImageMeta$SinglePicture mSinglePicture;
    public static final long serialVersionUID = 0x55934bc9752ee80a;

    public void ImageMeta(){
       super();
       this.mSinglePicMakeAtlasStructure = false;
    }
    public static CDNUrl[] createCdn(ImageMeta$CDNInfo[] p0,String p1){
       String str;
       Object obj = null;
       CDNUrl[] obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, ImageMeta.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (TextUtils.isEmpty(p1)) {
          return obj;
       }
       if (p0 == null) {
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
    public String[] getAtlasCdn(){
       ImageMeta tmAtlas = this.mAtlas;
       if (tmAtlas != null) {
          ImageMeta$Atlas mCdnList = tmAtlas.mCdnList;
          if (mCdnList != null && mCdnList.length > 0) {
             String[] stringArray = new String[mCdnList.length];
             int i = 0;
             ImageMeta$Atlas mCdnList1 = this.mAtlas.mCdnList;
             while (i < mCdnList1.length) {
                stringArray[i] = mCdnList1[i].mCdn;
                i = i + 1;
             }
             return stringArray;
          }
       }
       return null;
    }
    public int[] getAtlasIndices(){
       ImageMeta tmAtlas = this.mAtlas;
       if (tmAtlas != null) {
          return tmAtlas.mIndices;
       }
       return null;
    }
    public ImageMeta$Atlas getAtlasInfo(){
       return this.mAtlas;
    }
    public List getAtlasList(){
       Object[] objArray = null;
       ImageMeta obj = PatchProxy.apply(objArray, this, ImageMeta.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAtlas;
       if (obj != null && obj.mList != null) {
          return new ArrayList(Arrays.asList(this.mAtlas.mList));
       }
       return objArray;
    }
    public CDNUrl[] getAtlasMusicCdn(){
       Object[] objArray = null;
       ImageMeta$Atlas obj = PatchProxy.apply(objArray, this, ImageMeta.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getAtlasInfo();
       if (obj != null) {
          ImageMeta$Atlas mMusicCdnLis = obj.mMusicCdnList;
          if (mMusicCdnLis == null) {
             mMusicCdnLis = obj.mCdnList;
          }
          objArray = ImageMeta.createCdn(mMusicCdnLis, obj.mMusic);
       }
       return objArray;
    }
    public float getAtlasMusicVolume(){
       ImageMeta tmAtlas = this.mAtlas;
       ImageMeta$Atlas mVolume = (tmAtlas != null)? tmAtlas.mVolume: 0x3f800000;
       if (mVolume <= 0) {
          mVolume = 0x3f000000;
       }
       return mVolume;
    }
    public List getAtlasPhotosCdn(int p0){
       ImageMeta obj;
       object oobject1;
       if (PatchProxy.isSupport(ImageMeta.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ImageMeta.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.mAtlas;
       ArrayList uArrayList = null;
       if (obj != null) {
          ImageMeta$Atlas mCdnList = obj.mCdnList;
          if (mCdnList != null) {
             ImageMeta$Atlas mList = obj.mList;
             if (mList != null && (mCdnList != null && p0 < mList.length)) {
                uArrayList = new ArrayList();
                int len = mCdnList.length;
                for (int i = 0; i < len; i = i + 1) {
                   object oobject = mCdnList[i];
                   ImageMeta$CDNInfo mCdn = oobject.mCdn;
                   if (TextUtils.isEmpty(mCdn)) {
                      oobject1 = mList[p0];
                   }else if(!mCdn.startsWith("http")){
                      oobject1 = "http://"+mCdn+mList[p0];
                   }else {
                      oobject1 = mCdn+mList[p0];
                   }
                   uArrayList.add(new CDNUrl(mCdn, oobject1, oobject.mIsFreeTraffic));
                }
             }
          }
       }
       return uArrayList;
    }
    public ImageMeta$AtlasCoverSize getAtlasSize(int p0){
       ImageMeta tmAtlas = this.mAtlas;
       if (tmAtlas != null) {
          ImageMeta$Atlas mSize = tmAtlas.mSize;
          if (mSize != null && (tmAtlas.mCdnList != null && p0 < mSize.length)) {
             return mSize[p0];
          }
       }
       return null;
    }
    public ImageMeta$AtlasCoverSize[] getAtlasSizes(){
       ImageMeta tmAtlas = this.mAtlas;
       if (tmAtlas != null && tmAtlas.mCdnList != null) {
          return tmAtlas.mSize;
       }
       return null;
    }
    public String getMusicUrl(){
       ImageMeta tmAtlas = this.mAtlas;
       if (tmAtlas != null) {
          return tmAtlas.mMusic;
       }
       return "";
    }
    public ImageMeta$SinglePicture getSinglePictureIfValid(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ImageMeta.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isSinglePhoto()) {
          objArray = this.mSinglePicture;
       }
       return objArray;
    }
    public CDNUrl[] getSinglePictureMusicCdn(){
       Object[] objArray = null;
       ImageMeta$SinglePicture obj = PatchProxy.apply(objArray, this, ImageMeta.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getSinglePictureIfValid();
       if (obj != null) {
          ImageMeta$SinglePicture mMusicCdnLis = obj.mMusicCdnList;
          if (mMusicCdnLis == null) {
             mMusicCdnLis = obj.mCdnList;
          }
          objArray = ImageMeta.createCdn(mMusicCdnLis, obj.mMusic);
       }
       return objArray;
    }
    public float getSinglePictureMusicVolume(){
       ImageMeta tmSinglePict = this.mSinglePicture;
       ImageMeta$SinglePicture mVolume = (tmSinglePict != null)? tmSinglePict.mVolume: 0x3f800000;
       if (mVolume <= 0) {
          mVolume = 0x3f000000;
       }
       return mVolume;
    }
    public boolean isAtlasPhotos(){
       ImageMeta tmAtlas = this.mAtlas;
       boolean b = true;
       if (tmAtlas == null || tmAtlas.mType != b) {
          b = false;
       }
       return b;
    }
    public boolean isLongPhotos(){
       ImageMeta tmAtlas = this.mAtlas;
       boolean b = (tmAtlas != null && tmAtlas.mType == 2)? true: false;
       return b;
    }
    public boolean isSinglePhoto(){
       ImageMeta obj = PatchProxy.apply(null, this, ImageMeta.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.isAtlasPhotos() || this.isLongPhotos()) {
          return this.mSinglePicMakeAtlasStructure;
       }
       obj = this.mSinglePicture;
       boolean b = (obj != null && obj.mType == 3)? true: false;
       return b;
    }
}
