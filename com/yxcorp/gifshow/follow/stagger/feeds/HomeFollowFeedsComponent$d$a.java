package com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$d$a;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import tga.a;

public final class HomeFollowFeedsComponent$d$a implements Runnable	// class@001188
{
    public static final HomeFollowFeedsComponent$d$a b;

    static {
       HomeFollowFeedsComponent$d$a.b = new HomeFollowFeedsComponent$d$a();
    }
    public void HomeFollowFeedsComponent$d$a(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, HomeFollowFeedsComponent$d$a.class, "1")) {
          return;
       }
       RxBus.f.b(new a());
       return;
    }
}
