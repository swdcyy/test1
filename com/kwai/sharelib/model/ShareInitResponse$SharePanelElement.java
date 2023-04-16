package com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Exception;

public class ShareInitResponse$SharePanelElement implements Serializable	// class@0016f3
{
    public String mActionUrl;
    public boolean mAutoAdjustFontSize;
    public boolean mAutoHidePanelWhenClicked;
    public String mBgColor;
    public String mCamelName;
    public String mDisplayName;
    public int mDisplayNameResId;
    public String mElementType;
    public String mExtraInfo;
    public int mHeight;
    public int mIconResId;
    public String mIconUrl;
    public String mId;
    public boolean mPrime;
    public String mPrimeBgColor;
    public String mPrimeFontColor;
    public float mPrimeFontSize;
    public String mPrimeIconUrl;
    public String mPrimeText;
    public int mWidth;
    public static final long serialVersionUID = 0x8a4a0db2c038247d;

    public void ShareInitResponse$SharePanelElement(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShareInitResponse$SharePanelElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return "SharePanelElement{mId=\'"+this.mId+'''+", mCamelName=\'"+this.mCamelName+'''+", mElementType=\'"+this.mElementType+'''+", mDisplayName=\'"+this.mDisplayName+'''+", mDisplayNameResId="+this.mDisplayNameResId+", mIconUrl=\'"+this.mIconUrl+'''+", mIconResId="+this.mIconResId+", mActionUrl=\'"+this.mActionUrl+'''+", mHeight="+this.mHeight+", mWidth="+this.mWidth+", mBgColor=\'"+this.mBgColor+'''+", mAutoHidePanelWhenClicked="+this.mAutoHidePanelWhenClicked+", mAutoAdjustFontSize="+this.mAutoAdjustFontSize+", mExtraInfo=\'"+this.mExtraInfo+'''+", mPrime="+this.mPrime+", mPrimeIconUrl=\'"+this.mPrimeIconUrl+'''+", mPrimeText=\'"+this.mPrimeText+'''+", mPrimeBgColor=\'"+this.mPrimeBgColor+'''+", mPrimeFontSize="+this.mPrimeFontSize+", mPrimeFontColor=\'"+this.mPrimeFontColor+'''+'}';
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return "error occasion when SharePanelElement toString "+e0.getMessage();
       }
    }
}
