package com.kuaishou.post.story.entrance.StoryMoodFragment;
import ml8.d;
import mm6.c;
import im8.g;
import com.yxcorp.gifshow.fragment.PostBaseFragment;
import com.kuaishou.post.story.entrance.e;
import crd.a;
import mm6.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import android.view.View;
import ekd.m1;
import com.kuaishou.post.story.widget.StoryDecorationContainerView;
import java.lang.Boolean;
import androidx.fragment.app.Fragment;
import iq4.v;
import java.util.Map;
import java.util.HashMap;
import java.lang.StringBuilder;
import android.graphics.drawable.Drawable;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.content.Intent;
import pi9.c;
import rp4.b;
import android.view.animation.Animation;
import java.lang.Integer;
import rp4.c;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.font.vm.FontViewModel;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.lifecycle.ViewModelStore;
import crd.b;
import lnc.b9;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import android.view.KeyEvent;
import hka.d;
import hka.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rp4.n;
import android.view.Window;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import lq.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import lq.a;
import brd.t;
import com.kuaishou.post.story.entrance.g;
import com.kuaishou.post.story.entrance.h;
import erd.g;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import sm6.b;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout$LayoutParams;
import com.kuaishou.post.story.entrance.j;
import com.kuaishou.post.story.entrance.d;
import iq4.w;
import wp4.a;

public class StoryMoodFragment extends PostBaseFragment implements d, c, g	// class@000b2d
{
    public StoryMoodFragment p;
    public String q;
    public e r;
    public MoodTemplateRepo s;
    public StoryDecorationContainerView t;
    public PresenterV2 u;
    public a v;
    public boolean w;
    public FontViewModel x;
    public static final int y;

    public void StoryMoodFragment(){
       super();
       this.p = this;
       this.q = "PRODUCE_MOOD_PHOTO";
       this.r = new e();
       this.v = new a();
       this.w = false;
       this.x = null;
    }
    public int Ff(){
       return b.c(this);
    }
    public int M(){
       return 1;
    }
    public int S5(){
       return b.d(this);
    }
    public String Xa(){
       Object obj = PatchProxy.apply(null, this, StoryMoodFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.o();
    }
    public boolean a4(){
       return true;
    }
    public void dg(Activity p0){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryMoodFragment.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0a6c);
       return;
    }
    public boolean f9(){
       Object obj = PatchProxy.apply(null, this, StoryMoodFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.isVisible() ^ 0x01);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StoryMoodFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, StoryMoodFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(StoryMoodFragment.class, new v());
       }else {
          obj.put(StoryMoodFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, StoryMoodFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "task_id="+this.r.i;
    }
    public Drawable i9(){
       return b.i(this);
    }
    public boolean lf(){
       return b.h(this);
    }
    public String o(){
       return this.q;
    }
    public void onAttach(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryMoodFragment.class, "3")) {
          return;
       }
       super.onAttach(p0);
       Object obj = null;
       Intent intent = (p0 != null)? p0.getIntent(): obj;
       this.r.i = c.b(intent, true);
       e i = this.r.i;
       if (!PatchProxy.applyVoidOneRefs(i, obj, b.class, "1")) {
          b.a = b.c("task_id", i);
       }
       return;
    }
    public boolean onBackPressed(){
       return false;
    }
    public Animation onCreateAnimation(int p0,boolean p1,int p2){
       if (PatchProxy.isSupport(StoryMoodFragment.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Integer.valueOf(p2), this, StoryMoodFragment.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (!p1 && (p2 == 0x7f01011c || p2 == 0x7f010125)) {
          c.b(406, "click_back");
       }
       return super.onCreateAnimation(p0, p1, p2);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, StoryMoodFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d1570, p1, false);
       this.doBindView(view);
       this.t.setEnableDecorationView(false);
       this.t.setEnableAutoUnSelect(false);
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, StoryMoodFragment.class, "10")) {
          return;
       }
       super.onDestroy();
       StoryMoodFragment tx = this.x;
       if (tx != null) {
          tx.C0();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, StoryMoodFragment.class, "9")) {
          return;
       }
       super.onDestroyView();
       StoryMoodFragment tu = this.u;
       if (tu != null) {
          tu.unbind();
          this.u.destroy();
          this.u = null;
       }
       this.getViewModelStore().clear();
       b9.a(this.v);
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(StoryMoodFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, StoryMoodFragment.class, "7")) {
          return;
       }
       super.onHiddenChanged(p0);
       if (!p0 && (this.getActivity() != null && this.getActivity() instanceof CameraActivity)) {
          this.getActivity().V0(0, true);
       }
    label_0035 :
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       return c.a(this, p0, p1);
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       return c.b(this, p0, p1);
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StoryMoodFragment.class, "6")) {
          return;
       }
       super.onResume();
       if (n.h()) {
          this.getActivity().getWindow().setStatusBarColor(0);
       }
       if (this.w == null) {
          String str = b.a(0x4b316083).h1(this.o(), objArray);
          if (TextUtils.x(i.m().z("USER_TRACE_INFO_KEY"))) {
             i.m().Q("USER_TRACE_INFO_KEY", str);
          }
          this.w = true;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StoryMoodFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (this.getActivity() != null && this.getActivity().isFinishing()) {
          return;
       }
       boolean b = true;
       if (this.getActivity() != null && PostExperimentUtils.r()) {
          FontViewModel uFontViewMod = ViewModelProviders.of(this.getActivity()).get(FontViewModel.class);
          this.x = uFontViewMod;
          uFontViewMod.y0(b);
       }
       this.v.c(i.m().p().init().subscribe(g.b, h.b));
       if (!PatchProxy.applyVoidOneRefs(p0, this, StoryMoodFragment.class, "5")) {
          KwaiActionBar kwaiActionBa = p0.findViewById(R.id.title_root);
          RelativeLayout$LayoutParams layoutParams = kwaiActionBa.getLayoutParams();
          layoutParams.topMargin = b.p(this.getActivity(), p0);
          kwaiActionBa.setLayoutParams(layoutParams);
          if (this.getArguments() != null && this.getArguments().containsKey("key_close_button_resource")) {
             kwaiActionBa.i(this.getArguments().getInt("key_close_button_resource"));
          }
       }
       this.p = this;
       PresenterV2 presenterV2 = new PresenterV2();
       this.u = presenterV2;
       presenterV2.U7(new j());
       this.u.U7(new d());
       this.u.U7(new w());
       if (PostExperimentUtils.q()) {
          this.u.U7(new a());
       }
       this.u.f(p0);
       Object[] objArray = new Object[b];
       objArray[0] = this;
       this.u.i(objArray);
       return;
    }
    public boolean re(){
       return b.g(this);
    }
    public boolean x2(){
       return true;
    }
}
