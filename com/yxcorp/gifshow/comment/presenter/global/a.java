package com.yxcorp.gifshow.comment.presenter.global.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import com.yxcorp.gifshow.comment.presenter.global.a$a;
import com.yxcorp.gifshow.comment.presenter.global.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import android.app.Activity;
import android.view.View;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.b;
import brd.t;
import t45.d;
import brd.z;
import el9.o;
import erd.g;
import crd.b;
import el9.m;
import io.reactivex.internal.functions.Functions;
import el9.j;
import zca.d;
import el9.n;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.QComment;
import al9.a;
import com.yxcorp.gifshow.comment.utils.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.List;
import qvb.i;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.response.CommentResponse;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import fk9.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import brd.y;
import java.lang.Throwable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import yk9.d;
import com.yxcorp.gifshow.comment.e$f;
import el9.l;
import el9.k;
import lnc.u1;
import lnc.d2;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.comment.utils.b;
import java.util.Map;
import ek9.a;
import java.lang.System;
import com.yxcorp.gifshow.comment.e$c;
import com.yxcorp.gifshow.comment.presenter.global.a$e;
import el9.e;
import msd.l;
import com.yxcorp.gifshow.comment.CommentParams;
import ok.x;
import el9.f;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.yxcorp.gifshow.comment.presenter.global.a$c;
import com.yxcorp.gifshow.comment.utils.b$a;
import nk9.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import java.util.HashSet;
import org.greenrobot.eventbus.a;
import el9.d;
import com.kuaishou.android.model.mix.QSubComment;
import java.lang.Math;
import el9.c;
import java.lang.Runnable;
import rkd.b;
import zg5.a;
import e17.i$b;
import e17.i;
import androidx.fragment.app.Fragment;
import android.app.Application;
import o56.a;
import android.content.Context;
import ekd.p0;
import lnc.a1;
import u07.t$a;
import el9.i;
import u07.u;
import u07.t;
import u07.j;
import java.lang.Long;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.google.protobuf.nano.MessageNano;
import k2b.u1;
import java.lang.Number;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import kk9.d;
import zf6.k;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import kk9.c;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import java.util.Iterator;
import xk9.d;
import com.yxcorp.gifshow.comment.presenter.global.a$d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import el9.h;
import android.view.View$OnClickListener;
import el9.b;
import el9.g;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import el9.a;
import android.content.DialogInterface$OnDismissListener;
import nk9.b;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.utility.n;
import g9c.a;
import java.util.Set;
import java.lang.Integer;
import ek9.t0;
import jk9.a;

public class a extends PresenterV2	// class@0010f0
{
    public y A;
    public e B;
    public t0 C;
    public x D;
    public x E;
    public a F;
    public BaseEditorFragment G;
    public c H;
    public t I;
    public t J;
    public ViewStubInflater2 K;
    public long L;
    public CommentsFragment M;
    public int N;
    public View O;
    public boolean P;
    public CommentConfig Q;
    public k R;
    public boolean S;
    public b T;
    public Map U;
    public e$f U0;
    public QComment V;
    public final e$b V0;
    public String W;
    public EmotionInfo X;
    public QMedia Y;
    public HashSet Z;
    public RecyclerFragment p;
    public d q;
    public QPhoto r;
    public CommentParams s;
    public Set t;
    public t u;
    public List v;
    public t w;
    public boolean x;
    public int y;
    public y z;

