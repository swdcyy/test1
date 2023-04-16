package com.zmxv.RNSound.RNSoundModule$b;
import android.media.MediaPlayer$OnErrorListener;
import com.zmxv.RNSound.RNSoundModule;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import android.media.MediaPlayer;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.String;

public class RNSoundModule$b implements MediaPlayer$OnErrorListener	// class@000c73
{
    public boolean b;
    public final Callback c;
    public final RNSoundModule d;

    public void RNSoundModule$b(RNSoundModule p0,Callback p1){
       this.d = p0;
       this.c = p1;
       super();
       this.b = false;
    }
    public synchronized boolean onError(MediaPlayer p0,int p1,int p2){
       if (this.b != null) {
          return true;
       }
       this.b = true;
       try{
          WritableMap writableMap = Arguments.createMap();
          writableMap.putInt("what", p1);
          writableMap.putInt("extra", p2);
          Object[] objArray = new Object[]{writableMap,RNSoundModule.NULL};
          this.c.invoke(objArray);
          return e0;
       }catch(java.lang.RuntimeException e0){
       }
    }
}
