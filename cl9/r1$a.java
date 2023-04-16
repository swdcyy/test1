package cl9.r1$a;
import com.yxcorp.gifshow.widget.m;
import cl9.r1;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wh5.c;
import com.kuaishou.android.model.mix.QComment;
import java.util.Objects;
import nk9.k;
import brd.y;
import lnc.i3;
import yk9.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;

public class r1$a extends m	// class@000661
{
    public final r1 c;

    public void r1$a(r1 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       r1 or1 = r1.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, r1$a.class, "1")) {
          return;
       }
       if (!c.c()) {
          return;
       }
       r1$a tc = this.c;
       r1 s = tc.s;
       if (s.mIsDislikeHideComment != null) {
          return;
       }
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(s, tc, or1, "5")) {
          tc.v.onNext(new k(s, false));
       }
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, or1, "4")) {
          i3 oi3 = i3.f();
          oi3.d("tips_content", tc.t.l());
          tc.t.A(tc.s, oi3.e(), tc.getActivity().N2(), false);
       }
       return;
    }
}
