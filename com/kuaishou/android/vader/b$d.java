package com.kuaishou.android.vader.b$d;
import java.lang.Runnable;
import com.kuaishou.android.vader.b;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.android.vader.Channel;
import java.lang.String;
import ar.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.Future;
import uq.a;

public class b$d implements Runnable	// class@000f6d
{
    public final MessageNano b;
    public final Channel c;
    public final String d;
    public final b e;
    public final b f;

    public void b$d(b p0,MessageNano p1,Channel p2,String p3,b p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, b$d.class, "1")) {
          return;
       }
       this.f.e.a(this.b, this.c, this.d, this.e);
       PatchProxy.onMethodExit(b$d.class, "1");
       return;
    }
}
