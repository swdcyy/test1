package gra.b$a$a;
import erd.a;
import gra.b$a;
import brd.v;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.g;
import com.kwai.library.widget.popup.common.c;
import gra.h;
import com.yxcorp.gifshow.growth.vfc.GrowthVfcUtilKt;

public final class b$a$a implements a	// class@002ba1
{
    public final b$a b;
    public final v c;

    public void b$a$a(b$a p0,v p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b$a$a.class, "1")) {
          return;
       }
       this.c.onNext(Boolean.TRUE);
       this.c.onComplete();
       c uoc = this.b.b.X8();
       if (uoc != null) {
          GrowthVfcUtilKt.a(uoc);
       }
       return;
    }
}
