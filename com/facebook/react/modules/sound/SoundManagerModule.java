package com.facebook.react.modules.sound.SoundManagerModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactContext;
import android.media.AudioManager;

public class SoundManagerModule extends ReactContextBaseJavaModule	// class@0012df
{

    public void SoundManagerModule(ReactApplicationContext p0){
       super(p0);
    }
    public String getName(){
       return "SoundManager";
    }
    public void playTouchSound(){
       if (PatchProxy.applyVoid(null, this, SoundManagerModule.class, "1")) {
          return;
       }
       AudioManager systemServic = this.getReactApplicationContext().getSystemService("audio");
       if (systemServic != null) {
          systemServic.playSoundEffect(0);
       }
       return;
    }
}
