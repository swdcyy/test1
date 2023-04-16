package c.t.m.g.bj;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import c.t.m.g.by;
import java.lang.IllegalArgumentException;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import c.t.m.g.bi;
import java.lang.Throwable;
import c.t.m.g.bt;
import c.t.m.g.ba;

public class bj	// class@000be7
{
    public static byte[] a;
    public static HashMap b;

    static {
       bj.a();
    }
    public static synchronized final String a(String p0){
       _monitor_enter(bj.class);
       p0 = bj.b.get(p0);
       if (by.a(p0)) {
          p0 = "";
       }
       _monitor_exit(bj.class);
       return p0;
    }
    public static String a(String p0,String p1){
       return bj.a(p0, p1, 1);
    }
    public static String a(String p0,String p1,int p2){
       byte[] bytes;
       if (p2 != 1 && p2 != 2) {
          throw new IllegalArgumentException("wrong mode.");
       }
       if (p0 != null && p0.length()) {
          if (p2 == 1) {
             bytes = p0.getBytes();
          }else if(p2 == 2){
             bytes = Base64.decode(p0.getBytes(), 2);
          }else {
             p0 = null;
          }
          if (bytes != null && bytes.length) {
             bytes = bj.a(bytes, 0, bytes.length, p1, p2);
             if (p2 == 1) {
                return Base64.encodeToString(bytes, 2);
             }else if(p2 == 2){
                return new String(bytes);
             }else {
                return null;
             }
          }
       }
    label_004a :
       return "";
    }
    public static Cipher a(String p0,int p1){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(p1, new SecretKeySpec(p0.getBytes("UTF-8"), "AES"), new IvParameterSpec(bj.a));
       return instance;
    }
    public static synchronized final void a(){
       byte b;
       _monitor_enter(bj.class);
       bj.b = new HashMap();
       byte[] uobyteArray = new byte[]{8,16,116,91,-113,b,70,-62,-45,-36,8,119,-121,51,54,-122,72,12,-109,-53,78,13,-80,-118,-43,-111,85,-110,87,62,10,92,-46,53,-86,-78,75,-122,108,-53,30,123,-122,-114,65,78,27,-15,63,-58,-22,26,-19,-87,-65,-34,-76,3,-26,-75,53,115,-22,-113,102,43,-52,74,39,-117,39,-63,-116,4,-99,109,1,53,-127,-75,74,12,-88,77,-37,53,1,89,73,-95,-103,-33,-91,1,-22,66,105,3,12,111,-83,85,-57,-89,-43,-94,99,-117,2,-81,67,-2,111,-128,-124,79,-111,86,-83,-106,92,-87,17,-85,119,-15,-116,-68,121,1,6,92,40,-12,-22,60,31,-73,-6,31,-28,-8,-14,-125,-63,-33,-85,-12,7,23,109,122,-110,113,-103,15,-101,64,67,115,3,-85,73,102,59,-61,-16,112,53,123,118,-19,-61,63,-102,101,-40,-118,49,-127,14,-109,-30,-123,41,-117,-14,59,10,-56,78,121,-77,55,-84,-40,-34,-69,-94,52,53,94,-49,48,-10,82,18,-7,56,-126,-70,-94,59,118,25,0,b,-26,7,-126,72,-93,-66,-6,62,124,74,109,18,61,-57,98,67,95,25,-53,-25,65,127,-5,-74,30,-99,-1,87,-104,54,-61,37,107,12,106,67,21,17,-100,113,-35,-43,-62,b,-52,-116,-97,-44,-125,28,-67,67,72,-45,-84,-82,102,-118,80,-9,-87,6,30,-100,36,-122,6,71,-91,21,96,-53,-79,-82,76,91,-101,84,-4,87,-15,-48,-38,-81,10,42,b,17,117,-39,-119,90,-51,67,-87,55,-69,48,-92,116,34,118,-56,4,95,-106,-3,23,-9,81,-69,-58,-57,26,-87,119,62,-87,69,-8,-58,-77,-57,8,-89,15,77,64,-15,-110,80,-13,70,96,-41,73,-2,-66,43,107,103,44,-81,-17,-41,-48,-91,60,25,-76,-109};
       b = -11;
       String[] stringArray = (new String(bi.b(uobyteArray), "UTF-8")).split(";");
       int i = 0;
       while (i < stringArray.length) {
          String[] stringArray1 = (stringArray[i]).split(",");
          if (stringArray1.length == 2) {
             bj.b.put(stringArray1[0], stringArray1[1]);
          }
          i = i + 1;
       }
       bj.a = (bj.b.get("enc_iv")).getBytes("UTF-8");
       _monitor_exit(bj.class);
       return;
    }
    public static byte[] a(byte[] p0,int p1,int p2,String p3){
       return bj.a(p0, p1, p2, p3, 1);
    }
    public static byte[] a(byte[] p0,int p1,int p2,String p3,int p4){
       if (p4 != 1 && p4 != 2) {
          throw new IllegalArgumentException("wrong mode.");
       }
       if (p0 != null && (p0.length && (p1 < 0 || !p2))) {
          return ba.a;
       }
       Cipher uCipher = bj.a(p3, p4);
       if (uCipher == null) {
          return ba.a;
       }
       return uCipher.doFinal(p0, p1, p2);
    }
    public static byte[] a(byte[] p0,String p1){
       return bj.a(p0, 0, p0.length, p1);
    }
    public static String b(String p0,String p1){
       return bj.a(p0, p1, 2);
    }
}
