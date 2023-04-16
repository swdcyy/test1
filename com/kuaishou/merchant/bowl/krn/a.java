package com.kuaishou.merchant.bowl.krn.a;
import ps6.e;
import java.lang.Object;
import com.kuaishou.krn.model.LaunchModel;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import java.util.HashMap;
import com.kwai.kxb.KxbManager;
import com.kwai.kxb.PlatformType;
import gu6.b;
import iu6.a;
import st3.a;
import p74.a;
import java.util.Map;
import o74.a;

public class a implements e	// class@00160e
{
    public e a;
    public LaunchModel b;

    public void a(){
       super();
    }
    public void a(LaunchModel p0){
       this.b = p0;
    }
    public void o0(Throwable p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       a ta = this.a;
       if (ta != null) {
          ta.o0(p0);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "2") && (a.t().d("merchantKrnErrorUIReport", false) && this.b != null)) {
          HashMap hashMap = new HashMap();
          String str = this.b.a();
          String str1 = this.b.b();
          hashMap.put("bundleId", str);
          hashMap.put("componentName", str1);
          hashMap.put("url", this.b.f());
          a uoa1 = KxbManager.g.f(PlatformType.KDS_REACT).h(str);
          if (uoa1 != null) {
             hashMap.put("version", uoa1.i());
          }
          String str2 = null;
          if (p0 != null) {
             str2 = p0.getMessage();
          }
          a.o(new a(str1), str, str2, p0, hashMap);
       }
    label_0078 :
       return;
    }
}
