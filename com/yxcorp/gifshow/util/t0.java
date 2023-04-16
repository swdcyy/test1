package com.yxcorp.gifshow.util.t0;
import java.lang.Object;
import o56.c;
import o56.a;
import android.app.Application;
import java.lang.String;
import android.media.AudioManager;
import lnc.o9;
import android.os.Build$VERSION;
import android.media.AudioFocusRequest;
import android.media.AudioManager$OnAudioFocusChangeListener;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest$Builder;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.util.t0$a;

public class t0	// class@001fb0
{
    public final AudioManager a;
    public final AudioManager$OnAudioFocusChangeListener b;
    public t0$a c;

    public void t0(){
       super();
       this.a = a.a().a().getSystemService("audio");
       this.b = new o9(this);
    }
    public boolean a(){
       t0 tb = this.b;
       boolean b = false;
       if (tb != null) {
          t0 ta = this.a;
          if (ta != null) {
             try{
                if (Build$VERSION.SDK_INT >= 26) {
                   if (1 == ta.abandonAudioFocusRequest(this.b())) {
                      b = true;
                   }
                   return b;
                }else if(1 == ta.abandonAudioFocus(tb)){
                   b = true;
                }
                return b;
             }catch(java.lang.Exception e0){
                Log.e("SimpleAudioFocusHelper", "abandonFocus error", e0);
             }
          }
       }
    }
    public final AudioFocusRequest b(){
       return new AudioFocusRequest$Builder(2).setAudioAttributes(new AudioAttributes$Builder().setLegacyStreamType(3).setUsage(1).setContentType(2).build()).setAcceptsDelayedFocusGain(false).setOnAudioFocusChangeListener(this.b).build();
    }
    public boolean c(){
       boolean b;
       String str;
       try{
          b = false;
          if (this.b == null || this.a == null) {
          }else {
             str = "SimpleAudioFocusHelper";
             Log.g(str, "requestAudioFocus");
             if (a.t().d("enableAudioFocusTrace", b)) {
                Log.g(str, Log.f(new Throwable()));
             }
             if (Build$VERSION.SDK_INT >= 26) {
                if (1 == this.a.requestAudioFocus(this.b())) {
                   b = true;
                }
                return b;
             }else if(1 == this.a.requestAudioFocus(this.b, 3, 2)){
                b = true;
             }
             return b;
          }
       }catch(java.lang.Exception e2){
          Log.e(str, "requestAudioFocus error", e2);
       }
       return b;
    }
    public void d(t0$a p0){
       this.c = p0;
    }
}
