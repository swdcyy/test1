package com.kuaishou.live.gzone.barrage.p$a;
import oq5.c;
import com.kuaishou.live.gzone.barrage.p;
import java.lang.Object;
import android.content.res.Configuration;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.view.View;
import t02.a0;
import jv1.b;
import b53.i0;
import java.lang.Runnable;
import ekd.k1;
import b53.j0;

public class p$a implements c	// class@001c43
{
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$a.class, "1")) {
          return;
       }
       p$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, p.class, "11")) {
          p w = tb.w;
          if (w != null) {
             w.setVisibility(8);
          }
          if (tb.s.x.H2()) {
             if (tb.z != null) {
                tb.z = false;
                k1.r(new i0(tb), 0);
             }
          }else if(tb.y != null){
             tb.y = false;
             k1.r(new j0(tb), 0);
          }
       }
    label_004f :
       return;
    }
}
