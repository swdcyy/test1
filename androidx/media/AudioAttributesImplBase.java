package androidx.media.AudioAttributesImplBase;
import androidx.media.AudioAttributesImpl;
import java.lang.Object;
import androidx.media.AudioAttributesCompat;
import java.lang.Integer;
import java.util.Arrays;
import java.lang.String;
import java.lang.StringBuilder;

public class AudioAttributesImplBase implements AudioAttributesImpl	// class@000825
{
    public int a;
    public int b;
    public int c;
    public int d;

    public void AudioAttributesImplBase(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = -1;
    }
    public void AudioAttributesImplBase(int p0,int p1,int p2,int p3){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 0;
       this.d = -1;
       this.b = p0;
       this.c = p1;
       this.a = p2;
       this.d = p3;
    }
    public static int f(int p0){
       switch (p0){
           case 0:
             return 2;
           case 1:
           case 7:
             return 13;
           case 2:
             return 6;
           case 3:
             return 1;
           case 4:
             return 4;
           case 5:
             return 5;
           case 6:
             return 2;
           case 8:
             return 3;
           case 10:
             return 11;
           default:
          label_0004 :
             return 0;
       }
    }
    public int a(){
       return this.d;
    }
    public int b(){
       return this.a;
    }
    public int c(){
       return AudioAttributesCompat.f(true, this.c, this.a);
    }
    public int d(){
       AudioAttributesImplBase td = this.d;
       if (td != -1) {
          return td;
       }
       return AudioAttributesCompat.f(false, this.c, this.a);
    }
    public Object e(){
       return null;
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof AudioAttributesImplBase) {
          return b;
       }
       if (this.b == p0.getContentType() && (this.c == p0.getFlags() && (this.a == p0.b() && this.d == p0.d))) {
          b = true;
       }
    label_0027 :
       return b;
    }
    public int getContentType(){
       return this.b;
    }
    public int getFlags(){
       AudioAttributesImplBase tc = this.c;
       int i = this.d();
       if (i == 6) {
          tc = tc | 0x04;
       }else if(i == 7){
          tc = tc | 0x01;
       }
       return (tc & 0x0111);
    }
    public int hashCode(){
       Object[] objArray = new Object[]{Integer.valueOf(this.b),Integer.valueOf(this.c),Integer.valueOf(this.a),Integer.valueOf(this.d)};
       return Arrays.hashCode(objArray);
    }
    public String toString(){
       String str = "AudioAttributesCompat:";
       if (this.d != -1) {
          str = str+" stream="+this.d+" derived";
       }
       return str+" usage="+AudioAttributesCompat.h(this.a)+" content="+this.b+" flags=0x"+(Integer.toHexString(this.c)).toUpperCase();
    }
}
