package com.yxcorp.login.helper.c;
import java.lang.Object;
import com.yxcorp.login.loginaction.LoginHelper;
import java.lang.String;
import java.util.Map;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.login.helper.b;
import erd.o;
import t45.d;
import brd.z;

public class c	// class@001ab7
{
    public LoginHelper a;

    public void c(){
       super();
       this.a = new LoginHelper();
    }
    public t a(String p0,String p1,Map p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.d().flatMap(new b(this, p2, p0, p1)).subscribeOn(d.c);
    }
}
