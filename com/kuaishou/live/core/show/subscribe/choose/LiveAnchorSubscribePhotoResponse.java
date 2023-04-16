package com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribePhotoResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import la6.a;

public class LiveAnchorSubscribePhotoResponse implements CursorResponse, Serializable	// class@0010ca
{
    public String mCursor;
    public int mMaxRelateCount;
    public List mPhotos;
    public String mRelatePhotosTips;
    public int mReservationActivityType;
    public String mSelectedPhotosHint;
    public static final long serialVersionUID = 0x8042ce9887dd00c1;

    public void LiveAnchorSubscribePhotoResponse(){
       super();
       this.mMaxRelateCount = 1;
       this.mReservationActivityType = 1;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       return this.mPhotos;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveAnchorSubscribePhotoResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}
