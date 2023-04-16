package dl9.b2;
import android.view.View$OnClickListener;
import dl9.f2;
import java.lang.Object;
import android.view.View;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import k2b.e0;
import yk9.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import dl9.e2;
import java.util.HashMap;
import java.lang.Integer;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import erd.g;
import com.yxcorp.gifshow.comment.utils.d;

public final class b2 implements View$OnClickListener	// class@001f4b
{
    public final f2 b;

    public void b2(f2 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b2 tb = this.b;
       if ((tb.t.getUserId()).equals(tb.s.getUser().getId())) {
          tb.u.z(tb.s, tb.v);
       }else {
          tb.u.y(tb.s, tb.v);
       }
       e2 b = e2.b;
       HashMap hashMap = new HashMap();
       hashMap.put("clickType", Integer.valueOf(47));
       Activity activity = tb.getActivity();
       f2 t = tb.t;
       f2 s = tb.s;
       User user = s.getUser();
       if (k.B(tb.t) == null) {
          b = 0;
       }
       d.i(activity, t, s, user, b, hashMap, tb.x);
       return;
    }
}
