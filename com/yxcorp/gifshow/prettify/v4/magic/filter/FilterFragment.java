package com.yxcorp.gifshow.prettify.v4.magic.filter.FilterFragment;
import ml8.d;
import im8.g;
import com.kwai.feature.post.api.fragment.FlyWheelBaseFragment;
import io.reactivex.subjects.PublishSubject;
import android.util.SparseArray;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.util.ArrayList;
import d1c.c;
import p0c.c;
import java.util.List;
import java.util.Collection;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import o1c.w0;
import n1c.h;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.kwai.robust.PatchProxyResult;
import o1c.q0;
import java.util.Map;
import java.util.HashMap;
import android.content.Context;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.app.Activity;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import p0c.c$a;
import o0c.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.trello.rxlifecycle3.components.support.RxFragment;
import d1c.e;
import com.yxcorp.gifshow.prettify.v4.magic.filter.z;

public class FilterFragment extends FlyWheelBaseFragment implements d, g	// class@0011a6
{
    public boolean[] A;
    public BaseFragment n;
    public PublishSubject o;
    public c p;
    public h q;
    public SparseArray r;
    public PublishSubject s;
    public PublishSubject t;
    public PublishSubject u;
    public PublishSubject v;
    public PostBubbleManager w;
    public PrettifyConfigView x;
    public PresenterV2 y;
    public Activity z;

    public void FilterFragment(){
       super();
       this.o = PublishSubject.g();
       this.r = new SparseArray();
       this.s = PublishSubject.g();
       this.t = PublishSubject.g();
       this.u = PublishSubject.g();
       boolean[] uobooleanArr = new boolean[]{false};
       this.A = uobooleanArr;
       super.setArguments(new Bundle());
    }
    public String E7(){
       return "Filter";
    }
    public void ch(boolean p0){
       if (PatchProxy.isSupport(FilterFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FilterFragment.class, "11")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       uArrayList.addAll(this.p.e().l());
       uArrayList.addAll(this.p.e().g());
       w0 ow0 = h.b(p0, this.A, this.p.e().r(), uArrayList.indexOf(this.p.e().a()), uArrayList, this.p.e());
       if (ow0 != null) {
          c uoc = this.p.e();
          boolean b = (ow0.c() == -111)? true: false;
          uoc.q(b);
          this.p.e().o(ow0.a());
       }
       FilterFragment ty = this.y;
       if (ty != null && ty.R1()) {
          this.t.onNext(Boolean.valueOf(p0));
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterFragment.class, "1")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a0e7e);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FilterFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, FilterFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(FilterFragment.class, new q0());
       }else {
          obj.put(FilterFragment.class, null);
       }
       return obj;
    }
    public void onAttach(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterFragment.class, "2")) {
          return;
       }
       super.onAttach(p0);
       if (p0 instanceof Activity) {
          this.z = p0;
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FilterFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       if (this.p == null) {
          ExceptionHandler.handleCaughtException(new Throwable("beauty fragment finish unexpected"));
          this.p = new c$a().a();
       }
       this.n = this;
       if (this.p.g() != null) {
          this.p.g().f6();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FilterFragment.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       Context context = p0.getContext();
       int i = (this.p.d() != -1)? this.p.d(): 0x7f0d12d5;
       View view = a.d(context, i, p1, false);
       this.doBindView(view);
       this.r.clear();
       int[] ointArray = (this.getArguments() == null)? null: SerializableHook.getSerializable(this.getArguments(), "fragment_tab_key");
       if (!PatchProxy.applyVoidOneRefs(ointArray, this, FilterFragment.class, "10")) {
          if (ointArray == null || ointArray.length <= 1) {
             this.x.setDividerViewVisibility(8);
          }else {
             this.x.setDividerViewVisibility(4);
          }
       }
       if (this.p.g() != null) {
          this.p.g().W5();
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FilterFragment.class, "9")) {
          return;
       }
       super.onDestroy();
       if (this.p.g() != null) {
          this.p.g().x5();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FilterFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.y.unbind();
       this.p.f().L(this.r);
       if (this.p.g() != null) {
          this.p.g().f5();
       }
       this.r.clear();
       return;
    }
    public void onHiddenChanged(boolean p0){
       if (PatchProxy.isSupport(FilterFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FilterFragment.class, "6")) {
          return;
       }
       super.onHiddenChanged(p0);
       this.o.onNext(Boolean.valueOf(p0));
       if (this.p.g() != null) {
          this.p.g().v6(p0);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, FilterFragment.class, "7")) {
          return;
       }
       super.onPause();
       this.s.onNext(Boolean.TRUE);
       if (this.p.g() != null) {
          this.p.g().n4();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, FilterFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.y = presenterV2;
       presenterV2.U7(new z());
       this.y.f(p0);
       Object[] objArray = new Object[]{this};
       this.y.i(objArray);
       if (this.p.g() != null) {
          this.p.g().q4(p0, p1);
       }
       return;
    }
}
