package com.kuaishou.live.tuna.presenter.b$b;
import com.kuaishou.live.tuna.presenter.b$c;
import com.kuaishou.live.tuna.presenter.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pp3.b;

public class b$b implements b$c	// class@000fd8
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.a9().isVisible();
    }
}
