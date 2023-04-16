package com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import ek9.f;
import androidx.collection.ArraySet;
import ml9.b;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.comment.CommentConfig;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Parcelable;
import org.parceler.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dl9.o2;
import e9c.f;
import y8c.q;
import e9c.i;
import hka.l;
import el9.k0;
import com.yxcorp.gifshow.comment.presenter.global.g;
import el9.e0;
import com.yxcorp.gifshow.comment.presenter.global.i;
import nx9.c;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import cl9.i2;
import com.yxcorp.gifshow.comment.presenter.global.a;
import com.yxcorp.gifshow.comment.presenter.global.j;
import com.yxcorp.gifshow.comment.presenter.global.b;
import cl9.k2;
import pk9.g;
import com.yxcorp.gifshow.comment.presenter.global.f;
import el9.l0;
import cl9.v1;
import xk9.d;
import java.util.List;
import xk9.g;
import java.util.Set;
import yk9.d;
import fk9.c;
import fk9.d;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import y8c.g;
import fk9.b;
import java.util.Objects;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import zf6.l;
import im8.c;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment$a;
import androidx.recyclerview.widget.RecyclerView;
import ok9.a;
import java.util.Iterator;
import androidx.recyclerview.widget.RecyclerView$r;
import g9c.d;
import java.util.Map;
import com.yxcorp.gifshow.comment.log.a;
import jk9.a;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import xk9.i;
import hl9.d;
import com.yxcorp.gifshow.comment.e;
import ek9.t0;
import hk9.b;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import al9.a;
import ml9.a;
import android.view.ContextThemeWrapper;
import android.content.Context;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.fragment.app.FragmentActivity;
import ml9.d;
import ml9.c;
import java.lang.reflect.Type;
import el.a;
import com.yxcorp.gifshow.comment.config.RecommendGodComment;
import ek9.l1;
import android.app.Activity;
import y8c.t;
import q2b.h$b;
import k2b.u1;
import qvb.i;
import com.yxcorp.gifshow.model.response.CommentResponse;
import ok9.b;
import ekd.k1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.ObservableLinearLayoutManager;
import com.kuaishou.android.model.mix.QComment;
import al9.b;

public class CommentsFragment extends RecyclerFragment	// class@0010cf
{
    public QPhoto F;
    public a G;
    public f H;
    public CommentParams I;
    public CommentConfig J;
    public d K;
    public a L;
    public boolean M;
    public b N;
    public Set O;
    public b P;
    public List Q;
    public static final int R;

