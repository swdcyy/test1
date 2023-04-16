package com.kuaishou.merchant.home2.feed.model.FeedType$12;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import sx3.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.stream.banner.model.BannerFeed;
import tw3.b;
import sy3.e;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.c;
import su.a;

public final class FeedType$12 extends FeedType	// class@0017a1
{

    public void FeedType$12(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new a();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$12.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BannerFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$12.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$12.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("feed_activity_banner_native", c.a, BannerFeed.class);
    }
}
