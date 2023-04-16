package com.kuaishou.live.lite.square.e;
import td3.o;
import com.kuaishou.live.lite.square.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import kd3.e;
import com.kuaishou.live.lite.square.d;
import erd.g;
import crd.b;
import lnc.b9;

public class e	// class@000b6b
{
    public final e$a a;
    public final o b;
    public b c;

    public void e(o p0,e$a p1){
       super();
       this.a = p1;
       this.b = p0;
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
       }else {
          this.c = p0.W().subscribe(new e(this), d.b);
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       b9.a(this.c);
       return;
    }
}