    public void a(){
       super();
       this.P = false;
       this.U = new HashMap();
       this.U0 = new a$a(this);
       this.V0 = new a$b(this);
    }
    public void E8(){
       int b;
       int i2;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          return;
       }
       if (this.Q.mPageListConfig.mEnableSubBrowseMode != null) {
          this.O = this.getActivity().findViewById(0x7f0a0888);
       }
       this.B.b(this.V0);
       this.M = this.p;
       RxBus f = RxBus.f;
       this.X7(f.f(b.class).observeOn(d.a).subscribe(new o(this)));
       g e = Functions.e;
       this.X7(this.u.subscribe(new m(this), e));
       this.X7(this.w.subscribe(new j(this), e));
       this.X7(f.f(d.class).subscribe(new n(this), e));
       e c = this.B.c;
       if (!PatchProxy.applyVoidOneRefs(c, this, uoa, "15") && (c != null && !c.isEmpty())) {
          int i = 0;
          int i1 = 0;
          while (i1 < c.size()) {
             Object obj = c.get(i1);
             a uoa1 = this.X8();
             QComment mId = obj.mId;
             QComment obj1 = PatchProxy.applyTwoRefs(uoa1, mId, objArray, d.class, "31");
             if (obj1 != PatchProxyResult.class) {
                b = obj1.booleanValue();
             }else if(uoa1 != null && (q.f(uoa1.getItems()) || TextUtils.x(mId))){
                obj1 = new QComment();
                obj1.mId = mId;
                i2 = uoa1.getItems().indexOf(obj1);
                if (i2 >= 0) {
                   mId = uoa1.getItem(i2);
                   if (mId.mParent == null) {
                      uoa1.remove(mId);
                      uoa1.add(i, mId);
                      b = true;
                   }
                }
             }
             b = false;
             if (!b) {
                this.X8().add(i, obj);
                if (this.X8().L0() != null) {
                   CommentResponse uCommentResp = this.X8().L0();
                   i2 = uCommentResp.mCommentCount + 1;
                   uCommentResp.mCommentCount = i2;
                }
             }
             b = c.size() - 1;
             if (i1 == b) {
                g og = this.M.g7();
                if (og instanceof b) {
                   og.v1(obj);
                }
                this.M.g7().r0(i, c.size());
                if (this.Q.mLocationAfterAddComment != null) {
                   this.z.onNext(obj);
                }
             }
             if (c.get(i1).mStatus == 2) {
                b = c.size() - 1;
                if (i1 == b) {
                   this.M.g7().k0();
                }
                this.q.v(obj, false, this.L, new Throwable("post comment fail"), this.getActivity().N2());
             }
             i1 = i1 + 1;
          }
          c.clear();
       }
    label_017c :
       this.B.l(this.U0);
       this.X7(this.J.subscribe(new l(this)));
       this.X7(this.I.subscribe(new k(this)));
       u1.a(this);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.N = d2.e();
       if (this.K == null) {
          ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a086b, 0x7f0a086a);
          this.K = viewStubInfl;
          viewStubInfl.d(this.getActivity().findViewById(0x1020002));
       }
       this.T = new b(this.getActivity());
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       a uoa = this.X8();
       if (uoa != null) {
          uoa.k0();
       }
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "5")) {
          return;
       }
       this.B.l(objArray);
       this.U.clear();
       u1.b(this);
       this.B.j(this.V0);
       return;
    }
    public void P8(a p0){
       a tB;
       Activity activity;
       CommentParams mLogWatchId;
       a tD;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "14")) {
          return;
       }
       this.b9(null);
       if (p0 != null && p0.v()) {
          if (!this.L - false) {
             this.L = System.currentTimeMillis();
          }
          QComment qComment = p0.e();
          a$e uoe = new a$e(this, p0.g(), qComment, p0.r());
          String str = "";
          if (qComment != null && qComment.mQMedia != null) {
             tB = this.B;
             activity = this.getActivity();
             p0 = a.c(p0, new e(this, uoe));
             mLogWatchId = this.s.mLogWatchId;
             tD = this.D;
             if (tD != null) {
                str = tD.get();
             }
             this.X7(tB.c(activity, p0, mLogWatchId, str));
          }else {
             tB = this.B;
             activity = this.getActivity();
             p0 = a.c(p0, new f(this, uoe));
             mLogWatchId = this.s.mLogWatchId;
             tD = this.D;
             if (tD != null) {
                str = tD.get();
             }
             this.X7(tB.a(activity, p0, mLogWatchId, str, null, null));
          }
       }
       return;
    }
    public void R8(BaseEditorFragment$g p0,QComment p1,boolean p2,BaseEditorFragment p3){
       a uoa = this;
       BaseEditorFragment$g og = p0;
       Object obj = p1;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, a.class, "7")) {
          return;
       }
       uoa.U.remove(obj);
       boolean b = uoa.T.i("commentKeywordActionConfiguration", og.c, p1, super(uoa, og, obj, p2), "HUMANISTIC_CARE");
       if (b) {
          uoa.U.put(obj, og.c);
          uoa.q.w(obj, uoa.L, this.getActivity().N2());
          a uoa1 = new a(uoa.r, og.c, og.e, og.f, og.g, og.r, og.s, this.getActivity().hashCode());
          QComment qComment = (v1.a())? obj: null;
          v1.b(qComment);
          a.d().k(v1);
       }
       if (!b) {
          uoa.P8(a.d(uoa.r, new d(og, obj)));
          uoa.U.remove(obj);
       }
       return;
    }
    public void S8(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "13")) {
          return;
       }
       int i = 0;
       if (p0.mReplyComment == null) {
          this.M.q().add(i, p0);
       }else if(this.X8().L0() != null){
          QComment mParent = p0.mParent;
          if (mParent != null) {
             this.M.q().add(Math.max(d.f(mParent.mSubComment), i), p0);
          }else {
             this.M.q().add(p0);
          }
          if (!this.M.Qh(new c(this, p0))) {
             this.c9(p0);
          }
       }
       return;
    }
    public final void V8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "12")) {
          return;
       }
       if (b.b()) {
          if (p0 && !b.e()) {
             return;
          }else {
             RxBus.f.b(new a(p0));
          }
       }
       return;
    }
    public boolean W8(BaseEditorFragment$g p0){
       BaseEditorFragment$g obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.c;
       if (obj == null || (!TextUtils.x(obj.trim()) || (p0.e != null || p0.f != null))) {
          return false;
       }
       i$b uob = i.m();
       uob.x(R.string.arg_RES_7f104252);
       uob.l(true);
       i.c(R.style.arg_RES_7f11066a, uob);
       return true;
    }
    public a X8(){
       a obj = PatchProxy.apply(null, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (obj == null) {
          return null;
       }
       return obj.q();
    }
    public final View Y8(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Q.mPageListConfig.mEnableSubBrowseMode != null) {
          return this.O;
       }
       return this.K.b(0x7f0a086a);
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       a tG = this.G;
       if (tG != null) {
          tG.dismiss();
          this.G = null;
       }
       return;
    }
    public void a9(QComment p0,boolean p1){
       String str;
       i3 oi3;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(obj1, Boolean.valueOf(p1), obj, a.class, "9")) {
          return;
       }
       a g = obj.G;
       if (g != null && g.isAdded()) {
          return;
       }
       if (obj1 != null && this.getActivity() instanceof GifshowActivity) {
          int i = 0x7f11066a;
          if (!obj.r.isAllowComment()) {
             i.a(i, R.string.arg_RES_7f10078c);
             return;
          }else {
             Activity uActivity = this.getActivity();
             if (p0.getStatus() == 1) {
                i.a(i, R.string.arg_RES_7f104666);
                return;
             }else {
                l ol = null;
                if (p0.getStatus() == 2) {
                   if (!p0.C(a.b())) {
                      i.d(i, a1.p(R.string.arg_RES_7f101be4));
                      return;
                   }else if(p1){
                      t$a uoa = new t$a(uActivity);
                      uoa.W0(R.string.arg_RES_7f1042b2);
                      uoa.S0(R.string.arg_RES_7f103a83);
                      uoa.Q0(R.string.cancel);
                      uoa.u0(new i(obj, obj1));
                      j.d(uoa);
                   }else {
                      obj.P8(a.b(obj1, ol));
                   }
                   return;
                }else {
                   a q = obj.q;
                   x ox = this.getActivity().N2();
                   g = obj.E;
                   long l = (g != null)? g.get().longValue(): null;
                   long l1 = l;
                   Objects.requireNonNull(q);
                   if (PatchProxy.isSupport(d.class)) {
                      if (!PatchProxy.applyVoidThreeRefs(p0, ox, Long.valueOf(l1), q, d.class, "8")) {
                      label_00e2 :
                         if (q.a != null) {
                            ClientContent$ContentPackage uContentPack = q.c(obj1, ol, 0);
                            ClientEvent$ElementPackage uElementPack = q.f(obj1, 1, "ÆÀÂÛ»Ø¸´ºÃÓÑ", 301);
                            if ((q.i).equals("DETAIL")) {
                               oi3 = i3.f();
                               oi3.d("contentPackage_params", uContentPack.toString());
                               oi3.d("elementPackage_params", uElementPack.toString());
                               str = oi3.e();
                               u1.R("REPLY_PHOTO_COMMENT", str, 14);
                            }else {
                               oi3 = i3.f();
                               oi3.c("ActionRelativeTime", Long.valueOf(l1));
                               uElementPack.params = oi3.e();
                               u1.B(new ClickMetaData().setLogPage(ox).setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(q.a.getFeedLogCtx()));
                            }
                         }
                      }
                   }else {
                      int i1 = 0;
                      goto label_00e2 ;
                   }
                   d uod = new d();
                   str = obj.U.get(obj1);
                   if (str != null) {
                      uod.g = str;
                   }
                   uod.e = obj1;
                   if (obj.V == obj1) {
                      uod.g = obj.W;
                      uod.i = obj.X;
                      uod.j = obj.Y;
                      uod.n = obj.Z;
                   }else {
                      this.b9(p0);
                   }
                   if (k.e() && (obj.M.Nh() && obj.Q.mEditorConfig.mForceDayNightMode == null)) {
                      uod.m = 16;
                   }
                label_019b :
                   boolean b = true;
                   obj.V8(b);
                   BaseEditorFragment uBaseEditorF = obj.H.a(this.getActivity(), uod, obj.M);
                   if (uBaseEditorF instanceof EmotionFloatEditorFragment) {
                      uBaseEditorF.Pi(b);
                   }else {
                      uBaseEditorF.ri(b);
                   }
                   Iterator iterator = obj.v.iterator();
                   while (iterator.hasNext()) {
                      iterator.next().c(uod, uBaseEditorF);
                   }
                   a$d uod1 = new a$d(this, uod, uBaseEditorF, p0, uActivity, p1);
                   uBaseEditorF.ai(ox);
                   uBaseEditorF.ci(new h(obj));
                   uBaseEditorF.bi(new b(obj));
                   uBaseEditorF.ph(new g(obj, uBaseEditorF, uod));
                   uBaseEditorF.k0(new a(obj, uBaseEditorF, uActivity, uod));
                   obj.L = System.currentTimeMillis();
                   RxBus.f.b(super(true));
                   obj.P = true;
                   uBaseEditorF.show(uActivity.getSupportFragmentManager(), a.class.getName());
                   if (this.Y8() != null) {
                      n.Y(this.Y8(), 0, true);
                   }
                }
             }
          }
       }
       return;
    }
    public final void b9(QComment p0){
       this.W = null;
       this.X = null;
       this.Y = null;
       this.V = p0;
       this.Z = null;
    }
    public final void c9(QComment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "16")) {
          return;
       }
       int i = this.M.q().getItems().indexOf(p0.mParent);
       if (i >= 0 && p0.mParent.mSubComment != null) {
          this.M.g7().l0(i);
          int size = p0.mParent.mSubComment.getSize();
          i = (i + size) - 1;
          if (size > 1 && i < this.M.g7().Q0().size()) {
             this.M.g7().l0(i);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(d.class);
       this.r = this.q8(QPhoto.class);
       this.s = this.q8(CommentParams.class);
       this.Q = this.q8(CommentConfig.class);
       this.t = this.r8("COMMENT_ON_REPLY_LISTENERS");
       this.u = this.r8("COMMENT_REPLY_OBSERVABLE");
       this.w = this.r8("COMMENT_ADD_OBSERVABLE");
       this.x = this.r8("COMMENT_ENABLE_EMOTION").booleanValue();
       this.y = this.r8("COMMENT_FLOAT_EDIT_THEME").intValue();
       this.z = this.r8("COMMENT_SCROLL_TO_TOP_OBSERVER");
       this.A = this.t8("DETAIL_EDITOR_FRAGMENT_SHOW_STATE");
       this.B = this.r8("COMMENT_HELPER");
       this.C = this.r8("COMMENT_GLOBAL_ACTION");
       this.D = this.t8("COMMENT_CURRENT_TRANS_CODE_TYPE");
       this.E = this.t8("COMMENT_CURRENT_PROGRESS");
       this.F = this.q8(a.class);
       this.H = this.t8("COMMENT_EDITOR_FACTORY");
       this.v = this.r8("COMMENT_PANEL_EDITOR_LISTENER");
       this.I = this.r8("COMMENT_SHOW_PANEL_OBSERVABLE");
       this.J = this.r8("COMMENT_HIDE_PANEL_OBSERVABLE");
       return;
    }
    public void onEventMainThread(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       a tr = this.r;
       if (tr != null && tr.equals(p0.a)) {
          tr = p0.f;
          if (tr != null && (this.V == tr && p0.a())) {
             this.W = p0.b;
             this.X = p0.c;
             this.Y = p0.d;
             this.Z = p0.h;
          }else {
             this.b9(null);
          }
       }
       return;
    }
}
