package com.zmxv.RNSound.RNSoundModule$a;
import android.media.MediaPlayer$OnPreparedListener;
import com.zmxv.RNSound.RNSoundModule;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import android.media.MediaPlayer;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.String;

public class RNSoundModule$a implements MediaPlayer$OnPreparedListener	// class@000c72
{
    public boolean b;
    public final Callback c;
    public final RNSoundModule d;

    public void RNSoundModule$a(RNSoundModule p0,Callback p1){
       this.d = p0;
       this.c = p1;
       super();
       this.b = false;
    }
    public synchronized void onPrepared(MediaPlayer p0){
       if (this.b != null) {
          return;
       }
       this.b = true;
       WritableMap writableMap = Arguments.createMap();
       String str = "duration";
       double d = (double)p0.getDuration() * 0x3f50624dd2f1a9fc;
       try{
          writableMap.putDouble(str, d);
          Object[] objArray = new Object[]{RNSoundModule.NULL,writableMap};
          this.c.invoke(objArray);
          return;
       }catch(java.lang.RuntimeException e0){
       }
    }
}
