package com.yxcorp.gifshow.v3.editor.text.n0$d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.text.n0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.LinearLayout;
import e17.i;
import java.util.Map;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import wpc.a0;
import t36.f;
import huc.d0;
import t36.f$a;

public class n0$d extends m	// class@001477
{
    public final n0 c;

    public void n0$d(n0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0$d.class, "1")) {
          return;
       }
       n0$d tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, n0.class, "6")) {
          if (tc.I.isSelected()) {
             i.a(R.style.arg_RES_7f11066a, 0x7f100c96);
          }else {
             f.p0(tc.u.u(), a0.class).s0(new d0(tc));
          }
       }
       return;
    }
}
