package com.zmxv.RNSound.RNSoundModule$d;
import android.media.MediaPlayer$OnErrorListener;
import com.zmxv.RNSound.RNSoundModule;
import java.lang.Double;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import android.media.MediaPlayer;
import java.lang.Boolean;

public class RNSoundModule$d implements MediaPlayer$OnErrorListener	// class@000c75
{
    public boolean b;
    public final Double c;
    public final Callback d;
    public final RNSoundModule e;

    public void RNSoundModule$d(RNSoundModule p0,Double p1,Callback p2){
       this.e = p0;
       this.c = p1;
       this.d = p2;
       super();
       this.b = false;
    }
    public synchronized boolean onError(MediaPlayer p0,int p1,int p2){
       this.e.setOnPlay(false, this.c);
       if (this.b != null) {
          return true;
       }
       this.b = true;
       try{
          Object[] objArray = new Object[true];
          objArray[0] = Boolean.TRUE;
          this.d.invoke(objArray);
          return true;
       }catch(java.lang.Exception e0){
       }
    }
}
