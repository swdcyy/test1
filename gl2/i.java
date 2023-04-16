package gl2.i;
import gl2.f;
import fq5.b;
import fl2.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import gl2.i$a;
import erd.g;
import crd.b;

public final class i extends f	// class@002b46
{
    public final b b;
    public final a c;
    public final boolean d;
    public final int e;
    public final String f;

    public void i(b p0,a p1,boolean p2,int p3,String p4){
       a.p(p0, "liveBasicContext");
       a.p(p1, "tipService");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       if (this.e >= null && !TextUtils.isEmpty(this.f)) {
          i tf = this.f;
          a.m(tf);
          this.e(this.e, tf);
       }
       return;
    }
    public final void e(int p0,String p1){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oi, "3")) {
          return;
       }
       b uob = t.timer((long)p0, TimeUnit.SECONDS).observeOn(d.a).subscribe(new i$a(this, p1));
       a.o(uob, "Observable.timer\(thresho¡­imeReach\(token\)\n        }");
       this.b(uob);
       return;
    }
}
