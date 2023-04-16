package com.kuaishou.android.live.model.LiveAdaptiveManifest;
import java.io.Serializable;
import java.lang.Boolean;
import java.util.Set;
import com.kuaishou.android.live.model.AdaptationSet;
import com.kuaishou.android.live.model.LiveAdaptiveManifest$ManifestType;
import java.lang.Object;
import java.util.List;
import com.kuaishou.android.live.model.AdaptationUrl;
import java.lang.String;
import ekd.p0;
import com.kuaishou.aegon.httpdns.ResolvedIP;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveAdaptiveManifest implements Serializable	// class@0007e2
{
    public AdaptationSet mAdaptationSet;
    public Boolean mAutoDefaultSelect;
    public long mBusinessType;
    public Set mCdnFeature;
    public Boolean mHideAuto;
    public String mHost;
    public Boolean mIsFreeTrafficCdn;
    public boolean mIsTransformed;
    public LiveAdaptiveManifest$ManifestType mManifestType;
    public final ResolvedIP mResolvedIP;
    public String mType;
    public String mVersion;
    public static final long serialVersionUID = 0x578d70f09564fda1;

    public void LiveAdaptiveManifest(Boolean p0,Set p1,AdaptationSet p2,LiveAdaptiveManifest$ManifestType p3,boolean p4,boolean p5){
       super();
       this.mIsTransformed = false;
       this.mResolvedIP = null;
       this.mVersion = "2.0";
       this.mType = "";
       this.mIsFreeTrafficCdn = p0;
       this.mAdaptationSet = p2;
       this.mCdnFeature = p1;
       this.mManifestType = p3;
       this.mIsTransformed = p4;
       this.mAutoDefaultSelect = Boolean.FALSE;
       this.mHideAuto = Boolean.valueOf(p5);
       if (p2 != null) {
          AdaptationSet mRepresentat = p2.mRepresentation;
          if (mRepresentat != null && mRepresentat.size() > 0) {
             this.mHost = p0.n(p2.mRepresentation.get(false).mUrl);
          }
       }
       return;
    }
    public void LiveAdaptiveManifest(String p0,String p1,Boolean p2,Boolean p3,Boolean p4,long p5,Set p6,AdaptationSet p7,String p8,ResolvedIP p9,LiveAdaptiveManifest$ManifestType p10,boolean p11){
       super();
       this.mIsTransformed = false;
       this.mVersion = p0;
       this.mType = p1;
       this.mIsFreeTrafficCdn = p2;
       this.mAdaptationSet = p7;
       this.mHost = p8;
       this.mResolvedIP = p9;
       this.mHideAuto = p3;
       this.mAutoDefaultSelect = p4;
       this.mBusinessType = p5;
       this.mCdnFeature = p6;
       this.mManifestType = p10;
       this.mIsTransformed = p11;
    }
    public LiveAdaptiveManifest$ManifestType getManifestType(){
       LiveAdaptiveManifest tmManifestTy = this.mManifestType;
       if (tmManifestTy != null) {
       }else {
          tmManifestTy = LiveAdaptiveManifest$ManifestType.FLV;
       }
       return tmManifestTy;
    }
    public boolean isLiveQualityInvisible(){
       boolean b = (!this.mBusinessType - 1)? true: false;
       return b;
    }
    public boolean isManifestFlv(){
       boolean b = (this.mManifestType == LiveAdaptiveManifest$ManifestType.FLV)? true: false;
       return b;
    }
    public boolean isManifestHLS(){
       boolean b = (this.mManifestType == LiveAdaptiveManifest$ManifestType.HLS)? true: false;
       return b;
    }
    public boolean isManifestWebRTC(){
       boolean b = (this.mManifestType == LiveAdaptiveManifest$ManifestType.WebRTC)? true: false;
       return b;
    }
    public boolean isTransformed(){
       return this.mIsTransformed;
    }
    public boolean shouldHideAutoLiveQuality(){
       Object obj = PatchProxy.apply(null, this, LiveAdaptiveManifest.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Boolean.TRUE.equals(this.mHideAuto);
    }
    public boolean shouldSelectAutoLiveQuality(){
       Object obj = PatchProxy.apply(null, this, LiveAdaptiveManifest.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Boolean.TRUE.equals(this.mAutoDefaultSelect);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAdaptiveManifest.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAdaptiveManifest{mVersion=\'"+this.mVersion+'''+", mType=\'"+this.mType+'''+", mIsFreeTrafficCdn="+this.mIsFreeTrafficCdn+", mAdaptationSet="+this.mAdaptationSet+", mHost=\'"+this.mHost+'''+", mBusinessType="+this.mBusinessType+", mResolvedIP="+this.mResolvedIP+", mHideAuto="+this.mHideAuto+", mAutoDefaultSelect="+this.mAutoDefaultSelect+", mCdnFeature="+this.mCdnFeature+", mManifestType="+this.mManifestType+", mIsTransformed="+this.mIsTransformed+'}';
    }
}
