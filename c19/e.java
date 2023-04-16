package c19.e;
import com.yxcorp.gifshow.ad.detail.presenter.ordered.AdBaseOrderedAppLabelPresenter;
import c19.e$a;
import nsd.u;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import c19.e$b;
import c19.e$c;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import ekd.p1;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import io.reactivex.subjects.PublishSubject;

public final class e extends AdBaseOrderedAppLabelPresenter	// class@0004c8
{
    public PublishSubject x;
    public static final e$a y;

    static {
       e.y = new e$a(null);
    }
    public void e(){
       super();
    }
    public void R8(ViewGroup p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       a.p(p0, "operateLayout");
       e tx = this.x;
       if (tx == null) {
          a.S("mScreenVisibilityPublisher");
       }
       this.X7(tx.subscribe(new e$b(p0), e$c.b));
       return;
    }
    public void S8(Activity p0,ViewGroup p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "5")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "operateLayout");
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
       layoutParams.leftMargin = a1.d(0x7f070271);
       layoutParams.bottomMargin = a1.d(0x7f070334);
       p1.addView(p1.g(p0, R.layout.arg_RES_7f0d0068), 0, layoutParams);
       return;
    }
    public int W8(){
       return 0x7f0a3ea3;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.r8("DETAIL_SLIDE_SCREEN_VISIBILITY_EVENT");
       a.o(obj, "inject\(AccessIds.DETAIL_бн_SCREEN_VISIBILITY_EVENT\)");
       this.x = obj;
       return;
    }
}
