package cl9.y;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uid.a;
import kk9.a;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import io.reactivex.subjects.PublishSubject;
import cl9.q;
import cl9.y$a;
import cl9.y$b;
import cl9.y$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.app.Activity;
import android.view.View;
import com.yxcorp.gifshow.comment.e$b;
import com.yxcorp.gifshow.comment.e;
import com.yxcorp.gifshow.comment.utils.e;
import com.yxcorp.gifshow.comment.CommentConfig;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import yk9.d;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import kk9.b;
import cl9.z;
import com.yxcorp.gifshow.comment.utils.e$c;
import ync.a;
import java.util.Objects;
import java.lang.Integer;
import com.yxcorp.gifshow.widget.d;
import cl9.a0;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import cl9.n;
import android.content.DialogInterface$OnShowListener;
import cl9.i;
import android.content.DialogInterface$OnDismissListener;
import cl9.g0;
import android.view.View$OnClickListener;
import cl9.b0;
import ak5.j;
import cl9.c0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import ek9.l1;
import android.content.SharedPreferences;
import cl9.m;
import java.lang.Runnable;
import android.widget.TextView;
import com.yxcorp.utility.n;
import cl9.d0;
import ok.x;
import zf6.k;
import android.text.method.MovementMethod;
import android.text.method.ScrollingMovementMethod;
import cl9.p;
import cl9.o;
import nk9.a;
import cl9.t;
import erd.g;
import crd.b;
import brd.t;
import cl9.u;
import cl9.v;
import cl9.l;
import cl9.k;
import io.reactivex.internal.functions.Functions;
import ek9.t0;
import com.kwai.robust.PatchProxyResult;
import rkd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import cl9.j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.List;
import xk9.d;
import com.yxcorp.gifshow.comment.utils.b;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.framework.model.user.User;
import lu7.f;
import lnc.a1;
import hl9.a;
import java.lang.CharSequence;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import rnc.i;
import com.yxcorp.gifshow.comment.utils.d;
import com.yxcorp.utility.TextUtils;
import hl9.c;

public final class y extends PresenterV2	// class@000688
{
    public TextView A;
    public View B;
    public View C;
    public View D;
    public View E;
    public e F;
    public ViewStubInflater2 G;
    public final PublishSubject H;
    public QComment I;
    public a J;
    public a K;
    public boolean L;
    public CommentsFragment M;
    public final b N;
    public RecyclerView$r O;
    public final e$b P;
    public final d Q;
    public b p;
    public QPhoto q;
    public t r;
    public t s;
    public a t;
    public t u;
    public e v;
    public t0 w;
    public d x;
    public CommentConfig y;
    public x z;
    public static final boolean R;

