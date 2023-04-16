package com.yxcorp.gifshow.ad.webview.jshandler.dto.NeoDetailResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.api.DetailAd;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.ad.webview.jshandler.dto.NeoDetailResponse$AdData;

public class NeoDetailResponse implements Serializable	// class@001903
{
    public NeoDetailResponse$AdData mAdData;
    public String mDetailSessionId;
    public static final long serialVersionUID = 0xc555fb8ab039b15a;

    public void NeoDetailResponse(DetailAd p0,String p1){
       super();
       if (p0 != null) {
          NeoDetailResponse$AdData uAdData = new NeoDetailResponse$AdData();
          this.mAdData = uAdData;
          uAdData.mCaption = p0.getMCaption();
          this.mAdData.mCoverUrl = p0.getMCoverUrl();
          this.mAdData.mH5Data = p0.getMH5Data();
       }
       this.mDetailSessionId = p1;
       return;
    }
}
