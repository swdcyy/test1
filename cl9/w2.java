package cl9.w2;
import erd.g;
import cl9.y2;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import hlb.g;
import java.util.Objects;
import ek9.t0;
import e17.i;
import ek9.k1;
import android.view.View;
import pk9.h;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import com.yxcorp.gifshow.comment.utils.d;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.QComment$CommentBottomTag;
import com.kuaishou.android.model.mix.QComment$Label;
import java.util.List;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import ek9.t0$a;
import io.reactivex.subjects.PublishSubject;
import java.lang.Boolean;
import cl9.y2$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import yk9.d;

public final class w2 implements g	// class@00067a
{
    public final y2 b;
    public final boolean c;
    public final QComment d;

    public void w2(y2 p0,boolean p1,QComment p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       w2 tb = this.b;
       w2 td = this.d;
       Objects.requireNonNull(tb);
       t0 ot0 = t0.class;
       i.a(R.style.arg_RES_7f11066a, 0x7f104d67);
       boolean b = false;
       tb.u.a = b;
       tb.w.setVisibility(8);
       boolean b1 = true;
       if (this.c != null) {
          p0 = y2.P8(td);
          p0.e(b1);
          tb.v.a(p0);
          tb.v.h(tb.p, td, b1);
       }else if(td.hasSub() && td.getEntity().mHasCollapseSub == null){
          d.a(td);
       }
       if (td.mCommentBottomTags == null) {
          td.mCommentBottomTags = new ArrayList();
       }
       if (p0 != null) {
          p0 = p0.mLabel;
          if (p0 != null) {
             QComment mCommentBott = td.mCommentBottomTags;
             QComment$CommentBottomTag uCommentBott = PatchProxy.applyOneRefs(p0, tb, y2.class, "10");
             if (uCommentBott != PatchProxyResult.class) {
             }else {
                uCommentBott = new QComment$CommentBottomTag();
                uCommentBott.mBgColor = p0.mLabelBackgroundWhiteColor;
                uCommentBott.mBgColorNight = p0.mLabelBackgroundBlackColor;
                uCommentBott.mBgColorStr = p0.mBackgroundWhiteColor;
                uCommentBott.mBgColorNightStr = p0.mBackgroundBlackColor;
                uCommentBott.mTextColor = p0.mLabelWhiteColor;
                uCommentBott.mTextColorNight = p0.mLabelBlackColor;
                uCommentBott.mText = p0.mLabelName;
                uCommentBott.mTextKey = "top_comment_tag";
             }
             mCommentBott.add(b, uCommentBott);
          }
       }
       tb.s.q().remove(td);
       tb.s.q().add(b, td);
       p0 = tb.v;
       y2 p = tb.p;
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidTwoRefs(p, td, p0, ot0, "4")) {
          p0.a.onNext(new t0$a(p, td));
       }
       tb.v.h(tb.p, td, b1);
       p0 = tb.v;
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, ot0, "25")) {
          p0.i.onNext(Boolean.FALSE);
       }
       if (!tb.s.Qh(new y2$b(tb.v, tb.q))) {
          new y2$b(tb.v, tb.q).run();
       }
       tb.r.k("TOP_COMMENT_TOAST", td, tb.getActivity().N2());
       return;
    }
}
