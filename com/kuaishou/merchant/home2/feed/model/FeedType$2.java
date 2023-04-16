package com.kuaishou.merchant.home2.feed.model.FeedType$2;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import yx3.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.LiveFeed;
import tw3.b;
import zy3.a;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.g;
import su.a;

public final class FeedType$2 extends FeedType	// class@0017a7
{

    public void FeedType$2(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new a();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("live_component", g.a, BaseFeed.class);
    }
}
