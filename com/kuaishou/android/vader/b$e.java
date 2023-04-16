package com.kuaishou.android.vader.b$e;
import java.util.concurrent.Callable;
import com.kuaishou.android.vader.b;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.android.vader.Channel;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.Future;
import uq.a;

public class b$e implements Callable	// class@000f6e
{
    public final MessageNano b;
    public final Channel c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final b g;

    public void b$e(b p0,MessageNano p1,Channel p2,String p3,boolean p4,boolean p5){
       this.g = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       super();
    }
    public Boolean a(){
       boolean b;
       Future obj = PatchProxy.applyWithListener(null, this, b$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g.e.b(this.b, this.c, this.d, this.e, this.f, true);
       if (obj == null) {
          PatchProxy.onMethodExit(b$e.class, "1");
          return Boolean.FALSE;
       }else if(this.g.i(obj, 500) != null){
          b = true;
       }else {
          b = false;
       }
       PatchProxy.onMethodExit(b$e.class, "1");
       return Boolean.valueOf(b);
    }
    public Object call(){
       return this.a();
    }
}
