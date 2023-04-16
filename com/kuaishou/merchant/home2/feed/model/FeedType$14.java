package com.kuaishou.merchant.home2.feed.model.FeedType$14;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import qx3.c;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.ActivityVideoFeed;
import tw3.b;
import ry3.a;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.e;
import su.a;

public final class FeedType$14 extends FeedType	// class@0017a3
{

    public void FeedType$14(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new c();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$14.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ActivityVideoFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$14.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$14.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("feed_activity_video_native", e.a, BaseFeed.class);
    }
}
