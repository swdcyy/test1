package com.kuaishou.merchant.home2.feed.model.FeedType$3;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import ay3.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.PhotoFeed;
import tw3.b;
import dz3.a;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.h;
import su.a;

public final class FeedType$3 extends FeedType	// class@0017a8
{

    public void FeedType$3(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new a();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$3.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhotoFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$3.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$3.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("video_component", h.a, PhotoFeed.class);
    }
}