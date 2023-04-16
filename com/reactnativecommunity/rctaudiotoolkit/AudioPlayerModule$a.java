package com.reactnativecommunity.rctaudiotoolkit.AudioPlayerModule$a;
import android.media.MediaPlayer$OnPreparedListener;
import com.reactnativecommunity.rctaudiotoolkit.AudioPlayerModule;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import android.media.MediaPlayer;
import com.facebook.react.bridge.WritableMap;

public class AudioPlayerModule$a implements MediaPlayer$OnPreparedListener	// class@000b69
{
    public final Callback b;
    public final AudioPlayerModule c;

    public void AudioPlayerModule$a(AudioPlayerModule p0,Callback p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onPrepared(MediaPlayer p0){
       Object[] objArray = new Object[]{null,this.c.getInfo(p0)};
       this.b.invoke(objArray);
    }
}
