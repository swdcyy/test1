package com.kuaishou.live.preview.item.presenter.c$a;
import d6a.a;
import com.kuaishou.live.preview.item.presenter.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$a extends a	// class@000e15
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "2")) {
          return;
       }
       c$a tb = this.b;
       tb.x = false;
       tb.P8(true);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       c$a tb = this.b;
       tb.x = true;
       tb.V8();
       return;
    }
}
