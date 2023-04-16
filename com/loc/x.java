package com.loc.x;
import java.lang.String;
import java.lang.StringBuilder;
import com.loc.w;
import com.loc.w$a;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.lang.Throwable;
import com.loc.ak;
import android.content.Context;
import android.os.Build$VERSION;
import android.content.pm.ApplicationInfo;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import android.os.Build;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.List;
import java.util.Arrays;
import java.io.File;
import java.io.StringWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Map;
import java.lang.StringBuffer;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.reflect.Method;
import java.util.Calendar;
import org.json.JSONObject;
import com.loc.l;
import com.loc.s;
import java.io.ByteArrayOutputStream;
import java.lang.Integer;
import com.loc.p;
import com.loc.aj;
import java.lang.Byte;
import java.util.zip.ZipOutputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.security.PublicKey;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateFactory;
import java.security.KeyFactory;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.KeySpec;
import java.util.zip.GZIPOutputStream;

public final class x	// class@001471
{
    public static String a;
    public static final String[] b;
    public static final String[] c;

    static {
       String[] stringArray = new String[]{"arm64-v8a","x86_64"};
       x.b = stringArray;
       stringArray = new String[]{"arm","x86"};
       x.c = stringArray;
       StringBuilder str = "";
       for (int i = 0; i < 80; i = i + 1) {
          str = str+"=";
       }
       x.a = str;
    }
    public static w a(){
       String[] stringArray = new String[]{"com.amap.api.collection"};
       return new w$a("collection", "1.0", "AMap_collection_1.0").a(stringArray).a();
    }
    public static String a(long p0){
       return x.a(p0, "yyyyMMdd HH:mm:ss:SSS");
    }
    public static String a(long p0,String p1){
       String str = new SimpleDateFormat(p1, Locale.CHINA).format(new Date(p0));
       return str;
    }
    public static String a(Context p0){
       String str;
       boolean b = true;
       Build uBuild = 28;
       if (Build$VERSION.SDK_INT < uBuild) {
          Field declaredFiel = Class.forName(ApplicationInfo.class.getName()).getDeclaredField("primaryCpuAbi");
          declaredFiel.setAccessible(b);
          str = declaredFiel.get(p0.getApplicationInfo());
       }else {
          str = "";
       }
       if (Build$VERSION.SDK_INT >= uBuild) {
          String[] stringArray = Build.class.getDeclaredField("SUPPORTED_ABIS").get(null);
          if (stringArray != null && stringArray.length > 0) {
             str = stringArray[0];
          }
          if (!TextUtils.isEmpty(str) && Arrays.asList(x.b).contains(str)) {
             ApplicationInfo nativeLibrar = p0.getApplicationInfo().nativeLibraryDir;
             if (!TextUtils.isEmpty(nativeLibrar) && Arrays.asList(x.c).contains(nativeLibrar.substring((nativeLibrar.lastIndexOf(File.separator) + b)))) {
                String[] stringArray1 = Build.class.getDeclaredField("SUPPORTED_32_BIT_ABIS").get(null);
                if (stringArray1 != null && stringArray1.length > 0) {
                   str = stringArray1[0];
                }
             }
          }
       }
    label_009c :
       if (TextUtils.isEmpty(str)) {
          str = Build.CPU_ABI;
       }
       return str;
    }
    public static String a(Throwable p0){
       StringWriter stringWriter = new StringWriter();
       PrintWriter printWriter = new PrintWriter(stringWriter);
       p0.printStackTrace(printWriter);
       p0 = p0.getCause();
       while (p0 != null) {
          p0.printStackTrace(printWriter);
       }
       String str = stringWriter.toString();
       stringWriter.close();
       printWriter.close();
       return str;
    }
    public static String a(Map p0){
       String value;
       if (!p0.size()) {
          return null;
       }
       StringBuffer str = "";
       int i = 1;
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          if (i) {
             i = 0;
             str = str+uEntry.getKey()+"=";
             value = uEntry.getValue();
          }else {
             str = str+"&"+uEntry.getKey()+"=";
             value = uEntry.getValue();
          }
          str = str+value;
       }
       return str;
    }
    public static String a(byte[] p0){
       if (p0 == null || !p0.length) {
          return "";
       }
       try{
          return new String(p0, "UTF-8");
       }catch(java.io.UnsupportedEncodingException e0){
          return new String(p0);
       }
    }
    public static Method a(Class p0,String p1,Class[] p2){
       return p0.getDeclaredMethod(x.c(p1), p2);
    }
    public static Calendar a(String p0,String p1){
       try{
          Calendar instance = Calendar.getInstance();
          Calendar instance1 = Calendar.getInstance();
          instance1.setTime(new SimpleDateFormat(p1, Locale.CHINA).parse(p0));
          instance.set(instance.get(1), instance.get(2), instance.get(5), instance1.get(11), instance1.get(12), instance1.get(13));
          return instance;
       }catch(java.text.ParseException e9){
          ak.a(e9, "ut", "ctt");
          return null;
       }
    }
    public static void a(Context p0,String p1,String p2,JSONObject p3){
       String str = "sec_code_debug";
       String str1 = "key";
       String str2 = "sec_code";
       String str3 = "info";
       String str4 = l.e(p0);
       String str5 = s.a(str4);
       String str6 = l.a(p0);
       String str7 = "";
       str3 = (p3.has(str3))? p3.getString(str3): str7;
       if (("INVALID_USER_SCODE").equals(str3)) {
          str1 = (p3.has(str2))? p3.getString(str2): str7;
          if (p3.has(str)) {
             str7 = p3.getString(str);
          }
          if (str5.equals(str1) || str5.equals(str7)) {
             str = "C6K+35Zyo6auY5b635byA5pS+5bmz5Y+w5a6Y572R5Lit5pCc57Si";
          label_004e :
             x.c(str);
          }
       }else if(("INVALID_USER_KEY").equals(str3)){
          if (p3.has(str1)) {
             str7 = p3.getString(str1);
          }
          if (str7.length() > 0 && !str6.equals(str7)) {
             str = "C6K+35Zyo6auY5b635byA5pS+5bmz5Y+w5a6Y572R5LiK5Y+R6LW35oqA5pyv5ZKo6K+i5bel5Y2V4oCUPui0puWPt+S4jktleemXrumimO+8jOWSqOivoklOVkFMSURfVVNFUl9LRVnlpoLkvZXop6PlhrM=";
             goto label_004e ;
          }
       }
       x.f(("SHA1Package:").concat(String.valueOf(str4)));
       x.f(("key:").concat(String.valueOf(str6)));
       x.f(("csid:").concat(String.valueOf(p1)));
       x.f(("gsid:").concat(String.valueOf(p2)));
       x.f("json:"+p3.toString());
       return;
    }
    public static void a(ByteArrayOutputStream p0,byte p1,byte[] p2){
       int i = 1;
       try{
          byte[] uobyteArray = new byte[i];
          uobyteArray[0] = p1;
          p0.write(uobyteArray);
          int i1 = p1 & 255;
          if (i1 < 255 && i1 > 0) {
             p0.write(p2);
             return;
          }else if(i1 == 255){
             p0.write(p2, 0, 255);
          }
          return;
       }catch(java.io.IOException e2){
          ak.a(e2, "ut", "wFie");
          return;
       }
    }
    public static void a(ByteArrayOutputStream p0,String p1){
       if (TextUtils.isEmpty(p1)) {
          int i = 1;
          try{
             byte[] uobyteArray = new byte[i];
             uobyteArray[0] = 0;
             p0.write(uobyteArray);
             return;
          }catch(java.io.IOException e2){
             ak.a(e2, "ut", "wsf");
             return;
          }
       }else {
          int i1 = p1.length();
          if (i1 > 255) {
             i1 = 255;
          }
          x.a(p0, (byte)i1, x.a(p1));
          return;
       }
    }
    public static boolean a(Context p0,String p1){
       if (p0 == null) {
          return false;
       }
       if (p0.checkCallingOrSelfPermission(p1)) {
          return false;
       }
       String str = 23;
       if (Build$VERSION.SDK_INT >= str && p0.getApplicationInfo().targetSdkVersion >= str) {
          Class[] uClassArray = new Class[]{String.class};
          Object[] objArray = new Object[]{p1};
          if (p0.getClass().getMethod("checkSelfPermission", uClassArray).invoke(p0, objArray).intValue()) {
             return false;
          }
       }
       return 1;
    }
    public static boolean a(JSONObject p0,String p1){
       if (p0 != null && p0.has(p1)) {
          return true;
       }
       return false;
    }
    public static byte[] a(int p0){
       byte[] uobyteArray = new byte[]{(byte)(p0 / 256),(byte)(p0 % 256)};
       return uobyteArray;
    }
    public static byte[] a(String p0){
       if (!TextUtils.isEmpty(p0)) {
          return p0.getBytes("UTF-8");
       }
       byte[] uobyteArray = new byte[0];
       return uobyteArray;
    }
    public static w b(){
       String[] stringArray = new String[]{"com.amap.co","com.amap.opensdk.co","com.amap.location"};
       return new w$a("co", "1.0.0", "AMap_co_1.0.0").a(stringArray).a();
    }
    public static String b(String p0){
       if (p0 == null) {
          return null;
       }
       p0 = p.c(x.a(p0));
       p0 = (char)((p0.length() % 26) + 65)+p0;
       return p0;
    }
    public static String b(Map p0){
       String str1;
       if (p0 != null) {
          StringBuilder str = "";
          Iterator iterator = p0.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             if (str.length() > 0) {
                str = str+"&";
             }
             str = str+uEntry.getKey()+"="+uEntry.getValue();
          }
          str1 = str;
       }else {
          str1 = null;
       }
       return x.e(str1);
    }
    public static boolean b(Context p0){
       return aj.a(p0);
    }
    public static byte[] b(byte[] p0){
       return x.h(p0);
    }
    public static String c(String p0){
       if (p0.length() < 2) {
          return "";
       }
       return p.a(p0.substring(1));
    }
    public static byte[] c(){
       String str = ",";
       String[] stringArray = (("16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87").reverse()).split(str);
       byte[] uobyteArray = new byte[stringArray.length];
       int i = 0;
       for (int i1 = 0; i1 < stringArray.length; i1 = i1 + 1) {
          uobyteArray[i1] = Byte.parseByte(stringArray[i1]);
       }
       String[] stringArray1 = ((new String(p.b(new String(uobyteArray)))).reverse()).split(str);
       byte[] uobyteArray1 = new byte[stringArray1.length];
       for (; i < stringArray1.length; i = i + 1) {
          uobyteArray1[i] = Byte.parseByte(stringArray1[i]);
       }
       return uobyteArray1;
    }
    public static byte[] c(byte[] p0){
       byte[] uobyteArray = null;
       if (p0 == null || !p0.length) {
          return uobyteArray;
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       ZipOutputStream zipOutputStr = new ZipOutputStream(uByteArrayOu);
       zipOutputStr.putNextEntry(new ZipEntry("log"));
       zipOutputStr.write(p0);
       zipOutputStr.closeEntry();
       zipOutputStr.finish();
       uobyteArray = uByteArrayOu.toByteArray();
       zipOutputStr.close();
       uByteArrayOu.close();
       return uobyteArray;
    }
    public static PublicKey d(){
       ByteArrayInputStream uByteArrayIn = new ByteArrayInputStream(p.b("MIICnjCCAgegAwIBAgIJAJ0Pdzos7ZfYMA0GCSqGSIb3DQEBBQUAMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjAeFw0xMzA4MTUwNzU2NTVaFw0yMzA4MTMwNzU2NTVaMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA8eWAyHbFPoFPfdx5AD+D4nYFq4dbJ1p7SIKt19Oz1oivF/6H43v5Fo7s50pD1UF8+Qu4JoUQxlAgOt8OCyQ8DYdkaeB74XKb1wxkIYg/foUwN1CMHPZ9O9ehgna6K4EJXZxR7Y7XVZnbjHZIVn3VpPU/Rdr2v37LjTw+qrABJxMCAwEAAaNQME4wHQYDVR0OBBYEFOM/MLGP8xpVFuVd+3qZkw7uBvOTMB8GA1UdIwQYMBaAFOM/MLGP8xpVFuVd+3qZkw7uBvOTMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADgYEA4LY3g8aAD8JkxAOqUXDDyLuCCGOc2pTIhn0TwMNaVdH4hZlpTeC/wuRD5LJ0z3j+IQ0vLvuQA5uDjVyEOlBrvVIGwSem/1XGUo13DfzgAJ5k1161S5l+sFUo5TxpHOXr8Z5nqJMjieXmhnE/I99GFyHpQmw4cC6rhYUhdhtg+Zk="));
       KeyFactory instance = KeyFactory.getInstance(x.c("EUlNB"));
       Certificate uCertificate = CertificateFactory.getInstance(x.c("IWC41MDk")).generateCertificate(uByteArrayIn);
       if (uCertificate == null || instance == null) {
          uByteArrayIn.close();
          return null;
       }else {
          PublicKey publicKey = instance.generatePublic(new X509EncodedKeySpec(uCertificate.getPublicKey().getEncoded()));
          uByteArrayIn.close();
          return publicKey;
       }
    }
    public static byte[] d(String p0){
       if (p0.length() % 2) {
          p0 = ("0").concat(p0);
       }
       int i = p0.length() / 2;
       byte[] uobyteArray = new byte[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          int i2 = i1 * 2;
          int i3 = i2 + 2;
          String str = p0.substring(i2, i3);
          uobyteArray[i1] = (byte)Integer.parseInt(str, 16);
       }
       return uobyteArray;
    }
    public static byte[] d(byte[] p0){
       return x.h(p0);
    }
    public static String e(String p0){
       String str = "&";
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       String[] stringArray = p0.split(str);
       Arrays.sort(stringArray);
       StringBuffer str1 = "";
       int len = stringArray.length;
       for (int i = 0; i < len; i = i + 1) {
          str1 = str1+stringArray[i]+str;
       }
       str = str1;
       if (str.length() > 1) {
          return str.subSequence(0, (str.length() - 1));
       }
       return p0;
    }
    public static String e(byte[] p0){
       return x.g(p0);
    }
    public static String f(byte[] p0){
       return x.g(p0);
    }
    public static void f(String p0){
       int i = 0;
       while (p0.length() >= 78) {
          p0.substring(i, 78);
          p0 = p0.substring(78);
       }
       int i1 = p0.length() - 78;
       while (i < i1) {
          i = i + 1;
       }
       return;
    }
    public static String g(byte[] p0){
       StringBuilder str = "";
       if (p0 == null) {
          return null;
       }
       for (int i = 0; i < p0.length; i = i + 1) {
          int i1 = p0[i] & 0x00ff;
          String str1 = Integer.toHexString(i1);
          if (str1.length() == 1) {
             str1 = ("0").concat(str1);
          }
          str = str+str1;
       }
       return str;
    }
    public static byte[] h(byte[] p0){
       if (p0 == null) {
          return null;
       }
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       GZIPOutputStream gZIPOutputSt = new GZIPOutputStream(uByteArrayOu);
       gZIPOutputSt.write(p0);
       gZIPOutputSt.finish();
       gZIPOutputSt.close();
       uByteArrayOu.close();
       return uByteArrayOu.toByteArray();
    }
}
