package com.yxcorp.gifshow.featured.offline.a$c$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.featured.offline.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import yea.f;

public class a$c$a implements Runnable	// class@000fdc
{
    public final a$c b;

    public void a$c$a(a$c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, a$c$a.class, "1")) {
          return;
       }
       b.a(0x60e4a25a).d(this.b.b);
       return;
    }
}
