package com.kuaishou.android.model.ads.PhotoAdvertisement$AdRerankInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PhotoAdvertisement$AdRerankInfo implements Serializable	// class@0008b1
{
    public Map mAvoidMap;
    public PhotoAdvertisement$AdRankType mRankType;
    public boolean mRerankSuc;
    public String mSourceType;
    public long mTimeInterval;
    public static final long serialVersionUID = 0x67fa6d2ad25dfae1;

    public void PhotoAdvertisement$AdRerankInfo(){
       super();
       this.mSourceType = "1";
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PhotoAdvertisement$AdRerankInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AdRerankInfo\nrankType="+this.mRankType+"\ntimeInterval="+this.mTimeInterval+"\nsourceType="+this.mSourceType+"\navoidMap="+this.mAvoidMap+"\nrerankSuc="+this.mRerankSuc;
    }
}
