package androidx.media.AudioAttributesCompat$a;
import java.lang.Object;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImplBase$a;
import android.os.Build$VERSION;
import androidx.media.AudioAttributesImplApi26$a;
import androidx.media.AudioAttributesImplApi21$a;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImpl$a;

public class AudioAttributesCompat$a	// class@000819
{
    public final AudioAttributesImpl$a a;

    public void AudioAttributesCompat$a(){
       super();
       if (AudioAttributesCompat.c) {
          this.a = new AudioAttributesImplBase$a();
       }else if(Build$VERSION.SDK_INT >= 26){
          this.a = new AudioAttributesImplApi26$a();
       }else {
          this.a = new AudioAttributesImplApi21$a();
       }
       return;
    }
    public void AudioAttributesCompat$a(AudioAttributesCompat p0){
       super();
       if (AudioAttributesCompat.c) {
          this.a = new AudioAttributesImplBase$a(p0);
       }else if(Build$VERSION.SDK_INT >= 26){
          this.a = new AudioAttributesImplApi26$a(p0.g());
       }else {
          this.a = new AudioAttributesImplApi21$a(p0.g());
       }
       return;
    }
    public AudioAttributesCompat a(){
       return new AudioAttributesCompat(this.a.build());
    }
    public AudioAttributesCompat$a b(int p0){
       this.a.a(p0);
       return this;
    }
}
