package com.kuaishou.live.gzone.treasurebox.presenter.r$c;
import n57.a;
import com.kuaishou.live.gzone.treasurebox.presenter.r;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import java.lang.CharSequence;
import android.widget.TextView;

public class r$c implements a	// class@001c94
{
    public final r a;

    public void r$c(r p0){
       this.a = p0;
       super();
    }
    public void a(long p0){
       r$c uoc = r$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.a.I.setText(String.valueOf(p0));
       return;
    }
}
