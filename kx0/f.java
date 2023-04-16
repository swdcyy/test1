package kx0.f;
import m0d.a;
import brd.v;
import android.util.Pair;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import java.lang.StringBuilder;
import brd.g;
import java.lang.Integer;

public class f extends a	// class@002e15
{
    public final v b;
    public final Pair c;
    public final Drawable[] d;

    public void f(v p0,Pair p1,Drawable[] p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       if (p0 == null) {
          this.b.onError(new Throwable("preload failed, image request: "+this.c.second));
          return;
       }else {
          this.d[this.c.first.intValue()] = p0;
          this.b.onComplete();
          return;
       }
    }
}
