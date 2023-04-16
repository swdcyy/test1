package okhttp3.internal.Util;
import java.lang.String;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okhttp3.RequestBody;
import okio.ByteString;
import java.nio.charset.Charset;
import java.util.TimeZone;
import okhttp3.internal.Util$1;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.reflect.Method;
import java.util.regex.Pattern;
import java.lang.Object;
import java.lang.Exception;
import java.lang.AssertionError;
import okio.d;
import java.lang.CharSequence;
import java.net.InetAddress;
import java.lang.StringBuilder;
import java.net.IDN;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.Closeable;
import java.net.ServerSocket;
import java.net.Socket;
import java.lang.RuntimeException;
import java.lang.System;
import java.util.Arrays;
import okio.n;
import okhttp3.HttpUrl;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Comparator;
import okio.b;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.TrustManagerFactory;
import java.security.KeyStore;
import javax.net.ssl.TrustManager;
import java.lang.IllegalStateException;
import okio.o;
import java.lang.Math;
import java.util.concurrent.ThreadFactory;
import okhttp3.internal.Util$2;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import java.util.Iterator;
import okhttp3.internal.http2.Header;
import okhttp3.internal.Internal;
import java.util.regex.Matcher;

public final class Util	// class@0020a0
{
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    public static final String[] EMPTY_STRING_ARRAY;
    public static final Charset ISO_8859_1;
    public static final Comparator NATURAL_ORDER;
    public static final TimeZone UTC;
    public static final Charset UTF_16_BE;
    public static final ByteString UTF_16_BE_BOM;
    public static final Charset UTF_16_LE;
    public static final ByteString UTF_16_LE_BOM;
    public static final Charset UTF_32_BE;
    public static final ByteString UTF_32_BE_BOM;
    public static final Charset UTF_32_LE;
    public static final ByteString UTF_32_LE_BOM;
    public static final Charset UTF_8;
    public static final ByteString UTF_8_BOM;
    public static final Pattern VERIFY_AS_IP_ADDRESS;
    public static final Method addSuppressedExceptionMethod;

