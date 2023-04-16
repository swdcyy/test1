package okhttp3.WebSocket;
import java.lang.String;
import okhttp3.Request;
import okio.ByteString;

public interface abstract WebSocket	// class@001f69
{

    void cancel();
    boolean close(int p0,String p1);
    long queueSize();
    Request request();
    boolean send(String p0);
    boolean send(ByteString p0);
}
