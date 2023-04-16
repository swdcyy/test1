package br7.c;
import rq7.a;
import jh5.a;
import pp7.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp7.b;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import java.lang.StringBuilder;

public final class c extends a	// class@000451
{
    public final a d;
    public final a e;
    public final a f;

    public void c(){
       super(null);
    }
    public void c(a p0){
       super();
       this.d = new a(p0);
       this.e = new a(p0);
       this.f = new a(p0);
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       String str = TextUtils.I(this.d.a());
       String str1 = this.e.a();
       if (TextUtils.x(str1)) {
          this.f.f(str);
       }else {
          this.f.f(str+" ¡¤ "+str1);
       }
       return;
    }
}
