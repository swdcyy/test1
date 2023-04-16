package com.kuaishou.commercial.splash.presenter.f$a;
import gz.a3;
import com.kuaishou.commercial.splash.presenter.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class f$a implements a3	// class@0015e7
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public long a(){
       return this.a.r;
    }
    public boolean b(){
       return this.a.v;
    }
    public boolean c(){
       return this.a.s;
    }
    public long d(){
       Object obj = PatchProxy.apply(null, this, f$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.a.W8();
    }
}
