package com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType$a;
import java.lang.Object;
import nsd.u;
import ln1.b;
import com.kuaishou.live.common.core.component.hotspot.detail.model.MediaType;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotPhotoViewData;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotLiveViewData;

public final class MediaType$a	// class@0013d1
{

    public void MediaType$a(){
       super();
    }
    public void MediaType$a(u p0){
       super();
    }
    public final MediaType a(b p0){
       MediaType pHOTO;
       if (p0 instanceof LiveHotSpotPhotoViewData) {
          pHOTO = MediaType.PHOTO;
       }else if(p0 instanceof LiveHotSpotLiveViewData){
          pHOTO = MediaType.LIVE;
       }else {
          pHOTO = MediaType.UNKNOWN;
       }
       return pHOTO;
    }
}
