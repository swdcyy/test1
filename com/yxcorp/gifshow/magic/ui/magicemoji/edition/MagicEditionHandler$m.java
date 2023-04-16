package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$m;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class MagicEditionHandler$m implements g	// class@001bc6
{
    public final MagicEditionHandler b;

    public void MagicEditionHandler$m(MagicEditionHandler p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler$m.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.i();
          }
       }
       return;
    }
}
