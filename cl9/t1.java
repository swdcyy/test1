package cl9.t1;
import com.yxcorp.gifshow.comment.e$e;
import cl9.r1;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.Object;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import java.util.Objects;
import yk9.d;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import zb6.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.e0;
import k2b.u1;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import java.util.Set;
import java.util.List;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.android.model.mix.QSubComment;
import g9c.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class t1 implements e$e	// class@00066b
{
    public final ProgressFragment a;
    public final r1 b;

    public void t1(r1 p0,ProgressFragment p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(QComment p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, t1.class, "2")) {
          return;
       }
       t1 tb = this.b;
       r1 t = tb.t;
       x ox = tb.getActivity().N2();
       Objects.requireNonNull(t);
       if (PatchProxy.applyVoidThreeRefs(p0, p1, ox, t, d.class, "19") || (p0 != null && t.a != null)) {
          h$b uob = h$b.d(8, 302);
          ClientEvent$ResultPackage resultPackag = new ClientEvent$ResultPackage();
          resultPackag.code = a.b(p1);
          resultPackag.message = a.i(p1);
          uob.h(t.c(p0, null, false));
          uob.q(resultPackag);
          uob.l(t.a.getFeedLogCtx());
          u1.p0("", ox, uob);
       }
    label_0065 :
       this.a.dismiss();
       return;
    }
    public void b(QComment p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, t1.class, "1")) {
          return;
       }
       this.b.u.q().remove(p0);
       QComment mParent = p0.mParent;
       if (mParent != null) {
          mParent.getEntity().mNewSubCommentIdSet.remove(p0.getId());
          mParent = p0.mParent;
          mParent.mSubCommentCount = mParent.mSubCommentCount - 1;
       }
       t1 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, r1.class, "19") || (p0.mParent != null && tb.s.mParent.mSubComment != null)) {
          i = tb.u.q().getItems().indexOf(p0.mParent);
          if (i > 0) {
             tb.u.g7().l0(i);
             i = i + p0.mParent.mSubComment.getSize();
             if (i < tb.u.g7().Q0().size()) {
                tb.u.g7().l0(i);
             }
          }
       }
       boolean b = false;
       i = 0;
       while (i < this.b.u.q().getItems().size()) {
          QComment qComment = this.b.u.q().getItems().get(i);
          if (TextUtils.n(qComment.getId(), p0.getId()) && qComment != p0) {
             this.b.u.q().remove(qComment);
             break ;
          }
          i = i + 1;
       }
       this.a.dismiss();
       t1 tb1 = this.b;
       r1 t = tb1.t;
       x ox = tb1.getActivity().N2();
       Objects.requireNonNull(t);
       if (!PatchProxy.applyVoidTwoRefs(p0, ox, t, d.class, "18") && t.a != null) {
          h$b uob = h$b.d(7, 302);
          uob.h(t.c(p0, null, b));
          uob.l(t.a.getFeedLogCtx());
          u1.p0("", ox, uob);
       }
       return;
    }
}
