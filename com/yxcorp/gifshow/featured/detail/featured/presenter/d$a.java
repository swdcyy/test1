package com.yxcorp.gifshow.featured.detail.featured.presenter.d$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.featured.detail.featured.presenter.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kda.e;
import q87.c;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.google.gson.JsonObject;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.os.SystemClock;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import com.yxcorp.gifshow.featured.detail.featured.presenter.d$c;
import n66.c;
import android.app.Activity;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import java.lang.StringBuilder;
import java.lang.Long;
import zda.g;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Float;

public class d$a implements ViewPager$i	// class@000f6e
{
    public final d b;

    public void d$a(d p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       Object[] objArray1;
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       int i = 1;
       int i1 = 0;
       if (p0 == i) {
          Object[] objArray = new Object[i1];
          e.C().w("FeatureFpsMonitor", "onPageScrollStateChanged: SCROLL_STATE_DRAGGING", objArray);
          d$a tb = this.b;
          if (tb.B != null) {
             Objects.requireNonNull(tb);
             if (!PatchProxy.applyVoid(null, tb, d.class, "6")) {
                d p = tb.p;
                if (p == null || p.getActivity() == null) {
                   objArray1 = new Object[i1];
                   e.C().t("FeatureFpsMonitor", "startSlideMonitor: return fragment is null", objArray1);
                }else {
                   tb.W8(2);
                   QPhoto currentPhoto = tb.r.getCurrentPhoto();
                   JsonObject jsonObject = new JsonObject();
                   if (currentPhoto != null) {
                      QPhoto mEntity = currentPhoto.mEntity;
                      if (mEntity != null) {
                         String str = r1.t1(mEntity);
                         if (TextUtils.x(str)) {
                            str = "";
                         }
                         jsonObject.c0("photoId", str);
                         jsonObject.c0("photoType", tb.R8(currentPhoto));
                      }
                   }
                   int i2 = tb.P8();
                   long l = SystemClock.elapsedRealtime();
                   int i3 = tb.r.a0();
                   Iterator iterator = tb.C.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      c.a(uEntry.getValue().c);
                      FpsMonitor.startSection(uEntry.getValue().c, tb.p.getActivity());
                      Object[] objArray2 = new Object[i1];
                      e.C().t("FeatureFpsMonitor", "¿ªÊ¼¼à¿Ø, duration="+uEntry.getKey(), objArray2);
                      uEntry.getValue().d.clear();
                      uEntry.getValue().d.put("pageSessionId", tb.u);
                      uEntry.getValue().d.put("lastPhoto", jsonObject);
                      uEntry.getValue().d.put("lastPagaType", Integer.valueOf(i2));
                      uEntry.getValue().d.put("start", Long.valueOf(l));
                      uEntry.getValue().d.put("lastPosition", Integer.valueOf(i3));
                      uEntry.getValue().b = i;
                      g og = new g(tb, uEntry);
                      k1.s(og, uEntry.getValue().c, uEntry.getValue().a);
                   }
                }
             }
          }
       }else if(!p0){
          objArray1 = new Object[i1];
          e.C().w("FeatureFpsMonitor", "onPageScrollStateChanged: SCROLL_STATE_IDLE", objArray1);
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(d$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, d$a.class, "1")) {
          return;
       }
       d$a tb = this.b;
       if (tb.x != null && !tb.r.a0()) {
          tb = this.b;
          tb.x = false;
          tb.V8(3);
       }
       return;
    }
    public void onPageSelected(int p0){
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("FeatureFpsMonitor", "onPageSelected: ...position:"+p0, objArray);
       d$a tb = this.b;
       if (tb.y == null && !tb.r.a0()) {
          this.b.V8(1);
       }else {
          tb = this.b;
          if (tb.x != null && !tb.r.a0()) {
             tb = this.b;
             tb.x = false;
             tb.V8(3);
          }else {
             this.b.V8(2);
          }
       }
       return;
    }
}
