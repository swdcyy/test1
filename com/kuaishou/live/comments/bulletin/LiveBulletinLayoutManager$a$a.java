package com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$a$a;
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

public final class LiveBulletinLayoutManager$a$a extends LiveBulletinLayoutManager$a	// class@000e39
{
    public final int b;

    public void LiveBulletinLayoutManager$a$a(LiveBulletinLayoutManager$GiftSlotSize p0,int p1){
       a.p(p0, "size");
       super(p0, null);
       this.b = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveBulletinLayoutManager$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AboveFocusArea\(size="+this.a()+", extraBottomSpace="+this.b+')';
    }
}
