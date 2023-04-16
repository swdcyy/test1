package com.yxcorp.gifshow.photoad.IpdxHelper;
import okhttp3.OkHttpClient$Builder;
import com.yxcorp.retrofit.interceptor.ConvertToIOExceptionInterceptor;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import com.yxcorp.gifshow.photoad.IpdxHelper$mImei$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.photoad.IpdxHelper$mOaid$2;
import com.yxcorp.gifshow.photoad.IpdxHelper$mAndroidId$2;
import com.yxcorp.gifshow.photoad.IpdxHelper$mShouldCarryOaid$2;
import com.yxcorp.gifshow.photoad.IpdxHelper$mIsIpdxValid$2;
import com.yxcorp.gifshow.photoad.IpdxHelper$mReplacedActionTypes$2;
import qw.f;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.System;
import java.lang.Boolean;
import java.lang.Integer;
import p49.f;
import p49.c;
import java.util.Objects;
import p49.f$a;
import com.yxcorp.gifshow.photoad.IpdxHelper$a;
import p49.a;

public final class IpdxHelper	// class@000f61
{
    public static final OkHttpClient a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static String h;
    public static long i;
    public static final IpdxHelper j;

    static {
       IpdxHelper.j = new IpdxHelper();
       IpdxHelper.a = new OkHttpClient$Builder().addInterceptor(new ConvertToIOExceptionInterceptor()).build();
       IpdxHelper.b = s.c(IpdxHelper$mImei$2.INSTANCE);
       IpdxHelper.c = s.c(IpdxHelper$mOaid$2.INSTANCE);
       IpdxHelper.d = s.c(IpdxHelper$mAndroidId$2.INSTANCE);
       IpdxHelper.e = s.c(IpdxHelper$mShouldCarryOaid$2.INSTANCE);
       IpdxHelper.f = s.c(IpdxHelper$mIsIpdxValid$2.INSTANCE);
       IpdxHelper.g = s.c(IpdxHelper$mReplacedActionTypes$2.INSTANCE);
       SharedPreferences a = f.a;
       String str = a.getString("ipdx_ip", "");
       a.o(str, "DefaultPreferenceHelper.getIpdxIp\(\)");
       IpdxHelper.h = str;
       IpdxHelper.i = a.getLong("ipdx_ip_exp_time", 0);
    }
    public void IpdxHelper(){
       super();
    }
    public static final String a(){
       String obj = PatchProxy.apply(null, null, IpdxHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (IpdxHelper.j.d() && (!TextUtils.x(IpdxHelper.h) && (IpdxHelper.i * (long)1000) - System.currentTimeMillis() > 0))? IpdxHelper.h: "";
       return obj;
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, IpdxHelper.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IpdxHelper.d.getValue();
    }
    public final String c(){
       Object obj = PatchProxy.apply(null, this, IpdxHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IpdxHelper.b.getValue();
    }
    public final boolean d(){
       Object obj = PatchProxy.apply(null, this, IpdxHelper.class, "5");
       if (obj == PatchProxyResult.class) {
          obj = IpdxHelper.f.getValue();
       }
       return obj.booleanValue();
    }
    public final String e(){
       Object obj = PatchProxy.apply(null, this, IpdxHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return IpdxHelper.c.getValue();
    }
    public final void f(int p0,String p1,String p2){
       if (PatchProxy.isSupport(IpdxHelper.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, IpdxHelper.class, "11")) {
          return;
       }
       Objects.requireNonNull(c.Z);
       f.a.a(c.Q).b(0.02f).h(new IpdxHelper$a(p0, p1, p2));
       return;
    }
}
