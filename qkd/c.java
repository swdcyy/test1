package qkd.c;
import java.io.File;
import org.apache.internal.commons.io.output.StringBuilderWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.String;
import java.lang.StringBuilder;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.OutOfMemoryError;
import java.lang.StackOverflowError;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.Throwable;
import java.io.FileReader;
import ekd.p;
import java.lang.Exception;
import ekd.e0;
import android.content.res.AssetManager;
import android.content.Context;
import com.kwai.plugin.dva.split.SplitAssetHelper;
import java.nio.charset.Charset;
import iud.a;
import java.util.List;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.lang.Object;
import java.io.Serializable;
import java.io.ObjectInputStream;
import org.apache.internal.commons.io.output.a;
import java.lang.IllegalArgumentException;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class c	// class@00229a
{
    public static final char a;
    public static final String b;
    public static char[] c;
    public static byte[] d;

    static {
       c.a = File.separatorChar;
       StringBuilderWriter stringBuilde = new StringBuilderWriter(4);
       PrintWriter printWriter = new PrintWriter(stringBuilde);
       printWriter.println();
       c.b = stringBuilde.toString();
       printWriter.close();
    }
    public static void a(String p0){
       File uFile = new File(p0);
       if (uFile.exists() && uFile.isDirectory()) {
          String[] stringArray = uFile.list();
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray[i];
             String separator = File.separator;
             String str = (p0.endsWith(separator))? p0+oobject: p0+separator+oobject;
             File uFile1 = new File(str);
             if (uFile1.isFile()) {
                uFile1.delete();
             }
             if (uFile1.isDirectory()) {
                c.g(str);
             }
             i = i + 1;
          }
       }
       return;
    }
    public static int b(InputStream p0,OutputStream p1){
       long l = c.e(p0, p1);
       if (l - 0x7fffffff > 0) {
          return -1;
       }
       return (int)l;
    }
    public static boolean c(File p0,File p1){
       if (p0.exists() && p0.isFile()) {
          if (p1.isDirectory()) {
             return false;
          }
          if (p1.exists()) {
             p1.delete();
          }
          int i = 2048;
          try{
             byte[] uobyteArray = new byte[i];
             BufferedInputStream uBufferedInp = new BufferedInputStream(new FileInputStream(p0));
             BufferedOutputStream uBufferedOut = new BufferedOutputStream(new FileOutputStream(p1));
             int i1 = uBufferedInp.read(uobyteArray);
             while (i1 != -1) {
                uBufferedOut.write(uobyteArray, false, i1);
             }
             uBufferedInp.close();
             uBufferedOut.flush();
             uBufferedOut.close();
             return true;
          }catch(java.io.IOException e4){
             e4.printStackTrace();
          }
       label_004f :
          return false;
       }else {
          goto label_004f ;
       }
    }
    public static boolean d(String p0,String p1){
       return c.c(new File(p0), new File(p1));
    }
    public static long e(InputStream p0,OutputStream p1){
       byte[] uobyteArray = new byte[4096];
       long l = 0;
       int i = p0.read(uobyteArray);
       while (-1 != i) {
          p1.write(uobyteArray, 0, i);
          l = l + (long)i;
       }
       return l;
    }
    public static void f(String p0){
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       File uFile = new File(p0);
       if (uFile.exists() && uFile.isFile()) {
          uFile.delete();
       }
       return;
    }
    public static void g(String p0){
       File uFile = new File(p0);
       if (!uFile.exists()) {
          return;
       }
       if (uFile.isFile()) {
          uFile.delete();
          return;
       }else {
          String[] stringArray = uFile.list();
          if (stringArray == null) {
             return;
          }
          int len = stringArray.length;
          int i = 0;
          while (i < len) {
             object oobject = stringArray[i];
             if (oobject != null) {
                String separator = File.separator;
                String str = (p0.endsWith(separator))? p0+oobject: p0+separator+oobject;
                File uFile1 = new File(str);
                if (uFile1.isFile()) {
                   uFile1.delete();
                }
                if (uFile1.isDirectory()) {
                   c.g(str);
                }
             }
             i = i + 1;
          }
          uFile.delete();
          return;
       }
    }
    public static void h(String p0){
       c.f(p0);
    }
    public static long i(String p0){
       if (TextUtils.isEmpty(p0)) {
          return 0;
       }
       File uFile = new File(p0);
       if (!uFile.exists()) {
          return 0;
       }
       long l = uFile.length();
       if (uFile.isDirectory()) {
          File[] uFileArray = uFile.listFiles();
          if (uFileArray != null) {
             int len = uFileArray.length;
             for (int i = 0; i < len; i = i + 1) {
                object oobject = uFileArray[i];
                try{
                   l = l + c.i(oobject.getAbsolutePath());
                }catch(java.lang.StackOverflowError e8){
                   e8.printStackTrace();
                   return 0;
                }catch(java.lang.OutOfMemoryError e8){
                   e8.printStackTrace();
                   return 0;
                }
             }
          }
       }
       return l;
    }
    public static String j(File p0){
       return c.k(new InputStreamReader(new BufferedInputStream(new FileInputStream(p0)), "UTF-8"));
    }
    public static String k(Reader p0){
       StringWriter stringWriter = new StringWriter();
       char[] uocharArray = new char[1024];
       int i = p0.read(uocharArray);
       while (i != -1) {
          stringWriter.write(uocharArray, 0, i);
       }
       stringWriter.close();
       p0.close();
       return stringWriter.toString();
    }
    public static String l(String p0){
       Reader reader = null;
       try{
          p.e(reader);
          return c.k(new FileReader(p0));
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          p.e(reader);
          return "";
       }
    }
    public static String m(String p0){
       InputStream inputStream = SplitAssetHelper.open(e0.b.getAssets(), p0);
       p.c(inputStream);
       return c.t(inputStream, a.b(Charset.defaultCharset()));
    }
    public static List n(InputStream p0,Charset p1){
       InputStreamReader inputStreamR = new InputStreamReader(p0, a.b(p1));
       if (inputStreamR instanceof BufferedReader) {
       }else {
          inputStreamR = new BufferedReader(inputStreamR);
       }
       ArrayList uArrayList = new ArrayList();
       for (String str = inputStreamR.readLine(); str != null; str = inputStreamR.readLine()) {
          uArrayList.add(str);
       }
       return uArrayList;
    }
    public static Serializable o(File p0){
       ObjectInputStream objectInputS = new ObjectInputStream(new BufferedInputStream(new FileInputStream(p0)));
       p.c(objectInputS);
       return objectInputS.readObject();
    }
    public static boolean p(byte[] p0,File p1){
       FileOutputStream uFileOutputS;
       OutputStream outputStream = null;
       try{
          if (!p1.exists()) {
             p1.createNewFile();
             uFileOutputS = new FileOutputStream(p1);
             BufferedOutputStream uBufferedOut = new BufferedOutputStream(uFileOutputS);
             uBufferedOut.write(p0);
             uBufferedOut.flush();
             p.d(uFileOutputS);
          }
       }catch(java.lang.Exception e0){
       }catch(java.lang.Exception e0){
          outputStream = uFileOutputS;
       }
       p.d(e0);
       boolean b = false;
    }
    public static byte[] q(InputStream p0){
       a uoa = new a(1024);
       c.b(p0, uoa);
       return uoa.c();
    }
    public static byte[] r(InputStream p0,long p1){
       byte[] uobyteArray;
       if (p1 - 0x7fffffff > 0) {
          throw new IllegalArgumentException("Size cannot be greater than Integer max value: "+p1);
       }
       int i = (int)p1;
       if (i < 0) {
          throw new IllegalArgumentException("Size must be equal or greater than zero: "+i);
       }
       int i1 = 0;
       if (!i) {
          uobyteArray = new byte[i1];
       }else {
          byte[] uobyteArray1 = new byte[i];
          while (i1 < i) {
             int i2 = i - i1;
             i2 = p0.read(uobyteArray1, i1, i2);
             if (i2 != -1) {
                i1 = i1 + i2;
             }else if(i1 == i){
                uobyteArray = uobyteArray1;
             }else {
                throw new IOException("Unexpected readed size. current: "+i1+", excepted: "+i);
             }
          }
       }
       return uobyteArray;
    }
    public static String s(InputStream p0){
       return c.t(p0, Charset.defaultCharset());
    }
    public static String t(InputStream p0,Charset p1){
       StringBuilderWriter stringBuilde = new StringBuilderWriter();
       InputStreamReader inputStreamR = new InputStreamReader(p0, a.b(p1));
       char[] uocharArray = new char[4096];
       int i = inputStreamR.read(uocharArray);
       while (-1 != i) {
          stringBuilde.write(uocharArray, 0, i);
       }
       return stringBuilde.toString();
    }
    public static void u(String p0,OutputStream p1,Charset p2){
       if (p0 != null) {
          p1.write(p0.getBytes(a.b(p2)));
       }
       return;
    }
    public static void v(String p0,String p1,boolean p2){
       File uFile = new File(p0);
       if (!uFile.exists()) {
          uFile.getParentFile().mkdirs();
          uFile.createNewFile();
       }
       FileWriter uFileWriter = new FileWriter(p0, p2);
       try{
          uFileWriter.write(p1);
          uFileWriter.close();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public static void w(byte[] p0,OutputStream p1){
       if (p0 != null) {
          p1.write(p0);
       }
       return;
    }
    public static void x(Serializable p0,File p1){
       ObjectOutputStream objectOutput = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(p1)));
       objectOutput.writeObject(p0);
       objectOutput.flush();
       p.d(objectOutput);
       return;
    }
}
