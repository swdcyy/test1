package com.yxcorp.gifshow.im_rtc.media.b;
import android.media.MediaPlayer$OnCompletionListener;
import java.lang.Object;
import android.media.MediaPlayer;
import java.lang.String;
import dc5.c;

public final class b implements MediaPlayer$OnCompletionListener	// class@001934
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void onCompletion(MediaPlayer p0){
       c.g("IMRTCRing", "onComplete");
    }
}
