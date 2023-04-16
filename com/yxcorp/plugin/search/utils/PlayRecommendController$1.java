package com.yxcorp.plugin.search.utils.PlayRecommendController$1;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.yxcorp.plugin.search.utils.PlayRecommendController;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.System;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.yxcorp.plugin.search.response.RecoAfterPlayResponse;
import java.util.Map;
import eed.b;

public class PlayRecommendController$1 implements DefaultLifecycleObserver	// class@000780
{
    public final PlayRecommendController b;

    public void PlayRecommendController$1(PlayRecommendController p0){
       this.b = p0;
       super();
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayRecommendController$1.class, "1")) {
          return;
       }
       PlayRecommendController$1 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(null, tb, PlayRecommendController.class, "17") && tb.a > 0) {
          if ((System.currentTimeMillis() - tb.a) - PlayRecommendController.u < 0) {
             k1.m(tb.j);
          }
          tb.a = 0;
       }
       tb = this.b;
       PlayRecommendController e = tb.e;
       if (e == null) {
          tb.f(null, null);
          return;
       }else {
          b uob = tb.m.get(e);
          if (uob != null) {
             PlayRecommendController$1 tb1 = this.b;
             if (tb1.g(tb1.e)) {
                uob.u7();
             }else {
                uob.K2(this.b.n, true);
             }
          }
          this.b.f(null, null);
          return;
       }
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
