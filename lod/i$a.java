package lod.i$a;
import erd.g;
import bod.a;
import lod.i;
import brd.v;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;
import java.lang.RuntimeException;

public final class i$a implements g	// class@001c83
{
    public final a b;
    public final i c;
    public final v d;

    public void i$a(a p0,i p1,v p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i$a.class, "1")) {
       }else {
          i$a uoa = 200;
          if (p0 != null && p0.intValue() == uoa) {
             this.d.onNext(this.b);
          }else {
             String str = -2;
             if (p0 != null && p0.intValue() == str) {
                PatchProxy.onMethodExit(i$a.class, "1");
                throw new RuntimeException("downloadFonts Failed");
             }
          }
          PatchProxy.onMethodExit(i$a.class, "1");
       }
       return;
    }
}
