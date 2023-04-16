package com.yxcorp.gifshow.detail.util.e$a;
import crd.b;
import java.lang.Object;
import com.yxcorp.gifshow.detail.util.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kb.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class e$a implements b	// class@001a31
{
    public b b;
    public c c;
    public e$b d;

    public void e$a(){
       super();
       this.b = null;
    }
    public void e$a(d p0){
       super();
       this.b = null;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, e$a.class, "1")) {
          return;
       }
       e$a tb = this.b;
       if (tb != null && !tb.isDisposed()) {
          this.b.dispose();
       }
       tb = this.c;
       if (tb != null && !tb.isClosed()) {
          this.c.close();
       }
       this.c = null;
       this.b = null;
       this.d = null;
       return;
    }
    public boolean isDisposed(){
       boolean b;
       e$a obj = PatchProxy.apply(null, this, e$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.c;
       if (obj == null || obj.isClosed()) {
          obj = this.b;
          if (obj == null || obj.isDisposed()) {
             b = true;
          label_002c :
             return b;
          }
       }
       b = false;
       goto label_002c ;
    }
}
