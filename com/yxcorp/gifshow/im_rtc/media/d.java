package com.yxcorp.gifshow.im_rtc.media.d;
import android.media.MediaPlayer$OnInfoListener;
import java.lang.Object;
import android.media.MediaPlayer;
import java.lang.StringBuilder;
import java.lang.String;
import dc5.c;

public final class d implements MediaPlayer$OnInfoListener	// class@001936
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final boolean onInfo(MediaPlayer p0,int p1,int p2){
       c.g("IMRTCRing", "onInfo  what="+p1+", extra="+p2);
       return false;
    }
}
