package com.yxcorp.login.userlogin.presenter.accountsecurity.r;
import n3d.a;
import com.yxcorp.login.userlogin.presenter.accountsecurity.t;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.login.http.response.RiskCheckResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import erd.o;
import f2d.g0;
import f2d.e0;
import erd.g;
import crd.b;
import com.kwai.framework.accountsecurity.d;

public final class r implements a	// class@001bb7
{
    public final t b;

    public void r(t p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       r tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == -1) {
          RiskCheckResponse mAuthToken = SerializableHook.getSerializableExtra(p2, "KEY_RISK_CHECKING_RESULT").mAuthToken;
          String str = "";
          if (!PatchProxy.applyVoidFourRefs(mAuthToken, str, "", "", tb, t.class, "14")) {
             b.a(0x5cfaafff).z(mAuthToken, str, "", "").map(new e()).subscribe(new g0(tb), new e0(tb));
          }
       }else {
          tb.S8(true);
          d.i(true);
       }
       return;
    }
}
