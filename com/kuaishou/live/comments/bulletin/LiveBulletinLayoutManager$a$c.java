package com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$a$c;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$a;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$GiftSlotSize;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class LiveBulletinLayoutManager$a$c extends LiveBulletinLayoutManager$a	// class@000e3b
{

    public void LiveBulletinLayoutManager$a$c(LiveBulletinLayoutManager$GiftSlotSize p0){
       a.p(p0, "size");
       super(p0, null);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveBulletinLayoutManager$a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "BelowFocusArea\(size="+this.a()+')';
    }
}
