package com.kuaishou.merchant.home2.feed.model.FeedType$6;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import tx3.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.BrandActivityCardFeed;
import tw3.b;
import uy3.a;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.k;
import su.a;

public final class FeedType$6 extends FeedType	// class@0017ab
{

    public void FeedType$6(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new a();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$6.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BrandActivityCardFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$6.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$6.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("activity_component", k.a, BrandActivityCardFeed.class);
    }
}
