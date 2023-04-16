package androidx.media.AudioAttributesImplApi26Parcelizer;
import java.lang.Object;
import androidx.versionedparcelable.a;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplApi21;
import android.os.Parcelable;
import android.media.AudioAttributes;
import java.util.Objects;

public class AudioAttributesImplApi26Parcelizer	// class@000823
{

    public void AudioAttributesImplApi26Parcelizer(){
       super();
    }
    public static AudioAttributesImplApi26 read(a p0){
       AudioAttributesImplApi26 uAudioAttrib = new AudioAttributesImplApi26();
       uAudioAttrib.a = p0.u(uAudioAttrib.a, 1);
       uAudioAttrib.b = p0.r(uAudioAttrib.b, 2);
       return uAudioAttrib;
    }
    public static void write(AudioAttributesImplApi26 p0,a p1){
       Objects.requireNonNull(p1);
       p1.P(p0.a, 1);
       p1.M(p0.b, 2);
    }
}
