package com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class MagicMultiInputTextController$d implements Runnable	// class@000e3e
{
    public final MagicMultiInputTextController b;
    public final int c;

    public void MagicMultiInputTextController$d(MagicMultiInputTextController p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MagicMultiInputTextController$d.class, "1")) {
          return;
       }
       this.b.g2(this.c);
       return;
    }
}
