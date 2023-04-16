package com.yxcorp.gifshow.dialog.kem.c;
import sfc.a;
import com.yxcorp.gifshow.dialog.kem.a$b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.dialog.KemAdvanceCommonDialogResponse;
import x9a.j0;

public class c extends a	// class@001aaf
{
    public final a$b c;

    public void c(a$b p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       j0.h(this.c.b, false);
       super.b(p0);
       return;
    }
}
