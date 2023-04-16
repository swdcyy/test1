package androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImpl;
import java.lang.Object;
import android.media.AudioAttributes;
import androidx.media.AudioAttributesCompat;
import java.lang.String;
import java.lang.StringBuilder;

public class AudioAttributesImplApi21 implements AudioAttributesImpl	// class@00081f
{
    public AudioAttributes a;
    public int b;

    public void AudioAttributesImplApi21(){
       super();
       this.b = -1;
    }
    public void AudioAttributesImplApi21(AudioAttributes p0){
       super(p0, -1);
    }
    public void AudioAttributesImplApi21(AudioAttributes p0,int p1){
       super();
       this.b = -1;
       this.a = p0;
       this.b = p1;
    }
    public int a(){
       return this.b;
    }
    public int b(){
       return this.a.getUsage();
    }
    public int c(){
       return AudioAttributesCompat.f(true, this.getFlags(), this.b());
    }
    public int d(){
       AudioAttributesImplApi21 tb = this.b;
       if (tb != -1) {
          return tb;
       }
       return AudioAttributesCompat.f(false, this.getFlags(), this.b());
    }
    public Object e(){
       return this.a;
    }
    public boolean equals(Object p0){
       if (!p0 instanceof AudioAttributesImplApi21) {
          return false;
       }
       return this.a.equals(p0.a);
    }
    public int getContentType(){
       return this.a.getContentType();
    }
    public int getFlags(){
       return this.a.getFlags();
    }
    public int hashCode(){
       return this.a.hashCode();
    }
    public String toString(){
       return "AudioAttributesCompat: audioattributes="+this.a;
    }
}
