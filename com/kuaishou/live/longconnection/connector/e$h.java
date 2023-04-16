package com.kuaishou.live.longconnection.connector.e$h;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.e;
import com.kuaishou.live.longconnection.connector.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class e$h implements Runnable	// class@000c67
{
    public final l b;
    public final e c;

    public void e$h(e p0,l p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$h.class, "1")) {
          return;
       }
       this.c.n(this.b);
       return;
    }
}
