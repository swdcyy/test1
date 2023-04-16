package com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler$i;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.edition.MagicEditionHandler;
import android.app.Activity;
import a4b.a;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class MagicEditionHandler$i implements g	// class@001bc2
{
    public final MagicEditionHandler b;
    public final Activity c;
    public final a d;

    public void MagicEditionHandler$i(MagicEditionHandler p0,Activity p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicEditionHandler$i.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             this.b.j(this.c, this.d);
          }
       }
       return;
    }
}
