package c05.c;
import android.view.View$OnClickListener;
import com.kuaishou.tuna_core.multi_web_page.view.TunaMultiWebTitleView;
import android.app.Activity;
import com.kuaishou.tuna_core.multi_web_page.presenter.TunaMultiWebTitlePresenter;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo$TabInfo;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.tuna_core.multi_web_page.model.a;
import android.util.Pair;
import io.reactivex.subjects.PublishSubject;
import java.util.Objects;
import java.lang.Integer;
import java.util.List;
import java.util.Iterator;
import d05.a;

public final class c implements View$OnClickListener	// class@0003f8
{
    public final TunaMultiWebTitleView b;
    public final boolean c;
    public final Activity d;
    public final TunaMultiWebTitlePresenter e;
    public final TunaMultiWebConfigInfo$TabInfo f;
    public final int g;

    public void c(TunaMultiWebTitleView p0,boolean p1,Activity p2,TunaMultiWebTitlePresenter p3,TunaMultiWebConfigInfo$TabInfo p4,int p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void onClick(View p0){
       c tb;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       if (this.c != null) {
          c te = this.e;
          if (te.u != this.g) {
             TunaMultiWebTitlePresenter t = te.t;
             if (t != null) {
                tb = this.b;
                c tf = this.f;
                if (!PatchProxy.applyVoidTwoRefs(tb, tf, t, a.class, "3")) {
                   t.b.onNext(new Pair(tb, tf));
                }
             }
             te = this.e;
             tb = this.g;
             Objects.requireNonNull(te);
             TunaMultiWebTitlePresenter tunaMultiWeb = TunaMultiWebTitlePresenter.class;
             if (!PatchProxy.isSupport(tunaMultiWeb) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(tb), te, tunaMultiWeb, "6")) {
                Iterator iterator = te.R8().iterator();
                while (iterator.hasNext()) {
                   a uoa = iterator.next();
                   boolean b = (uoa.getPos() == tb)? true: false;
                   uoa.c(b);
                }
             }
             this.e.V8(this.f);
             this.e.S8(this.f, "INITIATIVE");
             te.u = this.g;
          }
       }
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
