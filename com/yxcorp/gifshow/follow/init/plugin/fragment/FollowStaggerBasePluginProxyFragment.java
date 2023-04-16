package com.yxcorp.gifshow.follow.init.plugin.fragment.FollowStaggerBasePluginProxyFragment;
import on5.f;
import lnc.g2$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import pha.a;
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
import mha.e;
import com.kwai.soc.arch.rubas.base.Rubas;
import com.kwai.social.config.utils.ArchConfigUtil;
import k2b.u1;

public abstract class FollowStaggerBasePluginProxyFragment extends BaseFragment implements f, g2$a	// class@0010b8
{
    public g2 j;
    public boolean k;

    public void FollowStaggerBasePluginProxyFragment(){
       super();
       this.k = false;
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, FollowStaggerBasePluginProxyFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER_PLUGIN.appendTag("FollowStaggerBasePluginProxyFragment"), "onCreatePresenter");
       PatchProxy.onMethodExit(FollowStaggerBasePluginProxyFragment.class, "10");
       return new a();
    }
    public boolean B7(){
       return e.f(this);
    }
    public void L8(){
       if (PatchProxy.applyVoid(null, this, FollowStaggerBasePluginProxyFragment.class, "8")) {
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "14");
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "17");
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "13");
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
    public abstract Fragment ch();
    public Fragment dh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, FollowStaggerBasePluginProxyFragment.class, "6");
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "19");
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "18");
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "12");
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "16");
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "15");
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "21");
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "11");
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
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "7");
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
       if (PatchProxy.isSupport(FollowStaggerBasePluginProxyFragment.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, FollowStaggerBasePluginProxyFragment.class, "4")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       c.i(KsLogFollowTag.FOLLOW_STAGGER_PLUGIN.appendTag("FollowStaggerBasePluginProxyFragment"), "onActivityResult");
       if (this.dh() != null) {
          this.dh().onActivityResult(p0, p1, p2);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowStaggerBasePluginProxyFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       c.i(KsLogFollowTag.FOLLOW_STAGGER_PLUGIN.appendTag("FollowStaggerBasePluginProxyFragment"), "onCreate");
       this.j = new g2(this, this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FollowStaggerBasePluginProxyFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       c.i(KsLogFollowTag.FOLLOW_STAGGER_PLUGIN.appendTag("FollowStaggerBasePluginProxyFragment"), "onCreateView");
       return a.c(p0, 0x7f0d0470, p1, false);
    }
    public void onRefresh(){
       e.g(this);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FollowStaggerBasePluginProxyFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       c.i(KsLogFollowTag.FOLLOW_STAGGER_PLUGIN.appendTag("FollowStaggerBasePluginProxyFragment"), "onViewCreated");
       c[] uocArray = new c[]{new c("FRAGMENT", this)};
       this.j.b(Lists.e(uocArray));
       this.a6();
       return;
    }
    public String pg(){
       Fragment obj = PatchProxy.apply(null, this, FollowStaggerBasePluginProxyFragment.class, "20");
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
       if (PatchProxy.isSupport(FollowStaggerBasePluginProxyFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FollowStaggerBasePluginProxyFragment.class, "9")) {
          return;
       }
       super.setUserVisibleHint(p0);
       KsLogFollowTag fOLLOW_STAGG = KsLogFollowTag.FOLLOW_STAGGER_PLUGIN;
       String str = "FollowStaggerBasePluginProxyFragment";
       fOLLOW_STAGG.appendTag(str);
       c.i(fOLLOW_STAGG, "setUserVisibleHint isVisibleToUser = "+p0);
       Fragment uFragment = this.dh();
       if (uFragment instanceof BaseFragment) {
          uFragment.setUserVisibleHint(p0);
       }
       if (p0) {
          p0 = e.a();
          if (this.k == null) {
             String str1 = "first_enter_follow_plugin_state_";
             Rubas.c(str1+p0);
             if (ArchConfigUtil.b.a()) {
                u1.R(str1+p0, null, 13);
             }
             this.k = true;
          }
          Rubas.c("enter_follow_plugin_state_"+p0);
          if (ArchConfigUtil.b.a()) {
             u1.R("enter_follow_plugin_state_"+p0, null, 13);
          }
          c.i(fOLLOW_STAGG.appendTag(str), "onPageSelect, plugin is Installed="+p0);
       }
       return;
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public void y2(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowStaggerBasePluginProxyFragment.class, "5")) {
          return;
       }
       super.y2(p0);
       c.i(KsLogFollowTag.FOLLOW_STAGGER_PLUGIN.appendTag("FollowStaggerBasePluginProxyFragment"), "onActivityNewIntent");
       if (this.dh() instanceof BaseFragment) {
          this.dh().y2(p0);
       }
       return;
    }
    public d z5(){
       return j.c(this);
    }
}
