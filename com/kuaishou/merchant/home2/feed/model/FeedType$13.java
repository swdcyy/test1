package com.kuaishou.merchant.home2.feed.model.FeedType$13;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import qx3.b;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.ActivityLiveFeed;
import tw3.b;
import qy3.c;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.d;
import su.a;

public final class FeedType$13 extends FeedType	// class@0017a2
{

    public void FeedType$13(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new b();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$13.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ActivityLiveFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$13.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$13.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("feed_activity_live_native", d.a, BaseFeed.class);
    }
}
