package isd.a;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.lang.Object;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import zsd.d;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.String;
import java.io.ByteArrayInputStream;
import java.util.Objects;
import kotlin.jvm.internal.a;
import trd.q;
import isd.a$a;
import java.io.ByteArrayOutputStream;
import java.lang.Math;

public final class a	// class@001980
{

    public static final BufferedInputStream a(InputStream p0,int p1){
       if (p0 instanceof BufferedInputStream) {
       }else {
          BufferedInputStream uBufferedInp = new BufferedInputStream(p0, p1);
       }
       return p0;
    }
    public static final BufferedOutputStream b(OutputStream p0,int p1){
       if (p0 instanceof BufferedOutputStream) {
       }else {
          BufferedOutputStream uBufferedOut = new BufferedOutputStream(p0, p1);
       }
       return p0;
    }
    public static BufferedInputStream c(InputStream p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 8192;
       }
       if (p0 instanceof BufferedInputStream) {
       }else {
          BufferedInputStream uBufferedInp = new BufferedInputStream(p0, p1);
       }
       return p0;
    }
    public static BufferedOutputStream d(OutputStream p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 8192;
       }
       if (p0 instanceof BufferedOutputStream) {
       }else {
          BufferedOutputStream uBufferedOut = new BufferedOutputStream(p0, p1);
       }
       return p0;
    }
    public static final BufferedReader e(InputStream p0,Charset p1){
       InputStreamReader inputStreamR = new InputStreamReader(p0, p1);
       if (inputStreamR instanceof BufferedReader) {
       }else {
          inputStreamR = new BufferedReader(inputStreamR, 8192);
       }
       return inputStreamR;
    }
    public static BufferedReader f(InputStream p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       InputStreamReader inputStreamR = new InputStreamReader(p0, p1);
       if (inputStreamR instanceof BufferedReader) {
       }else {
          inputStreamR = new BufferedReader(inputStreamR, 8192);
       }
       return inputStreamR;
    }
    public static final BufferedWriter g(OutputStream p0,Charset p1){
       OutputStreamWriter outputStream = new OutputStreamWriter(p0, p1);
       if (outputStream instanceof BufferedWriter) {
       }else {
          outputStream = new BufferedWriter(outputStream, 8192);
       }
       return outputStream;
    }
    public static BufferedWriter h(OutputStream p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       OutputStreamWriter outputStream = new OutputStreamWriter(p0, p1);
       if (outputStream instanceof BufferedWriter) {
       }else {
          outputStream = new BufferedWriter(outputStream, 8192);
       }
       return outputStream;
    }
    public static final ByteArrayInputStream i(String p0,Charset p1){
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       byte[] bytes = p0.getBytes(p1);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       return new ByteArrayInputStream(bytes);
    }
    public static ByteArrayInputStream j(String p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type java.lang.String");
       byte[] bytes = p0.getBytes(p1);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       return new ByteArrayInputStream(bytes);
    }
    public static final long k(InputStream p0,OutputStream p1,int p2){
       a.p(p0, "$this$copyTo");
       a.p(p1, "out");
       byte[] uobyteArray = new byte[p2];
       long l = 0;
       for (int i = p0.read(uobyteArray); i >= 0; i = p0.read(uobyteArray)) {
          p1.write(uobyteArray, 0, i);
          l = l + (long)i;
       }
       return l;
    }
    public static long l(InputStream p0,OutputStream p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = 8192;
       }
       return a.k(p0, p1, p2);
    }
    public static final ByteArrayInputStream m(byte[] p0){
       return new ByteArrayInputStream(p0);
    }
    public static final ByteArrayInputStream n(byte[] p0,int p1,int p2){
       return new ByteArrayInputStream(p0, p1, p2);
    }
    public static final q o(BufferedInputStream p0){
       a.p(p0, "$this$iterator");
       return new a$a(p0);
    }
    public static final byte[] p(InputStream p0){
       a.p(p0, "$this$readBytes");
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(Math.max(8192, p0.available()));
       a.l(p0, uByteArrayOu, 0, 2, null);
       byte[] uobyteArray = uByteArrayOu.toByteArray();
       a.o(uobyteArray, "buffer.toByteArray\(\)");
       return uobyteArray;
    }
    public static final byte[] q(InputStream p0,int p1){
       a.p(p0, "$this$readBytes");
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream(Math.max(p1, p0.available()));
       a.l(p0, uByteArrayOu, 0, 2, null);
       byte[] uobyteArray = uByteArrayOu.toByteArray();
       a.o(uobyteArray, "buffer.toByteArray\(\)");
       return uobyteArray;
    }
    public static byte[] r(InputStream p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 8192;
       }
       return a.q(p0, p1);
    }
    public static final InputStreamReader s(InputStream p0,Charset p1){
       return new InputStreamReader(p0, p1);
    }
    public static InputStreamReader t(InputStream p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       return new InputStreamReader(p0, p1);
    }
    public static final OutputStreamWriter u(OutputStream p0,Charset p1){
       return new OutputStreamWriter(p0, p1);
    }
    public static OutputStreamWriter v(OutputStream p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       return new OutputStreamWriter(p0, p1);
    }
}
