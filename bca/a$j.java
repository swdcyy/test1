package bca.a$j;
import erd.g;
import bca.a;
import brd.v;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public final class a$j implements g	// class@000453
{
    public final a b;
    public final v c;

    public void a$j(a p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$j.class, "1")) {
       }else if(this.b.h == null && p0.intValue() < 100){
          this.c.onNext(p0);
       }
       return;
    }
}
