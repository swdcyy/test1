package i6a.o$f;
import erd.g;
import i6a.o;
import java.lang.Object;
import ve5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelsGroup;
import java.util.List;

public final class o$f implements g	// class@0027a5
{
    public final o b;

    public void o$f(o p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, o$f.class, "1")) {
       }else {
          this.b.X8();
          o$f tb = this.b;
          o.V8(this.b).a(o.S8(this.b).subList(tb.B, tb.C));
          PatchProxy.onMethodExit(o$f.class, "1");
       }
       return;
    }
}
