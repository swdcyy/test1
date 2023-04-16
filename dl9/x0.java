package dl9.x0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import dl9.p0;
import android.view.View;
import android.view.View$OnClickListener;
import crd.b;
import com.yxcorp.gifshow.comment.utils.c;
import dl9.o0;
import o56.c;
import o56.a;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.TextView;
import java.lang.Boolean;
import java.util.Map;
import dl9.q0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import ek9.t0;
import java.lang.Integer;
import com.yxcorp.gifshow.comment.utils.d;
import com.kuaishou.android.model.mix.QSubComment;
import java.util.List;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import g9c.a;
import java.util.Objects;
import ek9.t0$a;
import com.yxcorp.gifshow.entity.QPhoto;
import io.reactivex.subjects.PublishSubject;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import brd.y;
import al9.a;
import androidx.recyclerview.widget.RecyclerView;
import dl9.s0;
import java.lang.Runnable;
import android.view.ViewGroup;
import java.util.Iterator;
import android.content.Context;
import hl9.s;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import hl9.t;
import androidx.core.content.ContextCompat;
import android.content.res.Resources;
import ekd.m1;
import nx9.c;
import android.text.TextPaint;
import com.yxcorp.gifshow.comment.log.a;

public class x0 extends PresenterV2	// class@001fc1
{
    public boolean A;
    public d B;
    public t0 C;
    public y D;
    public boolean E;
    public int F;
    public Drawable[] p;
    public ColorStateList q;
    public TextView r;
    public TextView s;
    public View t;
    public QComment u;
    public QPhoto v;
    public RecyclerFragment w;
    public Map x;
    public a y;
    public a z;

