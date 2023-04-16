package com.kuaishou.android.live.model.AdaptationUrl;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.lang.StringBuilder;

public class AdaptationUrl implements Serializable	// class@0007dd
{
    public long mBitrate;
    public boolean mDefaultSelect;
    public boolean mEnableAdaptive;
    public boolean mHidden;
    public long mId;
    public int mLevel;
    public String mName;
    public String mQualityType;
    public String mShortName;
    public String mUrl;
    public String mUrlType;
    public static Map b;
    public static final long serialVersionUID;

    public void AdaptationUrl(String p0,long p1,long p2,String p3,String p4,String p5,int p6,boolean p7,boolean p8,boolean p9,String p10){
       super();
       this.mUrl = p0;
       this.mId = p1;
       this.mBitrate = p2;
       this.mQualityType = p3;
       this.mName = p4;
       this.mShortName = p5;
       this.mLevel = p6;
       this.mHidden = p7;
       this.mEnableAdaptive = p8;
       this.mDefaultSelect = p9;
       this.mUrlType = p10;
    }
    public static String getNameByQualityType(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, null, AdaptationUrl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       if (AdaptationUrl.b == null) {
          obj = new HashMap();
          AdaptationUrl.b = obj;
          obj.put("SMOOTH", "流畅");
          AdaptationUrl.b.put("STANDARD", "高清");
          AdaptationUrl.b.put("HIGH", "超清");
          AdaptationUrl.b.put("BLUE_RAY", "蓝光");
          AdaptationUrl.b.put("SUPER", "蓝光 4M");
       }
       return AdaptationUrl.b.get(p0);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AdaptationUrl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AdaptationUrl{mUrl=\'"+this.mUrl+'''+", mId="+this.mId+", mBitrate="+this.mBitrate+", mQualityType=\'"+this.mQualityType+'''+", mName=\'"+this.mName+'''+", mShortName=\'"+this.mShortName+'''+", mLevel="+this.mLevel+", mHidden="+this.mHidden+", mEnableAdaptive="+this.mEnableAdaptive+", mDefaultSelect="+this.mDefaultSelect+", mUrlType=\'"+this.mUrlType+'''+'}';
    }
}
