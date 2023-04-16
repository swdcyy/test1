package com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$e;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler;
import java.util.Objects;
import s5b.b;
import q87.c;

public final class MagicSafeUIAreaController$e implements Runnable	// class@000e4e
{
    public final MagicSafeUIAreaController b;

    public void MagicSafeUIAreaController$e(MagicSafeUIAreaController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicSafeUIAreaController$e.class, "1")) {
          return;
       }
       MagicSafeUIAreaHandler magicSafeUIA = this.b.g2();
       Objects.requireNonNull(magicSafeUIA);
       if (!PatchProxy.applyVoid(objArray, magicSafeUIA, MagicSafeUIAreaHandler.class, "2")) {
          Object[] objArray1 = new Object[0];
          b.D().w("MagicSafeUIAreaHandler", "initAfterResume", objArray1);
          magicSafeUIA.c();
          magicSafeUIA.d();
       }
       return;
    }
}
