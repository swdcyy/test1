package k.b;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import java.util.zip.CRC32;
import android.content.pm.ApplicationInfo;
import android.content.SharedPreferences;
import oe6.o;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import android.content.pm.PackageManager$NameNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import android.preference.PreferenceManager;
import java.util.Locale;
import java.lang.Long;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class b	// class@00244c
{
    public SharedPreferences a;
    public Context b;
    public static String c;
    public static b d;
    public static boolean e;
    public static boolean f;
    public static String g;
    public static String h;
    public static String i;
    public static final String[] j;

    static {
       String[] stringArray = new String[]{"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
       b.j = stringArray;
    }
    public void b(Context p0){
       super();
       this.f(p0);
       new CRC32().update((this.e().getApplicationInfo().packageName).getBytes());
       this.f(p0);
       this.a = o.c(this.e(), "com.fkgfasdfeeqeqe", 0);
    }
    public static String b(byte[] p0){
       StringBuffer str = "";
       for (int i = 0; i < p0.length; i = i + 1) {
          int b = p0[i];
          if (b < 0) {
             b = b + 256;
          }
          int i1 = b / 16;
          b = b % 16;
          String[] j = b.j;
          str = str+j[i1]+j[b];
       }
       return str;
    }
    public static b c(Context p0){
       if (b.d == null) {
          _monitor_enter(b.class);
          if (b.d == null) {
             b.d = new b(p0);
          }
          _monitor_exit(b.class);
       }
       return b.d;
    }
    public static String d(Context p0){
       StringBuffer h = b.h;
       int i = 0;
       PackageManager packageManag = (h == null || !h.length())? 1: null;
       if (!packageManag) {
          return b.h;
       }else {
          try{
             h = "";
             PackageInfo signatures = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 64).signatures;
             int len = signatures.length;
             for (; i < len; i = i + 1) {
                byte[] uobyteArray = signatures[i].toByteArray();
                String str = null;
                if (uobyteArray != null && uobyteArray.length > 0) {
                   str = b.b(MessageDigest.getInstance("MD5").digest(uobyteArray));
                }
                h = h+str+",";
             }
             String str1 = h;
             b.h = str1;
             return str1;
          }catch(android.content.pm.PackageManager$NameNotFoundException e6){
             e6.printStackTrace();
             return b.h;
          }
       }
    }
    public String a(){
       FileInputStream uFileInputSt;
       IOException iOException;
       if ((b.g).isEmpty()) {
          int i = 0;
          int i1 = 8192;
          try{
             byte[] uobyteArray = new byte[i1];
             MessageDigest instance = MessageDigest.getInstance("MD5");
             uFileInputSt = new FileInputStream(new File(this.b.getPackageCodePath()));
             try{
                i = uFileInputSt.read(uobyteArray);
                while (i != -1) {
                   instance.update(uobyteArray, 0, i);
                }
                b.g = b.b(instance.digest());
             label_0039 :
                uFileInputSt.close();
             }catch(java.security.NoSuchAlgorithmException e0){
             }catch(java.io.IOException e0){
             }catch(java.io.IOException e0){
                e0.printStackTrace();
             }
          }catch(java.security.NoSuchAlgorithmException e1){
             uFileInputSt = i;
             NoSuchAlgorithmException noSuchAlgori = e1;
          }catch(java.io.IOException e1){
             uFileInputSt = i;
             iOException = e1;
          }
          iOException.printStackTrace();
          if (uFileInputSt) {
             goto label_0039 ;
          }
       }
    }
    public Context e(){
       return this.b;
    }
    public void f(Context p0){
       this.b = p0;
    }
    public boolean g(){
       if (b.e) {
          m$c.b("read from volatile");
          return b.f;
       }else {
          SharedPreferences defaultShare = PreferenceManager.getDefaultSharedPreferences(this.e());
          CRC32 uCRC32 = new CRC32();
          uCRC32.update((this.e().getApplicationInfo().packageName).getBytes());
          Object[] objArray = new Object[]{"com.kste.security.sperf.aleadyLaunch",Long.valueOf(uCRC32.getValue())};
          String str = String.format(Locale.getDefault(), "%s_%d", objArray);
          boolean booleanx = defaultShare.getBoolean(str, 0);
          if (!booleanx) {
             SharedPreferences$Editor uEditor = defaultShare.edit();
             uEditor.putBoolean(str, 1);
             g.a(uEditor);
          }
          b.e = true;
          int i = booleanx ^ 0x01;
          b.f = i;
          return i;
       }
    }
}
