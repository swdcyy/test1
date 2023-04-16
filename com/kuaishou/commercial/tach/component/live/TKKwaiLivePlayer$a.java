package com.kuaishou.commercial.tach.component.live.TKKwaiLivePlayer$a;
import java.lang.Runnable;
import com.kuaishou.commercial.tach.component.live.TKKwaiLivePlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class TKKwaiLivePlayer$a implements Runnable	// class@00166a
{
    public final TKKwaiLivePlayer b;

    public void TKKwaiLivePlayer$a(TKKwaiLivePlayer p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, TKKwaiLivePlayer$a.class, "1")) {
          return;
       }
       this.b.destroyOnUIThread();
       return;
    }
}
