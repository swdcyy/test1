package com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$b;
import com.yxcorp.gifshow.comment.utils.e;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import lnc.u1;
import android.app.Activity;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.e;
import yk9.d;
import zf6.l;
import android.view.View;
import android.widget.TextView;
import ok.x;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$c;
import zm5.a;
import android.content.DialogInterface$OnShowListener;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$d;
import android.content.DialogInterface$OnDismissListener;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.util.ArrayList;
import nx9.c;
import java.util.List;
import mzc.a;
import k2b.e0;
import g7a.q;
import com.yxcorp.gifshow.comment.utils.e$c;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$e;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.comment.utils.b;
import com.airbnb.lottie.LottieAnimationView;
import android.view.ViewParent;
import android.view.ViewGroup;
import java.util.Objects;
import ek9.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$sendComment$1;
import msd.l;
import ek9.a$b;
import m9a.t$c;
import java.lang.Integer;
import bk5.c;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.User;
import qa6.b;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentExternalEditorPresenter$addComment$params$1;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import com.yxcorp.gifshow.widget.EmojiTextView;
import java.lang.Number;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.event.CommentsEvent;
import com.yxcorp.gifshow.event.CommentsEvent$Operation;
import nk9.a;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;

public final class NasaCommentExternalEditorPresenter extends PresenterV2	// class@001853
{
    public boolean A;
    public LottieAnimationView B;
    public SlidePlayViewModel C;
    public EmojiTextView D;
    public View E;
    public b F;
    public final a G;
    public QComment p;
    public QPhoto q;
    public d r;
    public t s;
    public e t;
    public a u;
    public int v;
    public e w;
    public BaseFragment x;
    public PhotoDetailParam y;
    public x z;
    public static final NasaCommentExternalEditorPresenter$a H;

