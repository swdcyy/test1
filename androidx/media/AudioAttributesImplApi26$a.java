package androidx.media.AudioAttributesImplApi26$a;
import androidx.media.AudioAttributesImplApi21$a;
import java.lang.Object;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi26;
import android.media.AudioAttributes;
import android.media.AudioAttributes$Builder;
import androidx.media.AudioAttributesImpl$a;

public class AudioAttributesImplApi26$a extends AudioAttributesImplApi21$a	// class@000821
{

    public void AudioAttributesImplApi26$a(){
       super();
    }
    public void AudioAttributesImplApi26$a(Object p0){
       super(p0);
    }
    public AudioAttributesImpl build(){
       return new AudioAttributesImplApi26(this.a.build());
    }
    public AudioAttributesImpl$a c(int p0){
       this.h(p0);
       return this;
    }
    public AudioAttributesImplApi21$a g(int p0){
       this.h(p0);
       return this;
    }
    public AudioAttributesImplApi26$a h(int p0){
       this.a.setUsage(p0);
       return this;
    }
}
