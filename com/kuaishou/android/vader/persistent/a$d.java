package com.kuaishou.android.vader.persistent.a$d;
import java.util.concurrent.Callable;
import com.kuaishou.android.vader.persistent.a;
import com.kuaishou.android.vader.Channel;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class a$d implements Callable	// class@000722
{
    public final Channel b;
    public final int c;
    public final int d;
    public final int e;
    public final a f;

    public void a$d(a p0,Channel p1,int p2,int p3,int p4){
       this.f = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public List a(){
       Object obj = PatchProxy.apply(null, this, a$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.f.g();
       return this.f.d(this.b, this.c, this.d, this.e);
    }
    public Object call(){
       return this.a();
    }
}
