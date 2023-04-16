package cl9.l1;
import android.content.DialogInterface$OnCancelListener;
import cl9.r1;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import nk9.d;
import com.kuaishou.android.model.mix.QComment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import yk9.d;

public final class l1 implements DialogInterface$OnCancelListener	// class@000644
{
    public final r1 b;

    public void l1(r1 p0){
       this.b = p0;
    }
    public final void onCancel(DialogInterface p0){
       l1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, r1.class, "17")) {
       }else {
          RxBus.f.b(new d(false));
          if (tb.R8(tb.s)) {
             tb.t.k("CLOSE_COMMENT_PANEL", tb.s, tb.getActivity().N2());
          }
       }
       return;
    }
}
