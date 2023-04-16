package com.yxcorp.login.userlogin.presenter.phoneverify.c$c;
import mvb.b$b;
import com.yxcorp.login.userlogin.presenter.phoneverify.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import im8.f;

public class c$c implements b$b	// class@001bd1
{
    public final c a;

    public void c$c(c p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,int p2,String p3){
       if (PatchProxy.isSupport(c$c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, c$c.class, "1")) {
          return;
       }
       if (!TextUtils.x(p1)) {
          this.a.r.set(p1);
          this.a.P8();
       }
       return;
    }
}
