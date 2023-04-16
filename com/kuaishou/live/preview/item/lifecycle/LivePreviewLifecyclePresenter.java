package com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter;
import im8.g;
import a51.c;
import com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter$a;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;
import java.util.LinkedList;
import com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter$b;
import com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter$3;
import com.kuaishou.live.preview.item.lifecycle.LivePreviewLifecyclePresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import androidx.viewpager.widget.ViewPager$i;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.List;
import java.util.Iterator;
import wk3.b;
import com.kwai.robust.PatchProxyResult;
import wk3.e;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class LivePreviewLifecyclePresenter extends c implements g	// class@000dec
{
    public LiveWillShowType A;
    public float B;
    public SlidePlayViewModel C;
    public final List D;
    public final a E;
    public final DefaultLifecycleObserver F;
    public final ViewPager$i G;
    public f v;
    public BaseFragment w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void LivePreviewLifecyclePresenter(){
       super();
       this.v = new LivePreviewLifecyclePresenter$a(this);
       this.A = LiveWillShowType.NONE;
       this.D = new LinkedList();
       this.E = new LivePreviewLifecyclePresenter$b(this);
       this.F = new LivePreviewLifecyclePresenter$3(this);
       this.G = new LivePreviewLifecyclePresenter$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLifecyclePresenter.class, "2")) {
          return;
       }
       super.E8();
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.S0(this.w.getParentFragment());
       this.C = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.P(this.w, this.E);
          this.C.i(this.G);
       }
       this.w.getLifecycle().addObserver(this.F);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLifecyclePresenter.class, "3")) {
          return;
       }
       super.J8();
       LivePreviewLifecyclePresenter tC = this.C;
       if (tC != null) {
          tC.D(this.w, this.E);
          this.C.g(this.G);
       }
       this.w.getLifecycle().removeObserver(this.F);
       this.D.clear();
       return;
    }
    public void S8(){
       this.A = LiveWillShowType.NONE;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLifecyclePresenter.class, "4")) {
          return;
       }
       LivePreviewLifecyclePresenter tz = this.z;
       boolean b = (this.y != null && this.x != null)? true: false;
       this.z = b;
       if (tz != b) {
          Iterator iterator = this.D.iterator();
          while (iterator.hasNext()) {
             iterator.next().X4(this.z);
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePreviewLifecyclePresenter.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LivePreviewLifecyclePresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LivePreviewLifecyclePresenter.class, new e());
       }else {
          obj.put(LivePreviewLifecyclePresenter.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewLifecyclePresenter.class, "1")) {
          return;
       }
       this.w = this.r8("DETAIL_FRAGMENT");
       return;
    }
}
