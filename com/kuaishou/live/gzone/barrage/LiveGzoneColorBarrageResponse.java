package com.kuaishou.live.gzone.barrage.LiveGzoneColorBarrageResponse;
import java.io.Serializable;
import mkd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import ekd.q;
import com.kwai.live.gzone.barrage.LiveGzoneColorBarrageRight;
import lnc.a1;
import java.util.List;

public class LiveGzoneColorBarrageResponse implements Serializable, a	// class@001c2d
{
    public List mColorBarrageRightList;
    public boolean mHasColorBarrage;
    public static final long serialVersionUID = 0xd37f513359522b17;

    public void LiveGzoneColorBarrageResponse(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneColorBarrageResponse.class, "1")) {
          return;
       }
       if (!q.f(this.mColorBarrageRightList)) {
          LiveGzoneColorBarrageRight liveGzoneCol = new LiveGzoneColorBarrageRight();
          liveGzoneCol.mColorName = a1.p(0x7f10075f);
          liveGzoneCol.mColorValue = "#FFFFFF";
          this.mColorBarrageRightList.add(0, liveGzoneCol);
       }
       return;
    }
}
