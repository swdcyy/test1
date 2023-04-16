package com.yxcorp.gifshow.profile.nasa.ProfileNasaFragmentContainer;
import on5.f;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import crd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import eb5.b;
import java.lang.Number;
import on5.e;
import com.yxcorp.gifshow.refresh.RefreshType;
import fr6.a;
import wq6.k;
import wq6.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import java.lang.Integer;
import com.yxcorp.gifshow.profile.util.o;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.profile.fragment.MyProfileFragment;
import tkd.b;
import tkd.d;
import nl9.u;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.profile.fragment.BaseProfileFragment;
import vu5.b;
import androidx.fragment.app.e;
import s1c.a1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import org.greenrobot.eventbus.a;
import crd.b;
import lnc.b9;
import b66.k$a;
import hka.l;
import com.yxcorp.gifshow.util.rx.RxBus;
import cx5.d;
import brd.t;
import t45.d;
import brd.z;
import f4c.c;
import erd.g;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import com.yxcorp.gifshow.profile.nasa.a;
import f4c.a;
import io.reactivex.internal.functions.Functions;
import wq6.d;
import android.content.Intent;

public class ProfileNasaFragmentContainer extends BaseFragment implements f	// class@001405
{
    public b j;
    public boolean k;
    public boolean l;
    public int m;
    public a n;
    public static final int o;

