package com.kuaishou.live.preview.item.winter.a$a;
import d6a.a;
import com.kuaishou.live.preview.item.winter.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$a extends a	// class@000e60
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       a$a tb = this.b;
       tb.u = false;
       tb.R8();
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       tb.u = true;
       tb.P8();
       return;
    }
}
