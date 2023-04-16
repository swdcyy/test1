package com.kuaishou.android.model.feed.PhotoType$17;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.String;
import com.kuaishou.android.model.feed.PhotoType$1;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.AggregateLiveStreamFeed;

public final class PhotoType$17 extends PhotoType	// class@000b2d
{

    public void PhotoType$17(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, PhotoType$17.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AggregateLiveStreamFeed();
    }
}
