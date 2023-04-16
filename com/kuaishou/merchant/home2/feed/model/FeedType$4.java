package com.kuaishou.merchant.home2.feed.model.FeedType$4;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import xx3.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.CommodityFeed;
import tw3.b;
import yy3.a;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.i;
import su.a;

public final class FeedType$4 extends FeedType	// class@0017a9
{

    public void FeedType$4(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new a();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CommodityFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$4.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$4.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("commodity1_component", i.a, BaseFeed.class);
    }
}
