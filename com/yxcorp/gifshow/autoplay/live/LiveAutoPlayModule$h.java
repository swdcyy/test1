package com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule$h;
import com.kwai.video.player.IMediaPlayer$OnVideoSizeChangedListener;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.video.waynelive.LivePlayerController;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;
import u99.d;
import java.util.Iterator;
import java.lang.Iterable;
import t99.y;

public final class LiveAutoPlayModule$h implements IMediaPlayer$OnVideoSizeChangedListener	// class@001c05
{
    public final LiveAutoPlayModule b;

    public void LiveAutoPlayModule$h(LiveAutoPlayModule p0){
       this.b = p0;
       super();
    }
    public final void onVideoSizeChanged(IMediaPlayer p0,int p1,int p2,int p3,int p4){
       LiveAutoPlayModule$h oh = LiveAutoPlayModule$h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, oh, "1")) {
             return;
          }
       }
       LiveAutoPlayModule$h tb = this.b;
       LiveAutoPlayModule k = tb.k;
       p4 = -1;
       k = (k != null)? k.getCurrentLiveStreamType(): -1;
       tb.Y(p1, p2, k);
       tb = this.b;
       k = tb.k;
       if (k != null) {
          p4 = k.getCurrentLiveStreamType();
       }
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(LiveAutoPlayModule.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p4), tb, LiveAutoPlayModule.class, "52")) {
          HashMap hashMap = tb.Q();
          hashMap.put("width", String.valueOf(p1));
          hashMap.put("height", String.valueOf(p2));
          hashMap.put("type", String.valueOf(p4));
          d.h("LiveAutoPlayModule", "notifyVideoSizeChangeListener", hashMap);
          Iterator iterator = tb.e.iterator();
          while (iterator.hasNext()) {
             iterator.next().c(p1, p2, p4);
          }
       }
       return;
    }
}
