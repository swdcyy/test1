package com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter;
import androidx.lifecycle.LifecycleObserver;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter$a;
import nsd.u;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.stagger.post.MockViewPresenter;
import com.yxcorp.gifshow.follow.stagger.post.MockUITransitionPresenter;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import dja.a;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter$b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.f;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenter$c;
import erd.g;
import crd.b;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kwai.robust.PatchProxyResult;
import android.view.ViewStub;
import android.view.ViewParent;
import bja.d;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import tkd.b;
import tkd.d;
import lv5.d;
import o26.d;
import com.yxcorp.gifshow.entity.QPhoto;
import h8c.a;
import java.lang.StringBuilder;
import java.lang.Long;
import q87.c;
import kotlin.Pair;

public final class MockFeedPresenter extends PresenterV2 implements LifecycleObserver, g	// class@0011c3
{
    public BaseFragment p;
    public View q;
    public final PublishSubject r;
    public a s;
    public d t;
    public static final MockFeedPresenter$a u;

    static {
       MockFeedPresenter.u = new MockFeedPresenter$a(null);
    }
    public void MockFeedPresenter(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.r = publishSubje;
       this.U7(new MockViewPresenter());
       this.U7(new MockUITransitionPresenter());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MockFeedPresenter.class, "8")) {
          return;
       }
       MockFeedPresenter tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       tp.getLifecycle().addObserver(this);
       tp = this.s;
       if (tp == null) {
          a.S("mockFeedViewModel");
       }
       a i = tp.i;
       MockFeedPresenter tp1 = this.p;
       if (tp1 == null) {
          a.S(str);
       }
       i.observe(tp1, new MockFeedPresenter$b(this));
       this.X7(RxBus.f.f(f.class).observeOn(d.a).subscribe(new MockFeedPresenter$c(this)));
       return;
    }
    public void F8(){
       MockFeedPresenter tq;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MockFeedPresenter.class, "9")) {
          return;
       }
       if (i.c()) {
          tq = this.q;
          if (tq != null) {
             objArray = tq.getLayoutParams();
          }
          if (objArray != null) {
             Context context = this.getContext();
             a.m(context);
             objArray.topMargin = n.A(context);
          }
       }else {
          tq = this.q;
          if (tq != null) {
             objArray = tq.getLayoutParams();
          }
          if (objArray != null) {
             objArray.topMargin = 0;
          }
       }
       tq = this.q;
       if (tq != null) {
          tq.requestLayout();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MockFeedPresenter.class, "10")) {
          return;
       }
       MockFeedPresenter tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tp.getLifecycle().removeObserver(this);
       return;
    }
    public final a P8(){
       MockFeedPresenter obj = PatchProxy.apply(null, this, MockFeedPresenter.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("mockFeedViewModel");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MockFeedPresenter.class, "11")) {
          return;
       }
       View view = null;
       ViewStub viewStub = (p0 != null)? p0.findViewById(R.id.mock_feed_view_stub): view;
       if (viewStub != null) {
          int i = (viewStub.getParent() != null)? 1: 0;
          if (!i) {
             viewStub = view;
          }
          if (viewStub != null) {
             viewStub.setLayoutResource(R.layout.arg_RES_7f0d0838);
             viewStub.inflate();
          }
       }
       if (p0 != null) {
          view = p0.findViewById(R.id.mock_feed_layout);
       }
       this.q = view;
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MockFeedPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MockFeedPresenter.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MockFeedPresenter.class, new d());
       }else {
          obj.put(MockFeedPresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MockFeedPresenter.class, "7")) {
          return;
       }
       ViewModel obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = ViewModelProviders.of(obj).get(a.class);
       a.o(obj, "ViewModelProviders.of\(it¡­eedViewModel::class.java\)");
       this.s = obj;
       b uob = d.a(-447917650);
       a.o(uob, "PluginManager.get\(MockFeedRepoPlugin::class.java\)");
       d uod = uob.XV();
       a.o(uod, "PluginManager.get\(MockFe¡­:class.java\).mockFeedRepo");
       this.t = uod;
       return;
    }
    public final void reloadMockAndInsertCompletedPhotoBeforeJumpIfNeeded(){
       if (PatchProxy.applyVoid(null, this, MockFeedPresenter.class, "12")) {
          return;
       }
       MockFeedPresenter ts = this.s;
       String str = "mockFeedViewModel";
       if (ts == null) {
          a.S(str);
       }
       ts.q0();
       ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       QPhoto qPhoto = ts.r0();
       if (qPhoto != null) {
          String photoId = qPhoto.getPhotoId();
          a.o(photoId, "it.photoId");
          Object[] objArray = new Object[0];
          a.C().w("MockFeedPresenter", "reloadMockAndInsertCompletedPhotoBeforeJumpIfNeeded\(\) "+" insert mock feed "+Long.parseLong(photoId), objArray);
          photoId = qPhoto.getPhotoId();
          a.o(photoId, "it.photoId");
          this.r.onNext(new Pair(Long.valueOf(Long.parseLong(photoId)), qPhoto));
       }
       return;
    }
}
