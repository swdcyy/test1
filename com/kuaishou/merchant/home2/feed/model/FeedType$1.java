package com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.UnknownFeed;
import tw3.b;

public final class FeedType$1 extends FeedType	// class@0017a6
{

    public void FeedType$1(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new UnknownFeed();
    }
    public b createPresenterHolderCreator(){
       return null;
    }
}
