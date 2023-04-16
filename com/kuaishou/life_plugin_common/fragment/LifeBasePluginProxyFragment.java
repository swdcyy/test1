package com.kuaishou.life_plugin_common.fragment.LifeBasePluginProxyFragment;
import on5.f;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gl0.a;
import q87.c;
import fl0.b;
import on5.e;
import androidx.fragment.app.Fragment;
import java.lang.Number;
import k2b.e0;
import k2b.d0;
import com.yxcorp.gifshow.refresh.RefreshType;
import fr6.a;
import wq6.k;
import wq6.j;
import androidx.fragment.app.c;
import java.lang.Boolean;
import android.content.Intent;
import java.lang.Integer;
import android.os.Bundle;
import lnc.g2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import im8.c;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import wq6.d;
import java.lang.StringBuilder;

public abstract class LifeBasePluginProxyFragment extends BaseFragment implements f, g2$a	// class@00092f
{
    public g2 j;

    public void LifeBasePluginProxyFragment(){
       super();
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, LifeBasePluginProxyFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[0];
       a.C().w("LifeBasePluginProxyFragment", "onCreatePresenter", objArray);
       PatchProxy.onMethodExit(LifeBasePluginProxyFragment.class, "12");
       return new b();
    }
    public boolean B7(){
       return e.f(this);
    }
    public void L8(){
       if (PatchProxy.applyVoid(null, this, LifeBasePluginProxyFragment.class, "10")) {
          return;
       }
       Fragment uFragment = this.dh();
       if (uFragment instanceof f) {
          uFragment.L8();
       }else {
          e.h(this);
       }
       return;
    }
    public int M(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.dh();
       if (obj instanceof BaseFragment) {
          return obj.M();
       }
       return super.M();
    }
    public void N1(){
       e.j(this);
    }
    public String P7(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.dh();
       if (obj instanceof BaseFragment) {
          return obj.P7();
       }
       return d0.i(this);
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
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.dh();
       if (obj instanceof BaseFragment) {
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
       if (PatchProxy.applyVoid(null, this, LifeBasePluginProxyFragment.class, "7")) {
          return;
       }
       if (this.dh() instanceof BaseFragment && this.dh().isVisible()) {
          this.dh().c0();
       }
       return;
    }
    public abstract Fragment ch();
    public Fragment dh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LifeBasePluginProxyFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.isAdded()) {
          return objArray;
       }
       return this.getChildFragmentManager().findFragmentByTag(this.eh());
    }
    public abstract String eh();
    public int f(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.dh();
       if (obj instanceof BaseFragment) {
          return obj.f();
       }
       return super.f();
    }
    public int getPage(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.dh();
       if (obj instanceof BaseFragment) {
          return obj.getPage();
       }
       return super.getPage();
    }
    public String getPageParams(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.dh();
       if (obj instanceof BaseFragment) {
          return obj.getPageParams();
       }
       return super.getPageParams();
    }
    public String getUrl(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.dh();
       if (obj instanceof BaseFragment) {
          return obj.getUrl();
       }
       return super.getUrl();
    }
    public String h5(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.dh();
       if (obj instanceof BaseFragment) {
          return obj.h5();
       }
       return d0.g(this);
    }
    public boolean i8(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.dh();
       if (obj instanceof f) {
          return obj.i8();
       }
       return e.e(this);
    }
    public String o(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.dh();
       if (obj instanceof BaseFragment) {
          return obj.o();
       }
       return super.o();
    }
    public boolean o3(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.dh();
       if (obj instanceof f) {
          return obj.o3();
       }
       return e.d(this);
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(LifeBasePluginProxyFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, LifeBasePluginProxyFragment.class, "4")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       Object[] objArray = new Object[0];
       a.C().w("LifeBasePluginProxyFragment", "onActivityResult", objArray);
       if (this.dh() != null) {
          this.dh().onActivityResult(p0, p1, p2);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifeBasePluginProxyFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       Object[] objArray = new Object[0];
       a.C().w("LifeBasePluginProxyFragment", "onCreate", objArray);
       this.j = new g2(this, this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LifeBasePluginProxyFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       Object[] objArray = new Object[0];
       a.C().w("LifeBasePluginProxyFragment", "onCreateView", objArray);
       return a.c(p0, 0x7f0d08e2, p1, 0);
    }
    public void onRefresh(){
       e.g(this);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LifeBasePluginProxyFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = new Object[0];
       a.C().w("LifeBasePluginProxyFragment", "onViewCreated", objArray);
       c[] uocArray = new c[]{new c("FRAGMENT", this)};
       this.j.b(Lists.e(uocArray));
       this.a6();
       return;
    }
    public String pg(){
       Fragment obj = PatchProxy.apply(null, this, LifeBasePluginProxyFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.dh();
       if (obj instanceof BaseFragment) {
          return obj.pg();
       }
       return super.pg();
    }
    public int r(){
       return e.a(this);
    }
    public d s8(){
       return j.b(this);
    }
    public void setUserVisibleHint(boolean p0){
       if (PatchProxy.isSupport(LifeBasePluginProxyFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LifeBasePluginProxyFragment.class, "11")) {
          return;
       }
       super.setUserVisibleHint(p0);
       Object[] objArray = new Object[0];
       a.C().w("LifeBasePluginProxyFragment", "setUserVisibleHint isVisibleToUser = "+p0, objArray);
       Fragment uFragment = this.dh();
       if (uFragment instanceof BaseFragment) {
          uFragment.setUserVisibleHint(p0);
       }
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, LifeBasePluginProxyFragment.class, "6")) {
          return;
       }
       if (this.dh() instanceof BaseFragment && this.dh().isVisible()) {
          this.dh().u();
       }
       return;
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LifeBasePluginProxyFragment.class, "5")) {
          return;
       }
       super.y2(p0);
       Object[] objArray = new Object[0];
       a.C().w("LifeBasePluginProxyFragment", "onActivityNewIntent", objArray);
       if (this.dh() instanceof BaseFragment) {
          this.dh().y2(p0);
       }
       return;
    }
    public d z5(){
       return j.c(this);
    }
}
