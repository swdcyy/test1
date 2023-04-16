package com.kwai.yoda.function.ui.b;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import crd.b;
import ey7.a;
import io.reactivex.g;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import lrd.b;
import ey7.d;
import ey7.c;
import ey7.b;
import erd.g;
import erd.a;

public class b extends c	// class@001237
{
    public b f;

    public void b(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
             return;
          }
       }
       b tf = this.f;
       if (tf != null && !tf.isDisposed()) {
          this.f = null;
          return;
       }else {
          b uob1 = this;
          YodaBaseWebView yodaBaseWebV = p0;
          String str = p1;
          String str1 = p2;
          String str2 = p4;
          d uod = new d(uob1, yodaBaseWebV, str, str1, str2);
          c uoc = new c(uob1, yodaBaseWebV, str, str1, str2);
          this.f = t.create(new a(p0)).subscribeOn(a.c()).observeOn(b.c()).subscribe(v6, v7, new b(this));
          return;
       }
    }
}
