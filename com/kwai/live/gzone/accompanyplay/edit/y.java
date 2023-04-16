package com.kwai.live.gzone.accompanyplay.edit.y;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.v;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class y implements g	// class@000c23
{
    public final v b;

    public void y(v p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
       }else {
          b.I(LiveLogTag.GZONE, "FleetEditGameSdkchangeFleetSetting", p0);
       }
       return;
    }
}
