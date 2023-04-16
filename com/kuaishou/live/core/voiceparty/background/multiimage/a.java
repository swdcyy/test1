package com.kuaishou.live.core.voiceparty.background.multiimage.a;
import ub.a;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater$InitElements;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.background.multiimage.Inflater;
import ho2.a;

public final class a extends a	// class@001369
{
    public final Inflater$InitElements b;

    public void a(Inflater$InitElements p0){
       this.b = p0;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
       }else {
          a.p(p0, "id");
          if (p2 != null) {
             this.b.b.a.a(p2);
          }
       }
       return;
    }
}
