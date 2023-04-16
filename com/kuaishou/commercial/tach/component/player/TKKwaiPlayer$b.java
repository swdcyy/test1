package com.kuaishou.commercial.tach.component.player.TKKwaiPlayer$b;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.component.player.TKKwaiPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKKwaiPlayer$b implements Runnable	// class@00166d
{
    public final TKKwaiPlayer b;

    public void TKKwaiPlayer$b(TKKwaiPlayer p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKKwaiPlayer$b.class, "1")) {
          return;
       }
       this.b.destroyOnUIThread();
       return;
    }
}
