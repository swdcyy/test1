package com.kuaishou.live.core.show.guestactivity.h$b;
import n92.d;
import com.kuaishou.live.core.show.guestactivity.h;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n92.z;
import java.util.Map;

public class h$b implements d	// class@000bd8
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public UserInfo a(){
       Object obj = PatchProxy.apply(null, this, h$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.V.a();
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "2")) {
          return;
       }
       this.a.V.b();
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, h$b.class, "3")) {
          return;
       }
       this.a.V.c();
       return;
    }
    public Map d(){
       return this.a.O;
    }
    public String e(){
       return this.a.P;
    }
}
