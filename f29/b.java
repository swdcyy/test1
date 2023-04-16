package f29.b;
import erd.g;
import f29.c;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hy.e;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import qp7.t0;
import qp7.b;
import w19.e;
import e17.i;
import rd5.g;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import p1a.a$a;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a;

public final class b implements g	// class@00228c
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, c.class, "3")) {
       }else {
          p0 = e.G();
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(objArray, p0, e.class, "22") && p0.F()) {
             p0.t = 1;
          }
          if (!VisitorModeManager.g(3)) {
             if (tb.H().B()) {
                i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
             }else {
                p0 = new g(1, objArray);
                if (tb.t.numberOfComments() <= 0 && tb.n0()) {
                   p0.g = true;
                   p0.h = tb.t;
                }
                tb.H().N.onNext(p0);
                a$a uoa = a$a.a(1744, "µã»÷ÆÀÂÛ°´Å¥");
                i3 oi3 = i3.f();
                oi3.c("comments_cnt", Integer.valueOf(tb.t.numberOfComments()));
                uoa.m(oi3.e());
                uoa.f("CLICK_COMMENT_BUTTON");
                uoa.r(1);
                uoa.j(tb.t.getFeedLogCtx());
                tb.w.a(uoa);
             }
          }
       }
       return;
    }
}
