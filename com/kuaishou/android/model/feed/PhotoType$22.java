package com.kuaishou.android.model.feed.PhotoType$22;
import com.kuaishou.android.model.feed.PhotoType;
import java.lang.String;
import com.kuaishou.android.model.feed.PhotoType$1;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.AggregateTemplateFeed;

public final class PhotoType$22 extends PhotoType	// class@000b33
{

    public void PhotoType$22(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, PhotoType$22.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AggregateTemplateFeed();
    }
}
