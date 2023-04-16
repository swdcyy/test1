package cl9.q1;
import erd.g;
import cl9.r1;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import java.lang.String;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import zic.f;
import e17.i;

public final class q1 implements g	// class@000658
{
    public final r1 b;
    public final QComment c;

    public void q1(r1 p0,QComment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       q1 tb = this.b;
       Objects.requireNonNull(tb);
       f.e(this.c.getUser().getId(), 0, tb.getActivity().Q2(), 0);
       i.a(R.style.arg_RES_7f110669, 0x7f10011b);
    }
}
