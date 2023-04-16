package com.yxcorp.login.userlogin.e$a;
import du5.c;
import com.yxcorp.login.userlogin.e;
import java.lang.Object;
import java.util.HashMap;
import du5.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.yxcorp.login.http.response.ResetSelectResponse;
import com.yxcorp.login.userlogin.f$a;
import com.yxcorp.login.userlogin.f;
import java.lang.Integer;
import e17.i;

public class e$a implements c	// class@001b24
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void c(HashMap p0){
       b.b(this, p0);
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "1")) {
          return;
       }
       e$a ta = this.a;
       ta.e.a(ta.a, ta.c, null, p0, p1, ta.d);
       return;
    }
    public void onFailed(int p0){
       e$a uoa = e$a.class;
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
