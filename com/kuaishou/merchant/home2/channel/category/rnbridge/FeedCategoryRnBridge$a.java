package com.kuaishou.merchant.home2.channel.category.rnbridge.FeedCategoryRnBridge$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import fx3.a;

public final class FeedCategoryRnBridge$a implements Runnable	// class@0016f8
{
    public static final FeedCategoryRnBridge$a b;

    static {
       FeedCategoryRnBridge$a.b = new FeedCategoryRnBridge$a();
    }
    public void FeedCategoryRnBridge$a(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FeedCategoryRnBridge$a.class, "1")) {
          return;
       }
       RxBus.f.b(new a());
       return;
    }
}
