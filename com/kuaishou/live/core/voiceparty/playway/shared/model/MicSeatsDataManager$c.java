package com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager$c;
import java.lang.Runnable;
import java.lang.Iterable;
import msd.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;

public final class MicSeatsDataManager$c implements Runnable	// class@001876
{
    public final Iterable b;
    public final l c;

    public void MicSeatsDataManager$c(Iterable p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MicSeatsDataManager$c.class, "1")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          this.c.invoke(iterator.next());
       }
       return;
    }
}
