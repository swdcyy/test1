package com.yxcorp.gifshow.featured.offline.a$e$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.featured.offline.a$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import yea.a;
import xea.b;
import yea.f;

public class a$e$a implements Runnable	// class@000fe0
{
    public final a$e b;

    public void a$e$a(a$e p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$e$a.class, "1")) {
          return;
       }
       b uob = b.a(-730154612).b(this.b.b);
       if (uob != null) {
          uob.downloadStatus = 4;
          b.a(0x60e4a25a).b(uob);
       }
       return;
    }
}
