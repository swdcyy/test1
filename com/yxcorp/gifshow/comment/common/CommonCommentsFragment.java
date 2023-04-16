package com.yxcorp.gifshow.comment.common.CommonCommentsFragment;
import com.kwai.component.tabs.panel.a$b;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import java.util.ArrayList;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dl9.p;
import kk9.a;
import ok9.c;
import ik9.f;
import ik9.c;
import ik9.e;
import y8c.t;
import java.util.Objects;
import nx9.c;
import com.yxcorp.gifshow.comment.common.c;
import com.yxcorp.gifshow.comment.CommentParams;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.f;
import com.yxcorp.gifshow.comment.CommentConfig;
import com.yxcorp.gifshow.comment.common.b;
import yg5.k0;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import java.lang.Boolean;
import fk9.c;
import fk9.d;
import ik9.g;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Integer;
import qk9.h;
import android.util.SparseArray;
import java.util.List;
import java.util.Collection;
import android.view.View;
import android.os.Bundle;
import mrd.a;
import hk9.f;
import erd.g;
import crd.b;
import brd.t;
import hk9.g;
import ik9.d;
import xk9.a;
import hl9.d;
import java.lang.IllegalArgumentException;
import io.reactivex.subjects.CompletableSubject;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import hk9.i;
import java.lang.Runnable;
import ekd.k1;
import t45.d;
import brd.z;
import brd.a;
import hk9.e;
import erd.a;
import xk9.h;
import com.trello.rxlifecycle3.components.support.RxFragment;
import hk9.h;
import kk9.c;
import hk9.b;
import com.yxcorp.gifshow.comment.e;
import ek9.t0;
import ok.x;
import com.yxcorp.gifshow.comment.log.a;
import yk9.d;
import com.yxcorp.gifshow.comment.CommentPageListConfig;
import al9.a;
import qvb.i;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment$a;
import androidx.fragment.app.Fragment;
import yg5.t0;
import yg5.s0;
import nk9.h;
import brd.y;
import y8c.g;
import yg5.r0;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.comment.CommentTipsConfig;
import com.yxcorp.gifshow.comment.common.CommonCommentsFragment$1;
import android.content.Context;
import androidx.recyclerview.widget.ObservableLinearLayoutManager;

public final class CommonCommentsFragment extends CommentsFragment implements a$b	// class@00109e
{
    public c S;
    public final List T;
    public d U;
    public a V;
    public boolean W;
    public boolean X;
    public k0 Y;
    public static final int Z;

