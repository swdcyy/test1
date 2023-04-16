package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.view.TextureView;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import androidx.fragment.app.Fragment;
import oo5.a;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeFeed;
import p6a.p;
import com.yxcorp.gifshow.util.DateUtils;
import oe6.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$9;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Long;
import java.lang.Integer;
import km8.b;
import b8a.a1;
import b8a.a1$a;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;

public class RelaxTimeDetailPresenter$a extends a	// class@0017ab
{
    public final RelaxTimeDetailPresenter b;

    public void RelaxTimeDetailPresenter$a(RelaxTimeDetailPresenter p0){
       this.b = p0;
       super();
    }
    public void B0(){
       if (PatchProxy.applyVoidWithListener(null, this, RelaxTimeDetailPresenter$a.class, "3")) {
          return;
       }
       RelaxTimeDetailPresenter$a tb = this.b;
       if (tb.D != null) {
          tb.s.post(tb.T);
       }
       this.b.S8(true);
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter$a.class, "3");
       return;
    }
    public void F1(){
       SharedPreferences$Editor uEditor;
       RelaxTimeDetailPresenter relaxTimeDet = RelaxTimeDetailPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, RelaxTimeDetailPresenter$a.class, "2")) {
          return;
       }
       RelaxTimeDetailPresenter$a tb = this.b;
       boolean b = false;
       tb.J = b;
       tb.P8(b);
       tb = this.b;
       Objects.requireNonNull(tb);
       String str = "13";
       if (!PatchProxy.applyVoidWithListener(objArray, tb, relaxTimeDet, str)) {
          Activity activity1 = tb.getActivity();
          if (activity1 != null && (!activity1.isFinishing() && activity1 instanceof GifshowActivity)) {
             activity1.l3(tb.V);
          }
       label_003b :
          PatchProxy.onMethodExit(relaxTimeDet, str);
       }
       a.j(this.b.C, b);
       tb = this.b;
       Objects.requireNonNull(tb);
       String str1 = "15";
       if (!PatchProxy.applyVoidWithListener(objArray, tb, relaxTimeDet, str1)) {
          Activity activity = tb.getActivity();
          if (activity != null && (!activity.isFinishing() && activity instanceof GifshowActivity)) {
             activity.getLifecycle().removeObserver(tb.Y);
          }
       label_006e :
          PatchProxy.onMethodExit(relaxTimeDet, str1);
       }
       this.b.X8();
       if (p.a(this.b.B.mEntity) == 2) {
          uEditor = a.a.edit();
          uEditor.putLong("ignore_sleep_date", DateUtils.l());
          g.a(uEditor);
       }else {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidWithListener(objArray, tb, relaxTimeDet, "19")) {
             Map map = a.O(new RelaxTimeDetailPresenter$9(tb).getType());
             if (map == null) {
                map = new HashMap();
             }
             Iterator iterator = map.entrySet().iterator();
             while (iterator.hasNext()) {
                if (!DateUtils.J(iterator.next().getKey().longValue())) {
                   iterator.remove();
                }
             }
             int i = 1;
             if (map.containsKey(Long.valueOf(DateUtils.l()))) {
                map.put(Long.valueOf(DateUtils.l()), Integer.valueOf((map.get(Long.valueOf(DateUtils.l())).intValue() + i)));
             }else {
                map.put(Long.valueOf(DateUtils.l()), Integer.valueOf(i));
             }
             uEditor = a.a.edit();
             uEditor.putString("today_notice_times", b.e(map));
             g.a(uEditor);
             PatchProxy.onMethodExit(relaxTimeDet, "19");
          }
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter$a.class, "2");
       return;
    }
    public void i2(){
       RelaxTimeDetailPresenter relaxTimeDet = RelaxTimeDetailPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, RelaxTimeDetailPresenter$a.class, "1")) {
          return;
       }
       this.b.J = true;
       a1.w.a(false);
       this.b.S8(false);
       RelaxTimeDetailPresenter$a tb = this.b;
       Objects.requireNonNull(tb);
       String str = "12";
       if (!PatchProxy.applyVoidWithListener(objArray, tb, relaxTimeDet, str)) {
          Activity activity1 = tb.getActivity();
          if (activity1 != null && (!activity1.isFinishing() && activity1 instanceof GifshowActivity)) {
             activity1.F2(tb.V);
          }
       label_0043 :
          PatchProxy.onMethodExit(relaxTimeDet, str);
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       str = "14";
       if (!PatchProxy.applyVoidWithListener(objArray, tb, relaxTimeDet, str)) {
          Activity activity = tb.getActivity();
          if (activity != null && (!activity.isFinishing() && activity instanceof GifshowActivity)) {
             activity.getLifecycle().addObserver(tb.Y);
          }
       label_006f :
          PatchProxy.onMethodExit(relaxTimeDet, str);
       }
       a.b0(0);
       this.b.P8(true);
       this.b.a9();
       if (NasaExperimentUtils.d0() > 0) {
          RelaxTimeDetailPresenter$a tb1 = this.b;
          if (tb1.K == null) {
             tb1.s.removeCallbacks(tb1.U);
             tb1 = this.b;
             tb1.s.postDelayed(tb1.U, ((long)NasaExperimentUtils.d0() * 1000));
          }
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter$a.class, "1");
       return;
    }
}
