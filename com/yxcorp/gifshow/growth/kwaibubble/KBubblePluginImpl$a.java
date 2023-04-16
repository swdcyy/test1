package com.yxcorp.gifshow.growth.kwaibubble.KBubblePluginImpl$a;
import tx4.f;
import np5.c;
import java.lang.Object;
import tx4.w;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tx4.e;

public final class KBubblePluginImpl$a implements f	// class@001418
{
    public final c a;

    public void KBubblePluginImpl$a(c p0){
       this.a = p0;
       super();
    }
    public void a(w p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KBubblePluginImpl$a.class, "2")) {
          return;
       }
       e.b(this, p0, p1);
       KBubblePluginImpl$a ta = this.a;
       if (ta != null) {
          ta.a(false, p1);
       }
       return;
    }
    public void b(boolean p0){
       e.a(this, p0);
    }
    public void c(w p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KBubblePluginImpl$a.class, "1")) {
          return;
       }
       KBubblePluginImpl$a ta = this.a;
       if (ta != null) {
          ta.a(true, null);
       }
       return;
    }
}
