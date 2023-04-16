package com.facebook.react.a$e$a;
import java.lang.Runnable;
import com.facebook.react.a$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.a;
import ae.e;
import me.a;

public class a$e$a implements Runnable	// class@001173
{
    public final boolean b;
    public final a$e c;

    public void a$e$a(a$e p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$e$a.class, "1")) {
          return;
       }
       if (this.b != null) {
          this.c.b.j.F();
       }else if(this.c.b.j.r() && !this.c.a.i()){
          this.c.b.F();
       }else {
          this.c.a.b(false);
          this.c.b.L();
       }
       return;
    }
}
