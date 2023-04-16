package com.yxcorp.gifshow.model.response.PoiPhotosResponse;
import java.io.Serializable;
import la6.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class PoiPhotosResponse implements Serializable, b	// class@001f54
{
    public String mCursor;
    public List mHotQPhotos;
    public List mItems;
    public String mLlsid;
    public List mNearbyQPhotos;
    public List mQPhotos;
    public static final long serialVersionUID = 0x68bf44ff80d28c85;

    public void PoiPhotosResponse(){
       super();
    }
    public List getItems(){
       return this.mItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, PoiPhotosResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
