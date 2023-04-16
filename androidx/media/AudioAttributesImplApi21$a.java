package androidx.media.AudioAttributesImplApi21$a;
import androidx.media.AudioAttributesImpl$a;
import java.lang.Object;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesImplApi21$a implements AudioAttributesImpl$a	// class@00081e
{
    public final AudioAttributes$Builder a;

    public void AudioAttributesImplApi21$a(){
       super();
       this.a = new AudioAttributes$Builder();
    }
    public void AudioAttributesImplApi21$a(Object p0){
       super();
       this.a = new AudioAttributes$Builder(p0);
    }
    public AudioAttributesImpl$a G(int p0){
       this.e(p0);
       return this;
    }
    public AudioAttributesImpl$a a(int p0){
       this.f(p0);
       return this;
    }
    public AudioAttributesImpl$a b(int p0){
       this.d(p0);
       return this;
    }
    public AudioAttributesImpl build(){
       return new AudioAttributesImplApi21(this.a.build());
    }
    public AudioAttributesImpl$a c(int p0){
       return this.g(p0);
    }
    public AudioAttributesImplApi21$a d(int p0){
       this.a.setContentType(p0);
       return this;
    }
    public AudioAttributesImplApi21$a e(int p0){
       this.a.setFlags(p0);
       return this;
    }
    public AudioAttributesImplApi21$a f(int p0){
       this.a.setLegacyStreamType(p0);
       return this;
    }
    public AudioAttributesImplApi21$a g(int p0){
       if (p0 == 16) {
          p0 = 12;
       }
       this.a.setUsage(p0);
       return this;
    }
}
