package com.kwai.framework.network.access.AccessParamsInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import wa6.a;
import b76.a;
import com.kwai.framework.network.access.AccessPreferenceManager;
import java.util.Objects;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import com.kwai.sdk.switchconfig.a;
import oe6.g;
import com.kwai.framework.network.access.control.CommonParamsControlManager;
import io7.f;
import va6.a;
import java.lang.StringBuilder;
import fg6.a;
import com.google.gson.Gson;
import com.yxcorp.utility.Log;
import qrd.l1;

public class AccessParamsInitModule extends a	// class@00178f
{

    public void AccessParamsInitModule(){
       super();
    }
    public int f0(){
       return 0;
    }
    public void h0(){
       if (PatchProxy.applyVoid(null, this, AccessParamsInitModule.class, "2")) {
          return;
       }
       b.a(-1942878494).b();
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AccessParamsInitModule.class, "1")) {
          return;
       }
       AccessPreferenceManager d = AccessPreferenceManager.d;
       Objects.requireNonNull(d);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, d, AccessPreferenceManager.class, "3")) {
          boolean b = false;
          String str = "enableCommonParamsControl";
          g.a(AccessPreferenceManager.a.edit().putBoolean("enableHostCollection", a.t().d("enableHostCollection", b)).putBoolean(str, a.t().d(str, b)));
       }
       CommonParamsControlManager m = CommonParamsControlManager.m;
       Objects.requireNonNull(m);
       if (!PatchProxy.applyVoid(objArray, m, CommonParamsControlManager.class, "5")) {
          f uof = a.t().f("commonParamsControlConfig");
          _monitor_enter(m);
          if (m.d()) {
             _monitor_exit(m);
          }else {
             CommonParamsControlManager.l = true;
             a uoa = m.i(uof);
             if (uoa != null && uoa.a()) {
                Log.g("CommonParamsControlManager", "读取到有效的<缓存>公参管控配置:"+a.a.q(uoa));
                m.j(uoa);
                _monitor_exit(m);
             }else {
                uoa = m.h();
                if (uoa != null && uoa.a()) {
                   Log.g("CommonParamsControlManager", "读取到有效的<预埋>公参管控配置:"+a.a.q(uoa));
                   m.j(uoa);
                   _monitor_exit(m);
                }else {
                   _monitor_exit(m);
                }
             }
          }
       }
       return;
    }
    public void n(){
    }
}
