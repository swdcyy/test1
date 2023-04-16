package com.yxcorp.gifshow.model.response.HotResortPlaceResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Collections;

public class HotResortPlaceResponse implements Serializable, a	// class@001f3b
{
    public List mHotPlaces;
    public List mPlaces;
    public static final long serialVersionUID = 0x4fb5fc150aea6dda;

    public void HotResortPlaceResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, HotResortPlaceResponse.class, "1")) {
          return;
       }
       if (this.mHotPlaces == null) {
          this.mHotPlaces = Collections.emptyList();
       }
       if (this.mPlaces == null) {
          this.mPlaces = Collections.emptyList();
       }
       return;
    }
}
