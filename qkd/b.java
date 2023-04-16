package qkd.b;
import java.lang.String;
import java.nio.charset.Charset;
import java.math.BigInteger;
import java.io.File;
import java.lang.Character;
import java.lang.Object;
import java.util.Objects;
import java.util.regex.Pattern;
import java.lang.System;
import java.util.List;
import java.util.Iterator;
import java.lang.CharSequence;
import java.lang.Math;
import java.util.Collection;
import kud.d;
import java.io.FileFilter;
import com.yxcorp.utility.TextUtils;
import java.lang.Exception;
import org.apache.internal.commons.io.filefilter.DirectoryFileFilter;
import kud.c;
import org.apache.internal.commons.io.filefilter.FalseFileFilter;
import java.util.LinkedList;
import org.apache.internal.commons.io.filefilter.OrFileFilter;
import java.lang.IllegalArgumentException;
import org.apache.internal.commons.io.filefilter.TrueFileFilter;
import java.io.IOException;
import java.lang.StringBuilder;
import org.apache.internal.commons.io.FileExistsException;
import java.io.FileNotFoundException;
import java.util.Calendar;
import android.text.format.DateFormat;
import android.text.TextUtils;
import android.os.StatFs;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.InputStream;
import qkd.c;
import ekd.p;
import java.io.OutputStream;
import iud.a;
import java.text.DecimalFormat;
import ekd.n0;
import pkd.a;
import y56.a;
import org.apache.internal.commons.io.IOCase;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.io.Closeable;
import java.io.BufferedOutputStream;
import android.util.Base64;

public class b	// class@002299
{
    public static final Charset a;
    public static final Charset b;
    public static final BigInteger c;
    public static final BigInteger d;
    public static final BigInteger e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;
    public static final char i;
    public static Pattern j;
    public static Pattern k;
    public static Pattern l;
    public static Pattern m;
    public static final BigInteger n;
    public static final BigInteger o;
    public static final File[] p;
    public static final String q;
    public static final Charset r;
    public static final char s;

