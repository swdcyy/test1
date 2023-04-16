package com.kwai.sdk.eve.InitConfig;
import com.kwai.sdk.eve.InitConfig$a;
import nsd.u;
import com.kwai.sdk.eve.InitConfig$Builder;
import java.lang.Object;
import sm7.a;
import vn7.b;
import java.util.Map;
import trd.t0;
import sm7.r;
import java.util.List;
import sm7.j;
import vn7.e;
import sm7.e;
import sm7.c;
import qn7.a;
import java.util.Objects;
import com.kwai.sdk.eve.internal.featurecenter.FeatureCenterSwitchConfig;
import com.kwai.sdk.eve.internal.featurecenter.FeatureCenterLoggerConfig;
import com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenterConfig;
import com.kwai.sdk.eve.internal.featurecenter.FeaturesProvider;
import sm7.g;
import com.yxcorp.retrofit.a;
import m97.f;
import com.kwai.sdk.eve.internal.localguard.EveLocalGuardConfig;
import com.kwai.sdk.eve.InitConfig$d;
import com.kwai.sdk.eve.InitConfig$c;
import trd.t;
import com.kwai.sdk.eve.InitConfig$b;
import h97.g;
import android.content.Context;

public final class InitConfig	// class@001446
{
    public final g a;
    public final a b;
    public final e c;
    public final c d;
    public final Context e;
    public final a f;
    public final boolean g;
    public final FeatureCenterSwitchConfig h;
    public final EveFeatureCenterConfig i;
    public final List j;
    public final a k;
    public final g l;
    public final int m;
    public EveTaskPackageSource n;
    public final EveLocalGuardConfig o;
    public final o p;
    public final o q;
    public final List r;
    public final l s;
    public final o t;
    public static final InitConfig$a u;

    static {
       InitConfig.u = new InitConfig$a(null);
    }
    public void InitConfig(InitConfig$Builder p0){
       InitConfig initConfig = this;
       InitConfig$Builder uBuilder = p0;
       super();
       initConfig.a = uBuilder.a;
       InitConfig$Builder i = uBuilder.i;
       if (i != null) {
       }else {
          r or = new r(false, 0, 0, null, 15, null);
          r or1 = new r(false, 0, 0, null, 15, null);
          a uoa = new a(false, null, new b(), true, t0.z(), t0.z(), v17, v11);
       }
       initConfig.b = i;
       i = uBuilder.j;
       if (i == null) {
          e uoe = new e(false, false, false, 7, null);
       }
       initConfig.c = i;
       i = uBuilder.k;
       if (i == null) {
          c uoc1 = new c(false, false, false, false, false, false, 63, null);
       }
       initConfig.d = i;
       initConfig.e = uBuilder.s;
       i = uBuilder.m;
       if (i == null) {
          Objects.requireNonNull(a.e);
          a d = a.d;
       }
       initConfig.f = i;
       initConfig.g = uBuilder.l;
       i = uBuilder.n;
       if (i == null) {
          FeatureCenterSwitchConfig uFeatureCent = new FeatureCenterSwitchConfig(false, 0, 0, 0, 0, null, false, 0, 0, false, 0, null, 4095, null);
       }
       initConfig.h = i;
       i = uBuilder.d;
       if (i == null) {
          EveFeatureCenterConfig uEveFeatureC = new EveFeatureCenterConfig(null, null, 3, null);
       }
       initConfig.i = i;
       initConfig.j = uBuilder.e;
       initConfig.k = uBuilder.f;
       i = uBuilder.c;
       if (i == null) {
          g og = new g(null, null, null, null, null, null, null, 127, null);
       }
       initConfig.l = i;
       initConfig.m = uBuilder.o;
       initConfig.n = uBuilder.g;
       initConfig.o = new EveLocalGuardConfig();
       i = uBuilder.p;
       if (i == null) {
          InitConfig$d uod = new InitConfig$d(initConfig);
       }
       initConfig.p = i;
       i = uBuilder.q;
       if (i == null) {
          InitConfig$c uoc = new InitConfig$c();
       }
       initConfig.q = i;
       i = uBuilder.r;
       if (i == null) {
          List list = t.k("EveGlobalFeatureCalculate");
       }
       initConfig.r = i;
       initConfig.s = uBuilder.h;
       initConfig.t = new InitConfig$b();
       return;
    }
    public final a a(){
       return this.b;
    }
    public final g b(){
       return this.a;
    }
    public final Context c(){
       return this.e;
    }
    public final c d(){
       return this.d;
    }
    public final g e(){
       return this.l;
    }
    public final int f(){
       return this.m;
    }
}
