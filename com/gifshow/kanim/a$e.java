package com.gifshow.kanim.a$e;
import bh.n;
import com.gifshow.kanim.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class a$e implements n	// class@0015b1
{
    public final a a;

    public void a$e(a p0){
       this.a = p0;
       super();
    }
    public void onResult(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$e.class, "1")) {
       }else {
          a q = this.a.q;
          if (q == null) {
             q = a.u;
          }
          q.onResult(p0);
       }
       return;
    }
}
