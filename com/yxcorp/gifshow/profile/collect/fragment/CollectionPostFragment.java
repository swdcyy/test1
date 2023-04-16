package com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment;
import k3c.v1;
import com.yxcorp.gifshow.profile.collect.fragment.ProfileCollectionBaseFragment;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import p2c.w;
import p2c.a;
import p2c.z0;
import y8c.t;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment$d;
import s1c.r0;
import y2c.a;
import p2c.v0;
import com.kwai.feature.api.router.social.profile.ProfileStartParam$CollectionSub;
import java.lang.Integer;
import com.yxcorp.gifshow.profile.constant.ProfileTab;
import k2b.e0;
import t3c.c;
import android.view.View;
import java.lang.CharSequence;
import lnc.a1;
import i2c.h;
import r2c.h;
import java.lang.Boolean;
import r2c.g;
import android.view.View$OnClickListener;
import java.lang.StringBuilder;
import android.text.style.ClickableSpan;
import android.text.SpannableStringBuilder;
import com.yxcorp.gifshow.profile.util.ClickableSpanUtil;
import androidx.fragment.app.Fragment;
import java.lang.Number;
import qvb.i;
import com.kwai.framework.model.user.UserOwnerCount;
import z5c.i2;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import i2b.a;
import r2c.j;
import com.kwai.framework.model.user.User;
import java.lang.Math;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import qvb.n0;
import qvb.a;
import qa6.a;
import android.widget.TextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import i2c.j;
import j2c.f;
import kotlin.jvm.internal.a;
import j2c.b;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.profile.collect.fragment.a;
import u07.t$a;
import android.app.Activity;
import u07.f;
import java.util.Objects;
import j2c.c;
import msd.a;
import u07.u;
import j2c.d;
import j2c.e;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import g9c.d;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import i2c.r;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import android.content.res.Configuration;
import rkd.b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import i2c.i;
import java.lang.Runnable;
import ekd.k1;
import android.os.Bundle;
import com.kwai.framework.model.user.QCurrentUser;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.content.res.Resources;
import brd.t;
import com.yxcorp.gifshow.profile.collect.fragment.e;
import erd.r;
import i2c.l;
import com.yxcorp.gifshow.profile.collect.fragment.d;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.profile.collect.fragment.b;
import ok.h;
import lnc.b9;
import android.view.LayoutInflater;
import lnc.u1;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import qvb.q;
import qvb.j;
import cda.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.profile.collect.network.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import i2c.n;
import z5c.d3;
import com.kwai.library.widget.refresh.RefreshLayout;
import z8c.d;
import cw9.c;
import androidx.recyclerview.widget.RecyclerView$n;
import y8c.g;
import g2c.d;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment$c;
import androidx.recyclerview.widget.GridLayoutManager$b;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionPostFragment$b;

public class CollectionPostFragment extends ProfileCollectionBaseFragment implements v1	// class@0012a6
{
    public String H;
    public int I;
    public r0 J;
    public boolean K;
    public FragmentCompositeLifecycleState L;
    public b M;
    public boolean N;
    public Runnable O;
    public boolean P;
    public View Q;
    public b R;
    public UserOwnerCount S;
    public Runnable T;
    public b U;
    public b V;
    public int W;
    public final q X;
    public static final int Y;

