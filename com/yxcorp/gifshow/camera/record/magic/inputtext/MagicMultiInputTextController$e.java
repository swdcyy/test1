package com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController$e;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.inputtext.MagicMultiInputTextController;
import java.lang.Object;
import t4b.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import ce9.l;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import r5b.e;

public final class MagicMultiInputTextController$e implements g	// class@000e3f
{
    public final MagicMultiInputTextController b;

    public void MagicMultiInputTextController$e(MagicMultiInputTextController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicMultiInputTextController$e.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          b.D().w("MagicMultiInputTextController", "ShowMagicMultiInputTextEvent", objArray);
          this.b.g2(-1);
          p0 = this.b.d.d(l.i).a;
          p0 = (p0 != null)? p0.mId: null;
          if (p0 == null) {
             p0 = "";
          }
          e.g(p0, 0);
       }
       return;
    }
}
