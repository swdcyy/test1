package com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2;
import androidx.lifecycle.LifecycleObserver;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2$a;
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
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2$b;
import com.yxcorp.gifshow.follow.stagger.post.MockFeedPresenterV2$c;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewParent;
import bja.h;
import java.util.Map;
import java.util.HashMap;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import h8c.a;
import java.lang.StringBuilder;
import java.lang.Long;
import q87.c;
import kotlin.Pair;

public final class MockFeedPresenterV2 extends PresenterV2 implements LifecycleObserver, g	// class@0011c7
{
    public BaseFragment p;
    public final PublishSubject q;
    public a r;
    public static final MockFeedPresenterV2$a s;

    static {
       MockFeedPresenterV2.s = new MockFeedPresenterV2$a(null);
    }
    public void MockFeedPresenterV2(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.q = publishSubje;
       this.U7(new MockViewPresenter());
       this.U7(new MockUITransitionPresenter());
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MockFeedPresenterV2.class, "6")) {
          return;
       }
       MockFeedPresenterV2 tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tp.getLifecycle().addObserver(this);
       tp = this.r;
       if (tp == null) {
          a.S("mockFeedViewModel");
       }
       this.X7(tp.j.subscribe(new MockFeedPresenterV2$b(this), MockFeedPresenterV2$c.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MockFeedPresenterV2.class, "7")) {
          return;
       }
       MockFeedPresenterV2 tp = this.p;
       if (tp == null) {
          a.S("mFragment");
       }
       tp.getLifecycle().removeObserver(this);
       return;
    }
    public final a P8(){
       MockFeedPresenterV2 obj = PatchProxy.apply(null, this, MockFeedPresenterV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("mockFeedViewModel");
       }
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MockFeedPresenterV2.class, "8")) {
          return;
       }
       ViewStub viewStub = null;
       ViewStub viewStub1 = (p0 != null)? p0.findViewById(R.id.mock_feed_view_stub): viewStub;
       if (viewStub1 != null) {
          int i = (viewStub1.getParent() != null)? 1: 0;
          if (i) {
             viewStub = viewStub1;
          }
          if (viewStub != null) {
             viewStub.setLayoutResource(R.layout.arg_RES_7f0d0837);
             viewStub.inflate();
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MockFeedPresenterV2.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MockFeedPresenterV2.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MockFeedPresenterV2.class, new h());
       }else {
          obj.put(MockFeedPresenterV2.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MockFeedPresenterV2.class, "5")) {
          return;
       }
       ViewModel obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       obj = ViewModelProviders.of(obj).get(a.class);
       a.o(obj, "ViewModelProviders.of\(it¡­eedViewModel::class.java\)");
       this.r = obj;
       return;
    }
    public final void reloadMockAndInsertCompletedPhotoBeforeJumpIfNeeded(){
       if (PatchProxy.applyVoid(null, this, MockFeedPresenterV2.class, "9")) {
          return;
       }
       MockFeedPresenterV2 tr = this.r;
       String str = "mockFeedViewModel";
       if (tr == null) {
          a.S(str);
       }
       tr.q0();
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       QPhoto qPhoto = tr.r0();
       if (qPhoto != null) {
          String photoId = qPhoto.getPhotoId();
          a.o(photoId, "it.photoId");
          Object[] objArray = new Object[0];
          a.C().w("MockFeedPresenterV2", "reloadMockAndInsertCompletedPhotoBeforeJumpIfNeeded\(\) "+" insert mock feed "+Long.parseLong(photoId), objArray);
          photoId = qPhoto.getPhotoId();
          a.o(photoId, "it.photoId");
          this.q.onNext(new Pair(Long.valueOf(Long.parseLong(photoId)), qPhoto));
       }
       return;
    }
}
