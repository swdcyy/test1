package eb.g;
import java.io.OutputStream;
import com.facebook.common.memory.PooledByteBuffer;
import java.lang.Throwable;
import java.lang.RuntimeException;
import com.facebook.common.internal.e;

public abstract class g extends OutputStream	// class@001f14
{

    public void g(){
       super();
    }
    public abstract PooledByteBuffer a();
    public void close(){
       try{
          super.close();
          return;
       }catch(java.io.IOException e0){
          e.a(e0);
          throw null;
       }
    }
    public abstract int size();
}
