package yk.b;
import yk.b$a;
import java.lang.Object;
import com.google.flatbuffers.a;
import java.nio.ByteBuffer;
import java.lang.String;
import java.nio.ByteOrder;
import java.nio.Buffer;

public class b	// class@0028c6
{
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;
    public a e;
    public static final ThreadLocal f;

    static {
       b.f = new b$a();
    }
    public void b(){
       super();
       this.e = a.d();
    }
    public int a(int p0){
       return (p0 + this.b.getInt(p0));
    }
    public int b(int p0){
       short shortx = (p0 < this.d)? this.b.getShort((this.c + p0)): 0;
       return shortx;
    }
    public String c(int p0){
       p0 = p0 + this.b.getInt(p0);
       int intx = this.b.getInt(p0);
       return this.e.a(this.b, (p0 + 4), intx);
    }
    public int d(int p0){
       p0 = p0 + this.a;
       return ((p0 + this.b.getInt(p0)) + 4);
    }
    public ByteBuffer e(int p0,int p1){
       p0 = this.b(p0);
       if (!p0) {
          return null;
       }
       ByteBuffer uByteBuffer = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
       int i = this.d(p0);
       uByteBuffer.position(i);
       uByteBuffer.limit((i + (this.f(p0) * p1)));
       return uByteBuffer;
    }
    public int f(int p0){
       p0 = p0 + this.a;
       return this.b.getInt((p0 + this.b.getInt(p0)));
    }
}
