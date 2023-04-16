package com.yxcorp.gifshow.dialog.kem.b;
import com.yxcorp.gifshow.dialog.kem.l;
import com.yxcorp.gifshow.dialog.kem.a$b;
import com.kwai.library.widget.popup.common.c;
import ilb.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.response.dialog.KemAdvanceCommonDialogResponse;
import x9a.j0;

public class b extends l	// class@001aae
{
    public final a$b c;

    public void b(a$b p0,c p1){
       this.c = p0;
       super(p1);
    }
    public void a(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       j0.h(this.c.b, true);
       super.a(p0);
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
