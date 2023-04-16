package com.kuaishou.android.model.ads.PhotoAdvertisement$ItemClickActionInfo;
import java.io.Serializable;
import java.lang.Object;

public class PhotoAdvertisement$ItemClickActionInfo implements Serializable	// class@000975
{
    public int mConversionAreaType;
    public int mSubConversionType;
    public int mType;
    public int mWebViewType;
    public static final long serialVersionUID = 0xc5fd672517edcf72;

    public void PhotoAdvertisement$ItemClickActionInfo(){
       super();
       this.mConversionAreaType = 0;
       this.mType = 0;
       this.mWebViewType = 0;
       this.mSubConversionType = 0;
    }
    public boolean enableConvert(){
       boolean b = true;
       if (this.mType == b) {
       }else {
          b = false;
       }
       return b;
    }
}
