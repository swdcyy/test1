package androidx.media.AudioAttributesImplBaseParcelizer;
import java.lang.Object;
import androidx.versionedparcelable.a;
import androidx.media.AudioAttributesImplBase;
import java.util.Objects;

public class AudioAttributesImplBaseParcelizer	// class@000826
{

    public void AudioAttributesImplBaseParcelizer(){
       super();
    }
    public static AudioAttributesImplBase read(a p0){
       AudioAttributesImplBase uAudioAttrib = new AudioAttributesImplBase();
       uAudioAttrib.a = p0.r(uAudioAttrib.a, 1);
       uAudioAttrib.b = p0.r(uAudioAttrib.b, 2);
       uAudioAttrib.c = p0.r(uAudioAttrib.c, 3);
       uAudioAttrib.d = p0.r(uAudioAttrib.d, 4);
       return uAudioAttrib;
    }
    public static void write(AudioAttributesImplBase p0,a p1){
       Objects.requireNonNull(p1);
       p1.M(p0.a, 1);
       p1.M(p0.b, 2);
       p1.M(p0.c, 3);
       p1.M(p0.d, 4);
    }
}