    public void x0(){
       super();
    }
    public void E8(){
       x0 ox0 = x0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ox0, "3")) {
          return;
       }
       this.Y8(this.u.mParent);
       this.X7(c.a(this.r, new p0(this)));
       this.X7(c.a(this.s, new o0(this)));
       if (!PatchProxy.applyVoid(objArray, this, ox0, "4") && a.a().c()) {
          ox0 = this.r;
          if (ox0 != null && this.s != null) {
             ox0.setContentDescription(a1.p(R.string.arg_RES_7f1036b7));
             this.s.setContentDescription(a1.p(R.string.arg_RES_7f100f8b));
          }
       }
       if (Boolean.TRUE.equals(this.x.get(this.u.mParent.getId()))) {
          this.W8();
       }else {
          this.P8();
          this.X8(this.u.mParent);
       }
       this.X7(this.C.j(new q0(this), Functions.d()));
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, x0.class, "19")) {
          return;
       }
       this.x.put(this.u.mParent.getId(), Boolean.FALSE);
       this.t.setVisibility(4);
       return;
    }
    public void R8(QComment p0,int p1){
       int i;
       x0 ox0 = this;
       Object obj = p0;
       x0 ox01 = x0.class;
       if (PatchProxy.isSupport(ox01) && PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(p1), this, ox01, "8")) {
          return;
       }
       ox0.E = true;
       QComment mParent = obj.mParent;
       d uod = d.class;
       Object obj1 = null;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(mParent, Integer.valueOf(p1), obj1, uod, "2")) {
          if (!d.k(mParent)) {
             mParent.mSubCommentCount = mParent.mSubComment.mComments.size();
             mParent.getEntity().mNewSubCommentIdSet.clear();
          }
          d.p(mParent, p1);
       }
       this.S8();
       this.Y8(mParent);
       x0 c = ox0.C;
       x0 v = ox0.v;
       Object obj2 = PatchProxy.apply(obj1, this, ox01, "9");
       if (obj2 != PatchProxyResult.class) {
          i = obj2.intValue();
       }else {
          i = ox0.w.g7().getItemCount();
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                if (ox0.w.g7().N0(i1) == ox0.u) {
                   i = i1;
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i = -1;
             }
          }
       }
       Objects.requireNonNull(c);
       if (!PatchProxy.isSupport(t0.class) || !PatchProxy.applyVoidThreeRefs(v, mParent, Integer.valueOf(i), c, t0.class, "13")) {
          c.f.onNext(new t0$a(v, mParent, i));
       }
       ox0.B.E(p0, 309, "expand_secondary_comment", mParent.getId(), null, f0.a(ox0.w, this.getActivity()));
       ox0.B.I(obj.mParent, f0.a(ox0.w, this.getActivity()));
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, x0.class, "17")) {
          return;
       }
       this.D.onNext(Boolean.TRUE);
       this.y.c();
       this.w.h0().postDelayed(new s0(this), 50);
       return;
    }
    public void V8(QComment p0,CharSequence p1){
       int i;
       x0 ox0 = x0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ox0, "14")) {
          return;
       }
       QComment mSubCommentC = p0.mSubCommentCount;
       if (p0.mSubCommentVisible != null) {
          mSubCommentC = mSubCommentC - p0.mSubCommentVisibleLimit;
       }
       Iterator obj = PatchProxy.applyOneRefs(p0, this, ox0, "15");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else if(p0.hasSub()){
          obj = p0.mSubComment.mComments.iterator();
          int i2 = 0;
          while (obj.hasNext()) {
             QComment qComment = obj.next();
             if (p0.getEntity().mNewSubCommentIdSet.contains(qComment.getId()) && qComment.getEntity().mIsHide == null) {
                i2 = i2 + 1;
             }
          }
          i = i2;
       }else {
          i = 0;
       }
       int i1 = mSubCommentC - i;
       if (i1 <= 0) {
          this.r.setText(p1);
       }else {
          Object[] objArray = new Object[]{String.valueOf(i1)};
          this.r.setText(this.getContext().getString(R.string.arg_RES_7f100783, objArray));
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, x0.class, "18")) {
          return;
       }
       this.x.put(this.u.mParent.getId(), Boolean.TRUE);
       this.r.setVisibility(4);
       this.t.setVisibility(0);
       return;
    }
    public void X8(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x0.class, "20")) {
          return;
       }
       int i = 0;
       if (s.a(p0, this.v.getPhotoId())) {
          this.r.setVisibility(i);
       }else {
          this.r.setVisibility(4);
       }
       ConstraintLayout$LayoutParams layoutParams = this.s.getLayoutParams();
       this.s.setCompoundDrawables(null, null, this.p[2], null);
       layoutParams.g = i;
       t.d9(this.s, this.q, i);
       x0 ts = this.s;
       t.Y8(ts, i, ContextCompat.getColor(ts.getContext(), R.color.arg_RES_7f060914));
       t.Z8(this.s, 2, this.q);
       x0 ts1 = this.s;
       ts1.setPadding(ts1.getPaddingLeft(), this.s.getPaddingTop(), a1.d(R.dimen.arg_RES_7f0702ab), this.s.getPaddingBottom());
       this.s.setGravity(5);
       this.s.setLayoutParams(layoutParams);
       return;
    }
    public final void Y8(QComment p0){
       int i;
       boolean b;
       x0 ox0 = x0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ox0, "7")) {
          return;
       }
       this.X8(p0);
       if (!PatchProxy.applyVoid(null, this, ox0, "13")) {
          QComment mParent = this.u.mParent;
          i = 0x7f100782;
          if (mParent.mDisplaySubCommentCount != null) {
             if (mParent.mServerSubCommentCount <= null) {
                this.r.setText(i);
             }else if(mParent.mSubCommentVisibleLimit > null){
                if (d.f(mParent.mSubComment) > mParent.mSubCommentVisibleLimit) {
                   this.r.setText(i);
                }else {
                   this.V8(mParent, this.r.getResources().getText(i));
                }
             }else if(mParent.getEntity().mHasCollapseSub != null){
                this.V8(mParent, this.r.getResources().getText(i));
             }else {
                this.r.setText(i);
             }
          }else {
             this.r.setText(i);
          }
       }
       i = 0;
       if (this.E != null) {
          this.s.setVisibility(i);
          this.E = i;
       }else {
          x0 ts = this.s;
          Object obj = PatchProxy.applyOneRefs(p0, this, ox0, "10");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             int i1 = d.f(p0.mSubComment);
             QComment$CommentViewBindEntity mShowChildCo = p0.getEntity().mShowChildCount;
             b = (i1 <= mShowChildCo && (i1 != mShowChildCo || (mShowChildCo > p0.mSubCommentVisibleLimit || (i1 > 0 && (this.u.mParent.mSubCommentVisible == null && p0.getEntity().mHasCollapseSub == null)))))? true: false;
          }
          if (!b) {
             i = 4;
          }
          ts.setVisibility(i);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x0.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a3ba5);
       this.r = m1.f(p0, 0x7f0a3ba6);
       TextView textView = m1.f(p0, R.id.sub_comment_fold);
       this.s = textView;
       this.p = textView.getCompoundDrawables();
       if (c.c()) {
          this.q = t.S8(p0.getContext(), t.R8(this.getContext(), 0x7f06081c, 0x7f0601f6));
          this.r.getPaint().setFakeBoldText(false);
          this.s.getPaint().setFakeBoldText(false);
       }else {
          boolean b = true;
          if (c.d()) {
             this.q = t.S8(p0.getContext(), t.R8(this.getContext(), 0x7f06081b, 0x7f0601d9));
             this.r.getPaint().setFakeBoldText(b);
             this.s.getPaint().setFakeBoldText(b);
          }else {
             this.q = t.S8(p0.getContext(), t.R8(this.getContext(), 0x7f0607cf, 0x7f0601ba));
             this.r.getPaint().setFakeBoldText(b);
             this.s.getPaint().setFakeBoldText(b);
          }
       }
       t.d9(this.r, this.q, false);
       t.Y8(this.r, false, ContextCompat.getColor(p0.getContext(), R.color.arg_RES_7f060914));
       t.Z8(this.r, 2, this.q);
       t.d9(this.s, this.q, false);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x0.class, "1")) {
          return;
       }
       this.u = this.q8(QComment.class);
       this.v = this.q8(QPhoto.class);
       this.w = this.r8("FRAGMENT");
       this.x = this.r8("comment_loading_more");
       this.y = this.r8("DETAIL_PAGE_LIST");
       this.z = this.q8(a.class);
       this.A = this.r8("COMMENT_ENABLE_EMOTION").booleanValue();
       this.B = this.q8(d.class);
       this.C = this.r8("COMMENT_GLOBAL_ACTION");
       this.D = this.r8("COMMENT_ITEM_ANIM_OBSERVER");
       return;
    }
}
