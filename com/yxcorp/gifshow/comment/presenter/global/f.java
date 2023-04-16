package com.yxcorp.gifshow.comment.presenter.global.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import pk9.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import el9.u;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.comment.presenter.global.c;
import java.util.Objects;
import ek9.t0;
import com.kwai.robust.PatchProxyResult;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.yxcorp.gifshow.comment.presenter.global.d;
import com.kwai.component.tabs.panel.a;
import android.app.Activity;
import android.view.Window;
import il9.b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.android.model.mix.QComment;
import al9.a;
import java.util.List;
import com.kuaishou.android.model.mix.QSubComment;
import java.util.Iterator;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.lang.Integer;

public class f extends PresenterV2	// class@0010f5
{
    public Runnable A;
    public t p;
    public a q;
    public CommentParams r;
    public CommentConfig s;
    public CommentsFragment t;
    public int u;
    public a v;
    public t0 w;
    public e x;
    public e y;
    public QComment z;

    public void f(){
       super();
       this.x = new e(3, 1, 3, "CommentConversation");
       this.y = new e(3, 0, 0, "CommentConversationClick");
       this.A = null;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       if (this.s.mEnableConversation == null) {
          return;
       }
       this.X7(this.t.Vg().i().subscribe(new u(this), Functions.e));
       f tw = this.w;
       c uoc = new c(this);
       g og = Functions.d();
       Objects.requireNonNull(tw);
       b uob = PatchProxy.applyTwoRefs(uoc, og, tw, t0.class, "16");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = tw.f.subscribe(uoc, og);
       }
       this.X7(uob);
       this.X7(this.p.observeOn(a.c()).subscribe(new d(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       f tq = this.q;
       if (tq != null) {
          tq.j(false);
          this.q.b();
          this.q = null;
          b.d(this.getActivity().getWindow());
       }
       tq = this.v;
       if (tq != null) {
          tq.o();
          this.v = null;
       }
       tq = this.A;
       if (tq != null) {
          k1.m(tq);
       }
       return;
    }
    public QComment P8(QComment p0,a p1){
       QComment obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QComment qComment = null;
       if (p0.mParent == null) {
          return qComment;
       }
       int i = p1.R().indexOf(p0.mParent);
       if (i < 0) {
          return qComment;
       }
       QComment qComment1 = p1.R().get(i);
       obj = qComment1.mSubComment;
       if (obj != null) {
          QSubComment mComments = obj.mComments;
          if (mComments != null) {
             Iterator iterator = mComments.iterator();
             while (iterator.hasNext()) {
                qComment = iterator.next();
                if (qComment.equals(p0)) {
                   return qComment;
                }
             }
          }
       }
       Gson a = a.a;
       obj = a.h(a.q(p0), QComment.class);
       obj.mParent = qComment1;
       obj.mEmotionInfo = p0.mEmotionInfo;
       obj.attachmentList = p0.attachmentList;
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.r8("COMMENT_SHOW_SUB_COMMENT_PANEL");
       this.s = this.q8(CommentConfig.class);
       this.r = this.q8(CommentParams.class);
       this.t = this.r8("FRAGMENT");
       this.u = this.r8("COMMENT_FLOAT_EDIT_THEME").intValue();
       this.w = this.r8("COMMENT_GLOBAL_ACTION");
       return;
    }
}
