package com.kuaishou.aegon.okhttp.impl.e$a;
import java.lang.Runnable;
import com.kuaishou.aegon.okhttp.impl.e;
import com.kuaishou.aegon.okhttp.impl.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.aegon.okhttp.impl.f;
import okio.m;
import okio.c;
import okhttp3.RequestBody;
import java.io.IOException;

public class e$a implements Runnable	// class@0007bd
{
    public final a b;
    public final e c;

    public void e$a(e p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       e$a tb = this.b;
       try{
          f uof = new f(tb);
          this.c.c.writeTo(uof);
          uof.flush();
       }catch(java.io.IOException e0){
          e0.printStackTrace();
       }
       return;
    }
}
