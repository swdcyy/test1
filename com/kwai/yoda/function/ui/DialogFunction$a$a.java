package com.kwai.yoda.function.ui.DialogFunction$a$a;
import com.kuaishou.webkit.ValueCallback;
import brd.v;
import java.lang.Object;
import ez7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.g;

public final class DialogFunction$a$a implements ValueCallback	// class@001230
{
    public final v a;

    public void DialogFunction$a$a(v p0){
       this.a = p0;
       super();
    }
    public void onReceiveValue(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogFunction$a$a.class, "1")) {
       }else {
          this.a.onNext(p0);
          this.a.onComplete();
       }
       return;
    }
}
