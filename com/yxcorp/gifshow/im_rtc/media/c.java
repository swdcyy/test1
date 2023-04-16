package com.yxcorp.gifshow.im_rtc.media.c;
import android.media.MediaPlayer$OnErrorListener;
import java.lang.Object;
import android.media.MediaPlayer;
import java.lang.StringBuilder;
import java.lang.String;
import dc5.c;

public final class c implements MediaPlayer$OnErrorListener	// class@001935
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean onError(MediaPlayer p0,int p1,int p2){
       c.c("IMRTCRing", "onError what="+p1+", extra="+p2);
       return false;
    }
}
