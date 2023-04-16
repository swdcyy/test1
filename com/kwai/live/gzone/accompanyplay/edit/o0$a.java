package com.kwai.live.gzone.accompanyplay.edit.o0$a;
import erd.g;
import com.kwai.live.gzone.accompanyplay.edit.o0;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;

public class o0$a implements g	// class@000c0f
{
    public final o0 b;

    public void o0$a(o0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o0$a.class, "1")) {
       }else {
          o0$a tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, o0.class, "4")) {
             if (p0.intValue() < 0) {
                tb.v.setText(R.string.arg_RES_7f102370);
             }else {
                tb.v.setText(a1.q(R.string.arg_RES_7f102359, (p0.intValue() / 60)));
             }
          }
       }
       return;
    }
}
