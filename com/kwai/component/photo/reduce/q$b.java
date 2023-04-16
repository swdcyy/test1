package com.kwai.component.photo.reduce.q$b;
import tyc.u4;
import com.kwai.component.photo.reduce.q;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.widget.TextView;

public class q$b extends u4	// class@000b03
{
    public final q b;

    public void q$b(q p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$b.class, "1")) {
          return;
       }
       boolean b = false;
       int i = (p0 != null)? p0.length(): 0;
       this.b.s.setText(i+"/"+100);
       q t = this.b.t;
       if (i > 0) {
          b = true;
       }
       t.setEnabled(b);
       return;
    }
}
