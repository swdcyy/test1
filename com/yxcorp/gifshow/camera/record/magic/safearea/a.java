package com.yxcorp.gifshow.camera.record.magic.safearea.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler;
import com.yxcorp.gifshow.camera.record.magic.safearea.MagicSafeUIAreaController;

public final class a implements Runnable	// class@000e58
{
    public final MagicSafeUIAreaController$c b;

    public void a(MagicSafeUIAreaController$c p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.b.b.g2().d();
       return;
    }
}
