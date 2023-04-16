package com.yxcorp.gifshow.hot.spot.data.d;
import erd.g;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import gb5.a;
import java.util.Objects;

public final class d implements g	// class@00182a
{
    public final HotSpotFeedPageList$b b;

    public void d(HotSpotFeedPageList$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          Objects.requireNonNull(this.b.b);
          b.a(0x8708467).k("hot_spot", false);
       }
       return;
    }
}
