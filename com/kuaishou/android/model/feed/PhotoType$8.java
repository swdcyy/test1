package com.kuaishou.android.model.feed.PhotoType$8;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.String;
import com.kuaishou.android.model.feed.PhotoType$1;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PhotoType$8 extends PhotoType	// class@000b68
{

    public void PhotoType$8(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, PhotoType$8.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PhotoType.createFeedFromType(this);
    }
}
