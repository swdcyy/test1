package d5c.n;
import erd.g;
import d5c.g0;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import z5c.y2;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import java.lang.String;
import android.util.SparseArray;
import com.yxcorp.utility.TextUtils;
import k2b.e0;

public final class n implements g	// class@002104
{
    public final g0 b;

    public void n(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       if (!tb.s.Vg().c()) {
       }else if(p0 == FragmentEvent.RESUME){
          tb.Q.b();
       }else if(p0 == FragmentEvent.PAUSE){
          tb.Q.a(tb.s, tb.S8(tb.q.mPhotoTabId), TextUtils.I(tb.K.get(tb.q.mPhotoTabId)), tb.b9(tb.q.mPhotoTabId));
       }
       return;
    }
}
