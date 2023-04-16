package kotlin.io.FilesKt__FileReadWriteKt;
import isd.k;
import java.io.File;
import java.nio.charset.Charset;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.Object;
import zsd.d;
import msd.l;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.io.BufferedReader;
import java.io.Reader;
import wsd.m;
import kotlin.io.TextStreamsKt;
import nsd.c0;
import fsd.l;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import java.io.FileOutputStream;
import qrd.l1;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.Writer;
import msd.p;
import usd.q;
import java.lang.Integer;
import java.io.PrintWriter;
import java.util.Arrays;
import isd.f;
import java.io.ByteArrayOutputStream;
import isd.a;
import trd.n;
import java.lang.OutOfMemoryError;
import java.lang.StringBuilder;
import java.util.List;
import java.util.ArrayList;
import kotlin.io.FilesKt__FileReadWriteKt$readLines$1;

public class FilesKt__FileReadWriteKt extends k	// class@001c8f
{

    public void FilesKt__FileReadWriteKt(){
       super();
    }
    public static final InputStreamReader A(File p0,Charset p1){
       return new InputStreamReader(new FileInputStream(p0), p1);
    }
    public static InputStreamReader B(File p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       return new InputStreamReader(new FileInputStream(p0), p1);
    }
    public static final Object C(File p0,Charset p1,l p2){
       a.p(p0, "$this$useLines");
       a.p(p1, "charset");
       a.p(p2, "block");
       InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(p0), p1);
       if (inputStreamR instanceof BufferedReader) {
       }else {
          inputStreamR = new BufferedReader(inputStreamR, 8192);
       }
       p2 = p2.invoke(TextStreamsKt.h(inputStreamR));
       c0.d(1);
       if (l.a(1, 1, 0)) {
          b.a(inputStreamR, null);
       }else {
          inputStreamR.close();
       }
       c0.c(1);
       return p2;
    }
    public static Object D(File p0,Charset p1,l p2,int p3,Object p4){
       if (p3 & 1) {
          p1 = d.a;
       }
       a.p(p0, "$this$useLines");
       a.p(p1, "charset");
       a.p(p2, "block");
       p3 = 8192;
       InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(p0), p1);
       if (inputStreamR instanceof BufferedReader) {
       }else {
          inputStreamR = new BufferedReader(inputStreamR, p3);
       }
       p2 = p2.invoke(TextStreamsKt.h(inputStreamR));
       c0.d(1);
       if (l.a(1, 1, 0)) {
          b.a(inputStreamR, null);
       }else {
          inputStreamR.close();
       }
       c0.c(1);
       return p2;
    }
    public static final void E(File p0,byte[] p1){
       a.p(p0, "$this$writeBytes");
       a.p(p1, "array");
       FileOutputStream uFileOutputS = new FileOutputStream(p0);
       uFileOutputS.write(p1);
       b.a(uFileOutputS, null);
    }
    public static final void F(File p0,String p1,Charset p2){
       a.p(p0, "$this$writeText");
       a.p(p1, "text");
       a.p(p2, "charset");
       byte[] bytes = p1.getBytes(p2);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       FilesKt__FileReadWriteKt.E(p0, bytes);
    }
    public static void G(File p0,String p1,Charset p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = d.a;
       }
       FilesKt__FileReadWriteKt.F(p0, p1, p2);
       return;
    }
    public static final OutputStreamWriter H(File p0,Charset p1){
       return new OutputStreamWriter(new FileOutputStream(p0), p1);
    }
    public static OutputStreamWriter I(File p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       return new OutputStreamWriter(new FileOutputStream(p0), p1);
    }
    public static final void g(File p0,byte[] p1){
       a.p(p0, "$this$appendBytes");
       a.p(p1, "array");
       FileOutputStream uFileOutputS = new FileOutputStream(p0, true);
       uFileOutputS.write(p1);
       b.a(uFileOutputS, null);
    }
    public static final void h(File p0,String p1,Charset p2){
       a.p(p0, "$this$appendText");
       a.p(p1, "text");
       a.p(p2, "charset");
       byte[] bytes = p1.getBytes(p2);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       FilesKt__FileReadWriteKt.g(p0, bytes);
    }
    public static void i(File p0,String p1,Charset p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = d.a;
       }
       FilesKt__FileReadWriteKt.h(p0, p1, p2);
       return;
    }
    public static final BufferedReader j(File p0,Charset p1,int p2){
       InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(p0), p1);
       if (inputStreamR instanceof BufferedReader) {
       }else {
          inputStreamR = new BufferedReader(inputStreamR, p2);
       }
       return inputStreamR;
    }
    public static BufferedReader k(File p0,Charset p1,int p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = d.a;
       }
       if (p3 & 0x02) {
          p2 = 8192;
       }
       InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(p0), p1);
       if (inputStreamR instanceof BufferedReader) {
       }else {
          inputStreamR = new BufferedReader(inputStreamR, p2);
       }
       return inputStreamR;
    }
    public static final BufferedWriter l(File p0,Charset p1,int p2){
       OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(p0), p1);
       if (outputStream instanceof BufferedWriter) {
       }else {
          outputStream = new BufferedWriter(outputStream, p2);
       }
       return outputStream;
    }
    public static BufferedWriter m(File p0,Charset p1,int p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = d.a;
       }
       if (p3 & 0x02) {
          p2 = 8192;
       }
       OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(p0), p1);
       if (outputStream instanceof BufferedWriter) {
       }else {
          outputStream = new BufferedWriter(outputStream, p2);
       }
       return outputStream;
    }
    public static final void n(File p0,int p1,p p2){
       a.p(p0, "$this$forEachBlock");
       a.p(p2, "action");
       byte[] uobyteArray = new byte[q.n(p1, 512)];
       FileInputStream uFileInputSt = new FileInputStream(p0);
       int i = uFileInputSt.read(uobyteArray);
       while (i > 0) {
          p2.invoke(uobyteArray, Integer.valueOf(i));
       }
       b.a(uFileInputSt, null);
       return;
    }
    public static final void o(File p0,p p1){
       a.p(p0, "$this$forEachBlock");
       a.p(p1, "action");
       FilesKt__FileReadWriteKt.n(p0, 4096, p1);
    }
    public static final void p(File p0,Charset p1,l p2){
       a.p(p0, "$this$forEachLine");
       a.p(p1, "charset");
       a.p(p2, "action");
       TextStreamsKt.g(new BufferedReader(new InputStreamReader(new FileInputStream(p0), p1)), p2);
    }
    public static void q(File p0,Charset p1,l p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = d.a;
       }
       FilesKt__FileReadWriteKt.p(p0, p1, p2);
       return;
    }
    public static final FileInputStream r(File p0){
       return new FileInputStream(p0);
    }
    public static final FileOutputStream s(File p0){
       return new FileOutputStream(p0);
    }
    public static final PrintWriter t(File p0,Charset p1){
       OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(p0), p1);
       if (outputStream instanceof BufferedWriter) {
       }else {
          outputStream = new BufferedWriter(outputStream, 8192);
       }
       return new PrintWriter(outputStream);
    }
    public static PrintWriter u(File p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       OutputStreamWriter outputStream = new OutputStreamWriter(new FileOutputStream(p0), p1);
       if (outputStream instanceof BufferedWriter) {
       }else {
          outputStream = new BufferedWriter(outputStream, 8192);
       }
       return new PrintWriter(outputStream);
    }
    public static final byte[] v(File p0){
       a.p(p0, "$this$readBytes");
       FileInputStream uFileInputSt = new FileInputStream(p0);
       long l = p0.length();
       if (l - (long)Integer.MAX_VALUE > 0) {
          throw new OutOfMemoryError("File "+p0+" is too big \("+l+" bytes\) to fit in memory.");
       }
       int i = (int)l;
       byte[] uobyteArray = new byte[i];
       int i1 = i;
       int i2 = 0;
       while (i1 > 0) {
          int i3 = uFileInputSt.read(uobyteArray, i2, i1);
          if (i3 < 0) {
             break ;
          }else {
             i1 = i1 - i3;
             i2 = i2 + i3;
          }
       }
       if (i1 > 0) {
          uobyteArray = Arrays.copyOf(uobyteArray, i2);
          a.o(uobyteArray, "java.util.Arrays.copyOf\(this, newSize\)");
       }else {
          i1 = uFileInputSt.read();
          if (i1 != -1) {
             f uof = new f(8193);
             uof.write(i1);
             a.l(uFileInputSt, uof, 0, 2, null);
             i1 = uof.size() + i;
             if (i1 >= 0) {
                uobyteArray = Arrays.copyOf(uobyteArray, i1);
                a.o(uobyteArray, "java.util.Arrays.copyOf\(this, newSize\)");
                uobyteArray = n.W0(uof.a(), uobyteArray, i, 0, uof.size());
             }else {
                throw new OutOfMemoryError("File "+p0+" is too big to fit in memory.");
             }
          }
       }
       b.a(uFileInputSt, null);
       return uobyteArray;
    }
    public static final List w(File p0,Charset p1){
       a.p(p0, "$this$readLines");
       a.p(p1, "charset");
       ArrayList uArrayList = new ArrayList();
       FilesKt__FileReadWriteKt.p(p0, p1, new FilesKt__FileReadWriteKt$readLines$1(uArrayList));
       return uArrayList;
    }
    public static List x(File p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       return FilesKt__FileReadWriteKt.w(p0, p1);
    }
    public static final String y(File p0,Charset p1){
       a.p(p0, "$this$readText");
       a.p(p1, "charset");
       InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(p0), p1);
       b.a(inputStreamR, null);
       return TextStreamsKt.k(inputStreamR);
    }
    public static String z(File p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       return FilesKt__FileReadWriteKt.y(p0, p1);
    }
}
