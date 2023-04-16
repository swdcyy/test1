package okhttp3.WebSocketListener;
import java.lang.Object;
import okhttp3.WebSocket;
import java.lang.String;
import java.lang.Throwable;
import okhttp3.Response;
import okio.ByteString;

public abstract class WebSocketListener	// class@001f6a
{

    public void WebSocketListener(){
       super();
    }
    public void onClosed(WebSocket p0,int p1,String p2){
    }
    public void onClosing(WebSocket p0,int p1,String p2){
    }
    public void onFailure(WebSocket p0,Throwable p1,Response p2){
    }
    public void onMessage(WebSocket p0,String p1){
    }
    public void onMessage(WebSocket p0,ByteString p1){
    }
    public void onOpen(WebSocket p0,Response p1){
    }
}
