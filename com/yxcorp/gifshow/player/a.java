package com.yxcorp.gifshow.player.a;
import java.util.concurrent.Callable;
import com.yxcorp.gifshow.player.KsAudioPlayer;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.content.Context;
import lnc.a1;
import java.io.File;
import android.net.Uri;
import ib.c;
import android.media.MediaPlayer;
import rxb.a;
import android.media.MediaPlayer$OnCompletionListener;
import gq.a;
import java.lang.StringBuilder;
import ekd.k1;
import q87.c;

public final class a implements Callable	// class@000fb6
{
    public final KsAudioPlayer b;

    public void a(KsAudioPlayer p0){
       this.b = p0;
    }
    public final Object call(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, KsAudioPlayer.class, "16")) {
       }else {
          MediaPlayer mediaPlayer = MediaPlayer.create(a1.c(), c.d(new File(tb.g)));
          tb.a = mediaPlayer;
          mediaPlayer.setLooping(false);
          tb.a.setVolume(tb.e, tb.e);
          tb.a.setOnCompletionListener(new a(tb));
          Object[] objArray = new Object[false];
          a.D().w("KsAudioPlayer", "initInner cost:"+k1.t(System.currentTimeMillis()), objArray);
       }
       return new Object();
    }
}
