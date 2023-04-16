package kotlin.io.TextStreamsKt;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.Writer;
import java.io.BufferedWriter;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.l;
import wsd.m;
import java.util.Iterator;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import isd.n;
import kotlin.sequences.SequencesKt__SequencesKt;
import java.net.URL;
import java.io.InputStream;
import isd.a;
import java.util.List;
import java.util.ArrayList;
import kotlin.io.TextStreamsKt$readLines$1;
import java.io.StringWriter;
import java.nio.charset.Charset;
import zsd.d;
import java.io.StringReader;
import nsd.c0;
import fsd.l;

public final class TextStreamsKt	// class@001c97
{

    public static final BufferedReader a(Reader p0,int p1){
       if (p0 instanceof BufferedReader) {
       }else {
          BufferedReader uBufferedRea = new BufferedReader(p0, p1);
       }
       return p0;
    }
    public static final BufferedWriter b(Writer p0,int p1){
       if (p0 instanceof BufferedWriter) {
       }else {
          BufferedWriter uBufferedWri = new BufferedWriter(p0, p1);
       }
       return p0;
    }
    public static BufferedReader c(Reader p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 8192;
       }
       if (p0 instanceof BufferedReader) {
       }else {
          BufferedReader uBufferedRea = new BufferedReader(p0, p1);
       }
       return p0;
    }
    public static BufferedWriter d(Writer p0,int p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 8192;
       }
       if (p0 instanceof BufferedWriter) {
       }else {
          BufferedWriter uBufferedWri = new BufferedWriter(p0, p1);
       }
       return p0;
    }
    public static final long e(Reader p0,Writer p1,int p2){
       a.p(p0, "$this$copyTo");
       a.p(p1, "out");
       char[] uocharArray = new char[p2];
       long l = 0;
       for (int i = p0.read(uocharArray); i >= 0; i = p0.read(uocharArray)) {
          p1.write(uocharArray, 0, i);
          l = l + (long)i;
       }
       return l;
    }
    public static long f(Reader p0,Writer p1,int p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = 8192;
       }
       return TextStreamsKt.e(p0, p1, p2);
    }
    public static final void g(Reader p0,l p1){
       a.p(p0, "$this$forEachLine");
       a.p(p1, "action");
       if (p0 instanceof BufferedReader) {
       }else {
          BufferedReader uBufferedRea = new BufferedReader(p0, 8192);
       }
       Iterator iterator = TextStreamsKt.h(p0).iterator();
       while (iterator.hasNext()) {
          p1.invoke(iterator.next());
       }
       b.a(p0, null);
       return;
    }
    public static final m h(BufferedReader p0){
       a.p(p0, "$this$lineSequence");
       return SequencesKt__SequencesKt.i(new n(p0));
    }
    public static final byte[] i(URL p0){
       a.p(p0, "$this$readBytes");
       InputStream inputStream = p0.openStream();
       a.o(inputStream, "it");
       b.a(inputStream, null);
       return a.p(inputStream);
    }
    public static final List j(Reader p0){
       a.p(p0, "$this$readLines");
       ArrayList uArrayList = new ArrayList();
       TextStreamsKt.g(p0, new TextStreamsKt$readLines$1(uArrayList));
       return uArrayList;
    }
    public static final String k(Reader p0){
       a.p(p0, "$this$readText");
       StringWriter stringWriter = new StringWriter();
       TextStreamsKt.f(p0, stringWriter, 0, 2, null);
       String str = stringWriter.toString();
       a.o(str, "buffer.toString\(\)");
       return str;
    }
    public static final String l(URL p0,Charset p1){
       return new String(TextStreamsKt.i(p0), p1);
    }
    public static String m(URL p0,Charset p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = d.a;
       }
       return new String(TextStreamsKt.i(p0), p1);
    }
    public static final StringReader n(String p0){
       return new StringReader(p0);
    }
    public static final Object o(Reader p0,l p1){
       a.p(p0, "$this$useLines");
       a.p(p1, "block");
       if (p0 instanceof BufferedReader) {
       }else {
          BufferedReader uBufferedRea = new BufferedReader(p0, 8192);
       }
       p1 = p1.invoke(TextStreamsKt.h(p0));
       c0.d(1);
       if (l.a(1, 1, 0)) {
          b.a(p0, null);
       }else {
          p0.close();
       }
       c0.c(1);
       return p1;
    }
}
