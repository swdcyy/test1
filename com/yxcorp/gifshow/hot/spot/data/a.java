package com.yxcorp.gifshow.hot.spot.data.a;
import erd.g;
import com.yxcorp.gifshow.hot.spot.data.HotSpotFeedPageList$b;
import java.lang.Object;
import crd.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import gb5.a;
import java.util.Objects;

public final class a implements g	// class@001827
{
    public final HotSpotFeedPageList$b b;

    public void a(HotSpotFeedPageList$b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          Objects.requireNonNull(this.b.b);
          b.a(0x8708467).m("hot_spot");
       }
       return;
    }
}
