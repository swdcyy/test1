package ne.b;
import java.lang.Object;
import ne.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.nio.ByteBuffer;
import java.lang.StringBuilder;

public class b	// class@0026f5
{
    public long a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public void b(){
       super();
       this.a = 0x12345678;
       this.b = 0;
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = 0;
       this.g = 0;
    }
    public void b(int p0,int p1,int p2,int p3,int p4,int p5,b$a p6){
       super();
       this.a = 0x12345678;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
    }
    public static b a(byte[] p0){
       b obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       ByteBuffer uByteBuffer = ByteBuffer.wrap(p0);
       obj.a = uByteBuffer.getLong();
       obj.b = uByteBuffer.getInt();
       obj.c = uByteBuffer.getInt();
       obj.d = uByteBuffer.getInt();
       obj.e = uByteBuffer.getInt();
       obj.f = uByteBuffer.getInt();
       obj.g = uByteBuffer.getInt();
       return obj;
    }
    public int b(){
       return this.d;
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "dataSize:"+this.d+";crc:"+this.c+";version:"+this.e+";v8version:"+this.f;
    }
}
