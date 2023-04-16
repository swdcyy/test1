package com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController$bindMagicEffect$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.message_camera.effect.magic.IMMagicEffectController;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import kotlin.jvm.internal.a;
import dc5.c;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.io.File;
import i4b.g;
import java.lang.StringBuilder;
import xi9.n;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import eib.i;

public final class IMMagicEffectController$bindMagicEffect$1 extends Lambda implements a	// class@001d8a
{
    public final MagicEmoji$MagicFace $magicFace;
    public final IMMagicEffectController this$0;

    public void IMMagicEffectController$bindMagicEffect$1(IMMagicEffectController p0,MagicEmoji$MagicFace p1){
       this.this$0 = p0;
       this.$magicFace = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, IMMagicEffectController$bindMagicEffect$1.class, "1")) {
          return;
       }
       SimpleMagicFace mId = this.$magicFace.mId;
       IMMagicEffectController d = this.this$0.d;
       if (d != null) {
          objArray = d.mId;
       }
       String str = "IMMagicEffectController";
       if (a.g(mId, objArray)) {
          c.g(str, "bindMagicFace repeat");
       }else {
          this.this$0.h(this.$magicFace);
          File uFile = g.j(this.$magicFace);
          a.o(uFile, "MagicFaceResourceHelper.¡­tMagicFaceFile\(magicFace\)");
          String absolutePath = uFile.getAbsolutePath();
          c.g(str, "bindMagicFace start dir "+absolutePath);
          this.this$0.d = this.$magicFace;
          IMMagicEffectController f = this.this$0.f;
          if (f != null) {
             f.j(this.$magicFace, absolutePath);
          }
          Iterator iterator = this.this$0.e().iterator();
          while (iterator.hasNext()) {
             iterator.next().a(this.this$0.d, this.$magicFace);
          }
       }
       return;
    }
}
