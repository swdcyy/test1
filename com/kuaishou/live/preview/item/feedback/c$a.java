package com.kuaishou.live.preview.item.feedback.c$a;
import d6a.a;
import com.kuaishou.live.preview.item.feedback.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sk3.j;
import java.lang.Runnable;
import ekd.k1;

public class c$a extends a	// class@000de4
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       if (tb.s != null) {
          tb.s = false;
          k1.r(new j(this), 0);
       }
       return;
    }
}
