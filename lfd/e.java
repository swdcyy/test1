package lfd.e;
import lfd.b;
import android.content.Context;
import java.lang.Object;
import com.yxcorp.plugin.search.template.modular.widget.SearchTemplateButton;
import com.yxcorp.plugin.search.entity.template.base.JCAladdinFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import med.a;
import java.util.Objects;
import android.view.View;
import nfd.m0$a;
import nfd.o3;
import nfd.m0;
import ufd.l;
import nfd.n0;
import fw5.a;

public class e implements b	// class@001c2e
{
    public SearchTemplateButton a;
    public View b;

    public void e(Context p0){
       super();
       this.a = new SearchTemplateButton(p0);
    }
    public void a(JCAladdinFeed p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       this.a.b.a(a1.p(R.string.arg_RES_7f1017d4));
       Objects.requireNonNull(this.a.b);
       this.a.b.d(0);
       p0 = p0.mJoinResponse;
       e tb = this.b;
       if (tb != null) {
          tb.setVisibility(8);
       }
       m0$a uoa = new m0$a();
       uoa.f(R.drawable.arg_RES_7f081e90);
       uoa.b(1);
       uoa.c(0);
       n0.b(this.a.b, uoa.a());
       if (p0 != null) {
          a a = p0.a;
          if (a != 1) {
             if (a != 2) {
                this.b();
             }else {
                this.a.b.k(0);
                this.a.b.i(1);
                this.a.b.a(a1.p(R.string.arg_RES_7f100216));
                this.a.b.f(0);
                this.a.b.d(8);
             }
          }else {
             e tb1 = this.b;
             if (tb1 != null) {
                tb1.setVisibility(0);
             }
             this.a.b.k(8);
          }
       }else {
          this.b();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.a.b.a(a1.p(R.string.arg_RES_7f1017d4));
       this.a.b.f(true);
       this.a.b.d(0);
       this.a.b.i(0);
       this.a.b.k(0);
       return;
    }
    public View getView(){
       return this.a;
    }
}
