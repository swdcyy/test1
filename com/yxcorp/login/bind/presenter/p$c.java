package com.yxcorp.login.bind.presenter.p$c;
import sfc.a;
import com.yxcorp.login.bind.presenter.p;
import android.content.Context;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;

public class p$c extends a	// class@001a93
{
    public final p c;

    public void p$c(p p0,Context p1){
       this.c = p0;
       super(p1);
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$c.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.r.setEnabled(true);
       return;
    }
}
