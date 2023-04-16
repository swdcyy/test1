package com.yxcorp.gifshow.featured.detail.featured.presenter.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.featured.detail.featured.presenter.h$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kda.e;
import q87.c;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import hf5.h;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import org.json.JSONObject;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import qvb.i;
import com.yxcorp.gifshow.featured.detail.featured.t;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.StringBuilder;
import java.util.Map;
import java.util.HashMap;
import lnc.k4;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import java.lang.Boolean;
import java.lang.Integer;
import android.os.SystemClock;
import java.lang.Long;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import n66.c;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;

public class h extends PresenterV2	// class@000f77
{
    public BaseFragment p;
    public h q;
    public SlidePlayViewModel r;
    public int s;
    public JSONObject t;
    public JSONObject u;
    public long v;
    public final ViewPager$i w;

    public void h(){
       super();
       this.w = new h$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("NasaFeaturedFPSMonitorPresenter", "onBind: ...", objArray);
       this.r = SlidePlayViewModel.B0(this.p);
       this.q.b(this.w, 0);
       return;
    }
    public void J8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "9")) {
          return;
       }
       this.q.g(this.w);
       if (!PatchProxy.applyVoid(objArray, this, oh, "11")) {
          this.R8(this.p, "NASA_FEATURED_SLIDE_PAGE");
       }
       return;
    }
    public final void P8(JSONObject p0){
       int i;
       String obj2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "6")) {
          return;
       }
       QPhoto currentPhoto = this.r.getCurrentPhoto();
       if (currentPhoto != null && currentPhoto.mEntity != null) {
          p0.put("photoId", TextUtils.k(currentPhoto.getBizId()));
          String str = PatchProxy.applyOneRefs(currentPhoto, this, oh, "10");
          if (str != patchProxyRe) {
          }else if(currentPhoto.isVideoType()){
             obj2 = "video";
          }else {
             obj2 = "image";
          }
          str = obj2;
          p0.put("photoType", str);
       }
       p0.put("position", this.r.a0());
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, oh, "2");
       if (obj != patchProxyRe) {
          i = obj.intValue();
       }else {
          i obj1 = PatchProxy.apply(objArray, this, oh, "3");
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
             obj1 = this.r.X0();
             if (obj1 instanceof t) {
                Objects.requireNonNull(obj1);
                obj2 = PatchProxy.apply(objArray, obj1, t.class, "45");
                i = (obj2 != patchProxyRe)? obj2.intValue(): obj1.v.get();
             }else {
                i = -1;
             }
          }
       }
       p0.put("page", i);
       return;
    }
    public void R8(BaseFragment p0,String p1){
       String key;
       h oh = h.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oh, "12")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "NasaFeaturedFPSMonitorPresenter";
       e.C().w(str, "stop: ...."+p1, objArray);
       if (p0 == null) {
          Object[] objArray1 = new Object[i];
          e.C().t(str, "stop: return fragment is null", objArray1);
          return;
       }else {
          HashMap hashMap = PatchProxy.apply(null, this, oh, "7");
          if (hashMap != PatchProxyResult.class) {
          }else {
             hashMap = new HashMap();
             hashMap.put("type", "NASA_FEATURED_SLIDE_PAGE");
             h tt = this.t;
             key = "";
             if (tt == null) {
                tt = key;
             }
             hashMap.put("oldPhoto", tt);
             tt = this.u;
             if (tt != null) {
                h oh1 = tt;
             }
             hashMap.put("newPhoto", key);
             hashMap.put("disableAnimation", Boolean.valueOf(b.a(-404437045).g()));
             hashMap.put("slideProfile", Boolean.valueOf(this.r.r()));
             hashMap.put("distance", Integer.valueOf(this.s));
             hashMap.put("durationMs", Long.valueOf((SystemClock.elapsedRealtime() - this.v)));
          }
          Iterator iterator = hashMap.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             key = uEntry.getKey();
             c.b("NASA_FEATURED_SLIDE_PAGE", key, uEntry.getValue());
          }
          FpsMonitor.stopSection(p1, p0.requireActivity());
          c.c("NASA_FEATURED_SLIDE_PAGE");
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("MILANO_SLIDE_PLAY_VM_PROTOCOL");
       return;
    }
}
