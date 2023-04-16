package com.yxcorp.gifshow.ad.webview.o$b;
import erd.g;
import com.yxcorp.gifshow.ad.webview.o;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import p59.t;

public class o$b implements g	// class@001910
{
    public final o b;

    public void o$b(o p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$b.class, "1")) {
       }else {
          o$b tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, o.class, "2")) {
             if (p0 == FragmentEvent.DESTROY) {
                p0 = tb.c;
                if (p0 != null) {
                   p0.b();
                }
             }else if(p0 == FragmentEvent.RESUME){
                p0 = tb.c;
                if (p0 != null) {
                   p0.c();
                }
             }
          }
       }
       return;
    }
}
