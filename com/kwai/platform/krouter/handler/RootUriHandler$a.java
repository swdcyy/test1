package com.kwai.platform.krouter.handler.RootUriHandler$a;
import qh7.c;
import com.kwai.platform.krouter.handler.RootUriHandler;
import xh7.b;
import java.lang.Object;
import yh7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qh7.b;
import xh7.a;
import uh7.b;
import java.util.Iterator;
import java.util.List;
import uh7.a;
import java.lang.StringBuilder;
import android.net.Uri;
import vh7.a;

public class RootUriHandler$a implements c	// class@00128d
{
    public final b a;
    public final RootUriHandler b;

    public void RootUriHandler$a(RootUriHandler p0,b p1){
       this.b = p0;
       super();
       this.a = p1;
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RootUriHandler$a.class, "2")) {
          return;
       }
       b uob = this.a.c(b.class, "com.kwai.platform.krouter.CompleteListener");
       RootUriHandler$a ta = this.a;
       if (!PatchProxy.applyVoidTwoRefs(ta, p0, null, b.class, "4")) {
          Iterator iterator = b.a.iterator();
          while (iterator.hasNext()) {
             iterator.next().a(ta, p0);
          }
       }
       a a = p0.a;
       if (a != 200) {
          if (a != 302) {
             a.b("route failed. "+this.a.g().toString());
             if (uob != null) {
                uob.a(p0);
             }
          }else {
             this.b.g(this.a);
             a.b("route redirect to. "+this.a.g().toString());
          }
       }else {
          a.b("route succeed. "+this.a.g().toString());
          if (uob != null) {
             uob.a(p0);
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, RootUriHandler$a.class, "1")) {
          return;
       }
       this.a(new a(409));
       return;
    }
}
