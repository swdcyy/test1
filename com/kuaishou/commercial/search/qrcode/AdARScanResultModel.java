package com.kuaishou.commercial.search.qrcode.AdARScanResultModel;
import java.io.Serializable;
import com.kuaishou.commercial.search.qrcode.AdARScanResultModel$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;

public final class AdARScanResultModel implements Serializable	// class@001572
{
    public String mActivityId;
    public String mButtonLabel;
    public String mPopupId;
    public CDNUrl[] mVideoUrls;
    public static final AdARScanResultModel$a Companion;
    public static final long serialVersionUID;

    static {
       AdARScanResultModel.Companion = new AdARScanResultModel$a(null);
    }
    public void AdARScanResultModel(){
       super();
    }
    public static void getMVideoUrls$annotations(){
    }
    public final String getMActivityId(){
       return this.mActivityId;
    }
    public final String getMButtonLabel(){
       return this.mButtonLabel;
    }
    public final String getMPopupId(){
       return this.mPopupId;
    }
    public final CDNUrl[] getMVideoUrls(){
       return this.mVideoUrls;
    }
    public final void setMActivityId(String p0){
       this.mActivityId = p0;
    }
    public final void setMButtonLabel(String p0){
       this.mButtonLabel = p0;
    }
    public final void setMPopupId(String p0){
       this.mPopupId = p0;
    }
    public final void setMVideoUrls(CDNUrl[] p0){
       this.mVideoUrls = p0;
    }
}
