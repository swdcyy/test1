package android.support.v4.media.AudioAttributesCompatParcelizer;
import androidx.media.AudioAttributesCompatParcelizer;
import androidx.versionedparcelable.a;
import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends AudioAttributesCompatParcelizer	// class@0003b5
{

    public void AudioAttributesCompatParcelizer(){
       super();
    }
    public static AudioAttributesCompat read(a p0){
       return AudioAttributesCompatParcelizer.read(p0);
    }
    public static void write(AudioAttributesCompat p0,a p1){
       AudioAttributesCompatParcelizer.write(p0, p1);
    }
}
