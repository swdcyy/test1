package com.yxcorp.login.userlogin.b;
import java.lang.Object;
import android.app.Activity;
import com.yxcorp.login.model.AccountRiskParams;
import n3d.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.util.LoginPageLauncher;
import com.yxcorp.login.util.LoginPageLauncher$LoginType;
import com.yxcorp.login.util.LoginPageLauncher$a;
import android.content.Context;
import w1d.a;
import com.yxcorp.login.util.LoginPageLauncher$b;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.b$a;
import java.util.HashMap;
import crd.b;
import lnc.b9;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wkd.b;
import m1d.a;
import java.util.Map;
import brd.t;
import cjd.e;
import erd.o;
import w1d.b;
import w1d.c;
import erd.g;

public class b	// class@001b21
{
    public b a;

    public void b(){
       super();
    }
    public static void b(Activity p0,AccountRiskParams p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "1")) {
          return;
       }
       LoginPageLauncher loginPageLau = LoginPageLauncher.i.a(LoginPageLauncher$LoginType.ACCOUNT_RISK_CHECKING);
       loginPageLau.b(p0);
       loginPageLau.c(new a(p1));
       loginPageLau.h(p2);
       loginPageLau.f();
       return;
    }
    public void a(Activity p0,Fragment p1,AccountRiskParams p2,b$a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "2")) {
          return;
       }
       if (p0 != null && p2 != null) {
          HashMap hashMap = new HashMap();
          b9.a(this.a);
          hashMap.put("type", Integer.valueOf(p2.getType()));
          if (!TextUtils.x(p2.getZtType())) {
             hashMap.put("ztIdentityVerificationType", p2.getZtType());
          }
          if (!TextUtils.x(p2.getZtToken())) {
             hashMap.put("ztIdentityVerificationCheckToken", p2.getZtToken());
          }
          if (!TextUtils.x(p2.getPlatform())) {
             hashMap.put("platform", p2.getPlatform());
          }
          c uoc = new c(this, p3, p0, p1, p2);
          this.a = b.a(0x5cfaafff).x(hashMap).map(new e()).subscribe(new b(p2, p3), v8);
       }
       return;
    }
}
