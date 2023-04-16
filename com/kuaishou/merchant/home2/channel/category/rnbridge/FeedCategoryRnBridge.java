package com.kuaishou.merchant.home2.channel.category.rnbridge.FeedCategoryRnBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.home2.channel.category.rnbridge.FeedCategoryRnBridge$a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import com.kuaishou.merchant.home2.channel.category.rnbridge.FeedCategoryRnBridge$b;

public final class FeedCategoryRnBridge extends KrnBridge	// class@0016fa
{

    public void FeedCategoryRnBridge(ReactApplicationContext p0){
       super(p0);
    }
    public final void closeFeedCategoryRnView(Promise p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedCategoryRnBridge.class, "2")) {
          return;
       }
       k1.o(FeedCategoryRnBridge$a.b);
       p0.resolve(Integer.valueOf(0));
       return;
    }
    public String getName(){
       return "MerchantHomeFeedCategory";
    }
    public final void selectFeedCategory(int p0,int p1,int p2,String p3,Promise p4){
       FeedCategoryRnBridge uFeedCategor = FeedCategoryRnBridge.class;
       if (PatchProxy.isSupport(uFeedCategor)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uFeedCategor, "1")) {
             return;
          }
       }
       k1.o(new FeedCategoryRnBridge$b(p0, p1, p2, p3));
       p4.resolve(Integer.valueOf(0));
       return;
    }
}
