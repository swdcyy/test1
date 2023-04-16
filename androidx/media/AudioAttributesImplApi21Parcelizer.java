package androidx.media.AudioAttributesImplApi21Parcelizer;
import java.lang.Object;
import androidx.versionedparcelable.a;
import androidx.media.AudioAttributesImplApi21;
import android.os.Parcelable;
import android.media.AudioAttributes;
import java.util.Objects;

public class AudioAttributesImplApi21Parcelizer	// class@000820
{

    public void AudioAttributesImplApi21Parcelizer(){
       super();
    }
    public static AudioAttributesImplApi21 read(a p0){
       AudioAttributesImplApi21 uAudioAttrib = new AudioAttributesImplApi21();
       uAudioAttrib.a = p0.u(uAudioAttrib.a, 1);
       uAudioAttrib.b = p0.r(uAudioAttrib.b, 2);
       return uAudioAttrib;
    }
    public static void write(AudioAttributesImplApi21 p0,a p1){
       Objects.requireNonNull(p1);
       p1.P(p0.a, 1);
       p1.M(p0.b, 2);
    }
}
