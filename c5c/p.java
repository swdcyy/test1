package c5c.p;
import erd.g;
import com.yxcorp.gifshow.profile.presenter.profile.page.dialog.j;
import java.lang.Object;
import java.lang.Long;
import com.kwai.framework.model.user.User;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import s1c.j1;
import u3c.b;
import mrd.a;
import io.reactivex.subjects.PublishSubject;

public final class p implements g	// class@00052f
{
    public final j b;

    public void p(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p tb = this.b;
       if (tb.q.isFollowingOrFollowRequesting()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f101034);
       }else {
          tb.p.g.onNext(new b(false, tb.getActivity().Q2()));
          tb.p.h.onNext(new Object());
       }
       return;
    }
}
