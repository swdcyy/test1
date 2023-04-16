package com.yxcorp.gifshow.log.widget.a$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class a$a	// class@001b5f
{
    public final String a;
    public final long b;
    public final long c;

    public void a$a(String p0,long p1,long p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Reason{"+this.a+","+this.b+"}";
    }
}
