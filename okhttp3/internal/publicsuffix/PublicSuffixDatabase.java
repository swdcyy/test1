package okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.CountDownLatch;
import okhttp3.internal.Util;
import java.nio.charset.Charset;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import java.util.Objects;
import java.net.IDN;
import java.io.InputStream;
import java.lang.Class;
import okio.j;
import okio.n;
import okio.l;
import okio.d;
import cud.k;
import java.io.Closeable;
import okhttp3.internal.platform.Platform;
import java.lang.Throwable;

public final class PublicSuffixDatabase	// class@001fd2
{
    public final AtomicBoolean listRead;
    public byte[] publicSuffixExceptionListBytes;
    public byte[] publicSuffixListBytes;
    public final CountDownLatch readCompleteLatch;
    public static final String[] EMPTY_RULE;
    public static final String[] PREVAILING_RULE;
    public static final byte[] WILDCARD_LABEL;
    public static final PublicSuffixDatabase instance;

    static {
       byte[] uobyteArray = new byte[]{42};
       PublicSuffixDatabase.WILDCARD_LABEL = uobyteArray;
       String[] stringArray = new String[0];
       PublicSuffixDatabase.EMPTY_RULE = stringArray;
       stringArray = new String[]{"*"};
       PublicSuffixDatabase.PREVAILING_RULE = stringArray;
       PublicSuffixDatabase.instance = new PublicSuffixDatabase();
    }
    public void PublicSuffixDatabase(){
       super();
       this.listRead = new AtomicBoolean(false);
       this.readCompleteLatch = new CountDownLatch(1);
    }
    public static String binarySearchBytes(byte[] p0,byte[][] p1,int p2){
       String str;
       int i11;
       byte[] uobyteArray = p0;
       int i = p1;
       int len = uobyteArray.length;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             int i2 = i1 + len;
             i2 = i2 / 2;
             int i3 = 10;
             while (i2 > -1 && uobyteArray[i2] != i3) {
                i2 = i2 - 1;
             }
             i2 = i2 + 1;
             int b = 1;
             int i4 = 1;
             int i5 = i2 + i4;
             while (uobyteArray[i5] != i3) {
                i4 = i4 + 1;
             }
             i3 = i5 - i2;
             int i6 = p2;
             i4 = 0;
             int i7 = 0;
             int i8 = 0;
             while (true) {
                if (i4 != null) {
                   i4 = 46;
                   object oobject = null;
                label_003e :
                   int i9 = i2 + i8;
                   i9 = uobyteArray[i9] & 0x00ff;
                   i4 = i4 - i9;
                   if (!i4) {
                      i8 = i8 + 1;
                      i7 = i7 + 1;
                      if (i8 != i3) {
                         if (i[i6].length == i7) {
                            i11 = i.length - b;
                            if (i6 != i11) {
                               i6 = i6 + 1;
                               i4 = 1;
                               i7 = -1;
                            }
                         }else {
                            object oobject1 = oobject;
                         }
                      }
                   }
                   if (i4 >= 0) {
                      if (i4 <= 0) {
                         int i10 = i3 - i8;
                         b = i[i6].length - i7;
                         i6 = i6 + 1;
                         while (i6 < i.length) {
                            b = b + i[i6].length;
                         }
                         if (b >= i10) {
                            if (b <= i10) {
                               str = new String(uobyteArray, i2, i3, Util.UTF_8);
                            }
                         }
                      }
                      i1 = i5 + 1;
                      continue ;
                   }
                   i2 = i2 - 1;
                   len = i2;
                }else {
                   i11 = i[i6][i7] & 0x00ff;
                   int i12 = i11;
                   i11 = i4;
                   i4 = i12;
                   goto label_003e ;
                }
             }
             return str;
          }else {
             str = null;
             goto label_0089 ;
          }
       }
    }
    public static PublicSuffixDatabase get(){
       return PublicSuffixDatabase.instance;
    }
    public final String[] findMatchingRule(String[] p0){
       int len;
       byte[][] uobyteArray;
       int i;
       int i1;
       String str;
       String str1;
       byte[][] uobyteArray1;
       int i2;
       int i3;
       String str2;
       String str3;
       String[] stringArray;
       boolean b = false;
       boolean b1 = true;
       if (!this.listRead.get() && this.listRead.compareAndSet(b, b1)) {
          this.readTheListUninterruptibly();
       }else {
          try{
             this.readCompleteLatch.await();
          }catch(java.lang.InterruptedException e0){
             Thread.currentThread().interrupt();
          }
       }
    }
    public String getEffectiveTldPlusOne(String p0){
       int len;
       int len1;
       Objects.requireNonNull(p0, "domain == null");
       String str = "\\.";
       String[] stringArray = (IDN.toUnicode(p0)).split(str);
       String[] stringArray1 = this.findMatchingRule(stringArray);
       if (stringArray.length == stringArray1.length && (stringArray1[0]).charAt(0) != '!') {
          return null;
       }
       if ((stringArray1[0]).charAt(0) == '!') {
          len = stringArray.length;
          len1 = stringArray1.length;
       }else {
          len = stringArray.length;
          len1 = stringArray1.length + 1;
       }
       StringBuilder str1 = "";
       String[] stringArray2 = p0.split(str);
       for (len = len - len1; len < stringArray2.length; len = len + 1) {
          str1 = str1+stringArray2[len]+'.';
       }
       str1.deleteCharAt((str1.length() - 1));
       return str1;
    }
    public final void readTheList(){
       InputStream resourceAsSt = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
       if (resourceAsSt == null) {
          return;
       }
       d uod = l.d(new j(l.k(resourceAsSt)));
       d uod1 = uod;
       byte[] uobyteArray = new byte[uod1.readInt()];
       uod1.readFully(uobyteArray);
       byte[] uobyteArray1 = new byte[uod1.readInt()];
       uod1.readFully(uobyteArray1);
       Util.closeQuietly(uod);
       _monitor_enter(this);
       this.publicSuffixListBytes = uobyteArray;
       this.publicSuffixExceptionListBytes = uobyteArray1;
       _monitor_exit(this);
       this.readCompleteLatch.countDown();
       return;
    }
    public final void readTheListUninterruptibly(){
       Thread thread = null;
       try{
       label_0001 :
          this.readTheList();
          if (thread) {
             Thread.currentThread().interrupt();
          }
          return;
       }catch(java.io.InterruptedIOException e0){
          Thread.interrupted();
          thread = 1;
          goto label_0001 ;
       }catch(java.io.IOException e1){
          Platform.get().log(5, "Failed to read public suffix list", e1);
          if (thread) {
             Thread.currentThread().interrupt();
          }
          return;
       }
    }
    public void setListBytes(byte[] p0,byte[] p1){
       this.publicSuffixListBytes = p0;
       this.publicSuffixExceptionListBytes = p1;
       this.listRead.set(true);
       this.readCompleteLatch.countDown();
    }
}
