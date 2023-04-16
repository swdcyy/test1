package com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$a;
import com.kuaishou.live.comments.bulletin.LiveBulletinLayoutManager$GiftSlotSize;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public abstract class LiveBulletinLayoutManager$a	// class@000e3c
{
    public final LiveBulletinLayoutManager$GiftSlotSize a;

    public void LiveBulletinLayoutManager$a(LiveBulletinLayoutManager$GiftSlotSize p0){
       super();
       this.a = p0;
    }
    public void LiveBulletinLayoutManager$a(LiveBulletinLayoutManager$GiftSlotSize p0,u p1){
       super(p0);
    }
    public final LiveBulletinLayoutManager$GiftSlotSize a(){
       return this.a;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveBulletinLayoutManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AcrossFocusArea\(size="+this.a+')';
    }
}
