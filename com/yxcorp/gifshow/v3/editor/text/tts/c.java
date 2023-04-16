package com.yxcorp.gifshow.v3.editor.text.tts.c;
import com.yxcorp.gifshow.player.KsAudioPlayer$c;
import com.yxcorp.gifshow.v3.editor.text.tts.d;
import java.lang.Object;
import com.yxcorp.gifshow.player.KsAudioPlayer;
import java.util.Objects;
import faa.a;
import java.lang.String;
import q87.c;
import hvc.c;
import java.lang.Runnable;
import ekd.k1;

public final class c implements KsAudioPlayer$c	// class@0014f0
{
    public final d a;

    public void c(d p0){
       this.a = p0;
    }
    public final void a(KsAudioPlayer p0){
       c ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = new Object[0];
       a.D().w("TtsAuditionManager", "onPlayCompleted: using KSAudioPlayer", objArray);
       d h = ta.h;
       if (h != null) {
          h.n();
          ta.h = null;
       }
       k1.o(new c(ta));
       return;
    }
}
