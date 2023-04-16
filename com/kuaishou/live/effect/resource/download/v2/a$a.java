package com.kuaishou.live.effect.resource.download.v2.a$a;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a$a	// class@001b58
{
    public final int a;
    public final Throwable b;

    public void a$a(int p0,Throwable p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ErrorInfo{code="+this.a+", exception="+this.b+'}';
    }
}
