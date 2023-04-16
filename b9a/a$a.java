package b9a.a$a;
import d6a.a;
import b9a.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import qvb.i;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.slide.base.widget.d;

public class a$a extends a	// class@000422
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void i2(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = a.class;
       if (!PatchProxy.applyVoid(objArray, tb, uoa, "4")) {
          a obj = PatchProxy.apply(objArray, tb, uoa, "5");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = tb.q;
             if (obj != null && !obj.d1().isEmpty()) {
                uoa = tb.q;
                if (tb.s.getCurrentPhoto() == uoa.getItem((uoa.d1().size() - true))) {
                   b = true;
                }
             }
             b = false;
          }
          if (b && !tb.q.hasMore()) {
             tb.t.d(true, false);
          }
       }
    label_0067 :
       return;
    }
}
