package com.yxcorp.gifshow.growth.test.KwaiPopUriHandler$b;
import java.lang.Runnable;
import rn.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rn.e;
import rn.a;
import rn.e$a;

public final class KwaiPopUriHandler$b implements Runnable	// class@001543
{
    public final b b;

    public void KwaiPopUriHandler$b(b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KwaiPopUriHandler$b.class, "1")) {
          return;
       }
       a uoa = e.a.a(this.b);
       if (uoa != null) {
          uoa = uoa.build();
          if (uoa != null) {
             uoa.show();
          }
       }
       return;
    }
}
