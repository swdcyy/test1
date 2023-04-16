package com.kwai.live.gzone.accompanyplay.anchor.c0;
import erd.g;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.text.SpannableStringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;

public class c0 implements g	// class@000b00
{
    public final b0 b;

    public void c0(b0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
       }else {
          p0 = this.b;
          p0.I = p0.I - 1;
          p0.D.setText(p0.R8(a1.r(p0.S8(1), String.valueOf(this.b.I))));
          p0 = this.b;
          if (p0.I == null) {
             p0.V8();
          }
       }
       return;
    }
}
