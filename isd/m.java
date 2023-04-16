package isd.m;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.nio.CharBuffer;
import java.lang.StringBuilder;
import java.nio.charset.CharsetDecoder;
import java.nio.Buffer;
import java.nio.charset.CoderResult;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.lang.CharSequence;

public final class m	// class@001510
{
    public static CharsetDecoder a;
    public static boolean b;
    public static final byte[] c;
    public static final char[] d;
    public static final ByteBuffer e;
    public static final CharBuffer f;
    public static final StringBuilder g;
    public static final m h;

    static {
       m.h = new m();
       byte[] uobyteArray = new byte[32];
       m.c = uobyteArray;
       char[] uocharArray = new char[32];
       m.d = uocharArray;
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       a.o(uByteBuffer, "ByteBuffer.wrap\(bytes\)");
       m.e = uByteBuffer;
       CharBuffer uCharBuffer = CharBuffer.wrap(uocharArray);
       a.o(uCharBuffer, "CharBuffer.wrap\(chars\)");
       m.f = uCharBuffer;
       m.g = "";
    }
    public void m(){
       super();
    }
    public static final CharsetDecoder a(m p0){
       CharsetDecoder a = m.a;
       if (a == null) {
          a.S("decoder");
       }
       return a;
    }
    public static final void b(m p0,CharsetDecoder p1){
       m.a = p1;
    }
    public final int c(){
       ByteBuffer e = m.e;
       e.compact();
       e.position(0);
       return e.position();
    }
    public final int d(boolean p0){
       CharBuffer f;
       int i;
       CharsetDecoder a = m.a;
       while (a == null) {
          a.S("decoder");
          break ;
          char[] d = m.d;
          i = i - 1;
          StringBuilder str = m.g+d;
          f.position(0);
          f.limit(32);
          f.put(d[i]);
       }
       f = m.f;
       CoderResult uCoderResult = a.decode(m.e, f, p0);
       a.o(uCoderResult, "decoder.decode\(byteBuf, charBuf, endOfInput\)");
       if (uCoderResult.isError()) {
          this.g();
          uCoderResult.throwException();
       }
       i = f.position();
       if (!uCoderResult.isOverflow()) {
          return i;
       }else {
          goto label_002d ;
       }
    }
    public final int e(int p0,int p1){
       ByteBuffer e = m.e;
       e.limit(p0);
       m.f.position(p1);
       p0 = this.d(true);
       CharsetDecoder a = m.a;
       if (a == null) {
          a.S("decoder");
       }
       a.reset();
       e.position(0);
       return p0;
    }
    public synchronized final String f(InputStream p0,Charset p1){
       CharsetDecoder a;
       int i4;
       StringBuilder g;
       String str;
       a.p(p0, "inputStream");
       a.p(p1, "charset");
       a = m.a;
       int i = 1;
       if (a != null) {
          if (a == null) {
             a.S("decoder");
          }
          if (!(a.g(a.charset(), p1) ^ i)) {
          label_0025 :
             int i1 = 0;
             int i2 = 0;
             while (true) {
                int i3 = p0.read();
                if (i3 == -1) {
                   i4 = (!m.g.length())? 1: 0;
                   if (i4 && (!i1 && !i2)) {
                      return null;
                   }else {
                      i4 = this.e(i1, i2);
                   label_007a :
                      if (i4 > 0) {
                         char[] d = m.d;
                         if (d[(i4 - 1)] == 10) {
                            i4--;
                            if (i4 > 0 && d[(i4 - 1)] == 13) {
                               i4--;
                            }
                         }
                      }
                      g = m.g;
                      if (g.length()) {
                         i = 0;
                      }
                      if (i) {
                         return new String(m.d, 0, i4);
                      }else {
                         g = g+m.d;
                         str = g;
                         a.o(str, "sb.toString\(\)");
                         if (g.length() > 32) {
                            this.h();
                            break ;
                         }
                         break ;
                      }
                   }
                }else {
                   int i5 = i1 + 1;
                   m.c[i1] = (byte)i3;
                   if (i3 != 10 && (i5 == 32 || !m.b)) {
                      ByteBuffer e = m.e;
                      e.limit(i5);
                      m.f.position(i2);
                      i2 = this.d(0);
                      if (i2 > 0) {
                         int i6 = i2 - 1;
                         if (m.d[i6] == 10) {
                            e.position(0);
                            i4 = i2;
                            goto label_007a ;
                         }
                      }
                      i1 = this.c();
                   }else {
                      i1 = i5;
                   }
                }
             }
             g.setLength(0);
             return str;
          }
       }
       this.i(p1);
       goto label_0025 ;
    }
    public final void g(){
       CharsetDecoder a = m.a;
       if (a == null) {
          a.S("decoder");
       }
       a.reset();
       m.e.position(0);
       (m.g).setLength(0);
       return;
    }
    public final void h(){
       StringBuilder g = m.g;
       g.setLength(32);
       g.trimToSize();
    }
    public final void i(Charset p0){
       CharsetDecoder a;
       CharsetDecoder uCharsetDeco = p0.newDecoder();
       a.o(uCharsetDeco, "charset.newDecoder\(\)");
       m.a = uCharsetDeco;
       ByteBuffer e = m.e;
       e.clear();
       CharBuffer f = m.f;
       f.clear();
       e.put((byte)10);
       e.flip();
       a = m.a;
       if (a == null) {
          a.S("decoder");
       }
       boolean b = false;
       a.decode(e, f, b);
       if (f.position() == 1 && f.get(b) == 10) {
          b = true;
       }
       m.b = b;
       this.g();
       return;
    }
}
