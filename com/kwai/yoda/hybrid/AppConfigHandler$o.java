package com.kwai.yoda.hybrid.AppConfigHandler$o;
import java.util.concurrent.Callable;
import com.kwai.yoda.hybrid.AppConfigHandler;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iy7.b;
import qrd.l1;

public final class AppConfigHandler$o implements Callable	// class@001277
{
    public final AppConfigHandler b;
    public final List c;

    public void AppConfigHandler$o(AppConfigHandler p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object call(){
       if (PatchProxy.applyVoid(null, this, AppConfigHandler$o.class, "1")) {
       }else {
          this.b.e.d(this.c);
       }
       return l1.a;
    }
}
