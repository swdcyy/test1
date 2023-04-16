package com.yxcorp.login.userlogin.f;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.http.response.ResetSelectResponse;
import com.yxcorp.login.userlogin.f$a;
import java.util.Map;
import crd.b;
import lnc.b9;
import java.lang.Integer;
import com.yxcorp.login.loginaction.LoginHelper;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import w1d.k;
import w1d.l;
import erd.g;

public class f	// class@001b27
{
    public b a;
    public Map b;

    public void f(){
       super();
       this.b = new HashMap();
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("useNewResetPWDStyle", false);
    }
    public void a(Activity p0,Fragment p1,ResetSelectResponse p2,String p3,String p4,f$a p5){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uof, "2")) {
             return;
          }
       }
       if (p0 != null && (!this.b.isEmpty() || p2 != null)) {
          b9.a(this.a);
          if (this.b.isEmpty() && p2 != null) {
             this.b.put("authToken", p2.getCurrentAuthToken());
             this.b.put("accountToken", p2.mAccountToken);
             this.b.put("accountIndex", Integer.valueOf(p2.mUserIndex));
             this.b.put("mobile", LoginHelper.b(p2.mPhone));
             this.b.put("mobileCountryCode", p2.mCountryCode);
          }
          if (!TextUtils.x(p3)) {
             this.b.put("ztIdentityVerificationType", p3);
          }
          if (!TextUtils.x(p4)) {
             this.b.put("ztIdentityVerificationCheckToken", p4);
          }
          this.a = b.a(0x5cfaafff).s(this.b).map(new e()).subscribe(new k(p5), new l(this, p5, p0, p1));
       }
       return;
    }
}
