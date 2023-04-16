package com.yxcorp.gifshow.featured.detail.featured.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import com.yxcorp.gifshow.featured.detail.featured.presenter.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wd5.f;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.featured.detail.featured.presenter.d$b;
import java.lang.reflect.Type;
import kda.e;
import q87.c;
import java.util.List;
import java.util.Iterator;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.featured.detail.featured.presenter.d$c;
import java.util.Map;
import androidx.viewpager.widget.ViewPager$i;
import hf5.h;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import zda.e;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import zda.f;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.featured.detail.featured.presenter.HomeFeaturePageFpsMonitorPresenter$2;
import androidx.lifecycle.LifecycleObserver;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import ip.b;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.google.gson.JsonObject;
import android.os.SystemClock;
import java.lang.Long;
import androidx.fragment.app.FragmentActivity;
import n66.c;
import android.app.Activity;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import java.lang.Throwable;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Boolean;
import uw9.l0;
import jf5.a;

public class d extends PresenterV2	// class@000f71
{
    public Map A;
    public boolean B;
    public Map C;
    public final ViewPager$i D;
    public BaseFragment p;
    public h q;
    public SlidePlayViewModel r;
    public l0 s;
    public MilanoContainerEventBus t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void d(){
       super();
       this.u = "";
       this.v = false;
       this.w = false;
       this.x = false;
       this.y = false;
       this.z = false;
       this.A = new HashMap();
       this.B = false;
       this.C = new LinkedHashMap();
       this.D = new d$a(this);
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       if (TextUtils.x(this.u)) {
          d tp = this.p;
          if (tp instanceof f) {
             this.u = tp.N8();
          }
       }
       this.v = SlideDispatchHelper.e();
       this.w = SlideDispatchHelper.d();
       String str = "FeatureFpsMonitor";
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, uod, "2")) {
          int i = 0;
          d$b value = a.t().getValue("enable_featured_slide_fps_monitor", d$b.class, new d$b(this));
          if (value != null && (value.slideMonitor == null || value.monitorTime.isEmpty())) {
             Object[] objArray1 = new Object[i];
             e.C().w(str, "initConfig no need", objArray1);
          }else {
             Iterator iterator = value.monitorTime.iterator();
             while (iterator.hasNext()) {
                int i1 = iterator.next().intValue();
                if (i1 > 0) {
                   Object[] objArray2 = new Object[i];
                   e.C().w(str, "initConfig monitor duration:"+i1, objArray2);
                   this.C.put(Integer.valueOf(i1), new d$c(this, (long)i1));
                }
             }
             this.B = b;
          }
       }
       this.q.b(this.D, b);
       this.X7(this.t.P.subscribe(new e(this), Functions.d()));
       if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
          this.p.Vg().j().compose(c.c(this.p.m(), FragmentEvent.DESTROY_VIEW)).subscribe(new f(this));
          this.p.getLifecycle().addObserver(new HomeFeaturePageFpsMonitorPresenter$2(this));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.q.g(this.D);
       k1.n(this);
       if (this.z != null) {
          this.X8();
       }
       if (this.B != null) {
          this.W8(0);
       }
       return;
    }
    public final int P8(){
       d obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.r;
       if (obj != null) {
          return obj.G0(obj.j());
       }
       return -1;
    }
    public final String R8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.a(-570058679).m(p0.mEntity, true, true) >= 0) {
          return "ad";
       }
       if (r1.D3(p0.mEntity)) {
          return "video";
       }
       if (r1.f2(p0.mEntity)) {
          return "atlas";
       }
       if (r1.X2(p0.mEntity)) {
          return "longImage";
       }
       if (r1.S2(p0.mEntity)) {
          return "live";
       }
       return "other";
    }
    public final void S8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "11")) {
          return;
       }
       this.A.clear();
       QPhoto currentPhoto = this.r.getCurrentPhoto();
       JsonObject jsonObject = new JsonObject();
       if (currentPhoto != null) {
          QPhoto mEntity = currentPhoto.mEntity;
          if (mEntity != null) {
             String str = r1.t1(mEntity);
             if (TextUtils.x(str)) {
                str = "";
             }
             jsonObject.c0("photoId", str);
             jsonObject.c0("photoType", this.R8(currentPhoto));
          }
       }
       this.A.put("pageSessionId", this.u);
       this.A.put("curPagaType", Integer.valueOf(this.P8()));
       this.A.put("source", Integer.valueOf(p0));
       this.A.put("curPhoto", jsonObject);
       this.A.put("start", Long.valueOf(SystemClock.elapsedRealtime()));
       this.A.put("curPosition", Integer.valueOf(this.r.a0()));
       return;
    }
    public void V8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "9")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.C().w("FeatureFpsMonitor", "startPageMonitor, cause="+p0, objArray);
       boolean b = true;
       this.y = b;
       if (this.z != null) {
          this.X8();
       }
       d tp = this.p;
       if (tp == null || tp.getActivity() == null) {
          Object[] objArray1 = new Object[i];
          e.C().t("FeatureFpsMonitor", "stopMonitorPage: return fragment is null", objArray1);
          return;
       }else {
          c.a("SCENE_FEATURED_DETAIL_PAGE");
          FragmentActivity activity = this.p.getActivity();
          try{
             FpsMonitor.startSection("SCENE_FEATURED_DETAIL_PAGE", activity);
             this.S8(p0);
          }catch(org.json.JSONException e6){
             e.C().z("FeatureFpsMonitor", "resetPageParam failed!", e6);
          }
          this.z = b;
          return;
       }
    }
    public void W8(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "7")) {
          return;
       }
       Iterator iterator = this.C.entrySet().iterator();
       while (iterator.hasNext()) {
          this.Y8(p0, iterator.next().getKey().intValue());
       }
       return;
    }
    public void X8(){
       if (PatchProxy.applyVoid(null, this, d.class, "10")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "FeatureFpsMonitor";
       e.C().w(str, "stopPageMonitor", objArray);
       d tp = this.p;
       if (tp == null || tp.getActivity() == null) {
          Object[] objArray1 = new Object[i];
          e.C().t(str, "stopMonitorPage: return fragment is null", objArray1);
          return;
       }else if(!this.A.isEmpty()){
          this.A.put("end", Long.valueOf(SystemClock.elapsedRealtime()));
          Iterator iterator = this.A.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             c.b("SCENE_FEATURED_DETAIL_PAGE", key, uEntry.getValue());
          }
          c.b("SCENE_FEATURED_DETAIL_PAGE", "dipatch", Boolean.valueOf(this.v));
          c.b("SCENE_FEATURED_DETAIL_PAGE", "dipatch_opt", Boolean.valueOf(this.w));
       }
       FpsMonitor.stopSection("SCENE_FEATURED_DETAIL_PAGE", this.p.getActivity());
       c.c("SCENE_FEATURED_DETAIL_PAGE");
       this.z = i;
       return;
    }
    public final void Y8(int p0,int p1){
       String str3;
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "8")) {
          return;
       }
       uod = this.p;
       if (uod == null || uod.getActivity() == null) {
          Object[] objArray = new Object[0];
          e.C().t("FeatureFpsMonitor", "stopSlideMonitor: return fragment is null, cause="+p0, objArray);
          return;
       }else {
          d$c uoc = this.C.get(Integer.valueOf(p1));
          k1.n(uoc.c);
          if (uoc.b != null) {
             int i = this.r.a0();
             JsonObject obj = uoc.d.get("lastPosition");
             String str = "photoType";
             String str1 = "";
             String str2 = "photoId";
             if (obj != null && obj instanceof Integer) {
                str3 = "slideChange";
                if (obj.equals(Integer.valueOf(i))) {
                   uoc.d.put(str3, Boolean.FALSE);
                }else {
                   uoc.d.put(str3, Boolean.TRUE);
                   int i1 = -1;
                   String str4 = "slideType";
                   if (i > obj.intValue()) {
                      uoc.d.put(str4, Integer.valueOf(1));
                      i1 = i + 1;
                   }else if(i < obj.intValue()){
                      uoc.d.put(str4, Integer.valueOf(2));
                      i1 = i - 1;
                   }
                   if (i1 >= 0) {
                      QPhoto qPhoto = this.r.n(i1);
                      if (qPhoto != null && qPhoto.mEntity != null) {
                         JsonObject jsonObject = new JsonObject();
                         str4 = r1.t1(qPhoto.mEntity);
                         if (TextUtils.x(str4)) {
                            str4 = str1;
                         }
                         jsonObject.c0(str2, str4);
                         jsonObject.c0(str, this.R8(qPhoto));
                         uoc.d.put("nextPhoto", jsonObject);
                         uoc.d.put("nextPosition", Integer.valueOf(i1));
                      }
                   }
                }
             }
          label_00d8 :
             obj = new JsonObject();
             QPhoto currentPhoto = this.r.getCurrentPhoto();
             if (currentPhoto != null) {
                QPhoto mEntity = currentPhoto.mEntity;
                if (mEntity != null) {
                   str3 = r1.t1(mEntity);
                   if (!TextUtils.x(str3)) {
                      str1 = str3;
                   }
                   obj.c0(str2, str1);
                   obj.c0(str, this.R8(currentPhoto));
                }
             }
             uoc.d.put("curPhoto", obj);
             uoc.d.put("curPosition", Integer.valueOf(i));
             uoc.d.put("curPagaType", Integer.valueOf(this.P8()));
             uoc.d.put("end", Long.valueOf(SystemClock.elapsedRealtime()));
             uoc.d.put("cause", Integer.valueOf(p0));
             Object[] objArray1 = new Object[0];
             e.C().t("FeatureFpsMonitor", "唯峭酌陣, ！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！", objArray1);
             Iterator iterator = uoc.d.entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                c.b(uoc.c, uEntry.getKey(), uEntry.getValue());
                Object[] objArray2 = new Object[0];
                e.C().t("FeatureFpsMonitor", "key="+uEntry.getKey()+", value="+uEntry.getValue(), objArray2);
             }
             c.b(uoc.c, "dipatch", Boolean.valueOf(this.v));
             c.b(uoc.c, "dipatch_opt", Boolean.valueOf(this.w));
             Object[] objArray3 = new Object[0];
             e.C().t("FeatureFpsMonitor", "唯峭酌陣, cause="+p0+", duration="+p1+", scene="+uoc.c, objArray3);
             FpsMonitor.stopSection(uoc.c, this.p.getActivity());
             c.c(uoc.c);
             uoc.b = false;
          }
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("MILANO_SLIDE_PLAY_VM_PROTOCOL");
       this.r = SlidePlayViewModel.B0(this.p);
       l0 ol0 = this.q8(l0.class);
       this.s = ol0;
       this.t = ol0.X;
       return;
    }
}
