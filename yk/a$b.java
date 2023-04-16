package yk.a$b;
import yk.a$a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class a$b extends a$a	// class@0028c3
{
    public static final a$b a;

    static {
       a$b.a = new a$b();
    }
    public void a$b(){
       super();
    }
    public ByteBuffer a(int p0){
       return ByteBuffer.allocate(p0).order(ByteOrder.LITTLE_ENDIAN);
    }
}
