package com.kwai.live.gzone.accompanyplay.edit.b0;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.a0;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class b0 implements g	// class@000bda
{
    public final a0 b;

    public void b0(a0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b0.class, "1")) {
       }else {
          b.c0(LiveLogTag.LIVE_GZONE_ACCOMPANY, "onFleetSettingContext", "accept: ", p0);
       }
       return;
    }
}
