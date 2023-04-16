package dl9.r0;
import erd.g;
import dl9.x0;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.CommentResponse;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.comment.utils.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import com.kuaishou.android.model.mix.QSubComment;
import e17.i;
import dl9.t0;
import java.lang.Runnable;
import android.widget.TextView;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;

public final class r0 implements g	// class@001f99
{
    public final x0 b;
    public final QComment c;
    public final int d;

    public void r0(x0 p0,QComment p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       boolean b1;
       r0 or0 = this;
       r0 b = or0.b;
       r0 c = or0.c;
       r0 d = or0.d;
       Objects.requireNonNull(b);
       CommentResponse mSubComments = p0.mSubComments;
       if (!PatchProxy.isSupport(x0.class) || !PatchProxy.applyVoidThreeRefs(c, mSubComments, Integer.valueOf(d), b, x0.class, "12")) {
          b.P8();
          b.E = true;
          QComment mParent = c.mParent;
          Object obj = PatchProxy.applyTwoRefs(mParent, mSubComments, null, d.class, "24");
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else if(mSubComments == null || (!mSubComments.size() && d.f(mParent.mSubComment) == mParent.mSubComment.mComments.size())){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1 && d != null) {
             i.a(R.style.arg_RES_7f11066a, 0x7f10397e);
          }
          b.S8();
          b.r.postDelayed(new t0(b, mParent), 50);
          b.B.E(c, 309, "expand_secondary_comment", mParent.getId(), null, f0.a(b.w, b.getActivity()));
          b.B.I(mParent, f0.a(b.w, b.getActivity()));
       }
       b.u.mParent.getEntity().mHasRequestedSubList = true;
       return;
    }
}
