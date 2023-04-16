package com.yxcorp.gifshow.map.data.model.MapPhotosResponse;
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

public class MapPhotosResponse implements Serializable, b	// class@001c79
{
    public String mCursor;
    public String mLlsid;
    public FeedCountResponse mNearbyFeedCountResponse;
    public NearbyMapFeedResponseTime mNearbyMapFeedResponseTime;
    public List mQPhotos;
    public static final long serialVersionUID = 0x68bf44ff80d28c85;

    public void MapPhotosResponse(){
       super();
    }
    public List getItems(){
       return this.mQPhotos;
    }
    public boolean hasMore(){
       return false;
    }
    public boolean hasMoreRefresh(){
       Object obj = PatchProxy.apply(null, this, MapPhotosResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
