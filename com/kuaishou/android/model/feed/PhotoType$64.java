package com.kuaishou.android.model.feed.PhotoType$64;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.String;
import com.kuaishou.android.model.feed.PhotoType$1;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.FindTkFeed;

public final class PhotoType$64 extends PhotoType	// class@000b61
{

    public void PhotoType$64(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, PhotoType$64.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new FindTkFeed();
    }
}