    public void CommonCommentsFragment(){
       super();
       this.T = new ArrayList();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CommonCommentsFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new p(this));
       CommonCommentsFragment tV = this.V;
       if (tV != null) {
          obj.U7(c.b(this, tV));
       }
       if (this.S.e() != null) {
          e uoe = this.S.e().a(this);
          if (uoe != null) {
             PresenterV2 presenterV2 = new PresenterV2();
             presenterV2.U7(uoe.a);
             presenterV2.U7(obj);
             presenterV2.U7(uoe.b);
             PatchProxy.onMethodExit(CommonCommentsFragment.class, "6");
             return presenterV2;
          }
       }
       PatchProxy.onMethodExit(CommonCommentsFragment.class, "6");
       return obj;
    }
    public t Bh(){
       c this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommentsFragment obj = PatchProxy.apply(null, this, CommonCommentsFragment.class, "10");
       if (obj != patchProxyRe) {
          return obj;
       }
       CommonCommentsFragment tS = this.S;
       obj = this.H;
       CommentsFragment tI = this.I;
       CommentsFragment tJ = this.J;
       Objects.requireNonNull(tS);
       this = PatchProxy.applyFourRefs(this, obj, tI, tJ, tS, c.class, "2");
       if (this != patchProxyRe) {
       }else if(c.f()){
          super(this, tI.mQPhoto, obj, tJ);
       }else {
          super(this, tI.mQPhoto, obj, tJ);
       }
       return this;
    }
    public void I4(k0 p0){
       this.Y = p0;
    }
    public int M(){
       Object obj = PatchProxy.apply(null, this, CommonCommentsFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.Jh().mPageCategory != -1) {
          return this.Jh().mPageCategory;
       }
       return super.M();
    }
    public int Mh(){
       Object obj = PatchProxy.apply(null, this, CommonCommentsFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.Jh().mEditorConfig.mFloatEditorTheme;
    }
    public boolean Nh(){
       Object obj = PatchProxy.apply(null, this, CommonCommentsFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.Jh().mIsSupportWhiteComment;
    }
    public c Oh(){
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, CommonCommentsFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d();
       if (this.S.a() != null) {
          objArray = this.S.a().a;
       }
       if (objArray != null) {
          Iterator iterator = objArray.keySet().iterator();
          while (iterator.hasNext()) {
             int i = iterator.next().intValue();
             h oh = objArray.get(Integer.valueOf(i));
             d uod = d.class;
             if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), oh, obj, uod, "1")) {
                continue ;
             }
             obj.b.put(i, oh);
          }
       }
       return obj;
    }
    public void Sh(c p0){
       this.S = p0;
       this.X = true;
    }
    public List fg(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, CommonCommentsFragment.class, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = super.fg();
       if (this.S.e() != null) {
          f uof = this.S.e();
          Objects.requireNonNull(uof);
          Object obj1 = PatchProxy.applyOneRefs(this, uof, f.class, "1");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             f a = uof.a;
             if (a == null) {
                a = uof.b(this);
             }
             uof = a;
          }
       }
       if (objArray != null) {
          obj.addAll(objArray);
       }
       CommonCommentsFragment tY = this.Y;
       if (tY != null) {
          obj.add(tY);
       }
       return obj;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommonCommentsFragment.class, "4")) {
          return;
       }
       super.fh(p0, p1);
       if (this.S.l() != null) {
          this.T.add(this.S.l().subscribe(new f(this)));
       }
       if (this.S.k() != null) {
          this.T.add(this.S.k().subscribe(new g(this)));
       }
       return;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, CommonCommentsFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.U.a();
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommonCommentsFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(CommonCommentsFragment.class, null);
       return objectsByTag;
    }
    public int getPage(){
       Object obj = PatchProxy.apply(null, this, CommonCommentsFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.Jh().mPage != -1) {
          return this.Jh().mPage;
       }
       return super.getPage();
    }
    public boolean lh(){
       return this.J.mUseLazyInit;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, CommonCommentsFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Jh().mForcePage2Null != null) {
          return null;
       }
       return super.o();
    }
    public void onCreate(Bundle p0){
       a uoa;
       boolean b;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "3";
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonCommentsFragment.class, str)) {
          return;
       }
       if (this.S == null) {
          uoa = d.a(a.class, this);
          if (uoa != null) {
             this.S = uoa.get();
          }else {
             Object obj = PatchProxy.applyOneRefs(p0, this, CommonCommentsFragment.class, "2");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(p0 == null){
                b = false;
             }else {
                b = p0.getBoolean("IS_CREATOR_FROM_OUTSIDE", false);
             }
             if (!b) {
                this.S = new c();
             }else {
                throw new IllegalArgumentException(" please provide CommentComponentsCreatorGetter to support custom CommentComponentsCreator , or disable auto restore Activity!!! ");
             }
          }
       }
       if (this.S.b() != null && this.Jh().mUseLazyInit != null) {
          this.q = true;
          if (this.S.b().B()) {
             k1.r(new i(this), 0);
          }else {
             this.T.add(this.S.b().s(d.a).t(new e(this)));
          }
       }
       if (this.S.f() != null) {
          this.T.add(this.m().subscribe(new h(this)));
       }
       super.onCreate(p0);
       CommentsFragment tH = this.H;
       CommonCommentsFragment tS = this.S;
       CommentsFragment tI = this.I;
       CommentsFragment tJ = this.J;
       Objects.requireNonNull(tS);
       b uob = PatchProxy.applyTwoRefs(tI, tJ, tS, uoc, "4");
       if (uob != patchProxyRe) {
       }else {
          uob = new b();
          uob.b(tJ.mEditorConfig);
          uob.c(tI.mQPhoto);
       }
       tH.V = uob;
       tH.R = this.S.g(this.I);
       tH.S = this.S.h();
       tH.T = this.S.d();
       tH.U = this.S.c();
       tH = this.H;
       tS = this.S;
       tI = this.I;
       Objects.requireNonNull(tS);
       uoa = PatchProxy.applyTwoRefs(this, tI, tS, uoc, "1");
       if (uoa != patchProxyRe) {
       }else {
          uoa = new a(this, tI.mQPhoto);
       }
       this.L = uoa;
       tH.e = uoa;
       tH = this.H;
       tS = this.S;
       tI = this.I;
       tJ = this.J;
       Objects.requireNonNull(tS);
       d uod = PatchProxy.applyTwoRefs(tI, tJ, tS, uoc, str);
       if (uod != patchProxyRe) {
       }else {
          uod = new d(tI.mQPhoto, false, tJ.mLogCommentIncludeQuickCommentInfo, tI.mCommentLoggerSource);
          uod.H(tJ);
       }
       this.K = uod;
       tH.f = uod;
       a uoa1 = this.S.i(this.I, this.J.mPageListConfig);
       this.G = uoa1;
       if (!uoa1.g() && (this.G.isLoading() || this.G.L0() != null)) {
          this.M = true;
       }
       this.U = this.S.j();
       this.V = this.S.j().b(this);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CommonCommentsFragment.class, "19")) {
          return;
       }
       super.onDestroy();
       k1.r(new CommonCommentsFragment$a(this), 0);
       Iterator iterator = this.T.iterator();
       while (iterator.hasNext()) {
          b uob = iterator.next();
          if (!uob.isDisposed()) {
             uob.dispose();
          }
       }
       this.T.clear();
       return;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonCommentsFragment.class, "1")) {
          return;
       }
       super.onSaveInstanceState(p0);
       if (this.X != null) {
          p0.putBoolean("IS_CREATOR_FROM_OUTSIDE", true);
       }
       return;
    }
    public int qh(){
       Object obj = PatchProxy.apply(null, this, CommonCommentsFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.U.c();
    }
    public void s(boolean p0){
       if (PatchProxy.isSupport(CommonCommentsFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CommonCommentsFragment.class, "5")) {
          return;
       }
       s0.a(this, p0);
       if (!p0) {
          this.H.t.onNext(new h());
       }
       return;
    }
    public void th(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CommonCommentsFragment.class, "8")) {
          return;
       }
       super.th();
       if (this.S.a() != null) {
          objArray = this.S.a().b;
       }
       if (objArray != null) {
          Iterator iterator = objArray.keySet().iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             this.g7().n1(str, objArray.get(str));
          }
       }
       return;
    }
    public void wd(int p0,int p1,int p2,float p3,int p4){
       s0.c(this, p0, p1, p2, p3, p4);
    }
    public void xe(boolean p0,r0 p1){
       s0.b(this, p0, p1);
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, CommonCommentsFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.J.mTipsConfig.mForceTipsCenter != null) {
          return new CommonCommentsFragment$1(this, this.getContext());
       }
       return new ObservableLinearLayoutManager(this.getContext());
    }
}
