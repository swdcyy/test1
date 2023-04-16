package com.yxcorp.gifshow.dialog.kem.a$b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.dialog.kem.a$b;
import com.kwai.library.widget.popup.common.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import i89.d;
import i89.c;
import com.yxcorp.gifshow.model.response.dialog.KemDialogResponse;
import brd.t;
import cjd.e;
import erd.o;
import x9a.e;
import erd.g;
import x9a.d;
import erd.a;
import com.yxcorp.gifshow.dialog.kem.b;
import com.yxcorp.gifshow.dialog.kem.c;
import crd.b;

public class a$b$a extends m	// class@001aab
{
    public final c c;
    public final a$b d;

    public void a$b$a(a$b p0,c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b$a.class, "1")) {
          return;
       }
       a$b$a td = this.d;
       a$b$a tc = this.c;
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoidOneRefs(tc, td, a$b.class, "2")) {
          a$b b = td.b;
          c.a().e(b.mActivityId, b.mDialogType).map(new e()).doOnSubscribe(new e(td)).doFinally(new d(td)).subscribe(new b(td, tc), new c(td));
       }
       return;
    }
}
