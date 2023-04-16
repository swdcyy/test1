package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$g;
import com.kwai.video.player.IKwaiMediaPlayer$OnLiveSeiInfoListener;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import u99.d;
import java.util.Iterator;
import java.lang.Iterable;
import t99.y;

public final class LiveAutoPlayModule$g implements IKwaiMediaPlayer$OnLiveSeiInfoListener	// class@001c04
{
    public final LiveAutoPlayModule a;

    public void LiveAutoPlayModule$g(LiveAutoPlayModule p0){
       this.a = p0;
       super();
    }
    public final void onSeiInfo(byte[] p0,int p1,int p2){
       if (PatchProxy.isSupport(LiveAutoPlayModule$g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LiveAutoPlayModule$g.class, "1")) {
          return;
       }
       LiveAutoPlayModule$g ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(LiveAutoPlayModule.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), ta, LiveAutoPlayModule.class, "55")) {
          HashMap hashMap = ta.Q();
          hashMap.put("data", String.valueOf(p0));
          hashMap.put("size", String.valueOf(p1));
          hashMap.put("payloadType", String.valueOf(p2));
          d.h("LiveAutoPlayModule", "notifySeiInfo", hashMap);
          Iterator iterator = ta.e.iterator();
          while (iterator.hasNext()) {
             iterator.next().onSeiInfo(p0, p1, p2);
          }
       }
       return;
    }
}
