package dl9.j2;
import android.view.View$OnClickListener;
import dl9.m2;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import com.yxcorp.gifshow.comment.utils.d;

public final class j2 implements View$OnClickListener	// class@001f70
{
    public final m2 b;

    public void j2(m2 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j2 tb = this.b;
       if (tb.s.getUser() == null) {
          User user = new User("", "", "", "", null);
       }else {
          User user1 = tb.s.getUser();
       }
       if ((tb.t.getUserId()).equals(v0.getId())) {
          tb.u.z(tb.s, f0.a(tb.v, tb.getActivity()));
       }else {
          tb.u.y(tb.s, f0.a(tb.v, tb.getActivity()));
       }
       m2 s = tb.s;
       d.h(tb.getActivity(), tb.t, s, s.getUser());
       return;
    }
}
