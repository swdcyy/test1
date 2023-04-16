package com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager$d;
import z1.k;
import com.kuaishou.live.lite.adapter.component.gift.LiveLiteGiftManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;

public final class LiveLiteGiftManager$d implements k	// class@001da2
{
    public final LiveLiteGiftManager b;

    public void LiveLiteGiftManager$d(LiveLiteGiftManager p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Object[] objArray = null;
       Object[] objArray1 = PatchProxy.apply(objArray, this, LiveLiteGiftManager$d.class, "1");
       if (objArray1 != PatchProxyResult.class) {
       }else if(this.b.J.j0() != null){
          objArray = new LiveStreamFeedWrapper(this.b.J.j0());
       }
       objArray1 = objArray;
       return objArray1;
    }
}
