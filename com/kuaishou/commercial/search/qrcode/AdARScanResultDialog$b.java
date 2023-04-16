package com.kuaishou.commercial.search.qrcode.AdARScanResultDialog$b;
import androidx.fragment.app.c$b;
import com.kuaishou.commercial.search.qrcode.AdARScanResultDialog;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import yx.j0;
import com.kwai.framework.player.core.b;

public final class AdARScanResultDialog$b extends c$b	// class@00156b
{
    public final AdARScanResultDialog a;

    public void AdARScanResultDialog$b(AdARScanResultDialog p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdARScanResultDialog$b.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       AdARScanResultDialog$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, AdARScanResultDialog.class, "10")) {
          Object[] objArray = new Object[0];
          j0.f("AdARScanResultDialog", "pausePlayer", objArray);
          ta.p = true;
          AdARScanResultDialog n = ta.n;
          if (n != null) {
             n.pause();
          }
       }
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdARScanResultDialog$b.class, "2")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       AdARScanResultDialog$b ta = this.a;
       if (ta.r == null) {
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, AdARScanResultDialog.class, "11")) {
             Object[] objArray = new Object[0];
             j0.f("AdARScanResultDialog", "startPlayer", objArray);
             ta.p = false;
             AdARScanResultDialog n = ta.n;
             if (n != null) {
                n.start();
             }
          }
       }
       return;
    }
}
