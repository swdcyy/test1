package com.yxcorp.gifshow.map.search.a$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.map.search.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ty5.d;

public final class a$a implements View$OnClickListener	// class@001cd1
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, a.class, "3")) {
          tb.B.s7(true);
       }
       return;
    }
}