    static {
       NasaCommentExternalEditorPresenter.H = new NasaCommentExternalEditorPresenter$a(null);
    }
    public void NasaCommentExternalEditorPresenter(){
       super();
       this.G = new NasaCommentExternalEditorPresenter$b(this);
    }
    public static final e P8(NasaCommentExternalEditorPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mEditHolderHelper");
       }
       return p0;
    }
    public void E8(){
       NasaCommentExternalEditorPresenter tx1;
       NasaCommentExternalEditorPresenter tt;
       NasaCommentExternalEditorPresenter nasaCommentE = NasaCommentExternalEditorPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nasaCommentE, "4")) {
          return;
       }
       NasaCommentExternalEditorPresenter tx = this.x;
       String str = "mFragment";
       if (tx == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tx.getParentFragment());
       this.C = slidePlayVie;
       if (slidePlayVie != null) {
          tx1 = this.x;
          if (tx1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tx1, this.G);
       }
       u1.a(this);
       Activity activity = this.getActivity();
       NasaCommentExternalEditorPresenter tq = this.q;
       String str1 = "mPhoto";
       if (tq == null) {
          a.S(str1);
       }
       NasaCommentExternalEditorPresenter tw = this.w;
       NasaCommentExternalEditorPresenter tr = this.r;
       if (tr == null) {
          a.S("mCommentLogger");
       }
       e uoe = new e(activity, tq, tw, tr, 0x7f110143);
       this.t = slidePlayVie;
       slidePlayVie.u(l.i(0, 16));
       tx = this.t;
       if (tx == null) {
          a.S("mEditHolderHelper");
       }
       tx.o(this.E);
       tx.r(this.D);
       tx.p(this.z);
       tx.A = "BOTTOM_EDITOR";
       tx = this.u;
       if (tx != null) {
          tt = this.t;
          if (tt == null) {
             a.S("mEditHolderHelper");
          }
          tt.x(new NasaCommentExternalEditorPresenter$c(tx));
          tt = this.t;
          if (tt == null) {
             a.S("mEditHolderHelper");
          }
          tt.w(new NasaCommentExternalEditorPresenter$d(tx));
       }
       if (!PatchProxy.applyVoid(objArray, this, nasaCommentE, "7")) {
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = new ArrayList();
          if (c.a()) {
             Ref$ObjectRef element = objectRef.element;
             tt = this.q;
             if (tt == null) {
                a.S(str1);
             }
             tx1 = this.x;
             if (tx1 == null) {
                a.S(str);
             }
             element.add(new a(tt, tx1, "BOTTOM_COMMENT_BOX"));
          }
          if (objectRef.element.size() > 0) {
             NasaCommentExternalEditorPresenter tt1 = this.t;
             if (tt1 == null) {
                a.S("mEditHolderHelper");
             }
             tt1.q(new q(objectRef));
          }
       }
       nasaCommentE = this.s;
       if (nasaCommentE == null) {
          a.S("mEditorAtOperationObservable");
       }
       this.X7(nasaCommentE.subscribe(new NasaCommentExternalEditorPresenter$e(this), Functions.d()));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, NasaCommentExternalEditorPresenter.class, "2")) {
          return;
       }
       this.F = new b(this.getActivity());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NasaCommentExternalEditorPresenter.class, "5")) {
          return;
       }
       this.R8();
       u1.b(this);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, NasaCommentExternalEditorPresenter.class, "28")) {
          return;
       }
       NasaCommentExternalEditorPresenter tB = this.B;
       if (tB != null && tB.p() == true) {
          tB = this.B;
          if (tB != null) {
             tB.f();
          }
       }
       tB = this.B;
       if (tB != null) {
          tB.t();
       }
       this.S8(this.B);
       this.B = null;
       return;
    }
    public final void S8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaCommentExternalEditorPresenter.class, "27")) {
          return;
       }
       ViewParent parent = (p0 != null)? p0.getParent(): 0;
       if (parent instanceof ViewGroup) {
          parent = p0.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          parent.removeView(p0);
       }
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, NasaCommentExternalEditorPresenter.class, "15")) {
          return;
       }
       NasaCommentExternalEditorPresenter tw = this.w;
       if (tw != null) {
          Activity activity = this.getActivity();
          a$b r = a.r;
          NasaCommentExternalEditorPresenter tq = this.q;
          if (tq == null) {
             a.S("mPhoto");
          }
          tw.i(activity, r.b(tq, new NasaCommentExternalEditorPresenter$sendComment$1(this)));
       }
       tw = this.t;
       if (tw == null) {
          a.S("mEditHolderHelper");
       }
       tw.b();
       return;
    }
    public final void W8(int p0,t$c p1){
       NasaCommentExternalEditorPresenter nasaCommentE = NasaCommentExternalEditorPresenter.class;
       if (PatchProxy.isSupport(nasaCommentE) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, nasaCommentE, "22")) {
          return;
       }
       if (this.A != null) {
          return;
       }
       if (TextUtils.isEmpty(p1.a.a)) {
          return;
       }
       this.A = true;
       String str = p1.a.a+p1.a.a+p1.a.a;
       NasaCommentExternalEditorPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       QComment qComment = tq.newComment(str, null, null, b.a(QCurrentUser.me()));
       a.o(qComment, "comment");
       if (!PatchProxy.isSupport(nasaCommentE) || !PatchProxy.applyVoidFourRefs(qComment, p1, null, Integer.valueOf(p0), this, NasaCommentExternalEditorPresenter.class, "23")) {
          a uoa = a.r.a(new NasaCommentExternalEditorPresenter$addComment$params$1(this, null, qComment, p1));
          NasaCommentExternalEditorPresenter tw = this.w;
          if (tw != null) {
             this.X7(tw.i(this.getActivity(), uoa));
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaCommentExternalEditorPresenter.class, "1")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          activity = activity.findViewById(R.id.bottom_comment_layout);
          if (activity != null) {
             View view = activity.findViewById(R.id.text);
             if (!view instanceof EmojiTextView) {
                view = null;
             }
             this.D = view;
             this.E = activity.findViewById(0x7f0a026f);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaCommentExternalEditorPresenter.class, "3")) {
          return;
       }
       Object obj = this.r8("DETAIL_PHOTO_INDEX");
       a.o(obj, "inject\(AccessIds.DETAIL_PHOTO_INDEX\)");
       this.v = obj.intValue();
       this.y = this.q8(PhotoDetailParam.class);
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       this.w = this.r8("COMMENT_HELPER");
       NasaCommentExternalEditorPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       this.r = new d(tq);
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.x = obj;
       obj = this.r8("NASA_BOTTOM_EDITOR_OPERATION_OBSERVABLE");
       a.o(obj, "inject\(AccessIds.NASA_BO¡­TOR_OPERATION_OBSERVABLE\)");
       this.s = obj;
       this.z = this.t8("COMMENT_CURRENT_PROGRESS");
       this.u = this.t8("DETAIL_PLAY_SCENE_RECORD");
       return;
    }
    public final void onEventMainThread(CommentsEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaCommentExternalEditorPresenter.class, "19")) {
          return;
       }
       a.p(p0, "event");
       CommentsEvent b = p0.b;
       NasaCommentExternalEditorPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       if (a.g(b, tq) ^ 0x01) {
          return;
       }else if(p0.c == CommentsEvent$Operation.SEND){
          NasaCommentExternalEditorPresenter tt = this.t;
          if (tt == null) {
             a.S("mEditHolderHelper");
          }
          tt.b();
       }
       this.p = null;
       return;
    }
    public final void onEventMainThread(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaCommentExternalEditorPresenter.class, "18")) {
          return;
       }
       a a = (p0 != null)? p0.a: null;
       NasaCommentExternalEditorPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       if (a.g(a, tq) ^ 0x01) {
          return;
       }else {
          this.p = p0.f;
          NasaCommentExternalEditorPresenter tw = this.w;
          if (tw != null) {
             tw.e = p0;
          }
          tw = this.t;
          if (tw == null) {
             a.S("mEditHolderHelper");
          }
          if (tw != null) {
             tw.t(p0.c);
          }
          tw = this.t;
          if (tw == null) {
             a.S("mEditHolderHelper");
          }
          if (tw != null) {
             tw.y(p0.d);
          }
          tw = this.t;
          if (tw == null) {
             a.S("mEditHolderHelper");
          }
          if (tw != null) {
             tw.y = p0.h;
          }
          return;
       }
    }
}
