package com.kwai.framework.model.channel.HotChannel;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ok.k;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Number;
import java.lang.StringBuilder;

public class HotChannel implements Serializable	// class@000ba9
{
    public boolean disableEdit;
    public int mCoronaId;
    public String mH5Url;
    public boolean mHasCoronaId;
    public Bitmap mIconBitmap;
    public String mIconUrl;
    public String mId;
    public int mIndex;
    public String mIndicatorColor;
    public boolean mIsLive;
    public boolean mIsMine;
    public boolean mIsTitle;
    public String mName;
    public String mNameEn;
    public String mNameSc;
    public String mNameTc;
    public boolean mShow;
    public String mSubChannelId;
    public int mTabType;
    public boolean mTeenageMode;
    public static final long serialVersionUID = 0x553b45c720e468af;

    public void HotChannel(){
       super();
       this.mId = "";
       this.mName = "";
       this.mNameSc = "";
       this.mNameEn = "";
       this.mNameTc = "";
       this.mIsLive = false;
       this.mCoronaId = 0;
       this.mHasCoronaId = false;
       this.mSubChannelId = "";
       this.mTeenageMode = false;
    }
    public void HotChannel(String p0,String p1,int p2){
       super();
       this.mId = "";
       this.mName = "";
       this.mNameSc = "";
       this.mNameEn = "";
       this.mNameTc = "";
       this.mIsLive = false;
       this.mCoronaId = 0;
       this.mHasCoronaId = false;
       this.mSubChannelId = "";
       this.mTeenageMode = false;
       this.mId = p0;
       this.mName = p1;
       this.mTabType = p2;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotChannel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof HotChannel) {
          return k.a(p0.mId, this.mId);
       }
       return super.equals(p0);
    }
    public String getVerticalType(){
       String str = (this.mHasCoronaId != null)? "CORONA": "NORMAL";
       return str;
    }
    public boolean hasTabIcon(){
       Object obj = PatchProxy.apply(null, this, HotChannel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.isEmpty(this.mIconUrl) && this.mIconBitmap != null)? true: false;
       return b;
    }
    public int hashCode(){
       Object[] obj = PatchProxy.apply(null, this, HotChannel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = new Object[]{this.mId};
       return k.b(obj);
    }
    public boolean isArticle(){
       boolean b = (3 == this.mTabType)? true: false;
       return b;
    }
    public boolean isH5(){
       boolean b = (6 == this.mTabType)? true: false;
       return b;
    }
    public boolean isLongText(){
       Object obj = PatchProxy.apply(null, this, HotChannel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("32").equals(this.mId);
    }
    public boolean isRecommend(){
       Object obj = PatchProxy.apply(null, this, HotChannel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("recommend").equals(this.mId);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HotChannel.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "HotChannel{mId=\'"+this.mId+'''+", mName=\'"+this.mName+'''+", mNameSc=\'"+this.mNameSc+'''+", mNameEn=\'"+this.mNameEn+'''+", mNameTc=\'"+this.mNameTc+'''+", mTabType="+this.mTabType+", mIsLive="+this.mIsLive+", disableEdit="+this.disableEdit+", mCoronaId="+this.mCoronaId+", mHasCoronaId="+this.mHasCoronaId+", mSubChannelId=\'"+this.mSubChannelId+'''+", mIndex="+this.mIndex+", mShow="+this.mShow+", mIsMine="+this.mIsMine+", mIsTitle="+this.mIsTitle+'}';
    }
}
