package com.kwai.video.player.mid.manifest.v2.Representation;
import com.kwai.video.player.mid.manifest.RepInterface;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.player.KwaiRepresentation;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Math;
import java.util.Locale;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.player.mid.manifest.v2.Representation$Builder;
import java.util.Collection;
import java.util.List;
import com.kwai.video.player.mid.manifest.v2.Representation$1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.wayne.player.config.inerface.KSConfigGetInterface;
import com.kwai.video.wayne.player.config.impl.WaynePlayerConfigImpl;
import com.kwai.video.wayne.player.config.ks_sub.QualityRateModel;
import java.lang.StringBuilder;
import com.kwai.video.player.mid.manifest.v2.KvqScore;
import java.util.Collections;

public class Representation implements RepInterface, Serializable, Cloneable	// class@000b6f
{
    public int avgBitrate;
    public List bitratePattern;
    public String cacheKey;
    public String codecs;
    public int mAdaptiveType;
    public List mBackupUrls;
    public String mComment;
    public boolean mDefaultSelect;
    public boolean mDisableAdaptive;
    public int mDynamicType;
    public boolean mFeatureP2sp;
    public float mFrameRate;
    public int mHeight;
    public boolean mHidden;
    public int mId;
    public KvqScore mKvqScore;
    public String mM3u8Slice;
    public String mMailUrl;
    public String mMinorInfo;
    public float mQuality;
    public String mQualityLabel;
    public String mQualityType;
    public int mWidth;
    public int maxBitrate;
    public String videoCodec;

    public void Representation(){
       super();
       this.mBackupUrls = new ArrayList();
    }
    public void Representation(KwaiRepresentation p0){
       super();
       this.mBackupUrls = new ArrayList();
       this.mId = p0.id;
       this.mWidth = p0.width;
       this.mHeight = p0.height;
       this.maxBitrate = p0.maxBitrate;
       this.avgBitrate = p0.avgBitreate;
       KwaiRepresentation qualityType = p0.qualityType;
       this.mQualityType = qualityType;
       this.mQualityLabel = p0.qualityLabel;
       this.videoCodec = p0.videoCodec;
       this.mDefaultSelect = p0.defaultSelect;
       this.mMailUrl = p0.url;
       if (TextUtils.isEmpty(qualityType)) {
          int i = Math.min(this.mWidth, this.mHeight);
          Object[] objArray = new Object[]{Integer.valueOf(i)};
          this.mQualityType = Representation.matchQualityTypeInRateConfig(String.format(Locale.US, "%dp", objArray), i);
       }
       return;
    }
    public void Representation(Representation$Builder p0){
       super();
       ArrayList uArrayList = new ArrayList();
       this.mBackupUrls = uArrayList;
       this.mWidth = p0.mWidth;
       this.mHeight = p0.mHeight;
       this.maxBitrate = p0.mMaxBitrate;
       this.avgBitrate = p0.mAvgBitrate;
       this.mMailUrl = p0.mMailUrl;
       p0 = p0.mBackupUrls;
       if (p0 != null) {
          uArrayList.addAll(p0);
       }
       int i = Math.min(this.mWidth, this.mHeight);
       Object[] objArray = new Object[]{Integer.valueOf(i)};
       this.mQualityType = Representation.matchQualityTypeInRateConfig(String.format(Locale.US, "%dp", objArray), i);
       return;
    }
    public void Representation(Representation$Builder p0,Representation$1 p1){
       super(p0);
    }
    public static String matchQualityTypeInRateConfig(String p0,int p1){
       List obj;
       if (PatchProxy.isSupport(Representation.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, Representation.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = WaynePlayerConfigImpl.getConfigGet().getQualityList();
       if (obj != null && obj.size()) {
          int i = obj.size() - 1;
          int i1 = -1;
          while (true) {
             if (i >= 0) {
                QualityRateModel qualityRateM = obj.get(i);
                if ((qualityRateM.getQualityType()).equals(p0)) {
                label_0057 :
                   int i2 = obj.size() - 1;
                   if (i != -1) {
                      i1 = i;
                   }else if(i1 != -1){
                      i1 = i2;
                   }
                   i2 = obj.get(i1).getQualityType();
                   break ;
                }else if(i1 == -1 && (p1 > 0 && qualityRateM.getQualityNumber() >= p1)){
                   i1 = i;
                }
             label_0053 :
                i = i - 1;
             }else {
                i = -1;
                goto label_0057 ;
             }
          }
       }
       return p0;
    }
    public Representation clone(){
       Representation obj = PatchProxy.apply(null, this, Representation.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.clone();
       ArrayList uArrayList = new ArrayList();
       obj.mBackupUrls = uArrayList;
       Representation tmBackupUrls = this.mBackupUrls;
       if (tmBackupUrls != null) {
          uArrayList.addAll(tmBackupUrls);
       }
       return obj;
    }
    public Object clone(){
       return this.clone();
    }
    public String generateUniqueKey(){
       Object obj = PatchProxy.apply(null, this, Representation.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mWidth+this.mHeight+this.mFrameRate+this.mDynamicType;
    }
    public String generateUniqueKeyV2(){
       Object obj = PatchProxy.apply(null, this, Representation.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mWidth+this.mHeight+this.mFrameRate+this.mDynamicType+this.avgBitrate;
    }
    public int getAvgBitrate(){
       return this.avgBitrate;
    }
    public List getBackupUrls(){
       return this.mBackupUrls;
    }
    public String getBiz(){
       object oobject;
       Object obj = PatchProxy.apply(null, this, Representation.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mMinorInfo == null) {
          return "";
       }
       String[] stringArray = new String[]{"-kvc","-post","-ad"};
       int i = 0;
       while (true) {
          if (i >= 3) {
             return "";
          }
          oobject = stringArray[i];
          if ((this.mMinorInfo).contains(oobject)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public String getCodecs(){
       return this.codecs;
    }
    public int getId(){
       return this.mId;
    }
    public KvqScore getKvqScore(){
       return this.mKvqScore;
    }
    public String getMailUrl(){
       return this.mMailUrl;
    }
    public String getMinorInfo(){
       Representation tmMinorInfo = this.mMinorInfo;
       if (tmMinorInfo == null) {
          tmMinorInfo = "";
       }
       return tmMinorInfo;
    }
    public float getQuality(){
       return this.mQuality;
    }
    public String getQualityLabel(){
       return this.mQualityLabel;
    }
    public String getQualityType(){
       Representation tmQualityTyp = this.mQualityType;
       if (tmQualityTyp == null) {
          tmQualityTyp = "";
       }
       return tmQualityTyp;
    }
    public String getSubLevel(){
       object oobject;
       Representation obj = PatchProxy.apply(null, this, Representation.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMinorInfo;
       if (obj == null) {
          return "";
       }
       String[] stringArray = obj.split(",");
       int len = stringArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return "";
          }
          oobject = stringArray[i];
          if (!oobject.equals("-kvc") && (!oobject.equals("-post") && !oobject.equals("-ad"))) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public String getUrl(){
       return this.mMailUrl;
    }
    public String getVideoCodec(){
       return this.videoCodec;
    }
    public void setQualityType(String p0){
       this.mQualityType = p0;
    }
    public void shuffleUrls(){
       if (PatchProxy.applyVoid(null, this, Representation.class, "2")) {
          return;
       }
       if (this.mBackupUrls == null) {
          this.mBackupUrls = new ArrayList();
       }
       this.mBackupUrls.add(this.mMailUrl);
       Collections.shuffle(this.mBackupUrls);
       this.mMailUrl = this.mBackupUrls.remove(0);
       return;
    }
}
