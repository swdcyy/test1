package com.kuaishou.android.vader.b$a;
import java.util.concurrent.Callable;
import com.kuaishou.android.vader.b;
import java.lang.Object;
import com.kuaishou.android.vader.stat.VaderStat;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import uq.a;

public class b$a implements Callable	// class@000f6c
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public VaderStat a(){
       Object obj = PatchProxy.applyWithListener(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(b$a.class, "1");
       return this.b.e.e();
    }
    public Object call(){
       return this.a();
    }
}
