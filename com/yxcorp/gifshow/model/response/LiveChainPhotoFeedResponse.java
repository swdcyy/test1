package com.yxcorp.gifshow.model.response.LiveChainPhotoFeedResponse;
import java.io.Serializable;
import com.kwai.framework.model.response.CursorResponse;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LiveChainPhotoFeedResponse implements Serializable, CursorResponse	// class@001f43
{
    public String mCursor;
    public String mIdentity;
    public List mQPhotos;
    public long mTimeStampMs;
    public static final long serialVersionUID = 0xc6351025e032dac6;

    public void LiveChainPhotoFeedResponse(){
       super();
       this.mIdentity = "";
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mQPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveChainPhotoFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
