package androidx.media.AudioAttributesCompatParcelizer;
import java.lang.Object;
import androidx.versionedparcelable.a;
import androidx.media.AudioAttributesCompat;
import g3.c;
import androidx.media.AudioAttributesImpl;
import java.util.Objects;

public class AudioAttributesCompatParcelizer	// class@00081b
{

    public void AudioAttributesCompatParcelizer(){
       super();
    }
    public static AudioAttributesCompat read(a p0){
       AudioAttributesCompat uAudioAttrib = new AudioAttributesCompat();
       uAudioAttrib.a = p0.z(uAudioAttrib.a, 1);
       return uAudioAttrib;
    }
    public static void write(AudioAttributesCompat p0,a p1){
       Objects.requireNonNull(p1);
       p1.W(p0.a, 1);
    }
}