    static {
       y.R = a.a();
    }
    public void y(a p0,CommentsFragment p1){
       super();
       this.H = PublishSubject.g();
       this.N = new q(this);
       this.O = new y$a(this);
       this.P = new y$b(this);
       this.Q = new y$c(this);
       this.t = p0;
       this.M = p1;
    }
    public void E8(){
       y tA;
       e e;
       y oy = y.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy, "5")) {
          return;
       }
       u1.a(this);
       if (!PatchProxy.applyVoid(objArray, this, oy, "6")) {
          ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a086b, 0x7f0a086a);
          this.G = viewStubInfl;
          viewStubInfl.d(this.getActivity().findViewById(0x1020002));
          this.v.b(this.P);
          e uoe = new e(this.getActivity(), this.q, this.v, this.x, 0x7f110143, this.y.mEditorConfig);
          this.F = viewStubInfl;
          viewStubInfl.q = this.t.a(this.m8(), this.y.mEditorConfig);
          this.F.q(new z(this));
          tA = this.F;
          int i = a.b(this.getContext());
          Objects.requireNonNull(tA);
          uoe = e.class;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tA, uoe, "3")) {
             tA.t.f(i);
          }
          this.F.s(new a0(this));
          this.F.x(new n(this));
          this.F.w(new i(this));
          if (!PatchProxy.applyVoid(objArray, this, oy, "10")) {
             tA = this.E;
             if (tA != null) {
                tA.setOnClickListener(new g0(this));
             }
          }
          tA = this.B;
          if (tA != null) {
             tA.setOnClickListener(new b0(this));
          }
          tA = this.D;
          i = 0;
          y oy1 = 8;
          if (tA != null) {
             int i1 = (j.o().t())? 0: 8;
             tA.setVisibility(i1);
             this.D.setOnClickListener(new c0(this));
          }
          if (this.C != null) {
             if (y.R && j.o().t()) {
                tA = this.q;
                if (tA != null && tA.enablePictureCommentForPhoto()) {
                   this.C.setVisibility(i);
                   tA = this.M;
                   if (tA != null && tA.Kh() != null) {
                      d uod = this.M.Kh();
                      e0 uoe0 = f0.a(this.M, this.getActivity());
                      Objects.requireNonNull(uod);
                      if (!PatchProxy.applyVoidOneRefs(uoe0, uod, d.class, "88")) {
                         ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                         uElementPack.action2 = "PICTURE_COMMENT_BTN";
                         u1.B0(new ShowMetaData().setLogPage(uoe0).setType(6).setElementPackage(uElementPack));
                      }
                   }
                   if (!l1.a.getBoolean("imageGuideBubbleShown", i)) {
                      this.C.postDelayed(new m(this), 7000);
                   }
                   tA = this.A;
                   if (tA != null) {
                      tA.setPadding(tA.getPaddingLeft(), this.A.getPaddingTop(), (this.A.getPaddingRight() + n.c(this.A.getContext(), 40.00f)), this.A.getPaddingBottom());
                   }
                   this.C.setOnClickListener(new d0(this));
                }
             }
             this.C.setVisibility(oy1);
          }
       }
       tA = this.A;
       if (tA == null) {
          return;
       }else {
          this.F.r(tA);
          this.F.p(this.z);
          this.F.o(this.B);
          if (this.y.mIsSupportWhiteComment != null && (k.e() && this.y.mEditorConfig.mForceDayNightMode == null)) {
             this.F.u(16);
          }
       label_01e1 :
          this.A.setMovementMethod(ScrollingMovementMethod.getInstance());
          this.S8();
          if (!this.q.isAllowComment()) {
             this.A.setOnClickListener(p.b);
          }else {
             this.A.setOnClickListener(new o(this));
          }
          tA = this.v;
          if (tA != null) {
             e = tA.e;
             if (e != null) {
                this.onEventMainThread(e);
                this.v.e = objArray;
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, oy, "7")) {
             oy = this.s;
             if (oy != null) {
                this.X7(oy.subscribe(new t(this)));
             }
             oy = this.u;
             if (oy != null) {
                this.X7(oy.subscribe(new u(this)));
             }
             oy = this.r;
             if (oy != null) {
                this.X7(oy.subscribe(new v(this)));
             }else if(this.A != null && this.q.isAllowComment()){
                this.R8();
             }
             this.X7(this.H.subscribe(new l(this)));
             oy = this.w;
             k ok = new k(this);
             g og = Functions.d();
             Objects.requireNonNull(oy);
             b uob = PatchProxy.applyTwoRefs(ok, og, oy, t0.class, "20");
             if (uob != PatchProxyResult.class) {
             }else {
                uob = oy.g.subscribe(ok, og);
             }
             this.X7(uob);
          }
          if (b.g() && this.getActivity() instanceof GifshowActivity) {
             this.getActivity().i3(this.N);
          }
          this.X7(this.M.I5().subscribe(new j(this)));
          oy = this.M;
          y tO = this.O;
          Objects.requireNonNull(oy);
          if (!PatchProxy.applyVoidOneRefs(tO, oy, CommentsFragment.class, "23")) {
             RecyclerView recyclerView = oy.h0();
             if (recyclerView != null) {
                recyclerView.addOnScrollListener(tO);
             }else {
                oy.Q.add(tO);
             }
          }
          this.M.Gh(this.Q);
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, y.class, "4")) {
          return;
       }
       this.p = new b(this.getActivity());
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "9")) {
          return;
       }
       u1.b(this);
       this.v.j(this.P);
       y tD = this.D;
       if (tD != null) {
          tD.setOnClickListener(objArray);
       }
       tD = this.B;
       if (tD != null) {
          tD.setOnClickListener(objArray);
       }
       tD = this.A;
       if (tD != null) {
          tD.setOnClickListener(objArray);
       }
       this.F.w(objArray);
       this.F.s(objArray);
       this.F.x(objArray);
       if (b.g() && this.getActivity() instanceof GifshowActivity) {
          this.getActivity().s3(this.N);
       }
       this.M.Rh(this.Q);
       tD = this.M;
       y tO = this.O;
       Objects.requireNonNull(tD);
       if (!PatchProxy.applyVoidOneRefs(tO, tD, CommentsFragment.class, "24")) {
          RecyclerView recyclerView = tD.h0();
          if (recyclerView != null) {
             recyclerView.removeOnScrollListener(tO);
          }
          tD.Q.remove(tO);
       }
       return;
    }
    public String P8(){
       CommentEditorConfig obj = PatchProxy.apply(null, this, y.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.F.j() != null && this.F.j().getUser() != null) {
          return a1.r(0x7f10428e, f.a(this.F.j().getUser()));
       }
       obj = this.y.mEditorConfig.mBottomEditorHint;
       if (obj != null) {
          return obj;
       }
       return a.a(this.q);
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, y.class, "18")) {
          return;
       }
       if (!this.q.isAllowComment()) {
          return;
       }
       d uod = this.F.d();
       if (uod != null && this.A != null) {
          String str = this.F.h().toString();
          y tM = this.M;
          if (!PatchProxy.isSupport(d.class) || (!PatchProxy.applyVoidThreeRefs(str, Integer.valueOf(2), tM, uod, d.class, "27") && uod.a != null)) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = uod.i();
             ClientEvent$ElementPackage uElementPack = uod.e(12, str, 0x75bd);
             uElementPack.index = 2;
             u1.B0(new ShowMetaData().setLogPage(tM).setType(6).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uod.a.getFeedLogCtx()));
          }
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, y.class, "8")) {
          return;
       }
       y tF = this.F;
       String str = this.P8();
       Objects.requireNonNull(tF);
       if (!PatchProxy.applyVoidOneRefs(str, tF, e.class, "18")) {
          tF.n = str;
          if (tF.c != null || tF.d != null) {
             e q = tF.q;
             if (q == null || !q.b()) {
             }
          }else {
          }
       }
    label_0038 :
       return;
    }
    public void doBindView(View p0){
       y oy = y.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oy, "2")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, oy, "3")) {
          this.t.g(p0);
          this.E = this.t.d(p0);
          this.A = this.t.f(p0);
          this.B = this.t.b(p0);
          this.C = this.t.e(p0);
          this.D = this.t.c(p0);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.v = this.r8("COMMENT_HELPER");
       this.w = this.r8("COMMENT_GLOBAL_ACTION");
       this.y = this.q8(CommentConfig.class);
       this.u = this.t8("COMMENT_SHOW_PANEL_OBSERVABLE");
       this.z = this.t8("COMMENT_CURRENT_PROGRESS");
       this.r = this.t8("COMMENT_SHOW_PANEL_ANIM_END_OBSERVABLE");
       this.s = this.t8("COMMENT_HIDE_PANEL_OBSERVABLE");
       return;
    }
    public void onEventMainThread(a p0){
       y oy = y.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oy, "15")) {
          return;
       }
       y tq = this.q;
       if (tq == null || (!tq.equals(p0.a) || (this.F != null && p0.j == this.getActivity().hashCode()))) {
          a f = p0.f;
          this.I = f;
          this.F.z(f);
          this.F.t(p0.c);
          this.F.y(p0.d);
          CharSequence uCharSequenc = i.j(p0.b);
          this.F.A(uCharSequenc);
          y tF = this.F;
          tF.y = p0.h;
          tF.z = p0.i;
          d.m(this.A);
          if (!PatchProxy.applyVoidOneRefs(p0, this, oy, "16") && this.E != null) {
             a b = p0.b;
             if (b == null || (TextUtils.x(b) && (p0.c != null || p0.d != null))) {
                this.E.setVisibility(0);
             }else {
                this.E.setVisibility(8);
             }
          }
          c.f(this.E, this.getContext(), uCharSequenc);
          this.S8();
       }
    label_0094 :
       return;
    }
}
