package cl9.e2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import android.text.TextUtils;
import k2b.u1;
import cl9.c2;
import lnc.c3$b;
import lnc.c3;
import cl9.x1;
import java.util.ArrayList;
import java.util.List;
import ekd.q;
import java.util.Collection;
import cl9.d2;
import ekd.q$b;
import java.util.Iterator;
import com.kuaishou.android.model.mix.QComment$Label;
import java.lang.Integer;
import android.content.Context;
import hl9.t;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import android.view.View;
import com.yxcorp.gifshow.comment.utils.Labels.CommentLabelsView;
import cl9.b2;
import com.yxcorp.gifshow.comment.utils.c;
import crd.b;
import com.yxcorp.gifshow.comment.utils.Labels.CommentLabelsView$a;
import hl9.x;
import java.lang.Runnable;
import crd.c;
import ekd.m1;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.utility.n;
import yk9.d;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;

public class e2 extends PresenterV2	// class@000619
{
    public CommentLabelsView p;
    public View q;
    public QPhoto r;
    public QComment s;
    public d t;
    public CommentsFragment u;

    public void e2(){
       super();
    }
    public void E8(){
       int b;
       QComment$Label mLabelWhiteC;
       QComment$Label mLabelBackgr;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e2 uoe2 = e2.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe2, "3")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, uoe2, "5");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.s.getUser() != null && this.r.getUser() != null){
          b = TextUtils.equals(this.s.getUser().getId(), this.r.getUser().getId());
       }else {
          String str = "user_null";
          if (this.s.getUser() == null) {
             u1.Q(str, "comment user is null");
          }else if(this.r.getUser() == null){
             u1.Q(str, "photo user is null");
          }
          b = false;
       }
       if (!b) {
          obj = PatchProxy.apply(objArray, this, uoe2, "8");
          b = (obj != patchProxyRe)? obj.booleanValue(): TextUtils.equals(c3.a(c3.a(this.s.mParent, c2.a), x1.a), this.s.mReplyToUserId) ^ 1;
          if (!b) {
             ArrayList uArrayList = PatchProxy.apply(objArray, this, uoe2, "4");
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = q.b(this.s.mLabels);
                if (!q.f(uArrayList)) {
                   q.c(uArrayList, new d2(this));
                }
             }
             if (!q.f(uArrayList)) {
                Iterator iterator = uArrayList.iterator();
                b = 0;
                while (iterator.hasNext()) {
                   QComment$Label label = iterator.next();
                   if (1 == label.mLabelType.intValue()) {
                      b = 1;
                   }
                   if (PatchProxy.applyVoidOneRefs(label, this, uoe2, "6")) {
                      continue ;
                   }else if(t.W8(this.getContext())){
                      mLabelWhiteC = label.mLabelWhiteColor;
                      mLabelBackgr = label.mLabelBackgroundWhiteColor;
                   }else {
                      mLabelWhiteC = label.mLabelBlackColor;
                      mLabelBackgr = label.mLabelBackgroundBlackColor;
                   }
                   if (mLabelWhiteC == null) {
                      mLabelWhiteC = ContextCompat.getColor(this.p.getContext(), R.color.arg_RES_7f060751);
                   }
                   label.mLabelColor = mLabelWhiteC;
                   if (mLabelBackgr == null) {
                      mLabelBackgr = ContextCompat.getColor(this.p.getContext(), R.color.arg_RES_7f06074b);
                   }
                   label.mLabelBackgroundColor = mLabelBackgr;
                }
             }else {
                b = 0;
             }
             if (this.q != null) {
                if (!b && !TextUtils.isEmpty(this.s.mRecommendDesc)) {
                   this.q.setVisibility(0);
                   this.p.setVisibility(8);
                   t.k9(this.q, this.s.mRecommendDesc);
                }else {
                   this.q.setVisibility(8);
                   this.p.setVisibility(0);
                   this.P8(uArrayList);
                }
             }else {
                this.p.setVisibility(0);
                this.P8(uArrayList);
             }
             return;
          }
       }
       this.p.setVisibility(8);
       e2 tq = this.q;
       if (tq != null) {
          tq.setVisibility(8);
       }
       return;
    }
    public final void P8(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e2.class, "7")) {
          return;
       }
       this.p.setLabels(p0);
       e2 tp = this.p;
       b2 uob2 = new b2(this, p0);
       b uob = PatchProxy.applyTwoRefs(tp, uob2, null, c.class, "4");
       if (uob != PatchProxyResult.class) {
       }else {
          tp.setOnLabelClickListener(uob2);
          uob = c.d(new x(tp));
       }
       this.X7(uob);
       return;
    }
    public void doBindView(View p0){
       e2 uoe2 = e2.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe2, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a16bf);
       this.q = m1.f(p0, 0x7f0a0883);
       if (!PatchProxy.applyVoid(null, this, uoe2, "9")) {
          ViewGroup$LayoutParams layoutParams = this.p.getLayoutParams();
          layoutParams.height = n.c(this.p.getContext(), 13.00f);
          this.p.setLayoutParams(layoutParams);
          e2 tp = this.p;
          tp.setLabelTextSize((float)n.c(tp.getContext(), 9.00f));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e2.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.q8(QComment.class);
       this.t = this.q8(d.class);
       this.u = this.r8("FRAGMENT");
       return;
    }
}
