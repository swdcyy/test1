package com.yxcorp.gifshow.featured.detail.featured.presenter.h$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.featured.detail.featured.presenter.h;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kda.e;
import java.lang.StringBuilder;
import q87.c;
import java.util.Objects;
import org.json.JSONObject;
import java.lang.Throwable;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Float;
import n66.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;
import android.os.SystemClock;

public class h$a implements ViewPager$i	// class@000f76
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("NasaFeaturedFPSMonitorPresenter", "onPageScrollStateChanged: ...state:"+p0, objArray);
       if (!p0) {
          h$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(null, tb, h.class, "5")) {
             try{
                JSONObject jSONObject = new JSONObject();
                tb.u = jSONObject;
                tb.P8(jSONObject);
             }catch(java.lang.Exception e0){
                e.C().z("NasaFeaturedFPSMonitorPresenter", "initParams failed!", e0);
             }
             tb.R8(tb.p, "NASA_FEATURED_SLIDE_PAGE");
             tb.t = tb.u;
          }
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(h$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, h$a.class, "1")) {
          return;
       }
       h$a tb = this.b;
       tb.s = tb.s + p2;
       return;
    }
    public void onPageSelected(int p0){
       h p;
       String str;
       Object[] objArray1;
       h$a uoa = h$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("NasaFeaturedFPSMonitorPresenter", "onPageSelected: ...position:"+p0, objArray);
       h$a tb = this.b;
       Objects.requireNonNull(tb);
       h oh = h.class;
       if (!PatchProxy.applyVoid(null, tb, oh, "4")) {
          if (tb.t == null) {
             try{
                JSONObject jSONObject = new JSONObject();
                tb.t = jSONObject;
                tb.P8(jSONObject);
             }catch(java.lang.Exception e2){
                e.C().z("NasaFeaturedFPSMonitorPresenter", "initParams failed!", e2);
             }
          }
       }
       return;
    }
}
