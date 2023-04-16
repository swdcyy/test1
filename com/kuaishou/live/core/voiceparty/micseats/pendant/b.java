package com.kuaishou.live.core.voiceparty.micseats.pendant.b;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vv2.f;
import java.lang.Math;
import vv2.d;
import java.lang.Runnable;
import ekd.k1;

public final class b implements Observer	// class@001772
{
    public final KwaiImageView b;

    public void b(KwaiImageView p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       boolean b;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, str)) {
       }else {
          b tb = this.b;
          a.o(p0, "it");
          b = p0.booleanValue();
          if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidTwoRefs(tb, Boolean.valueOf(b), null, f.class, str)) {
             k1.r(new d(tb, b), (long)(Math.random() * 0x408f400000000000));
          }
       }
       return;
    }
}
