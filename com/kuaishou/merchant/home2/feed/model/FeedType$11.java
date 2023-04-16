package com.kuaishou.merchant.home2.feed.model.FeedType$11;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import rx3.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.stream.reservation.activity.model.ActivityReservationFeed;
import tw3.b;
import gz3.d;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.b;
import su.a;

public final class FeedType$11 extends FeedType	// class@0017a0
{

    public void FeedType$11(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new a();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$11.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ActivityReservationFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$11.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$11.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("activity_reservation_component", b.a, ActivityReservationFeed.class);
    }
}
