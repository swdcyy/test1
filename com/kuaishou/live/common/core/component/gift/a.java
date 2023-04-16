package com.kuaishou.live.common.core.component.gift.a;
import com.kuaishou.live.common.core.component.gift.GiftAnimContainerView$j;
import com.kuaishou.live.common.core.component.gift.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import android.os.SystemClock;
import pp.c;
import com.kuaishou.android.live.log.b;

public class a implements GiftAnimContainerView$j	// class@001137
{
    public final long b;
    public final GiftAnimContainerView$j c;
    public final d d;

    public void a(d p0,long p1,GiftAnimContainerView$j p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       b.Z(LiveLogTag.GIFT, "Duration:"+(SystemClock.elapsedRealtime() - this.b));
       this.c.a();
       return;
    }
}
