package com.kuaishou.merchant.home2.feed.model.FeedType$5;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import by3.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.ReservationFeed;
import tw3.b;
import fz3.h;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.j;
import su.a;

public final class FeedType$5 extends FeedType	// class@0017aa
{

    public void FeedType$5(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new a();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$5.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReservationFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$5.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$5.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("live_foreshow_component", j.a, ReservationFeed.class);
    }
}