    static {
       b.a = Charset.forName("US-ASCII");
       String str = "UTF-8";
       b.b = Charset.forName(str);
       long l = 1024;
       BigInteger uBigInteger = BigInteger.valueOf(l);
       b.c = uBigInteger;
       BigInteger uBigInteger1 = uBigInteger.multiply(uBigInteger);
       b.d = uBigInteger1;
       uBigInteger1 = uBigInteger.multiply(uBigInteger1);
       b.e = uBigInteger1;
       uBigInteger1 = uBigInteger.multiply(uBigInteger1);
       b.f = uBigInteger1;
       uBigInteger1 = uBigInteger.multiply(uBigInteger1);
       b.g = uBigInteger1;
       b.h = uBigInteger.multiply(uBigInteger1);
       b.i = (b.Q())? '/': '\';
       BigInteger uBigInteger2 = BigInteger.valueOf(l).multiply(BigInteger.valueOf(0x1000000000000000));
       b.n = uBigInteger2;
       b.o = uBigInteger.multiply(uBigInteger2);
       File[] uFileArray = new File[0];
       b.p = uFileArray;
       b.q = Character.toString('.');
       b.r = Charset.forName(str);
       b.s = File.separatorChar;
    }
    public static File A(File p0,String[] p1){
       Objects.requireNonNull(p0, "directorydirectory must not be null");
       int len = p1.length;
       int i = 0;
       while (i < len) {
          i = i + 1;
          p0 = new File(p0, p1[i]);
       }
       return p0;
    }
    public static File B(String[] p0){
       int len = p0.length;
       File uFile = null;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          uFile = (uFile == null)? new File(oobject): new File(uFile, oobject);
          i = i + 1;
       }
       return uFile;
    }
    public static Pattern C(){
       if (b.j == null) {
          b.j = Pattern.compile(".*\\.\(jpe?g|png|gif|bmp\)$", 2);
       }
       return b.j;
    }
    public static String D(String p0){
       if (p0 == null) {
          return null;
       }
       return p0.substring((b.I(p0) + 1));
    }
    public static File E(){
       return new File(System.getProperty("java.io.tmpdir"));
    }
    public static Pattern F(){
       if (b.l == null) {
          b.l = Pattern.compile(".*\\.\(asf|avi|avs|flv|m4v|mkv|mov|mp4|mpeg|wav|wmv|jif\)$", 2);
       }
       return b.l;
    }
    public static boolean G(File p0,List p1){
       Iterator iterator = p1.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if ((p0.getPath()).contains(iterator.next())) {
             break ;
          }
       }
       return true;
    }
    public static int H(String p0){
       int i = p0.lastIndexOf(46);
       if (b.I(p0) > i) {
          i = -1;
       }
       return i;
    }
    public static int I(String p0){
       return Math.max(p0.lastIndexOf(47), p0.lastIndexOf(92));
    }
    public static void J(Collection p0,File p1,d p2,boolean p3){
       File[] uFileArray = p1.listFiles(p2);
       if (uFileArray != null) {
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (oobject.isDirectory()) {
                if (p3) {
                   p0.add(oobject);
                }
                b.J(p0, oobject, p2, p3);
             }else {
                p0.add(oobject);
             }
             i = i + 1;
          }
       }
       return;
    }
    public static boolean K(String p0){
       return p0.endsWith(".apk");
    }
    public static boolean L(File p0){
       boolean b = (p0 != null && b.M(p0.getName()))? true: false;
       return b;
    }
    public static boolean M(String p0){
       String[] stringArray = new String[]{"jpg","jpeg"};
       return TextUtils.B(p0, stringArray);
    }
    public static boolean N(File p0){
       String[] stringArray = new String[]{"mp4"};
       boolean b = (p0 != null && TextUtils.B(p0.getName(), stringArray))? true: false;
       return b;
    }
    public static boolean O(String p0){
       String[] stringArray = new String[]{"png"};
       return TextUtils.B(p0, stringArray);
    }
    public static boolean P(File p0){
       Objects.requireNonNull(p0, "File must not be null");
       if (b.Q()) {
          return false;
       }
       if (p0.getParent() != null) {
          p0 = new File(p0.getParentFile().getCanonicalFile(), p0.getName());
       }
       if (p0.getCanonicalFile().equals(p0.getAbsoluteFile())) {
          return false;
       }else {
          return true;
       }
    }
    public static boolean Q(){
       boolean b = (b.s == '\')? true: false;
       return b;
    }
    public static boolean R(File p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       int i = 1;
       try{
          if (!p0.mkdirs()) {
             p0.mkdir();
          }
          if (p0.exists() && p0.canWrite()) {
             b = true;
          }
          return b;
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          if (p0.exists() && p0.canWrite()) {
             b = true;
          }
          return b;
       }
    }
    public static boolean S(File p0){
       boolean b = (p0 != null && p0.exists())? true: false;
       return b;
    }
    public static Collection T(File p0,d p1,d p2){
       if (!p0.isDirectory()) {
          throw new IllegalArgumentException("Parameter \'directory\' is not a directory");
       }
       Objects.requireNonNull(p1, "Parameter \'fileFilter\' is null");
       int i = 2;
       d[] uodArray = new d[i];
       uodArray[0] = p1;
       p1 = DirectoryFileFilter.INSTANCE;
       uodArray[1] = c.d(p1);
       d uod = c.a(uodArray);
       if (p2 == null) {
          p1 = FalseFileFilter.INSTANCE;
       }else {
          d[] uodArray2 = new d[i];
          uodArray2[0] = p2;
          uodArray2[1] = p1;
          p1 = c.a(uodArray2);
       }
       LinkedList linkedList = new LinkedList();
       d[] uodArray1 = new d[i];
       uodArray1[0] = uod;
       uodArray1[1] = p1;
       b.J(linkedList, p0, new OrFileFilter(c.e(uodArray1)), 0);
       return linkedList;
    }
    public static Collection U(File p0,String[] p1,boolean p2){
       d iNSTANCE = TrueFileFilter.INSTANCE;
       d uod = (p2)? iNSTANCE: FalseFileFilter.INSTANCE;
       return b.T(p0, iNSTANCE, uod);
    }
    public static void V(File p0,File p1){
       String str = "Source \'";
       if (!p0.exists()) {
          throw new FileNotFoundException(str+p0+"\' does not exist");
       }
       if (!p0.isDirectory()) {
          throw new IOException(str+p0+"\' is not a directory");
       }
       if (p1.exists()) {
          throw new FileExistsException("Destination \'"+p1+"\' already exists");
       }
       if (!p0.renameTo(p1)) {
          if (!(p1.getCanonicalPath()).startsWith(p0.getCanonicalPath())) {
             b.c(p0, p1);
             b.p(p0);
             if (p0.exists()) {
                throw new IOException("Failed to delete original directory \'"+p0+"\' after copy to \'"+p1+"\'");
             }
          }else {
             throw new IOException("Cannot move directory: "+p0+" to a subdirectory of itself: "+p1);
          }
       }
       return;
    }
    public static void W(File p0,File p1){
       Objects.requireNonNull(p0, "Source must not be null");
       Objects.requireNonNull(p1, "Destination must not be null");
       String str = "Source \'";
       if (!p0.exists()) {
          throw new FileNotFoundException(str+p0+"\' does not exist");
       }
       String str1 = "\' is a directory";
       if (p0.isDirectory()) {
          throw new IOException(str+p0+str1);
       }
       str = "Destination \'";
       if (p1.exists()) {
          throw new FileExistsException(str+p1+"\' already exists");
       }
       if (p1.isDirectory()) {
          throw new IOException(str+p1+str1);
       }
       if (!p0.renameTo(p1)) {
          b.g(p0, p1);
          if (!p0.delete()) {
             b.q(p1);
             throw new IOException("Failed to delete original file \'"+p0+"\' after copy to \'"+p1+"\'");
          }
       }
       return;
    }
    public static File X(File p0,String p1){
       String str = DateFormat.format("yyyyMMdd_kkmmss", Calendar.getInstance()).toString();
       File uFile = new File(p0, str+p1);
       if (uFile.exists()) {
          int i = 1;
          while (i < 100) {
             uFile = new File(p0, str+i+p1);
             if (uFile.exists()) {
                i = i + 1;
             }
          }
       }
       return uFile;
    }
    public static File Y(File p0,String p1,String p2){
       p1 = (TextUtils.isEmpty(p1))? DateFormat.format("yyyyMMdd_kkmmss", Calendar.getInstance()).toString(): p1.trim();
       return new File(p0, p1+p2);
    }
    public static File Z(File p0){
       return b.X(p0, ".jpg");
    }
    public static long a(String p0){
       return new StatFs(p0).getAvailableBytes();
    }
    public static File a0(File p0){
       return b.X(p0, ".png");
    }
    public static void b(File p0){
       if (!p0.exists()) {
          throw new FileNotFoundException(p0+" does not exist");
       }
       if (!p0.isDirectory()) {
          throw new FileNotFoundException(p0+" is not a directory");
       }
       File[] uFileArray = p0.listFiles();
       if (uFileArray == null) {
          throw new IOException("Failed to list contents of "+p0);
       }
       int len = uFileArray.length;
       int i = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          try{
             b.x(oobject);
          }catch(java.io.IOException e4){
          }
          i = i + 1;
       }
       if (!null) {
          return;
       }
       throw null;
    }
    public static FileInputStream b0(File p0){
       if (!p0.exists()) {
          throw new FileNotFoundException("File \'"+p0+"\' does not exist");
       }
       if (p0.isDirectory()) {
          throw new IOException("File \'"+p0+"\' exists but is a directory");
       }
       if (p0.canRead()) {
          return new FileInputStream(p0);
       }
       throw new IOException("File \'"+p0+"\' cannot be read");
    }
    public static void c(File p0,File p1){
       b.e(p0, p1, true);
    }
    public static FileOutputStream c0(File p0){
       return b.d0(p0, false);
    }
    public static void d(File p0,File p1,FileFilter p2,boolean p3){
       Objects.requireNonNull(p0, "Source must not be null");
       Objects.requireNonNull(p1, "Destination must not be null");
       String str = "Source \'";
       if (!p0.exists()) {
          throw new FileNotFoundException(str+p0+"\' does not exist");
       }
       if (!p0.isDirectory()) {
          throw new IOException(str+p0+"\' exists but is not a directory");
       }
       if ((p0.getCanonicalPath()).equals(p1.getCanonicalPath())) {
          throw new IOException(str+p0+"\' and destination \'"+p1+"\' are the same");
       }
       ArrayList uArrayList = null;
       if ((p1.getCanonicalPath()).startsWith(p0.getCanonicalPath())) {
          File[] uFileArray = (p2 == null)? p0.listFiles(): p0.listFiles(p2);
          if (uFileArray != null && uFileArray.length > 0) {
             uArrayList = new ArrayList(uFileArray.length);
             int len = uFileArray.length;
             for (int i = 0; i < len; i = i + 1) {
                uArrayList.add(new File(p1, uFileArray[i].getName()).getCanonicalPath());
             }
          }
       }
       b.t(p0, p1, p2, p3, uArrayList);
       return;
    }
    public static FileOutputStream d0(File p0,boolean p1){
       if (p0.exists()) {
          if (!p0.isDirectory()) {
             if (!p0.canWrite()) {
                throw new IOException("File \'"+p0+"\' cannot be written to");
             }
          }else {
             throw new IOException("File \'"+p0+"\' exists but is a directory");
          }
       }else {
          File parentFile = p0.getParentFile();
          if (parentFile == null || (!parentFile.mkdirs() && !parentFile.isDirectory())) {
             throw new IOException("Directory \'"+parentFile+"\' could not be created");
          }
       }
       return new FileOutputStream(p0, p1);
    }
    public static void e(File p0,File p1,boolean p2){
       b.d(p0, p1, null, p2);
    }
    public static byte[] e0(File p0){
       FileInputStream uFileInputSt = b.b0(p0);
       p.c(uFileInputSt);
       return c.r(uFileInputSt, p0.length());
    }
    public static long f(File p0,OutputStream p1){
       FileInputStream uFileInputSt = new FileInputStream(p0);
       uFileInputSt.close();
       return c.e(uFileInputSt, p1);
    }
    public static String f0(File p0){
       return b.h0(p0, Charset.defaultCharset());
    }
    public static void g(File p0,File p1){
       b.h(p0, p1, true);
    }
    public static String g0(File p0,String p1){
       return b.h0(p0, a.a(p1));
    }
    public static void h(File p0,File p1,boolean p2){
       Objects.requireNonNull(p0, "Source must not be null");
       Objects.requireNonNull(p1, "Destination must not be null");
       String str = "Source \'";
       if (!p0.exists()) {
          throw new FileNotFoundException(str+p0+"\' does not exist");
       }
       if (p0.isDirectory()) {
          throw new IOException(str+p0+"\' exists but is a directory");
       }
       if ((p0.getCanonicalPath()).equals(p1.getCanonicalPath())) {
          throw new IOException(str+p0+"\' and destination \'"+p1+"\' are the same");
       }
       File parentFile = p1.getParentFile();
       if (parentFile == null || (!parentFile.mkdirs() && !parentFile.isDirectory())) {
          throw new IOException("Destination \'"+parentFile+"\' directory cannot be created");
       }
       if (p1.exists() && !p1.canWrite()) {
          throw new IOException("Destination \'"+p1+"\' exists but is read-only");
       }
       b.u(p0, p1, p2);
       return;
    }
    public static String h0(File p0,Charset p1){
       FileInputStream uFileInputSt = b.b0(p0);
       p.c(uFileInputSt);
       return c.t(uFileInputSt, a.b(p1));
    }
    public static void i(File p0,File p1){
       b.j(p0, p1, true);
    }
    public static String i0(long p0){
       if (p0 - null <= 0) {
          return "0";
       }
       String[] stringArray = new String[]{"B","KB","MB","GB","TB"};
       double d = (double)p0;
       int i = (int)(Math.log10(d) / Math.log10(1024.00f));
       return n0.b("#,##0.#").format((d / Math.pow(1024.00f, (double)i)))+" "+stringArray[i];
    }
    public static void j(File p0,File p1,boolean p2){
       Objects.requireNonNull(p1, "Destination must not be null");
       if (p1.exists() && !p1.isDirectory()) {
          throw new IllegalArgumentException("Destination \'"+p1+"\' is not a directory");
       }
       b.h(p0, new File(p1, p0.getName()), p2);
       return;
    }
    public static String j0(String p0){
       if (p0 == null) {
          return null;
       }
       int i = b.H(p0);
       if (i == -1) {
          return p0;
       }
       return p0.substring(0, i);
    }
    public static void k(InputStream p0,File p1){
       FileOutputStream uFileOutputS = b.c0(p1);
       c.b(p0, uFileOutputS);
       uFileOutputS.close();
       p.d(uFileOutputS);
       p.c(p0);
    }
    public static boolean k0(File p0,File p1){
       if (p0.renameTo(p1)) {
          return true;
       }
       try{
          try{
             b.g(p0, p1);
             p0.delete();
          }catch(java.lang.Exception e2){
             e2.printStackTrace();
          }
          return true;
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          return false;
       }
    }
    public static boolean l(InputStream p0,String p1){
       int i = 0;
       try{
          FileOutputStream uFileOutputS = new FileOutputStream(p1);
          try{
             int i1 = 8192;
             byte[] uobyteArray = new byte[i1];
             i = p0.read(uobyteArray);
             while (i != -1) {
                uFileOutputS.write(uobyteArray, 0, i);
             }
             p.c(p0);
             p.d(uFileOutputS);
             return true;
          }catch(java.lang.Exception e5){
             OutputStream outputStream = uFileOutputS;
          }
          e5.printStackTrace();
          p.c(p0);
          p.d(i);
          return 0;
       }catch(java.lang.Exception e5){
          goto label_0027 ;
       }
    }
    public static boolean l0(File p0){
       File uFile = new File(p0.getAbsolutePath()+System.currentTimeMillis());
       b.k0(p0, uFile);
       return b.q(uFile);
    }
    public static void m(File p0){
       if (p0 != null && p0.exists()) {
          File[] uFileArray = p0.listFiles();
          if (uFileArray == null) {
             return;
          }else {
             int len = uFileArray.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = uFileArray[i];
                if (oobject.isDirectory()) {
                   b.m(oobject);
                }
                oobject.delete();
             }
          }
       }
       return;
    }
    public static long m0(File p0){
       if (!p0.exists()) {
          if (!a.a) {
             return -1;
          }
          throw new IllegalArgumentException(p0+" does not exist");
       }else if(p0.isDirectory()){
          return b.o0(p0);
       }else {
          return p0.length();
       }
    }
    public static void n(File p0,List p1,List p2){
       if (p0.exists() && !b.G(p0, p1)) {
          File[] uFileArray = p0.listFiles();
          if (uFileArray == null) {
             return;
          }else {
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                if (oobject.isDirectory()) {
                   b.n(oobject, p1, p2);
                }
                if (!b.G(oobject, p1) && !oobject.delete()) {
                   p2.add(oobject.getPath());
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public static long n0(File p0){
       if (!p0.exists()) {
          throw new IllegalArgumentException(p0+" does not exist");
       }
       if (p0.isDirectory()) {
          return b.o0(p0);
       }
       throw new IllegalArgumentException(p0+" is not a directory");
    }
    public static void o(File p0,boolean p1){
       object oobject;
       File[] uFileArray = p0.listFiles();
       if (uFileArray == null) {
          if (p1) {
             return;
          }else {
             throw new IOException("not a readable directory: "+p0);
          }
       }else {
          int len = uFileArray.length;
          int i = 0;
          while (true) {
             if (i >= len) {
                return;
             }
             oobject = uFileArray[i];
             if (oobject.isDirectory()) {
                b.o(oobject, p1);
             }
             if (oobject.delete() || p1) {
                i = i + 1;
             }else {
                break ;
             }
          }
          throw new IOException("failed to delete file: "+oobject);
       }
    }
    public static long o0(File p0){
       File[] uFileArray = p0.listFiles();
       if (uFileArray == null) {
          return 0;
       }
       int len = uFileArray.length;
       int i = 0;
       long l = 0;
       while (i < len) {
          object oobject = uFileArray[i];
          try{
             if (!b.P(oobject)) {
                long l1 = (oobject.isDirectory())? b.o0(oobject): oobject.length();
                l = l + l1;
                if (l < 0) {
                   break ;
                }
             }
          label_002b :
             i = i + 1;
          }catch(java.io.IOException e0){
          }
       }
       return l;
    }
    public static void p(File p0){
       if (!p0.exists()) {
          return;
       }
       if (!b.P(p0)) {
          b.b(p0);
       }
       if (p0.delete()) {
          return;
       }else {
          throw new IOException("Unable to delete directory "+p0+".");
       }
    }
    public static long p0(File[] p0){
       int len = p0.length;
       long l = 0;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          try{
             l = l + a.c(oobject);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
          i = i + 1;
       }
       return l;
    }
    public static boolean q(File p0){
       if (p0 == null) {
          return false;
       }
       try{
          if (p0.isDirectory()) {
             b.b(p0);
          }
          try{
             return p0.delete();
          }catch(java.lang.Exception e0){
             return e0;
          }
       }catch(java.lang.Exception e0){
       }
    }
    public static void q0(File p0,CharSequence p1){
       b.s0(p0, p1, Charset.defaultCharset(), false);
    }
    public static boolean r(File p0,File p1){
       if (!p0.isDirectory()) {
          throw new IllegalArgumentException("Not a directory: "+p0);
       }
       if (p1 == null) {
          return false;
       }
       if (!p0.exists() || !p1.exists()) {
          return false;
       }
       return b.s(p0.getCanonicalPath(), p1.getCanonicalPath());
    }
    public static void r0(File p0,CharSequence p1,String p2,boolean p3){
       b.s0(p0, p1, a.a(p2), p3);
    }
    public static boolean s(String p0,String p1){
       if (p0 == null) {
          throw new IllegalArgumentException("Directory must not be null");
       }
       if (p1 == null) {
          return false;
       }
       IOCase sYSTEM = IOCase.SYSTEM;
       if (sYSTEM.checkEquals(p0, p1)) {
          return false;
       }
       return sYSTEM.checkStartsWith(p1, p0);
    }
    public static void s0(File p0,CharSequence p1,Charset p2,boolean p3){
       String str = (p1 == null)? null: p1.toString();
       b.w0(p0, str, p2, p3);
       return;
    }
    public static void t(File p0,File p1,FileFilter p2,boolean p3,List p4){
       File[] uFileArray = (p2 == null)? p0.listFiles(): p0.listFiles(p2);
       if (uFileArray != null) {
          String str = "Destination \'";
          if (p1.exists()) {
             if (!p1.isDirectory()) {
                throw new IOException(str+p1+"\' exists but is not a directory");
             }
          }else if(p1.mkdirs() || p1.isDirectory()){
             throw new IOException(str+p1+"\' directory cannot be created");
          }
          if (p1.canWrite()) {
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                File uFile = new File(p1, oobject.getName());
                if (p4 == null || !p4.contains(oobject.getCanonicalPath())) {
                   if (oobject.isDirectory()) {
                      b.t(oobject, uFile, p2, p3, p4);
                   }else {
                      b.u(oobject, uFile, p3);
                   }
                }
                i = i + 1;
             }
             if (p3) {
                p1.setLastModified(p0.lastModified());
             }
             return;
          }else {
             throw new IOException(str+p1+"\' cannot be written to");
          }
       }else {
          throw new IOException("Failed to list contents of "+p0);
       }
    }
    public static void t0(File p0,byte[] p1){
       FileOutputStream uFileOutputS = b.d0(p0, false);
       uFileOutputS.write(p1);
       uFileOutputS.close();
       p.d(uFileOutputS);
    }
    public static void u(File p0,File p1,boolean p2){
       File uFile = p0;
       File uFile1 = p1;
       if (p1.exists() && p1.isDirectory()) {
          throw new IOException("Destination \'"+uFile1+"\' exists but is a directory");
       }
       FileInputStream uFileInputSt = new FileInputStream(uFile);
       FileOutputStream uFileOutputS = new FileOutputStream(uFile1);
       FileChannel channel = uFileInputSt.getChannel();
       FileChannel channel1 = uFileOutputS.getChannel();
       long l = channel.size();
       long l1 = 0;
       while (l1 - l < 0) {
          long l2 = l - l1;
          long l3 = 0x1e00000;
          long l4 = (l2 - l3 > 0)? l3: l2;
          l1 = l1 + channel1.transferFrom(channel, l1, l4);
       }
       p.b(channel1);
       p.d(uFileOutputS);
       p.b(channel);
       p.c(uFileInputSt);
       if (p0.length() - p1.length()) {
          throw new IOException("Failed to copy full contents from \'"+uFile+"\' to \'"+uFile1+"\'");
       }
       if (p2) {
          uFile1.setLastModified(p0.lastModified());
       }
       return;
    }
    public static void u0(File p0,Collection p1){
       String b;
       FileOutputStream uFileOutputS = b.d0(p0, false);
       BufferedOutputStream uBufferedOut = new BufferedOutputStream(uFileOutputS);
       Charset uCharset = a.a(null);
       if (p1 == null) {
       }else {
          b = c.b;
          uCharset = a.b(uCharset);
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj != null) {
                uBufferedOut.write((obj.toString()).getBytes(uCharset));
             }
             uBufferedOut.write(b.getBytes(uCharset));
          }
       }
       uBufferedOut.flush();
       uFileOutputS.close();
       p.d(uFileOutputS);
       return;
    }
    public static boolean v(String p0,String p1){
       boolean b;
       IOCase sENSITIVE = IOCase.SENSITIVE;
       if (p0 == null || p1 == null) {
          b = (p0 == null && p1 == null)? true: false;
       }else {
          b = sENSITIVE.checkEquals(p0, p1);
       }
       return b;
    }
    public static void v0(File p0,String p1){
       b.w0(p0, p1, Charset.defaultCharset(), false);
    }
    public static String w(File p0){
       InputStream inputStream;
       String str = null;
       try{
          try{
             FileInputStream uFileInputSt = new FileInputStream(p0);
             byte[] uobyteArray = new byte[uFileInputSt.available()];
             uFileInputSt.read(uobyteArray);
             str = Base64.encodeToString(uobyteArray, 2);
          label_001e :
             p.c(inputStream);
             return str;
          }catch(java.lang.Exception e3){
          }
          e3.printStackTrace();
          goto label_001e ;
       }catch(java.lang.Exception e3){
          inputStream = str;
          goto label_001b ;
       }
    }
    public static void w0(File p0,String p1,Charset p2,boolean p3){
       FileOutputStream uFileOutputS = b.d0(p0, p3);
       c.u(p1, uFileOutputS, p2);
       uFileOutputS.close();
       p.d(uFileOutputS);
    }
    public static void x(File p0){
       boolean b;
       if (p0.isDirectory()) {
          b.p(p0);
       }else {
          b = p0.exists();
          if (!p0.delete()) {
             if (!b) {
                throw new FileNotFoundException("File does not exist: "+p0);
             }else {
                throw new IOException("Unable to delete file: "+p0);
             }
          }
       }
       return;
    }
    public static void y(File p0){
       if (p0.exists()) {
          if (!p0.isDirectory()) {
             throw new IOException("File "+p0+" exists and is not a directory. Unable to create directory.");
          }
       }else if(p0.mkdirs() || p0.isDirectory()){
          throw new IOException("Unable to create directory "+p0);
       }
       return;
    }
    public static String z(String p0){
       if (p0 == null) {
          return null;
       }
       int i = b.H(p0);
       if (i == -1) {
          return "";
       }
       return p0.substring((i + 1));
    }
}
