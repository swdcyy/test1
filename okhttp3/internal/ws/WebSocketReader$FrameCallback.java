package okhttp3.internal.ws.WebSocketReader$FrameCallback;
import java.lang.String;
import okio.ByteString;

public interface abstract WebSocketReader$FrameCallback	// class@001fde
{

    void onReadClose(int p0,String p1);
    void onReadMessage(String p0);
    void onReadMessage(ByteString p0);
    void onReadPing(ByteString p0);
    void onReadPong(ByteString p0);
}
