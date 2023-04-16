package a2c.a$c;
import erd.g;
import a2c.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.io.File;
import r16.d;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import a2c.f;
import a2c.g;
import crd.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.fragment.ProgressFragment;

public final class a$c implements g	// class@000035
{
    public final a b;
    public final GifshowActivity c;

    public void a$c(a p0,GifshowActivity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       int i = p0.intValue();
       a$c uoc = a$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uoc, "1")) {
          if (i == 100) {
             this.b.a();
             i = this.b;
             uoc = this.c;
             Objects.requireNonNull(i);
             if (!PatchProxy.applyVoidOneRefs(uoc, i, a.class, "6")) {
                a d = i.d;
                if (d != null && d.exists() == true) {
                   i.f = y6.s(d.class, LoadPolicy.DIALOG).R(new f(i, d, uoc), g.b);
                }
             }
          }else {
             a c = this.b.c;
             if (c != null) {
                a.m(c);
                c.Nh(i);
             }
          }
       }
       return;
    }
}
