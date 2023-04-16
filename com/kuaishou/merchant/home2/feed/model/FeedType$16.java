package com.kuaishou.merchant.home2.feed.model.FeedType$16;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import tw3.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cz3.a;

public final class FeedType$16 extends FeedType	// class@0017a5
{

    public void FeedType$16(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public BaseFeed createFeed(){
       return null;
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$16.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
}
