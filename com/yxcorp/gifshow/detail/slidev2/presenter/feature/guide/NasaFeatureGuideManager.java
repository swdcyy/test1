package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$a;
import nsd.u;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager$Companion$LazyInstance$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import oe6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import xf6.d;
import xf6.l;
import java.lang.System;
import java.lang.Number;
import uw9.c;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import oe6.e;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class NasaFeatureGuideManager	// class@001966
{
    public boolean a;
    public int b;
    public boolean c;
    public static final p d;
    public static final NasaFeatureGuideManager$a e;

    static {
       NasaFeatureGuideManager.e = new NasaFeatureGuideManager$a(null);
       NasaFeatureGuideManager.d = s.c(NasaFeatureGuideManager$Companion$LazyInstance$2.INSTANCE);
    }
    public void NasaFeatureGuideManager(){
       super();
       this.c = a.K();
    }
    public static final NasaFeatureGuideManager f(){
       Object obj = PatchProxy.apply(null, null, NasaFeatureGuideManager.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return NasaFeatureGuideManager.e.a();
    }
    public final boolean a(){
       boolean b;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, nasaFeatureG, "38");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!NasaExperimentUtils.E()) {
          obj = PatchProxy.apply(objArray, this, nasaFeatureG, "30");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(l.c("KEY_SCALE_CLEAN_GUIDE", false)){
             b = true;
          }else {
             b = a.G();
          }
          if (b) {
             return true;
          }
       }
       if (NasaExperimentUtils.E() && (this.k() < 2 && this.l() < 3)) {
          l = System.currentTimeMillis();
          Object obj1 = PatchProxy.apply(objArray, this, nasaFeatureG, "34");
          long l1 = (obj1 != patchProxyRe)? obj1.longValue(): c.a.getLong("slideScaleCleanHintShownTime", 0);
          if ((l - l1) - TimeUnit.DAYS.toMillis(2) > 0) {
             return true;
          }
       }
    label_007d :
       return false;
    }
    public final boolean b(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (l.c("ENABLE_MULTI_ATLAS_GUIDE_SHOW", false)) {
          return true;
       }
       return a.H();
    }
    public final boolean c(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (l.c("ENABLE_ATLAS_PROGRESS_DRAG_GUIDE", false)) {
          return true;
       }
       return a.c();
    }
    public final int d(){
       return this.b;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.I();
    }
    public final boolean g(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.J();
    }
    public final boolean h(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.B();
    }
    public final boolean i(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.C();
    }
    public final boolean j(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.D();
    }
    public final int k(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c.a.getInt("slideScaleCleanEnterCount", 0);
    }
    public final int l(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c.a.getInt("slideScaleCleanHintShownCount", 0);
    }
    public final boolean m(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.K();
    }
    public final boolean n(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.L();
    }
    public final boolean o(){
       Object obj = PatchProxy.apply(null, this, NasaFeatureGuideManager.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.I();
    }
    public final void p(){
       this.b = 0;
    }
    public final void q(boolean p0){
       NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.class;
       if (PatchProxy.isSupport(nasaFeatureG) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, nasaFeatureG, "25")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("ShouldShowSlideV2AtlasLeftSlideHint", p0);
       g.a(uEditor);
       return;
    }
    public final void r(boolean p0){
       NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.class;
       if (PatchProxy.isSupport(nasaFeatureG) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, nasaFeatureG, "11")) {
          return;
       }
       if (this.c != p0) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean("ShouldShowSlideV2LeftUpSlideHint", p0);
          g.a(uEditor);
       }
       return;
    }
    public final void s(boolean p0){
       NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.class;
       if (PatchProxy.isSupport(nasaFeatureG) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, nasaFeatureG, "5")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("ShouldShowSlideV2UpSlideHint", p0);
       g.a(uEditor);
       if (!p0) {
          this.a = true;
       }
       return;
    }
}
