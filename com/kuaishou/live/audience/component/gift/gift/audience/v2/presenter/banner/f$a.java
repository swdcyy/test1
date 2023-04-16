package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f$a;
import jk1.c;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.banner.f;
import java.lang.Object;
import jk1.d;
import com.kwai.framework.model.user.UserInfo;
import jk1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class f$a implements c	// class@000b2f
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(d p0,UserInfo p1){
       b.e(this, p0, p1);
    }
    public void c(d p0){
       b.a(this, p0);
    }
    public void d(){
       b.c(this);
    }
    public void e(int p0,int p1){
       b.d(this, p0, p1);
    }
    public void f(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       this.a.R8();
       return;
    }
}