    static {
       int i = 0;
       byte[] uobyteArray = new byte[i];
       Util.EMPTY_BYTE_ARRAY = uobyteArray;
       String[] stringArray = new String[i];
       Util.EMPTY_STRING_ARRAY = stringArray;
       MediaType mediaType = null;
       Util.EMPTY_RESPONSE = ResponseBody.create(mediaType, uobyteArray);
       Util.EMPTY_REQUEST = RequestBody.create(mediaType, uobyteArray);
       Util.UTF_8_BOM = ByteString.decodeHex("efbbbf");
       Util.UTF_16_BE_BOM = ByteString.decodeHex("feff");
       Util.UTF_16_LE_BOM = ByteString.decodeHex("fffe");
       Util.UTF_32_BE_BOM = ByteString.decodeHex("0000ffff");
       Util.UTF_32_LE_BOM = ByteString.decodeHex("ffff0000");
       Util.UTF_8 = Charset.forName("UTF-8");
       Util.ISO_8859_1 = Charset.forName("ISO-8859-1");
       Util.UTF_16_BE = Charset.forName("UTF-16BE");
       Util.UTF_16_LE = Charset.forName("UTF-16LE");
       Util.UTF_32_BE = Charset.forName("UTF-32BE");
       Util.UTF_32_LE = Charset.forName("UTF-32LE");
       Util.UTC = TimeZone.getTimeZone("GMT");
       Util$1 u1 = new Util$1();
       try{
          Util.NATURAL_ORDER = u1;
          Class[] uClassArray = new Class[]{Throwable.class};
          Method declaredMeth = Throwable.class.getDeclaredMethod("addSuppressed", uClassArray);
          Util.addSuppressedExceptionMethod = declaredMeth;
          Util.VERIFY_AS_IP_ADDRESS = Pattern.compile("\([0-9a-fA-F]*:[0-9a-fA-F:.]*\)|\([\\d.]+\)");
       }catch(java.lang.Exception e0){
       }
    }
    public void Util(){
       super();
    }
    public static void addSuppressedIfPossible(Throwable p0,Throwable p1){
       try{
          Method addSuppresse = Util.addSuppressedExceptionMethod;
          if (addSuppresse != null) {
             int i = 1;
             Object[] objArray = new Object[i];
             objArray[0] = p1;
             addSuppresse.invoke(p0, objArray);
          }
       label_000d :
          return;
       }catch(java.lang.reflect.InvocationTargetException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
    }
    public static AssertionError assertionError(String p0,Exception p1){
       try{
          AssertionError uAssertionEr = new AssertionError(p0);
          uAssertionEr.initCause(p1);
          return e0;
       }catch(java.lang.IllegalStateException e0){
       }
    }
    public static Charset bomAwareCharset(d p0,Charset p1){
       ByteString uTF_8_BOM = Util.UTF_8_BOM;
       long l = 0;
       if (p0.a0(l, uTF_8_BOM)) {
          p0.skip((long)uTF_8_BOM.size());
          return Util.UTF_8;
       }else {
          uTF_8_BOM = Util.UTF_16_BE_BOM;
          if (p0.a0(l, uTF_8_BOM)) {
             p0.skip((long)uTF_8_BOM.size());
             return Util.UTF_16_BE;
          }else {
             uTF_8_BOM = Util.UTF_16_LE_BOM;
             if (p0.a0(l, uTF_8_BOM)) {
                p0.skip((long)uTF_8_BOM.size());
                return Util.UTF_16_LE;
             }else {
                uTF_8_BOM = Util.UTF_32_BE_BOM;
                if (p0.a0(l, uTF_8_BOM)) {
                   p0.skip((long)uTF_8_BOM.size());
                   return Util.UTF_32_BE;
                }else {
                   uTF_8_BOM = Util.UTF_32_LE_BOM;
                   if (!p0.a0(l, uTF_8_BOM)) {
                      return p1;
                   }
                   p0.skip((long)uTF_8_BOM.size());
                   return Util.UTF_32_LE;
                }
             }
          }
       }
    }
    public static String canonicalizeHost(String p0){
       InetAddress inetAddress;
       String str = null;
       if (p0.contains(":")) {
          if (p0.startsWith("[") && p0.endsWith("]")) {
             int i = 1;
             inetAddress = Util.decodeIpv6(p0, i, (p0.length() - i));
          }else {
             inetAddress = Util.decodeIpv6(p0, 0, p0.length());
          }
          if (inetAddress == null) {
             return str;
          }else {
             byte[] address = inetAddress.getAddress();
             if (address.length == 16) {
                return Util.inet6AddressToAscii(address);
             }else {
                throw new AssertionError("Invalid IPv6 address: \'"+p0+"\'");
             }
          }
       }else {
          try{
             p0 = (IDN.toASCII(p0)).toLowerCase(Locale.US);
             if (p0.isEmpty()) {
                return str;
             }
             if (Util.containsInvalidHostnameAsciiCodes(p0)) {
                return str;
             }
             return p0;
          }catch(java.lang.IllegalArgumentException e0){
             return str;
          }
       }
    }
    public static int checkDuration(String p0,long p1,TimeUnit p2){
       if ((v2 = p1) < 0) {
          throw new IllegalArgumentException(p0+" < 0");
       }
       Objects.requireNonNull(p2, "unit == null");
       p1 = p2.toMillis(p1);
       if (p1 - 0x7fffffff > 0) {
          throw new IllegalArgumentException(p0+" too large.");
       }
       if (p1 || v2 <= 0) {
          return (int)p1;
       }
       throw new IllegalArgumentException(p0+" too small.");
    }
    public static void checkOffsetAndCount(long p0,long p1,long p2){
       if ((p1 | p2) >= 0 && (p1 - p0 <= 0 && (p0 - p1) - p2 >= 0)) {
          return;
       }
       throw new ArrayIndexOutOfBoundsException();
    }
    public static void closeQuietly(Closeable p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.lang.RuntimeException e0){
             throw e0;
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static void closeQuietly(ServerSocket p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.lang.RuntimeException e0){
             throw e0;
          }catch(java.lang.Exception e0){
          }
       }
       return;
    }
    public static void closeQuietly(Socket p0){
       if (p0 != null) {
          try{
             p0.close();
          }catch(java.lang.AssertionError e2){
             if (!Util.isAndroidGetsocknameError(e2)) {
                throw e2;
             }
          }catch(java.lang.RuntimeException e2){
             if (("bio == null").equals(e2.getMessage())) {
                return;
             }else {
                throw e2;
             }
          }catch(java.lang.Exception e0){
          }
       }
    }
    public static String[] concat(String[] p0,String p1){
       int i = p0.length + 1;
       String[] stringArray = new String[i];
       System.arraycopy(p0, 0, stringArray, 0, p0.length);
       stringArray[(i - 1)] = p1;
       return stringArray;
    }
    public static boolean containsInvalidHostnameAsciiCodes(String p0){
       int i = 0;
       while (true) {
          if (i >= p0.length()) {
             return false;
          }
          char c = p0.charAt(i);
          if (c <= 31 || c >= 127) {
             break ;
          }else if((" #%/:?@[\\]").indexOf(c) != -1){
             return true;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static int decodeHexDigit(char p0){
       char c = '0';
       if (p0 >= c && p0 <= '9') {
          return (p0 - c);
       }
       c = 'a';
       if (p0 < c || p0 > 'f') {
          c = 'A';
          if (p0 < c || p0 > 'F') {
             return -1;
          }
       }
       return ((p0 - c) + 10);
    }
    public static boolean decodeIpv4Suffix(String p0,int p1,int p2,byte[] p3,int p4){
       int i = p4;
       while (true) {
          boolean b = false;
          if (p1 < p2) {
             if (i == p3.length) {
                return b;
             }
             if (i != p4) {
                if (p0.charAt(p1) != '.') {
                   return b;
                }else {
                   p1++;
                }
             }
             int i1 = p1;
             int i2 = 0;
             while (true) {
                if (i1 < p2) {
                   char c = p0.charAt(i1);
                   if (c < '0' || c > '9') {
                   label_0037 :
                      p1 = i1 - p1;
                      if (!p1) {
                         return b;
                      }else {
                         p1 = i + 1;
                         p3[i] = (byte)i2;
                         i = p1;
                         p1 = i1;
                      }
                   }else if(!i2 && p1 != i1){
                      return b;
                   }else {
                      i2 = i2 * 10;
                      i2 = i2 + c;
                      i2 = i2 - 48;
                      if (i2 > 255) {
                         return b;
                      }else {
                         i1 = i1 + 1;
                      }
                   }
                }else {
                   goto label_0037 ;
                }
             }
             return true;
          }else if(i != (p4 + 4)){
             return b;
          }else {
             goto label_0049 ;
          }
       }
    }
    public static InetAddress decodeIpv6(String p0,int p1,int p2){
       int i6;
       int i = 16;
       byte[] uobyteArray = new byte[i];
       int i1 = 0;
       int i2 = -1;
       int i3 = -1;
       while (true) {
          InetAddress inetAddress = null;
          if (p1 < p2) {
             if (i1 == i) {
                return inetAddress;
             }
             int i4 = p1 + 2;
             if (i4 <= p2 && p0.regionMatches(p1, "::", 0, 2)) {
                if (i2 != -1) {
                   return inetAddress;
                }else {
                   i1 = i1 + 2;
                   i2 = i1;
                   if (i4 == p2) {
                   label_007a :
                      if (i1 != i) {
                         if (i2 == -1) {
                            return inetAddress;
                         }else {
                            int i5 = i1 - i2;
                            System.arraycopy(uobyteArray, i2, uobyteArray, (i5 - 16), i5);
                            Arrays.fill(uobyteArray, i2, ((i - i1) + i2), 0);
                            break ;
                         }
                      }
                      break ;
                   }else {
                      i3 = i4;
                   }
                }
             }else if(i1){
                i6 = 1;
                if (p0.regionMatches(p1, ":", 0, i6)) {
                   p1++;
                }else if(p0.regionMatches(p1, ".", 0, i6)){
                   if (!Util.decodeIpv4Suffix(p0, i3, p2, uobyteArray, (i1 - 2))) {
                      return inetAddress;
                   }else {
                      i1 = i1 + 2;
                      goto label_007a ;
                   }
                }else {
                   return inetAddress;
                }
             }
             i3 = p1;
             i4 = 0;
             for (p1 = i3; p1 < p2; p1++) {
                i6 = Util.decodeHexDigit(p0.charAt(p1));
                if (i6 == -1) {
                   break ;
                }
                i4 = i4 << 4;
                i4 = i4 + i6;
             }
             i6 = p1 - i3;
             if (!i6 || i6 > 4) {
                return inetAddress;
             }else {
                int i7 = i1 + 1;
                i6 = i4 >> 8;
                i6 = i6 & 0x00ff;
                uobyteArray[i1] = (byte)i6;
                i1 = i7 + 1;
                i4 = i4 & 0x00ff;
                uobyteArray[i7] = (byte)i4;
             }
          }else {
             goto label_007a ;
          }
       }
       try{
          return InetAddress.getByAddress(uobyteArray);
       }catch(java.net.UnknownHostException e0){
          throw new AssertionError();
       }
    }
    public static int delimiterOffset(String p0,int p1,int p2,char p3){
       while (true) {
          if (p1 >= p2) {
             return p2;
          }
          if (p0.charAt(p1) == p3) {
             break ;
          }else {
             p1++;
          }
       }
       return p1;
    }
    public static int delimiterOffset(String p0,int p1,int p2,String p3){
       while (true) {
          if (p1 >= p2) {
             return p2;
          }
          if (p3.indexOf(p0.charAt(p1)) != -1) {
             break ;
          }else {
             p1++;
          }
       }
       return p1;
    }
    public static boolean discard(n p0,int p1,TimeUnit p2){
       try{
          return Util.skipAll(p0, p1, p2);
       }catch(java.io.IOException e0){
          return false;
       }
    }
    public static boolean equal(Object p0,Object p1){
       boolean b = (p0 == p1 || (p0 != null && p0.equals(p1)))? true: false;
       return b;
    }
    public static String format(String p0,Object[] p1){
       return String.format(Locale.US, p0, p1);
    }
    public static String hostHeader(HttpUrl p0,boolean p1){
       String str = ((p0.host()).contains(":"))? "["+p0.host()+"]": p0.host();
       if (p1 || p0.port() != HttpUrl.defaultPort(p0.scheme())) {
          str = str+":"+p0.port();
       }
       return str;
    }
    public static List immutableList(List p0){
       return Collections.unmodifiableList(new ArrayList(p0));
    }
    public static List immutableList(Object[] p0){
       return Collections.unmodifiableList(Arrays.asList(p0.clone()));
    }
    public static Map immutableMap(Map p0){
       p0 = (p0.isEmpty())? Collections.emptyMap(): Collections.unmodifiableMap(new LinkedHashMap(p0));
       return p0;
    }
    public static int indexOf(Comparator p0,String[] p1,String p2){
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return -1;
          }
          if (!p0.compare(p1[i], p2)) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public static int indexOfControlOrNonAscii(String p0){
       int i = p0.length();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return -1;
          }
          char c = p0.charAt(i1);
          if (c <= 31 || c >= 127) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return i1;
    }
    public static String inet6AddressToAscii(byte[] p0){
       int i5;
       int i6;
       int i = 0;
       int i1 = -1;
       int i2 = 0;
       int i3 = 0;
       int i4 = 16;
       while (i2 < p0.length) {
          i5 = i2;
          while (i5 < i4 && !p0[i5]) {
             i6 = i5 + 1;
             if (!p0[i6]) {
                i5 = i5 + 2;
             }else {
                break ;
             }
          }
          i4 = i5 - i2;
          if (i4 > i3 && i4 >= 4) {
             i1 = i2;
             i3 = i4;
          }
          i2 = i5 + 2;
       }
       b uob = new b();
       while (i < p0.length) {
          i5 = 58;
          if (i == i1) {
             uob.y(i5);
             i = i + i3;
             if (i == i4) {
                uob.y(i5);
             }
          }else if(i > 0){
             uob.y(i5);
          }
          i5 = p0[i] & 0x00ff;
          i5 = i5 << 8;
          i6 = i + 1;
          i6 = p0[i6] & 0x00ff;
          i5 = i5 | i6;
          uob.A((long)i5);
          i = i + 2;
       }
       return uob.readUtf8();
    }
    public static String[] intersect(Comparator p0,String[] p1,String[] p2){
       ArrayList uArrayList = new ArrayList();
       int len = p1.length;
       int i = 0;
       while (i < len) {
          object oobject = p1[i];
          int len1 = p2.length;
          int i1 = 0;
          while (i1 < len1) {
             if (!p0.compare(oobject, p2[i1])) {
                uArrayList.add(oobject);
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          i = i + 1;
       }
       String[] stringArray = new String[uArrayList.size()];
       return uArrayList.toArray(stringArray);
    }
    public static boolean isAndroidGetsocknameError(AssertionError p0){
       boolean b = (p0.getCause() != null && (p0.getMessage() != null && (p0.getMessage()).contains("getsockname failed")))? true: false;
       return b;
    }
    public static boolean nonEmptyIntersection(Comparator p0,String[] p1,String[] p2){
       if (p1 == null || (p2 == null || (p1.length && p2.length))) {
          int len = p1.length;
          int i = 0;
          while (i < len) {
             object oobject = p1[i];
             int len1 = p2.length;
             int i1 = 0;
             while (true) {
                if (i1 < len1) {
                   if (!p0.compare(oobject, p2[i1])) {
                      return true;
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i = i + 1;
                }
             }
          }
       }
       return false;
    }
    public static X509TrustManager platformTrustManager(){
       try{
          TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
          instance.init(null);
          TrustManager[] trustManager = instance.getTrustManagers();
          if (trustManager.length == 1) {
             int i = 0;
             if (trustManager[i] instanceof X509TrustManager) {
                return trustManager[i];
             }
          }
          throw new IllegalStateException("Unexpected default trust managers:"+Arrays.toString(trustManager));
       }catch(java.security.GeneralSecurityException e0){
          throw Util.assertionError("No System TLS", e0);
       }
    }
    public static boolean skipAll(n p0,int p1,TimeUnit p2){
       long l = System.nanoTime();
       long l1 = (p0.timeout().hasDeadline())? p0.timeout().deadlineNanoTime() - l: Long.MAX_VALUE;
       o oo = p0.timeout();
       long l2 = Math.min(l1, p2.toNanos((long)p1)) + l;
       try{
          oo.deadlineNanoTime(l2);
          b uob = new b();
          while (p0.read(uob, 8192) - -1) {
             uob.a();
          }
          if (!l1 - Long.MAX_VALUE) {
             p0.timeout().clearDeadline();
          }else {
             p0.timeout().deadlineNanoTime((l + l1));
          }
          return true;
       }catch(java.io.InterruptedIOException e0){
          if (!l1 - Long.MAX_VALUE) {
             p0.timeout().clearDeadline();
          }else {
             p0.timeout().deadlineNanoTime((e0 + l1));
          }
          return false;
       }
    }
    public static int skipLeadingAsciiWhitespace(String p0,int p1,int p2){
       while (true) {
          if (p1 >= p2) {
             return p2;
          }
          char c = p0.charAt(p1);
          if (c != 9 && (c != 10 && (c != 12 && (c != 13 && c != ' ')))) {
             break ;
          }else {
             p1++;
          }
       }
       return p1;
    }
    public static int skipTrailingAsciiWhitespace(String p0,int p1,int p2){
       p2--;
       while (true) {
          if (p2 < p1) {
             return p1;
          }
          char c = p0.charAt(p2);
          if (c != 9 && (c != 10 && (c != 12 && (c != 13 && c != ' ')))) {
             break ;
          }else {
             p2--;
          }
       }
       p2++;
       return p2;
    }
    public static ThreadFactory threadFactory(String p0,boolean p1){
       return new Util$2(p0, p1);
    }
    public static Headers toHeaders(List p0){
       Headers$Builder uBuilder = new Headers$Builder();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          Header header = iterator.next();
          Internal.instance.addLenient(uBuilder, header.name.utf8(), header.value.utf8());
       }
       return uBuilder.build();
    }
    public static String trimSubstring(String p0,int p1,int p2){
       p1 = Util.skipLeadingAsciiWhitespace(p0, p1, p2);
       return p0.substring(p1, Util.skipTrailingAsciiWhitespace(p0, p1, p2));
    }
    public static boolean verifyAsIpAddress(String p0){
       return Util.VERIFY_AS_IP_ADDRESS.matcher(p0).matches();
    }
}
