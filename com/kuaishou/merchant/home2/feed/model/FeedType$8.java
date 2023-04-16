package com.kuaishou.merchant.home2.feed.model.FeedType$8;
import com.kuaishou.merchant.home2.feed.model.FeedType;
import java.lang.String;
import com.kuaishou.merchant.home2.feed.model.FeedType$1;
import com.kuaishou.bowl.core.component.NativeComponent;
import wx3.a;
import com.kuaishou.merchant.home2.feed.model.BaseFeed;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.home2.feed.model.BrandReservationCardFeed;
import tw3.b;
import xy3.b;
import kx3.b;
import com.kuaishou.merchant.home2.feed.model.m;
import su.a;

public final class FeedType$8 extends FeedType	// class@0017ad
{

    public void FeedType$8(String p0,int p1,int p2){
       super(p0, p1, p2, null);
    }
    public static NativeComponent lambda$getDynamicRegisterModel$0(){
       return new a();
    }
    public BaseFeed createFeed(){
       Object obj = PatchProxy.apply(null, this, FeedType$8.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BrandReservationCardFeed();
    }
    public b createPresenterHolderCreator(){
       Object obj = PatchProxy.apply(null, this, FeedType$8.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
    public b getDynamicRegisterModel(){
       Object obj = PatchProxy.apply(null, this, FeedType$8.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b("brand_foreshow_component", m.a, BrandReservationCardFeed.class);
    }
}
