package com.yxcorp.gifshow.camera.record.tab.c$e;
import lnc.o;
import com.yxcorp.gifshow.camera.record.tab.c;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;

public class c$e extends o	// class@000f4c
{
    public final c b;

    public void c$e(c p0){
       this.b = p0;
       super();
    }
    public void b(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$e.class, "1")) {
          return;
       }
       this.b.h.setTranslationY(0);
       this.b.h.setVisibility(0);
       return;
    }
}
