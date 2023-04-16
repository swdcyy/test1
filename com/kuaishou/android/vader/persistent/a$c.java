package com.kuaishou.android.vader.persistent.a$c;
import java.util.concurrent.Callable;
import com.kuaishou.android.vader.persistent.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class a$c implements Callable	// class@000f7b
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public Boolean a(){
       Object obj = PatchProxy.apply(null, this, a$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.g();
       return Boolean.TRUE;
    }
    public Object call(){
       return this.a();
    }
}
