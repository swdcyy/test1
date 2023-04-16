package com.yxcorp.login.userlogin.a$a;
import du5.c;
import com.yxcorp.login.userlogin.a;
import java.lang.Object;
import java.util.HashMap;
import du5.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.login.model.AccountRiskParams;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.userlogin.b$a;
import com.yxcorp.login.userlogin.b;
import java.lang.Integer;
import e17.i;

public class a$a implements c	// class@001afd
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void c(HashMap p0){
       b.b(this, p0);
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       this.a.c.setZtType(p0);
       this.a.c.setZtToken(p1);
       a$a ta = this.a;
       ta.f.a(ta.a, ta.d, ta.c, ta.e);
       return;
    }
    public void onFailed(int p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       if (p0) {
          if (p0 == 427) {
             i.a(R.style.arg_RES_7f11066a, 0x7f103404);
          }
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f1004b4);
       }
       if (!this.a.a.isFinishing()) {
          this.a.a.finish();
       }
       return;
    }
}