    public void CollectionPostFragment(){
       super();
       this.H = "POST";
       this.K = false;
       this.W = -1;
       this.X = new CollectionPostFragment$a(this);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionPostFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new w());
       obj.U7(new a());
       obj.U7(new z0());
       PatchProxy.onMethodExit(CollectionPostFragment.class, "1");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CollectionPostFragment$d(this, this, this.J);
    }
    public void Fc(r0 p0){
       this.J = p0;
    }
    public PresenterV2 Gh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionPostFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a());
       obj.U7(new v0(ProfileStartParam$CollectionSub.TAB_COLLECTION_POST));
       PatchProxy.onMethodExit(CollectionPostFragment.class, "5");
       return obj;
    }
    public void Hh(int p0){
       if (PatchProxy.isSupport(CollectionPostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CollectionPostFragment.class, "24")) {
          return;
       }
       if (!this.Mh()) {
          return;
       }
       p0 = this.Jh();
       if (p0 > 0) {
          this.Nh(p0, false);
          this.Ph();
          c.c(this, p0, ProfileTab.TAB_COLLECT);
       }else if(PatchProxy.applyVoid(null, this, CollectionPostFragment.class, "34")){
          this.Kh().setVisibility(8);
       }
       return;
    }
    public CharSequence Ih(){
       SpannableStringBuilder spannableStr;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "25");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.Jh() <= 0) {
          return this.getString(0x7f103fda);
       }
       obj = a1.p(R.string.arg_RES_7f103e90);
       h oh = new h(this);
       if (PatchProxy.isSupport(h.class)) {
          spannableStr = PatchProxy.applyThreeRefs(obj, Boolean.TRUE, oh, null, h.class, "1");
          if (spannableStr != patchProxyRe) {
          label_0060 :
             return spannableStr;
          }
       }
       String str = a1.p(R.string.arg_RES_7f103f1b);
       spannableStr = ClickableSpanUtil.a(obj+" "+str, str, new g(oh));
       goto label_0060 ;
    }
    public final int Jh(){
       Object obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return i2.b(this.S, this.q().getCount(), 6);
    }
    public final View Kh(){
       View obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Q == null) {
          obj = a.i(this.h0(), R.layout.arg_RES_7f0d160f);
          this.Q = obj;
          int paddingLeft = obj.getPaddingLeft();
          int paddingTop = this.Q.getPaddingTop();
          int paddingRight = this.Q.getPaddingRight();
          int i = (j.c(this))? a1.d(R.dimen.arg_RES_7f070bf1): 0;
          obj.setPadding(paddingLeft, paddingTop, paddingRight, i);
       }
       return this.Q;
    }
    public final void Lh(int p0){
       if (PatchProxy.isSupport(CollectionPostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CollectionPostFragment.class, "15")) {
          return;
       }
       r0 b = this.J.b;
       if (b != null) {
          User mOwnerCount = b.mOwnerCount;
          if (mOwnerCount != null) {
             mOwnerCount.mCollection = Math.max((mOwnerCount.mCollection + p0), 0);
             b.notifyChanged();
             CollectionPostFragment tV = this.V;
             if (tV != null && !tV.hasMore()) {
                if (this.V.isEmpty() && this.sh() != null) {
                   this.Ih();
                   this.sh().i();
                }else {
                   this.Hh(this.q().getCount());
                }
             }
          }
       }
       return;
    }
    public boolean Mh(){
       CollectionPostFragment obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.J;
       boolean b = (obj != null && a.b(obj.b))? true: false;
       return b;
    }
    public final void Nh(int p0,boolean p1){
       String str;
       if (PatchProxy.isSupport(CollectionPostFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, CollectionPostFragment.class, "27")) {
          return;
       }
       TextView textView = this.Kh().findViewById(R.id.invalid_tip_tv);
       if (!p1) {
          textView.setMovementMethod(LinkMovementMethod.getInstance());
       }
       if (p1) {
          str = a1.q(R.string.arg_RES_7f103f20, p0);
       }else {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          String obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "28");
          if (obj != patchProxyRe) {
          }else {
             String str1 = a1.q(R.string.arg_RES_7f103eb6, this.Jh());
             j oj = new j(this, this.Jh());
             if (PatchProxy.isSupport(f.class)) {
                obj = PatchProxy.applyThreeRefs(str1, Boolean.TRUE, oj, null, f.class, "1");
                if (obj != patchProxyRe) {
                }
             }
             a.p(str1, "src");
             obj = a1.p(R.string.arg_RES_7f103f1b);
             obj = ClickableSpanUtil.a(str1+' '+obj, obj, new b(oj));
             a.o(obj, "ClickableSpanUtil.create¡­c, target, clickableSpan\)");
          }
          str = obj;
       }
       textView.setText(str);
       return;
    }
    public final void Oh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CollectionPostFragment.class, "29")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       r0 c = this.J.c;
       int i = this.Jh();
       a uoa = new a(this);
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray1 = new Object[]{activity,this,Integer.valueOf(c),Integer.valueOf(i),uoa};
          if (PatchProxy.applyVoid(objArray1, objArray, uof, "3")) {
          label_00b3 :
             return;
          }
       }
       a.p(activity, "activity");
       a.p(this, "logPage");
       a.p(uoa, "onPositive");
       objArray = 6;
       ProfileTab tAB_LIKE = (c != objArray)? ProfileTab.TAB_LIKE: ProfileTab.TAB_COLLECT;
       t$a uoa1 = f.e(new t$a(activity));
       uoa1.X0(a1.p(R.string.arg_RES_7f103f1f));
       Objects.requireNonNull(f.a);
       int i1 = (c != objArray)? 0x7f103f1e: 0x7f103f1c;
       uoa1.z0(a1.p(i1));
       uoa1.T0(a1.p(R.string.arg_RES_7f103f1d));
       uoa1.R0(a1.p(R.string.cancel));
       uoa1.u0(new c(this, i, tAB_LIKE, uoa));
       uoa1.t0(new d(this, i, tAB_LIKE));
       uoa1.Y(new e(this, i, tAB_LIKE));
       goto label_00b3 ;
    }
    public final void Ph(){
       if (PatchProxy.applyVoid(null, this, CollectionPostFragment.class, "33")) {
          return;
       }
       View view = this.Kh();
       if (!this.ia().T0(view)) {
          this.ia().L0(view);
       }
       view.setVisibility(0);
       return;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public int f(){
       return 165;
    }
    public List fg(){
       CollectionPostFragment tJ;
       Object[] obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Object[]{this,tJ,tJ.e};
       tJ = this.J;
       return Lists.e(obj);
    }
    public void ga(boolean p0){
       this.K = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CollectionPostFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new r();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CollectionPostFragment.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CollectionPostFragment.class, new r());
       }else {
          obj.put(CollectionPostFragment.class, null);
       }
       return obj;
    }
    public boolean h9(){
       return this.K;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.L.c();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionPostFragment.class, "6")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (this.N != null) {
          return;
       }
       if (b.g()) {
          this.I = p0.orientation;
          if (!PatchProxy.applyVoid(null, this, CollectionPostFragment.class, "7")) {
             this.h0().setLayoutManager(this.xh());
          }
       }
       this.N = true;
       i oi = new i(this, p0);
       this.O = oi;
       k1.r(oi, 500);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionPostFragment.class, "8")) {
          return;
       }
       super.onCreate(p0);
       this.P = QCurrentUser.me().isNotPublicProfileCollect();
       this.L = new FragmentCompositeLifecycleState(this);
       this.I = this.getActivity().getResources().getConfiguration().orientation;
       this.M = this.L.j().filter(e.b).subscribe(new l(this), d.b);
       if (this.J != null) {
          this.R = b9.c(this.R, new b(this));
          this.S = this.J.b.mOwnerCount;
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CollectionPostFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       u1.a(this);
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CollectionPostFragment.class, "12")) {
          return;
       }
       i oi = this.q();
       if (oi != null) {
          oi.f(this.X);
       }
       b9.a(this.U);
       this.V = null;
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CollectionPostFragment.class, "11")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.M);
       b9.a(this.R);
       u1.b(this);
       if (!PatchProxy.applyVoid(null, this, CollectionPostFragment.class, "31")) {
          CollectionPostFragment tT = this.T;
          if (tT != null) {
             k1.m(tT);
             this.T = null;
          }
       }
       return;
    }
    public void onEventMainThread(c p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionPostFragment.class, "14")) {
          return;
       }
       if (!this.Mh()) {
          return;
       }
       c a = p0.a;
       int i = 0;
       if (a == 2) {
          p0 = p0.b;
          i obj = PatchProxy.applyOneRefs(p0, this, CollectionPostFragment.class, "13");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.q();
             int i1 = obj.getCount() - 1;
             while (i1 >= 0) {
                QPhoto item = obj.getItem(i1);
                if ((item.getPhotoId()).equals(p0.getPhotoId())) {
                   obj.remove(item);
                   i = 1;
                }
                i1 = i1 - 1;
             }
             b = i;
          }
          if (b) {
             this.V.l2();
             this.Lh(-1);
          }
       }else if(a == 1 && (!this.q().isEmpty() || (this.W > null && !this.q().getItems().contains(p0.b)))){
          CollectionPostFragment tV = this.V;
          p0 = p0.b;
          Objects.requireNonNull(tV);
          if (!PatchProxy.applyVoidOneRefs(p0, tV, b.class, "7")) {
             tV.i2(i, p0);
          }
          this.V.l2();
          if (!this.h0().getLayoutManager().i0()) {
             k1.s(new n(this), this, 200);
          }
          this.Lh(1);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, CollectionPostFragment.class, "9")) {
          return;
       }
       super.onResume();
       if (d3.a(this.J.b) && this.P != QCurrentUser.me().isNotPublicProfileCollect()) {
          this.P = QCurrentUser.me().isNotPublicProfileCollect();
          if (this.sh() != null) {
             this.sh().p();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CollectionPostFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.Ac().setBackgroundResource(R.color.arg_RES_7f061b13);
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, CollectionPostFragment.class, "20")) {
          return;
       }
       super.th();
       this.h0().addItemDecoration(new d(c.b(this.getResources(), R.dimen.box), 3, this.ia()));
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(this.J);
    }
    public boolean x0(){
       return false;
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 3;
       if (b.g() && this.I == 2) {
          i = 5;
       }
       GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getContext(), i);
       gridLayoutMa.m1(new CollectionPostFragment$c(this, i));
       return gridLayoutMa;
    }
    public i yh(){
       CollectionPostFragment$b obj = PatchProxy.apply(null, this, CollectionPostFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CollectionPostFragment$b(this, this.J.b.getId());
       obj.h(this.X);
       this.V = obj;
       return obj;
    }
}
