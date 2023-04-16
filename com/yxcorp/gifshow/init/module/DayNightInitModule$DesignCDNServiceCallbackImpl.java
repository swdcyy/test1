package com.yxcorp.gifshow.init.module.DayNightInitModule$DesignCDNServiceCallbackImpl;
import zyc.e;
import java.lang.Object;
import com.yxcorp.gifshow.init.module.DayNightInitModule$1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import zf6.k;
import bjd.d;
import bb6.c;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import java.util.HashMap;
import java.util.Map;
import java.lang.Runnable;
import t45.c;
import com.yxcorp.gifshow.widget.cdn.DesignCDNDataTrack;
import fg6.a;
import com.google.gson.Gson;
import k2b.u1;
import zyc.a;
import java.lang.Integer;
import vl7.a;
import bm7.a;
import zl7.a;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class DayNightInitModule$DesignCDNServiceCallbackImpl implements e	// class@00196f
{

    public void DayNightInitModule$DesignCDNServiceCallbackImpl(){
       super();
    }
    public void DayNightInitModule$DesignCDNServiceCallbackImpl(DayNightInitModule$1 p0){
       super();
    }
    public boolean a(){
       DayNightInitModule$DesignCDNServiceCallbackImpl uDesignCDNSe = DayNightInitModule$DesignCDNServiceCallbackImpl.class;
       Object obj = PatchProxy.applyWithListener(null, this, uDesignCDNSe, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       PatchProxy.onMethodExit(uDesignCDNSe, "5");
       return k.d();
    }
    public String b(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, DayNightInitModule$DesignCDNServiceCallbackImpl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(DayNightInitModule$DesignCDNServiceCallbackImpl.class, "2");
       return c.a().h(CdnHostGroupType.DESIGN.getTypeName(), p0, new HashMap());
    }
    public void c(Runnable p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DayNightInitModule$DesignCDNServiceCallbackImpl.class, "3")) {
          return;
       }
       c.a(p0);
       PatchProxy.onMethodExit(DayNightInitModule$DesignCDNServiceCallbackImpl.class, "3");
       return;
    }
    public void d(DesignCDNDataTrack p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DayNightInitModule$DesignCDNServiceCallbackImpl.class, "6")) {
          return;
       }
       u1.R("KS_PRE_LOAD_RESOURCES", a.a.q(p0), 23);
       PatchProxy.onMethodExit(DayNightInitModule$DesignCDNServiceCallbackImpl.class, "6");
       return;
    }
    public a[] e(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       HashMap obj = PatchProxy.applyWithListener(objArray, this, DayNightInitModule$DesignCDNServiceCallbackImpl.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new HashMap();
       String str = "icon";
       obj.put(str, Integer.valueOf(R.string.arg_RES_7f1004e1));
       obj.put("motion", Integer.valueOf(R.string.arg_RES_7f1036db));
       HashMap hashMap = new HashMap();
       HashMap hashMap1 = PatchProxy.apply(objArray, objArray, a.class, "1");
       if (hashMap1 != patchProxyRe) {
       }else {
          hashMap1 = new HashMap();
          hashMap1.put("common", "https://ali2.a.kwimgs.com/kos/nlav11289/preload/1/9fe5e5fe5d8e41f9aeb57026401d56cf.zip");
       }
       hashMap.put(str, hashMap1);
       hashMap1 = PatchProxy.apply(objArray, objArray, a.class, "1");
       if (hashMap1 != patchProxyRe) {
       }else {
          hashMap1 = new HashMap();
          hashMap1.put("common", "https://ali2.a.kwimgs.com/kos/nlav11289/preload/1/common/703137335aa24ba594a0872e6738a3ac.zip");
          hashMap1.put("common-1", "https://ali2.a.kwimgs.com/kos/nlav11289/preload/1/common-1/d1a9a35db4794079a1374175b5a5238f.zip");
       }
       hashMap.put("motion", hashMap1);
       a uoa = new a("", obj, hashMap);
       obj = new HashMap();
       obj.put(str, Integer.valueOf(R.string.arg_RES_7f101ac4));
       obj.put("motion", Integer.valueOf(R.string.arg_RES_7f101ad5));
       hashMap = new HashMap();
       HashMap hashMap2 = new HashMap();
       hashMap2.put("common", "https://ali2.a.kwimgs.com/kos/nlav11289/preload/21/ca177ac1fed74df9b8ee23468d6a5ee4.zip");
       hashMap.put(str, hashMap2);
       HashMap hashMap3 = PatchProxy.apply(objArray, objArray, a.class, "1");
       if (hashMap3 != patchProxyRe) {
       }else {
          hashMap3 = new HashMap();
          hashMap3.put("common", "https://ali2.a.kwimgs.com/kos/nlav11289/preload/21/common/841c64e6ab684565afc10eac42e70477.zip");
       }
       hashMap.put("motion", hashMap3);
       a[] uoaArray = new a[]{uoa,new a("ksm", obj, hashMap)};
       PatchProxy.onMethodExit(DayNightInitModule$DesignCDNServiceCallbackImpl.class, "1");
       return uoaArray;
    }
    public void handleException(Exception p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, DayNightInitModule$DesignCDNServiceCallbackImpl.class, "4")) {
          return;
       }
       ExceptionHandler.handleCaughtException(p0);
       PatchProxy.onMethodExit(DayNightInitModule$DesignCDNServiceCallbackImpl.class, "4");
       return;
    }
}
