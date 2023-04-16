package com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$d;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController;
import java.lang.Object;
import y4b.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler;
import java.util.Objects;
import kotlin.jvm.internal.a;
import y4b.c;
import s5b.b;
import q87.c;

public final class MagicSafeUIAreaController$d implements g	// class@000e4d
{
    public final MagicSafeUIAreaController b;

    public void MagicSafeUIAreaController$d(MagicSafeUIAreaController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSafeUIAreaController$d.class, "1")) {
       }else {
          MagicSafeUIAreaHandler magicSafeUIA = this.b.g2();
          p0 = p0.a;
          Objects.requireNonNull(magicSafeUIA);
          if (!PatchProxy.applyVoidOneRefs(p0, magicSafeUIA, MagicSafeUIAreaHandler.class, "17")) {
             magicSafeUIA = magicSafeUIA.d;
             if (magicSafeUIA == null) {
                a.S("safeUIAreaCalculator");
             }
             Objects.requireNonNull(magicSafeUIA);
             if (!PatchProxy.applyVoidOneRefs(p0, magicSafeUIA, c.class, "4")) {
                Object[] objArray = new Object[0];
                b.D().w("MagicSafeUIAreaCalculator", "setSafeUIAreaProcessor", objArray);
                magicSafeUIA.b = p0;
             }
          }
       }
       return;
    }
}
