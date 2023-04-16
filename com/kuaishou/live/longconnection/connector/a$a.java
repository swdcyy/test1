package com.kuaishou.live.longconnection.connector.a$a;
import lf3.b;
import com.kuaishou.live.longconnection.connector.a;
import brd.v;
import com.kuaishou.live.longconnection.exception.ClientException;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.kuaishou.live.longconnection.exception.LiveLongConnectionServerException;
import com.kuaishou.live.longconnection.exception.ChannelException;

public class a$a extends b	// class@000c5a
{
    public final v a;
    public final a b;

    public void a$a(a p0,v p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(ClientException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       this.b.a(this.a, p0);
       return;
    }
    public void e(LiveLongConnectionServerException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.b.a(this.a, p0);
       return;
    }
    public void j(ChannelException p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "2")) {
          return;
       }
       this.b.a(this.a, p0);
       return;
    }
}
