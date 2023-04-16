package j0.k;
import java.nio.ByteBuffer;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class k	// class@00199a
{

    public static void a(ByteBuffer p0){
       if (p0.isDirect()) {
          return;
       }
       throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
    }
    public static void b(ByteBuffer p0){
       if (p0.hasRemaining()) {
          return;
       }
       throw new IllegalArgumentException("ByteBuffer is already full.");
    }
}
