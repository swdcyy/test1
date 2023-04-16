package com.kuaishou.merchant.home2.feed.model.FeedType$9;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import ux3.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.BrandLiveFeed;
import tw3.b;
import vy3.e;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.n;
import su.a;

public final class FeedType$9 extends FeedType	// class@0017ae
{

    public void FeedType$9(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new a();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$9.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BrandLiveFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$9.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$9.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("brand_live_component", n.a, BaseFeed.class);
    }
}
