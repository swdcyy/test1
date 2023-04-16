package com.kuaishou.live.gzone.v2.activity.g;
import erd.g;
import com.kuaishou.live.gzone.v2.activity.f;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;

public class g implements g	// class@001cbe
{
    public final f b;

    public void g(f p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else {
          a.C().e("LiveGzonePlayStationPresenter", "initTabSwitchListener", p0);
       }
       return;
    }
}
