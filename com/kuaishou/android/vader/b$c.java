package com.kuaishou.android.vader.b$c;
import java.lang.Runnable;
import com.kuaishou.android.vader.b;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.android.vader.Channel;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ar.b;
import java.util.concurrent.Future;
import uq.a;

public class b$c implements Runnable	// class@000709
{
    public final MessageNano b;
    public final Channel c;
    public final String d;
    public final b e;

    public void b$c(b p0,MessageNano p1,Channel p2,String p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, b$c.class, "1")) {
          return;
       }
       this.e.e.a(this.b, this.c, this.d, null);
       PatchProxy.onMethodExit(b$c.class, "1");
       return;
    }
}
