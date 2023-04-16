package com.frog.engine.view.FrogRender$b$b;
import java.lang.Runnable;
import com.frog.engine.view.FrogRender$b;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.frog.engine.view.FrogRender;
import java.util.Map;
import java.lang.Boolean;
import java.util.HashMap;

public class FrogRender$b$b implements Runnable	// class@001596
{
    public final Map$Entry a;
    public final FrogRender$b b;

    public void FrogRender$b$b(FrogRender$b p0,Map$Entry p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$b$b.class, "1")) {
          return;
       }
       if (FrogRender.sFrogRenders.get(this.a.getKey()) != null) {
          FrogRender$b a = this.b.a;
          _monitor_enter(a);
          this.b.a.put(this.a.getKey(), Boolean.valueOf(FrogRender.isAudioMute(this.a.getKey())));
          _monitor_exit(a);
          FrogRender.handleAudioMute(this.a.getKey(), true);
       }
       return;
    }
}
