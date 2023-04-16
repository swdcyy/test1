package com.yxcorp.gifshow.v3.editor.text.tts.d$b;
import com.kwai.video.stannis.observers.AudioBufferPlayObserver;
import com.yxcorp.gifshow.v3.editor.text.tts.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import faa.a;
import q87.c;
import hvc.b;
import java.lang.Runnable;
import ekd.k1;

public class d$b extends AudioBufferPlayObserver	// class@0014f3
{
    public final d a;

    public void d$b(d p0){
       this.a = p0;
       super();
    }
    public void onCompleted(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$b.class, "1")) {
          return;
       }
       d$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, d.class, "4")) {
          Object[] objArray = new Object[0];
          a.D().w("TtsAuditionManager", "auditionFinished: ", objArray);
          k1.o(new b(ta));
          ta.j = false;
       }
       return;
    }
}
