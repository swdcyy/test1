package com.kuaishou.merchant.home2.channel.category.rnbridge.FeedCategoryRnBridge$b;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import fx3.b;

public final class FeedCategoryRnBridge$b implements Runnable	// class@0016f9
{
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public void FeedCategoryRnBridge$b(int p0,int p1,int p2,String p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, FeedCategoryRnBridge$b.class, "1")) {
          return;
       }
       RxBus.f.b(new b(this.b, this.c, this.d, this.e));
       return;
    }
}
