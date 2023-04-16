package com.zmxv.RNSound.RNSoundModule$c;
import android.media.MediaPlayer$OnCompletionListener;
import com.zmxv.RNSound.RNSoundModule;
import java.lang.Double;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import android.media.MediaPlayer;
import java.lang.Boolean;

public class RNSoundModule$c implements MediaPlayer$OnCompletionListener	// class@000c74
{
    public boolean b;
    public final Double c;
    public final Callback d;
    public final RNSoundModule e;

    public void RNSoundModule$c(RNSoundModule p0,Double p1,Callback p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
       this.b = false;
    }
    public synchronized void onCompletion(MediaPlayer p0){
       try{
          if (!p0.isLooping()) {
             this.e.setOnPlay(false, this.c);
             if (this.b != null) {
                return;
             }else {
                boolean b = true;
                this.b = b;
                Object[] objArray = new Object[b];
                objArray[0] = Boolean.TRUE;
                this.d.invoke(objArray);
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
