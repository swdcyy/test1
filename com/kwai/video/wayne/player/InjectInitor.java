package com.kwai.video.wayne.player.InjectInitor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;

public class InjectInitor	// class@000ca0
{
    public Runnable minitRunable;
    public static final InjectInitor injectInitor;

    static {
       InjectInitor.injectInitor = new InjectInitor();
    }
    public void InjectInitor(){
       super();
       this.minitRunable = null;
    }
    public static InjectInitor getInstance(){
       return InjectInitor.injectInitor;
    }
    public void initRun(){
       if (PatchProxy.applyVoid(null, this, InjectInitor.class, "1")) {
          return;
       }
       InjectInitor tminitRunabl = this.minitRunable;
       if (tminitRunabl != null) {
          tminitRunabl.run();
       }
       return;
    }
    public void injectInitorRunable(Runnable p0){
       this.minitRunable = p0;
    }
}
