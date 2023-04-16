package androidx.media.AudioAttributesCompat;
import g3.c;
import android.util.SparseIntArray;
import java.lang.Object;
import androidx.media.AudioAttributesImpl;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import android.os.Build$VERSION;
import androidx.media.AudioAttributesImplApi26;
import android.media.AudioAttributes;
import androidx.media.AudioAttributesImplApi21;

public class AudioAttributesCompat implements c	// class@00081a
{
    public AudioAttributesImpl a;
    public static final SparseIntArray b;
    public static boolean c;
    public static final int[] d;

    static {
       SparseIntArray sparseIntArr = new SparseIntArray();
       AudioAttributesCompat.b = sparseIntArr;
       sparseIntArr.put(5, 1);
       sparseIntArr.put(6, 2);
       sparseIntArr.put(7, 2);
       sparseIntArr.put(8, 1);
       sparseIntArr.put(9, 1);
       sparseIntArr.put(10, 1);
       AudioAttributesCompat.d = new int[16]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,16};
    }
    public void AudioAttributesCompat(){
       super();
    }
    public void AudioAttributesCompat(AudioAttributesImpl p0){
       super();
       this.a = p0;
    }
    public static int f(boolean p0,int p1,int p2){
       int i = 1;
       if ((p1 & 0x01) == i) {
          if (!p0) {
             i = 7;
          }
          return i;
       }else {
          int i1 = 4;
          int i2 = 0;
          if ((p1 & i1) == i1) {
             if (!p0) {
                i2 = 6;
             }
             return i2;
          }else {
             p1 = 3;
             switch (p2){
                 case 0:
                 case 12:
                 case 14:
                 case 16:
                 case 1:
                   return p1;
                 case 2:
                label_0029 :
                   return i2;
                 case 3:
                   if (p0) {
                      goto label_0029 ;
                   }else {
                      i2 = 8;
                      goto label_0029 ;
                   }
                   break;
                 case 4:
                   return i1;
                 case 5:
                 case 7:
                 case 8:
                 case 9:
                 case 10:
                   return 5;
                 case 6:
                   return 2;
                 case 11:
                   return 10;
                 case 13:
                   return i;
                 default:
                label_0018 :
                   if (!p0) {
                      return p1;
                   }
                   throw new IllegalArgumentException("Unknown usage value "+p2+" in audio attributes");
             }
          }
       }
    }
    public static String h(int p0){
       switch (p0){
           case 0:
             return "USAGE_UNKNOWN";
           case 1:
             return "USAGE_MEDIA";
           case 2:
             return "USAGE_VOICE_COMMUNICATION";
           case 3:
             return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
           case 4:
             return "USAGE_ALARM";
           case 5:
             return "USAGE_NOTIFICATION";
           case 6:
             return "USAGE_NOTIFICATION_RINGTONE";
           case 7:
             return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
           case 8:
             return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
           case 9:
             return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
           case 10:
             return "USAGE_NOTIFICATION_EVENT";
           case 11:
             return "USAGE_ASSISTANCE_ACCESSIBILITY";
           case 12:
             return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
           case 13:
             return "USAGE_ASSISTANCE_SONIFICATION";
           case 14:
             return "USAGE_GAME";
           case 16:
             return "USAGE_ASSISTANT";
           default:
          label_0003 :
             return "unknown usage "+p0;
       }
    }
    public static AudioAttributesCompat i(Object p0){
       if (AudioAttributesCompat.c) {
          return null;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          return new AudioAttributesCompat(new AudioAttributesImplApi26(p0));
       }
       return new AudioAttributesCompat(new AudioAttributesImplApi21(p0));
    }
    public int a(){
       return this.a.a();
    }
    public int b(){
       return this.a.b();
    }
    public boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof AudioAttributesCompat) {
          return b;
       }
       AudioAttributesCompat ta = this.a;
       if (ta != null) {
          return ta.equals(p0.a);
       }
       if (p0.a == null) {
          b = true;
       }
       return b;
    }
    public Object g(){
       return this.a.e();
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
       return this.a.toString();
    }
}