    public void CommentsFragment(){
       super();
       this.H = new f();
       this.O = new ArraySet();
       this.P = new b(true);
       this.Q = new ArrayList();
    }
    public static final Bundle Ih(QPhoto p0,CommentParams p1,CommentConfig p2){
       Bundle obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, CommentsFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Bundle();
       if (p1 == null) {
          p1 = new CommentParams();
       }
       p1.mQPhoto = p0;
       obj.putParcelable("COMMENT_PARAMS", b.c(p1));
       obj.putParcelable("COMMENT_CONFIG", b.c(p2));
       return obj;
    }
    public PresenterV2 B2(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PresenterV2 obj = PatchProxy.applyWithListener(objArray, this, CommentsFragment.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new o2());
       obj.U7(new f(this));
       obj.U7(new i(this));
       obj.U7(new k0());
       obj.U7(new g());
       obj.U7(new e0(this.J.mAvoidAdaptEditorPanelCoverList));
       obj.U7(new i(0));
       if (this.J.mEnableLastViewedButton != null) {
          Object obj1 = PatchProxy.apply(objArray, objArray, c.class, "2");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("enableCommentLastViewedButton", 0);
          if (b) {
             obj.U7(new i2());
          }
       }
       obj.U7(new a());
       obj.U7(new j());
       if (this.J.mAutoSendAttachPageEvent != null) {
          obj.U7(new b());
       }
       if (this.J.mEnableShowPermissionTips != null) {
          obj.U7(new k2(this.F.isMine(), g.a()));
       }
       if (this.J.mEnableConversation != null) {
          obj.U7(new f());
       }
       if (this.J.mEnableSubItemAnimation != null) {
          obj.U7(new l0());
       }
       if (this.J.mEnableBaseEditorWidget != null) {
          obj.U7(new v1());
       }
       PatchProxy.onMethodExit(CommentsFragment.class, "11");
       return obj;
    }
    public final void Gh(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentsFragment.class, "25")) {
          return;
       }
       this.H.j.add(p0);
       return;
    }
    public final void Hh(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentsFragment.class, "21")) {
          return;
       }
       this.O.add(p0);
       return;
    }
    public CommentConfig Jh(){
       Object obj = PatchProxy.apply(null, this, CommentsFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.Ph();
       return this.J;
    }
    public final d Kh(){
       return this.K;
    }
    public final List Lh(){
       return this.H.j;
    }
    public int Mh(){
       return 0x7f11013f;
    }
    public boolean N5(){
       return false;
    }
    public boolean Nh(){
       return this.J.mIsSupportWhiteComment;
    }
    public c Oh(){
       Object obj = PatchProxy.apply(null, this, CommentsFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d();
    }
    public void Ph(){
       if (PatchProxy.applyVoid(null, this, CommentsFragment.class, "2")) {
          return;
       }
       if (this.I != null) {
          return;
       }
       this.I = b.a(this.getArguments().getParcelable("COMMENT_PARAMS"));
       CommentConfig uCommentConf = b.a(this.getArguments().getParcelable("COMMENT_CONFIG"));
       this.J = uCommentConf;
       if (uCommentConf == null) {
          this.J = new CommentConfig();
       }
       this.F = this.I.mQPhoto;
       return;
    }
    public boolean Qh(Runnable p0){
       b obj = PatchProxy.applyOneRefs(p0, this, CommentsFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.g7() instanceof b || !this.g7().u1()) {
          return false;
       }
       obj = this.g7();
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidOneRefs(p0, obj, b.class, "5")) {
          obj.G.add(p0);
       }
       return true;
    }
    public final void Rh(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentsFragment.class, "26")) {
          return;
       }
       this.H.j.remove(p0);
       return;
    }
    public boolean Xg(){
       return false;
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CommentsFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Nh()) {
          p0 = l.x(p0);
       }
       return super.eh(p0, p1, p2);
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, CommentsFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(new c("LOAD_MORE_HELPER", new CommentsFragment$a(this, this.h0())));
       obj.add(this.H);
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentsFragment.class, "5")) {
          return;
       }
       super.fh(p0, p1);
       if (this.M != null) {
          p0.post(new a(this));
       }
       Iterator iterator = this.Q.iterator();
       while (iterator.hasNext()) {
          this.h0().addOnScrollListener(iterator.next());
       }
       this.Q.clear();
       iterator.v = true;
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentsFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(CommentsFragment.class, null);
       return objectsByTag;
    }
    public boolean i0(){
       return (this.M ^ 0x01);
    }
    public void onCreate(Bundle p0){
       i oi;
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentsFragment.class, "1")) {
          return;
       }
       this.Ph();
       super.onCreate(p0);
       CommentsFragment tH = this.H;
       CommentsFragment tF = this.F;
       tH.b = tF;
       tH.c = this.I;
       d uod = new d(tF, false, this.J.mLogCommentIncludeQuickCommentInfo);
       this.K = uod;
       uod.H(this.J);
       uod.f = this.K;
       this.L = new a(this, this.F);
       uod.Z = new a(this.F);
       tH = this.H;
       tH.V0 = this;
       tH.e = this.L;
       tH.g = this.J.mPageListConfig.mEnableCommentEmotion;
       tH.h = this.Mh();
       tH = this.H;
       tH.d = this.J;
       tH.o = this.N;
       tH.m = this.O;
       if (tH.R == null || tH.S == null) {
          oi = d.a(i.class, this);
          if (oi != null) {
             this.H.R = oi.T6();
             this.H.S = oi.m4();
          }
       }
       b uob = new b();
       uob.b(this.J.mEditorConfig);
       uob.c(this.F);
       oi.V = uob;
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CommentsFragment.class, "18")) {
          return;
       }
       super.onDestroyView();
       CommentsFragment tG = this.G;
       if (tG != null) {
          tG.e1();
       }
       tG = this.P;
       Objects.requireNonNull(tG);
       if (!PatchProxy.applyVoid(objArray, tG, b.class, "2")) {
          Iterator iterator = tG.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
          tG.a.clear();
       }
       return;
    }
    public LayoutInflater onGetLayoutInflater(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentsFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.J.mThemeStyle != null) {
          return super.onGetLayoutInflater(p0).cloneInContext(new ContextThemeWrapper(this.getContext(), this.J.mThemeStyle));
       }
       return super.onGetLayoutInflater(p0);
    }
    public void onViewCreated(View p0,Bundle p1){
       b b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentsFragment.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       CommentsFragment tP = this.P;
       CommentsFragment tJ = this.J;
       f r = this.H.R;
       FragmentActivity activity = this.getActivity();
       Objects.requireNonNull(tP);
       if (!PatchProxy.applyVoidThreeRefs(tJ, r, activity, tP, b.class, "1")) {
          b = tP.b;
          d uod = d.class;
          boolean b1 = true;
          if (PatchProxy.isSupport(uod)) {
             RecommendGodComment obj = PatchProxy.applyTwoRefs(Boolean.valueOf(b), tJ, null, uod, "1");
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
             label_004d :
                obj = l1.f(new c().getType());
                if (obj != null && obj.oneClickRecommendGodComment != null) {
                   if (b != null) {
                      b1 = b1 ^ tJ.mDisableGodCommentRecommendGuide;
                   }
                }else {
                   b1 = 0;
                }
             }
          }else {
             goto label_004d ;
          }
          if (b1) {
             tP.a.add(new d(r, activity));
          }
          Iterator iterator = tP.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().b();
          }
       }
       return;
    }
    public t sh(){
       Object obj = PatchProxy.apply(null, this, CommentsFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.sh();
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(CommentsFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, CommentsFragment.class, "17")) {
          return;
       }
       super.v2(p0, p1);
       if (!p0) {
          u1.r0(h$b.d(7, 305));
       }
       if (this.q().L0() instanceof CommentResponse) {
          this.F.setNumberOfComments(this.q().L0().mCommentCount);
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             k1.r(new b(this, activity), 0);
          }
       }
       return;
    }
    public final g vh(){
       b obj = PatchProxy.apply(null, this, CommentsFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b(this, this.F, this.H, this.Oh());
       CommentsFragment tJ = this.J;
       if (tJ.mPageListConfig.mEnableCommentEmotion != null) {
          obj.H = true;
       }
       obj.J = tJ.mEnableFixScrollError;
       return obj;
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, CommentsFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ObservableLinearLayoutManager(this.getContext());
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, CommentsFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.G == null) {
          this.G = b.a(this.F, this.I.mComment, this.J.mPageListConfig);
       }
       return this.G;
    }
}
