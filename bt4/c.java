package bt4.c;
import erd.g;
import com.kuaishou.recruit.krn.RecruitTabKrnFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.kds.krn.api.page.router.KwaiRnTab;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.kds.krn.api.page.KwaiRnFragment;

public final class c implements g	// class@0003cd
{
    public final RecruitTabKrnFragment b;

    public void c(RecruitTabKrnFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(RecruitTabKrnFragment.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, RecruitTabKrnFragment.class, "11")) {
          RecruitTabKrnFragment s = tb.s;
          if (s instanceof KwaiRnTab) {
             if (b) {
                if (!TextUtils.equals(QCurrentUser.me().getId(), tb.w)) {
                   tb.w = QCurrentUser.me().getId();
                   tb.s.D();
                }
                tb.s.g5(tb.Vg().c());
                tb.s.lg();
             }else {
                s.g5(tb.Vg().c());
                tb.s.df();
             }
          }
       }
       return;
    }
}
