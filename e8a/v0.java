package e8a.v0;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.j;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.utils.d;
import com.yxcorp.retrofit.model.KwaiException;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import e17.i;
import com.yxcorp.gifshow.comment.e$g;
import ek9.d1;

public class v0 implements e$c	// class@0020de
{
    public final e$c a;
    public final j b;

    public void v0(j p0,e$c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(QComment p0,Throwable p1){
       boolean b = PatchProxy.applyVoidTwoRefs(p0, p1, this, v0.class, "3");
       if (b) {
          return;
       }
       v0 tb = this.b;
       tb.l = false;
       tb = this.a;
       if (tb != null) {
          tb.a(p0, p1);
       }
       if (this.b.k != null && !d.l(p1)) {
          if (p1 instanceof KwaiException) {
             String str = (TextUtils.x(p1.getMessage()))? a1.p(R.string.arg_RES_7f1038e5): p1.getMessage();
             i.d(R.style.arg_RES_7f11066a, str);
          }else {
             i.a(R.style.arg_RES_7f11066a, 0x7f1038e5);
          }
       }
       return;
    }
    public void b(QComment p0,e$g p1){
       boolean b = PatchProxy.applyVoidTwoRefs(p0, p1, this, v0.class, "2");
       if (b) {
          return;
       }
       v0 tb = this.b;
       tb.h = null;
       tb.i = null;
       tb.j = null;
       tb.l = false;
       tb = this.a;
       if (tb != null) {
          tb.b(p0, p1);
       }
       return;
    }
    public void c(){
       boolean b = PatchProxy.applyVoid(null, this, v0.class, "1");
       if (b) {
          return;
       }
       v0 ta = this.a;
       if (ta != null) {
          ta.c();
       }
       return;
    }
    public void d(QComment p0,Throwable p1){
       d1.d(this, p0, p1);
    }
}
