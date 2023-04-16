package com.kwai.live.gzone.accompanyplay.anchor.b0$c;
import android.widget.CompoundButton$OnCheckedChangeListener;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import java.lang.Object;
import android.widget.CompoundButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import crd.b;
import lnc.b9;
import android.widget.TextView;

public class b0$c implements CompoundButton$OnCheckedChangeListener	// class@000afa
{
    public final b0 b;

    public void b0$c(b0 p0){
       this.b = p0;
       super();
    }
    public void onCheckedChanged(CompoundButton p0,boolean p1){
       if (PatchProxy.isSupport(b0$c.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, b0$c.class, "1")) {
          return;
       }
       if (!p1) {
          b9.a(this.b.t);
          b0$c tb = this.b;
          tb.D.setText(tb.S8(false));
       }
       this.b.F.setSelected(p1);
       return;
    }
}
