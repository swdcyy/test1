package dl9.c2;
import android.view.View$OnClickListener;
import dl9.f2;
import java.lang.Object;
import android.view.View;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import com.google.common.base.Optional;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import com.yxcorp.gifshow.comment.utils.d;

public final class c2 implements View$OnClickListener	// class@001f51
{
    public final f2 b;

    public void c2(f2 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c2 tb = this.b;
       User user = new User("", "", "", "", null);
       if (TextUtils.n(tb.t.getUserId(), Optional.fromNullable(tb.s.getUser()).or(v7).getId())) {
          tb.u.z(tb.s, f0.a(tb.v, tb.getActivity()));
       }else {
          tb.u.y(tb.s, f0.a(tb.v, tb.getActivity()));
       }
       f2 s = tb.s;
       User user1 = new User(s.mReplyToUserId, s.mReplyToUserName, null, null, null);
       d.h(tb.getActivity(), tb.t, tb.s, v9);
       return;
    }
}
