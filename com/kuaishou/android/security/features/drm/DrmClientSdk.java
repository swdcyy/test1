package com.kuaishou.android.security.features.drm.DrmClientSdk;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.security.internal.dispatch.JNICLibrary;
import com.kuaishou.android.security.features.drm.utils.b;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.log.d;
import com.kuaishou.android.security.features.drm.AppDrmInfoService;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import com.kuaishou.android.security.base.util.a;
import com.kuaishou.android.security.features.drm.DrmContext;
import com.kuaishou.android.security.base.network.b;
import com.kuaishou.android.security.features.drm.DrmClientSdk$b;
import com.kuaishou.android.security.base.network.e;
import com.kuaishou.android.security.base.network.d;
import com.kuaishou.android.security.base.network.d$b;
import android.util.Base64;
import android.os.AsyncTask;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.features.drm.DrmClientSdk$c;
import com.kuaishou.android.security.features.drm.DrmClientSdk$a;

public class DrmClientSdk	// class@000f34
{
    public AppDrmInfoService appInfoService;

    public void DrmClientSdk(){
       super();
    }
    public static void exchangeMainKey(int p0,String p1,int p2,String p3,int p4,String p5){
       int i = p0;
       object oobject = p1;
       int i1 = p2;
       object oobject1 = p3;
       String str = "0dc6922f-e3ee-4c57-8eb1-b72d86635497";
       String str1 = "drm";
       DrmClientSdk uDrmClientSd = DrmClientSdk.class;
       int i2 = 4;
       int i3 = 3;
       if (PatchProxy.isSupport(uDrmClientSd)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,Integer.valueOf(p2),oobject1,Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, null, uDrmClientSd, "2")) {
             return;
          }
       }
       int i4 = 1002;
       if (i <= 0) {
          byte[] uobyteArray = new byte[0];
          JNICLibrary.dCaBk(i1, oobject1, uobyteArray, 1000);
          Object[] objArray1 = new Object[]{Integer.valueOf(p4),p5};
          b.a(oobject, i1, i4, String.format("[http_resp_onfailed]errorno:[%d] errorMessage:[%s]", objArray1));
          return;
       }else {
          d.c("retry current times["+i+"]");
          i = i - 1;
          d.a("req:"+oobject+" random_id:"+i1);
          Object[] objArray2 = new Object[]{oobject,DrmClientSdk.get().getAppInfoService().getCurrentUserId(),DrmClientSdk.get().getAppInfoService().getDeviceId(),"ANDROID","KUAISHOU"};
          String str2 = String.format("%s$%s$%s$%s$%s", objArray2);
          String str3 = MXSec.get().getWrapper().atlasSign(str1, str, 0, str2);
          Object[] objArray3 = new Object[]{str2,str3};
          d.a(String.format("drm atlasign input[%s] output[%s]", objArray3));
          byte[] uobyteArray1 = MXSec.get().getWrapper().atlasEncrypt(str1, str, 0, str2.getBytes());
          objArray3 = new Object[]{str2,a.a(uobyteArray1)};
          d.a(String.format("drm atlasencrypt input[%s] output_hex[%s]", objArray3));
          str1 = (DrmContext.isIsDebugModel())? "https://zt-drm.test.gifshow.com/rest/zt/basic/drm/getMainKeyByToken": "https://zt-basic-drm.kuaishou.com/rest/zt/basic/drm/getMainKeyByToken";
          d[] uodArray = new d[]{new d$b(str1).a("encryptData", Base64.encodeToString(uobyteArray1, 2)).a("sign", str3).a()};
          new b(new DrmClientSdk$b(oobject, i1, str2, i)).execute(uodArray);
          return;
       }
    }
    public static DrmClientSdk get(){
       Object obj = PatchProxy.apply(null, null, DrmClientSdk.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return DrmClientSdk$c.a();
    }
    public AppDrmInfoService getAppInfoService(){
       DrmClientSdk$a uoa;
       DrmClientSdk obj = PatchProxy.apply(null, this, DrmClientSdk.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.appInfoService;
       if (obj == null) {
          uoa = new DrmClientSdk$a(this);
       }
       return uoa;
    }
    public DrmClientSdk setAppDrmInfoService(AppDrmInfoService p0){
       if (this.appInfoService != null) {
          return this;
       }
       this.appInfoService = p0;
       return this;
    }
}
