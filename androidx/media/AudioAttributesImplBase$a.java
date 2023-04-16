package androidx.media.AudioAttributesImplBase$a;
import androidx.media.AudioAttributesImpl$a;
import java.lang.Object;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplBase;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class AudioAttributesImplBase$a implements AudioAttributesImpl$a	// class@000824
{
    public int a;
    public int b;
    public int c;
    public int d;

    public void AudioAttributesImplBase$a(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = -1;
    }
    public void AudioAttributesImplBase$a(AudioAttributesCompat p0){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = -1;
       this.a = p0.b();
       this.b = p0.getContentType();
       this.c = p0.getFlags();
       this.d = p0.a();
    }
    public AudioAttributesImpl$a G(int p0){
       this.e(p0);
       return this;
    }
    public AudioAttributesImpl$a a(int p0){
       this.g(p0);
       return this;
    }
    public AudioAttributesImpl$a b(int p0){
       this.d(p0);
       return this;
    }
    public AudioAttributesImpl build(){
       return new AudioAttributesImplBase(this.b, this.c, this.a, this.d);
    }
    public AudioAttributesImpl$a c(int p0){
       this.h(p0);
       return this;
    }
    public AudioAttributesImplBase$a d(int p0){
       this.b = (p0 && (p0 != 1 && (p0 != 2 && (p0 != 3 && p0 != 4))))? 0: p0;
       return this;
    }
    public AudioAttributesImplBase$a e(int p0){
       this.c = (p0 & 0x03ff) | this.c;
       return this;
    }
    public final AudioAttributesImplBase$a f(int p0){
       int i = 1;
       switch (p0){
           case 0:
             this.b = i;
             break;
           case 1:
             this.b = 4;
             break;
           case 2:
             this.b = 4;
             break;
           case 3:
             this.b = 2;
             break;
           case 4:
             this.b = 4;
             break;
           case 5:
             this.b = 4;
             break;
           case 6:
             this.b = i;
             this.c = this.c | 4;
             break;
           case 7:
             this.c = i | this.c;
             goto label_002a ;
             break;
           case 8:
             this.b = 4;
             break;
           case 9:
             this.b = 4;
             break;
           case 10:
             this.b = i;
             break;
           default:
       }
       this.a = AudioAttributesImplBase.f(p0);
       return this;
    }
    public AudioAttributesImplBase$a g(int p0){
       if (p0 == 10) {
          throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
       }
       this.d = p0;
       this.f(p0);
       return this;
    }
    public AudioAttributesImplBase$a h(int p0){
       switch (p0){
           case 0:
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:
           case 11:
           case 12:
           case 13:
           case 14:
           case 15:
           case 1:
             this.a = p0;
             break;
           case 16:
             this.a = 12;
             break;
           default:
             this.a = 0;
       }
       return this;
    }
}
