package ag8.b;
import java.lang.String;
import java.lang.Throwable;
import java.nio.ByteBuffer;
import java.util.Map;

public interface abstract b	// class@00008d
{

    void onClose(int p0,String p1);
    void onError(Throwable p0);
    void onMessage(String p0);
    void onMessage(ByteBuffer p0);
    void onOpen(Map p0);
}
