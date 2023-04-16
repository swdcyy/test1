package com.yxcorp.gifshow.profile.collect.fragment.CollectionSerialFragment;
import k3c.v1;
import com.yxcorp.gifshow.profile.collect.fragment.ProfileCollectionBaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import p2c.w;
import p2c.a;
import y8c.t;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionSerialFragment$b;
import s1c.r0;
import y2c.a;
import p2c.v0;
import com.kwai.feature.api.router.social.profile.ProfileStartParam$CollectionSub;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserOwnerCount;
import java.lang.Math;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import java.lang.Boolean;
import qa6.a;
import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import i2c.z;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import android.os.Bundle;
import com.kwai.framework.model.user.QCurrentUser;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import com.yxcorp.gifshow.profile.collect.fragment.i;
import erd.r;
import i2c.t;
import com.yxcorp.gifshow.profile.collect.fragment.h;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.profile.collect.fragment.j;
import i2c.u;
import com.yxcorp.gifshow.profile.collect.fragment.g;
import ok.h;
import lnc.b9;
import cda.k;
import i2c.w;
import com.trello.rxlifecycle3.android.FragmentEvent;
import eoc.f;
import cda.l;
import i2c.v;
import z5c.d3;
import android.view.View;
import com.kwai.library.widget.refresh.RefreshLayout;
import android.view.ViewGroup;
import y8c.g;
import g2c.e;
import qvb.i;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.gifshow.profile.collect.fragment.CollectionSerialFragment$a;
import java.lang.RuntimeException;

public class CollectionSerialFragment extends ProfileCollectionBaseFragment implements v1	// class@0012a9
{
    public String H;
    public r0 I;
    public boolean J;
    public FragmentCompositeLifecycleState K;
    public b L;
    public b M;
    public boolean N;
    public b O;
    public boolean P;
    public static final int Q;

    public void CollectionSerialFragment(){
       super();
       this.H = "SERIAL";
       this.J = false;
       this.P = false;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionSerialFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new w());
       obj.U7(new a());
       PatchProxy.onMethodExit(CollectionSerialFragment.class, "1");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, CollectionSerialFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CollectionSerialFragment$b(this, this, this.I);
    }
    public void Fc(r0 p0){
       this.I = p0;
    }
    public PresenterV2 Gh(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionSerialFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       obj.U7(new a());
       obj.U7(new v0(ProfileStartParam$CollectionSub.TAB_COLLECTION_SERIAL));
       PatchProxy.onMethodExit(CollectionSerialFragment.class, "5");
       return obj;
    }
    public final void Hh(int p0){
       if (PatchProxy.isSupport(CollectionSerialFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CollectionSerialFragment.class, "11")) {
          return;
       }
       CollectionSerialFragment tI = this.I;
       if (tI == null) {
          return;
       }
       r0 b = tI.b;
       if (b != null) {
          User mOwnerCount = b.mOwnerCount;
          if (mOwnerCount != null) {
             mOwnerCount.mCollection = Math.max((mOwnerCount.mCollection + p0), 0);
             b.notifyChanged();
          }
       }
       return;
    }
    public final boolean Ih(){
       CollectionSerialFragment obj = PatchProxy.apply(null, this, CollectionSerialFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.I;
       boolean b = (obj != null && a.b(obj.b))? true: false;
       return b;
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
       CollectionSerialFragment obj = PatchProxy.apply(null, this, CollectionSerialFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.I;
       int i = 0;
       if (obj != null) {
          Object[] objArray = new Object[]{this,obj,obj.e};
          return Lists.e(objArray);
       }else {
          Object[] objArray1 = new Object[]{this};
          return Lists.e(objArray1);
       }
    }
    public void ga(boolean p0){
       this.J = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CollectionSerialFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new z();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CollectionSerialFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CollectionSerialFragment.class, new z());
       }else {
          obj.put(CollectionSerialFragment.class, null);
       }
       return obj;
    }
    public boolean h9(){
       return this.J;
    }
    public boolean i0(){
       Object obj = PatchProxy.apply(null, this, CollectionSerialFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.K.c();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionSerialFragment.class, "6")) {
          return;
       }
       super.onCreate(p0);
       this.N = QCurrentUser.me().isNotPublicProfileCollect();
       FragmentCompositeLifecycleState uFragmentCom = new FragmentCompositeLifecycleState(this);
       this.K = uFragmentCom;
       this.L = uFragmentCom.j().filter(i.b).subscribe(new t(this), h.b);
       this.M = this.K.f().filter(j.b).subscribe(new u(this), h.b);
       if (this.I != null) {
          this.O = b9.c(this.O, new g(this));
       }
       FragmentEvent dESTROY_VIEW = FragmentEvent.DESTROY_VIEW;
       f.c(k.class, new w(this), this, dESTROY_VIEW);
       f.c(l.class, new v(this), this, dESTROY_VIEW);
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CollectionSerialFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.L);
       b9.a(this.M);
       b9.a(this.O);
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, CollectionSerialFragment.class, "7")) {
          return;
       }
       super.onResume();
       CollectionSerialFragment tI = this.I;
       if (tI != null && (d3.a(tI.b) && this.N != QCurrentUser.me().isNotPublicProfileCollect())) {
          this.N = QCurrentUser.me().isNotPublicProfileCollect();
          if (this.sh() != null) {
             this.sh().p();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CollectionSerialFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.Ac().setBackgroundResource(R.color.arg_RES_7f061b13);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, CollectionSerialFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e(this);
    }
    public boolean x0(){
       return false;
    }
    public i yh(){
       String obj = PatchProxy.apply(null, this, CollectionSerialFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QCurrentUser.me().getId();
       CollectionSerialFragment tI = this.I;
       if (tI != null) {
          r0 b = tI.b;
          if (b != null) {
             obj = b.getId();
          label_002b :
             return new CollectionSerialFragment$a(this, obj);
          }
       }
       if (!SystemUtil.K()) {
          goto label_002b ;
       }else {
          throw new RuntimeException("mProfilePageParam must not be null!");
       }
    }
}
