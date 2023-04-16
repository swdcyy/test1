package com.frog.engine.view.FrogRender$b$a;
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

public class FrogRender$b$a implements Runnable	// class@001595
{
    public final Map$Entry a;
    public final FrogRender$b b;

    public void FrogRender$b$a(FrogRender$b p0,Map$Entry p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FrogRender$b$a.class, "1")) {
          return;
       }
       if (FrogRender.sFrogRenders.get(this.a.getKey()) != null && Boolean.FALSE.equals(this.b.a.get(this.a))) {
          FrogRender.handleAudioMute(this.a.getKey(), false);
       }
       FrogRender$b a = this.b.a;
       _monitor_enter(a);
       this.b.a.remove(this.a.getKey());
       _monitor_exit(a);
       return;
    }
}
