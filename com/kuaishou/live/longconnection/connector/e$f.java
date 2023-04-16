package com.kuaishou.live.longconnection.connector.e$f;
import java.lang.Runnable;
import com.kuaishou.live.longconnection.connector.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.longconnection.connector.b;

public class e$f implements Runnable	// class@000c65
{
    public final e b;

    public void e$f(e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$f.class, "1")) {
          return;
       }
       this.b.c.m();
       return;
    }
}
