package com.yxcorp.gifshow.im_rtc.media.e;
import java.lang.Runnable;
import com.yxcorp.gifshow.im_rtc.media.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import android.media.MediaPlayer;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.content.res.AssetFileDescriptor;
import java.io.FileDescriptor;
import com.yxcorp.gifshow.im_rtc.media.c;
import android.media.MediaPlayer$OnErrorListener;
import com.yxcorp.gifshow.im_rtc.media.b;
import android.media.MediaPlayer$OnCompletionListener;
import com.yxcorp.gifshow.im_rtc.media.d;
import android.media.MediaPlayer$OnInfoListener;
import cxa.d;
import android.media.MediaPlayer$OnPreparedListener;
import android.os.Handler;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class e implements Runnable	// class@001937
{
    public final f b;

    public void e(f p0){
       this.b = p0;
    }
    public final void run(){
       f c;
       e tb = this.b;
       _monitor_enter(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, f.class, "9")) {
          _monitor_exit(tb);
       }else {
          c.g("IMRTCRing", "playCallRing");
          if (tb.d != null) {
             c.c("IMRTCRing", "playCallRing, destroyed");
             _monitor_exit(tb);
          }else {
             try{
                c = tb.c;
                if (c != null && c.isPlaying()) {
                   _monitor_exit(tb);
                }else {
                   c = tb.c;
                   if (c != null) {
                      c.release();
                   }
                   MediaPlayer mediaPlayer = new MediaPlayer();
                   tb.c = mediaPlayer;
                   mediaPlayer.setAudioStreamType(5);
                   tb.c.setVolume(0x3f800000, 0x3f800000);
                   tb.c.setLooping(true);
                   AssetFileDescriptor uAssetFileDe = a.b().getResources().openRawResourceFd(R.raw.arg_RES_7f0f002b);
                   if (uAssetFileDe == null) {
                      c.c("IMRTCRing", "open raw resource fd failed");
                      tb.c.release();
                      tb.c = objArray;
                      _monitor_exit(tb);
                   }else {
                      tb.c.setDataSource(uAssetFileDe.getFileDescriptor(), uAssetFileDe.getStartOffset(), uAssetFileDe.getLength());
                      tb.c.setOnErrorListener(c.b);
                      tb.c.setOnCompletionListener(b.b);
                      tb.c.setOnInfoListener(d.b);
                      c = tb.c;
                      d uod = new d(tb);
                      try{
                         c.setOnPreparedListener(uod);
                         tb.c.prepareAsync();
                         tb.a.removeCallbacks(tb.b);
                         tb.a.postDelayed(tb.b, 0xea60);
                         _monitor_exit(tb);
                      }catch(java.lang.IllegalStateException e1){
                         c.c("IMRTCRing", "prepareAsync"+e1);
                         tb.c.release();
                         tb.c = 0xea60;
                         _monitor_exit(tb);
                      }
                   }
                }
             }catch(java.io.IOException e1){
                c.d("IMRTCRing", "MediaPlayer setDataSource failed", e1);
                tb.c.release();
                tb.c = objArray;
                _monitor_exit(tb);
             }
          }
       }
    }
}
