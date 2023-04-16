package d3.d;
import d3.d$a;
import d3.d$b;
import java.lang.ThreadLocal;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.String;
import java.nio.charset.CharsetDecoder;
import java.nio.ByteOrder;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.nio.charset.CoderResult;
import java.lang.Error;
import java.lang.Throwable;

public class d	// class@001dfc
{
    public int a;
    public ByteBuffer b;
    public static final ThreadLocal c;
    public static final ThreadLocal d;
    public static final ThreadLocal e;

    static {
       d.c = new d$a();
       d.d = new d$b();
       d.e = new ThreadLocal();
    }
    public void d(){
       super();
    }
    public int a(int p0){
       return (p0 + this.b.getInt(p0));
    }
    public int b(int p0){
       d ta = this.a;
       int i = ta - this.b.getInt(ta);
       short shortx = (p0 < this.b.getShort(i))? this.b.getShort((i + p0)): 0;
       return shortx;
    }
    public String c(int p0){
       CharsetDecoder uCharsetDeco = d.c.get();
       uCharsetDeco.reset();
       p0 = p0 + this.b.getInt(p0);
       ByteBuffer uByteBuffer = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
       int intx = uByteBuffer.getInt(p0);
       p0 = p0 + 4;
       uByteBuffer.position(p0);
       uByteBuffer.limit((p0 + intx));
       float f = (float)intx;
       f = (int)(f * uCharsetDeco.maxCharsPerByte());
       ThreadLocal e = d.e;
       CharBuffer uCharBuffer = e.get();
       if (uCharBuffer == null || uCharBuffer.capacity() < f) {
          uCharBuffer = CharBuffer.allocate(f);
          e.set(uCharBuffer);
       }
       uCharBuffer.clear();
       try{
          f = 1;
          CoderResult uCoderResult = uCharsetDeco.decode(uByteBuffer, uCharBuffer, f);
          if (!uCoderResult.isUnderflow()) {
             uCoderResult.throwException();
          }
          return uCharBuffer.flip().toString();
       }catch(java.nio.charset.CharacterCodingException e6){
          throw new Error(e6);
       }
    }
    public int d(int p0){
       p0 = p0 + this.a;
       return ((p0 + this.b.getInt(p0)) + 4);
    }
    public int e(int p0){
       p0 = p0 + this.a;
       return this.b.getInt((p0 + this.b.getInt(p0)));
    }
}
