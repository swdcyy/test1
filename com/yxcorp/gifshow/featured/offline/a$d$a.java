package com.yxcorp.gifshow.featured.offline.a$d$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.featured.offline.a$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import yea.f;

public class a$d$a implements Runnable	// class@000fde
{
    public final a$d b;

    public void a$d$a(a$d p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$d$a.class, "1")) {
          return;
       }
       b.a(0x60e4a25a).e(this.b.b);
       return;
    }
}
