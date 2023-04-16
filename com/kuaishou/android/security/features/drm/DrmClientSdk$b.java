package com.kuaishou.android.security.features.drm.DrmClientSdk$b;
import com.kuaishou.android.security.base.network.e;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kuaishou.android.security.base.log.d;
import org.json.JSONObject;
import com.kuaishou.android.security.features.drm.utils.b;
import com.kuaishou.android.security.internal.dispatch.JNICLibrary;
import android.util.Base64;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import com.kuaishou.android.security.base.util.a;
import java.lang.Integer;
import com.kuaishou.android.security.features.drm.DrmClientSdk;

public final class DrmClientSdk$b implements e	// class@000f32
{
    public final String a;
    public final int b;
    public final String c;
    public final int d;

    public void DrmClientSdk$b(String p0,int p1,String p2,int p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(String p0){
       byte[] uobyteArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, DrmClientSdk$b.class, "1")) {
          return;
       }
       d.a("exchangekey response:"+p0);
       JSONObject jSONObject = new JSONObject(p0);
       int i = jSONObject.optInt("resultCode");
       DrmClientSdk$b uob = 2;
       int i1 = 0;
       if (i) {
          String str = "resultDesc";
          if (i == 1) {
             b.a(this.a, this.b, 2001, "[dserver]"+jSONObject.optString(str));
             uobyteArray = new byte[i1];
             JNICLibrary.dCaBk(this.b, this.c, uobyteArray, 2001);
          }else if(i == uob){
             b.a(this.a, this.b, 2002, "[dserver]"+jSONObject.optString(str));
             uobyteArray = new byte[i1];
             JNICLibrary.dCaBk(this.b, this.c, uobyteArray, 2002);
          }else {
             b.a(this.a, this.b, 2003, "[dserver]"+jSONObject.optString(str));
             uobyteArray = new byte[i1];
             JNICLibrary.dCaBk(this.b, this.c, uobyteArray, 2003);
          }
          d.c("resultcode is "+jSONObject.optInt("resultCodd"));
          return;
       }else {
          i = jSONObject.optString("mainKey");
          if (!i.isEmpty()) {
             byte[] uobyteArray1 = Base64.decode(i, uob);
             byte[] uobyteArray2 = MXSec.get().getWrapper().atlasDecrypt("drm", "0dc6922f-e3ee-4c57-8eb1-b72d86635497", i1, uobyteArray1);
             if (!uobyteArray2.length) {
                uobyteArray = new byte[i1];
                JNICLibrary.dCaBk(this.b, this.c, uobyteArray, 1001);
                b.a(this.a, this.b, 1001, "[DECERROR]"+a.a(uobyteArray1));
             }else {
                d.c("Decrypt mainkey is "+a.a(uobyteArray2));
                JNICLibrary.dCaBk(this.b, this.c, uobyteArray2, 1200);
             }
          }else {
             byte[] uobyteArray3 = new byte[i1];
             JNICLibrary.dCaBk(this.b, this.c, uobyteArray3, 2004);
             b.a(this.a, this.b, 2004, "[DECERROR]");
          }
          return;
       }
    }
    public void onFailed(int p0,String p1){
       DrmClientSdk$b uob = DrmClientSdk$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "2")) {
          return;
       }
       d.c("exchangekey error:"+p1);
       DrmClientSdk.exchangeMainKey(this.d, this.a, this.b, this.c, p0, p1);
       return;
    }
}
