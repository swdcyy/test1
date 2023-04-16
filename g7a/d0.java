package g7a.d0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.d;
import java.lang.Object;
import rd5.g;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import mrd.a;
import com.yxcorp.gifshow.entity.QPhoto;
import e17.i;

public final class d0 implements g	// class@0023d2
{
    public final d b;

    public void d0(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "6")) {
       }else {
          tb.U = p0;
          p0 = p0.c;
          tb.T = p0;
          if (p0 != 10) {
             tb.t.onNext(Integer.valueOf(0));
          }else {
             tb.q = true;
          }
          if (tb.T != 2 || (tb.x.numberOfLike() <= 0 || (tb.T == 11 && tb.x.numberOfCollects() <= 0))) {
             i.a(R.style.arg_RES_7f11066a, 0x7f1004bd);
          }else {
             tb.W8();
          }
       }
       return;
    }
}