    public void ProfileNasaFragmentContainer(){
       super();
       this.n = new a();
    }
    public boolean B7(){
       BaseFragment obj = PatchProxy.apply(null, this, ProfileNasaFragmentContainer.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.ch();
       if (obj instanceof b) {
          return obj.Mf();
       }
       return false;
    }
    public void L8(){
       if (PatchProxy.applyVoid(null, this, ProfileNasaFragmentContainer.class, "18")) {
          return;
       }
       BaseFragment uBaseFragmen = this.ch();
       if (uBaseFragmen instanceof b) {
          uBaseFragmen.T9();
       }
       return;
    }
    public int M(){
       BaseFragment obj = PatchProxy.apply(null, this, ProfileNasaFragmentContainer.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.ch();
       if (obj != null) {
          return obj.M();
       }
       return super.M();
    }
    public void N1(){
       e.j(this);
    }
    public void U0(boolean p0){
       e.k(this, p0);
    }
    public void X(RefreshType p0,boolean p1){
       e.i(this, p0, p1);
    }
    public boolean Xg(){
       return false;
    }
    public String a2(){
       BaseFragment obj = PatchProxy.apply(null, this, ProfileNasaFragmentContainer.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.ch();
       if (obj != null) {
          return obj.a2();
       }
       return super.a2();
    }
    public void a6(){
       e.b(this);
    }
    public a b0(){
       return j.a(this);
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, ProfileNasaFragmentContainer.class, "10")) {
          return;
       }
       if (this.k != null) {
          BaseFragment uBaseFragmen = this.ch();
          if (uBaseFragmen != null) {
             uBaseFragmen.c0();
          }
       }
       return;
    }
    public final BaseFragment ch(){
       Fragment obj = PatchProxy.apply(null, this, ProfileNasaFragmentContainer.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getHost() != null && this.k != null) {
          obj = this.getChildFragmentManager().findFragmentById(R.id.content_fragment);
          if (obj instanceof BaseFragment) {
             return obj;
          }
       }
       return null;
    }
    public final void dh(int p0){
       boolean b;
       if (PatchProxy.isSupport(ProfileNasaFragmentContainer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ProfileNasaFragmentContainer.class, "16")) {
          return;
       }
       BaseFragment uBaseFragmen = this.ch();
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          u obj = PatchProxy.applyTwoRefs(uBaseFragmen, Integer.valueOf(p0), null, oo, "27");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(!QCurrentUser.ME.isLogined()){
             p0 = uBaseFragmen instanceof MyProfileFragment ^ 1;
          }else if(!uBaseFragmen instanceof MyProfileFragment){
             obj = d.a(-1694791652);
             User user = uBaseFragmen.ab();
             int userType = (user != null)? user.getUserType(): 0;
             if (obj.v7(userType) == obj.v7(p0)) {
                p0 = 0;
             }
          }
          p0 = 1;
       }else {
          goto label_0039 ;
       }
       if (b && this.k != null) {
          this.eh();
       }
       return;
    }
    public final void eh(){
       if (PatchProxy.applyVoid(null, this, ProfileNasaFragmentContainer.class, "17")) {
          return;
       }
       BaseFragment uBaseFragmen = d.a(-1718536792).T7(false);
       uBaseFragmen.setUserVisibleHint(this.getUserVisibleHint());
       if (this.K0()) {
          uBaseFragmen.u();
       }else {
          uBaseFragmen.c0();
       }
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.v(R.id.content_fragment, uBaseFragmen);
       uoe.m();
       return;
    }
    public int f(){
       BaseFragment obj = PatchProxy.apply(null, this, ProfileNasaFragmentContainer.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.ch();
       if (obj != null) {
          return obj.f();
       }
       return super.f();
    }
    public int getPage(){
       return 0x7602;
    }
    public String getPageParams(){
       BaseFragment obj = PatchProxy.apply(null, this, ProfileNasaFragmentContainer.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.ch();
       if (obj != null) {
          return obj.getPageParams();
       }
       return super.getPageParams();
    }
    public String getUrl(){
       BaseFragment obj = PatchProxy.apply(null, this, ProfileNasaFragmentContainer.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.ch();
       if (obj != null) {
          return obj.getUrl();
       }
       return super.getUrl();
    }
    public boolean i8(){
       return e.e(this);
    }
    public boolean o3(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, ProfileNasaFragmentContainer.class, "21");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.apply(null, this, ProfileNasaFragmentContainer.class, "4");
       if (obj != patchProxyRe) {
          obj.booleanValue();
       }else {
          BaseFragment uBaseFragmen = this.ch();
          if (uBaseFragmen instanceof a1 && uBaseFragmen.isResumed()) {
             uBaseFragmen.v7();
          }
       }
       return false;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileNasaFragmentContainer.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d04ac, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ProfileNasaFragmentContainer.class, "3")) {
          return;
       }
       a.d().t(this);
       ProfileNasaFragmentContainer tn = this.n;
       if (tn != null) {
          tn.dispose();
       }
       super.onDestroyView();
       b9.a(this.j);
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileNasaFragmentContainer.class, "5")) {
          return;
       }
       if (p0.a == 2) {
          int userType = QCurrentUser.ME.getUserType();
          this.m = userType;
          this.dh(userType);
       }
       return;
    }
    public void onRefresh(){
       if (PatchProxy.applyVoid(null, this, ProfileNasaFragmentContainer.class, "20")) {
          return;
       }
       BaseFragment uBaseFragmen = this.ch();
       if (uBaseFragmen instanceof l) {
          uBaseFragmen.a();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, ProfileNasaFragmentContainer.class, "7")) {
          return;
       }
       super.onResume();
       if (this.l != null) {
          this.l = false;
          this.dh(this.m);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileNasaFragmentContainer.class, "2")) {
          return;
       }
       this.a6();
       super.onViewCreated(p0, p1);
       a.d().p(this);
       ProfileNasaFragmentContainer tn = this.n;
       if (tn != null) {
          RxBus f = RxBus.f;
          tn.c(f.f(d.class).observeOn(d.a).subscribe(new c(this)));
          this.n.c(f.g(n.class, RxBus$ThreadMode.MAIN).subscribe(new a(this)));
       }
       if (this.K0()) {
          this.k = true;
          this.eh();
       }else {
          this.j = this.n1().subscribe(new a(this), Functions.d());
       }
       return;
    }
    public int r(){
       return e.a(this);
    }
    public d s8(){
       return j.b(this);
    }
    public void setUserVisibleHint(boolean p0){
       if (PatchProxy.isSupport(ProfileNasaFragmentContainer.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ProfileNasaFragmentContainer.class, "8")) {
          return;
       }
       super.setUserVisibleHint(p0);
       if (this.k != null) {
          BaseFragment uBaseFragmen = this.ch();
          if (uBaseFragmen != null) {
             uBaseFragmen.setUserVisibleHint(p0);
          }
       }
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, ProfileNasaFragmentContainer.class, "9")) {
          return;
       }
       if (this.k != null) {
          BaseFragment uBaseFragmen = this.ch();
          if (uBaseFragmen != null) {
             uBaseFragmen.u();
          }
       }
       return;
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileNasaFragmentContainer.class, "22")) {
          return;
       }
       BaseFragment uBaseFragmen = this.ch();
       if (uBaseFragmen != null) {
          uBaseFragmen.y2(p0);
       }
       return;
    }
    public d z5(){
       return j.c(this);
    }
}
