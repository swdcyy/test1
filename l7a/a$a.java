package l7a.a$a;
import jta.a;
import l7a.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.RecreationHotAreaHelper;

public class a$a extends a	// class@002d5b
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "2")) {
          return;
       }
       a$a ta = this.a;
       if (ta.w != null) {
          a s = ta.s;
          if (s != null) {
             s.i((ta.P8() ^ 0x01));
          }
       }
       return;
    }
    public void d(float p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       a$a ta = this.a;
       if (ta.w != null && !ta.P8()) {
          a s = this.a.s;
          if (s != null) {
             s.i(false);
             this.a.s.b();
          }
       }
       return;
    }
}
