package com.kwai.live.gzone.api.model.LiveGzoneTextImageInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.api.model.LiveGzoneTextImageInfoResponse$Data;

public class LiveGzoneTextImageInfoResponse implements Serializable	// class@000c61
{
    public LiveGzoneTextImageInfoResponse$Data mData;
    public static final long serialVersionUID = 0x6ea68737b9605c7a;

    public void LiveGzoneTextImageInfoResponse(){
       super();
    }
    public String getLiveTextImageId(){
       LiveGzoneTextImageInfoResponse obj = PatchProxy.apply(null, this, LiveGzoneTextImageInfoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mData;
       if (obj != null) {
          LiveGzoneTextImageInfoResponse$Data mLiveTextIma = obj.mLiveTextImageId;
          if (mLiveTextIma != null) {
             return String.valueOf(mLiveTextIma);
          }
       }
       return null;
    }
}
