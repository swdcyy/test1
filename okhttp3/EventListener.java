package okhttp3.EventListener;
import okhttp3.EventListener$1;
import java.lang.Object;
import okhttp3.EventListener$Factory;
import okhttp3.EventListener$2;
import okhttp3.Call;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import okhttp3.Protocol;
import okhttp3.Connection;
import java.lang.String;
import java.util.List;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Handshake;

public abstract class EventListener	// class@002076
{
    public static final EventListener NONE;

    static {
       EventListener.NONE = new EventListener$1();
    }
    public void EventListener(){
       super();
    }
    public static EventListener$Factory factory(EventListener p0){
       return new EventListener$2(p0);
    }
    public void callEnd(Call p0){
    }
    public void callFailed(Call p0,IOException p1){
    }
    public void callStart(Call p0){
    }
    public void connectEnd(Call p0,InetSocketAddress p1,Proxy p2,Protocol p3){
    }
    public void connectFailed(Call p0,InetSocketAddress p1,Proxy p2,Protocol p3,IOException p4){
    }
    public void connectStart(Call p0,InetSocketAddress p1,Proxy p2){
    }
    public void connectionAcquired(Call p0,Connection p1){
    }
    public void connectionReleased(Call p0,Connection p1){
    }
    public void dnsEnd(Call p0,String p1,List p2){
    }
    public void dnsStart(Call p0,String p1){
    }
    public void requestBodyEnd(Call p0,long p1){
    }
    public void requestBodyStart(Call p0){
    }
    public void requestHeadersEnd(Call p0,Request p1){
    }
    public void requestHeadersStart(Call p0){
    }
    public void responseBodyEnd(Call p0,long p1){
    }
    public void responseBodyStart(Call p0){
    }
    public void responseHeadersEnd(Call p0,Response p1){
    }
    public void responseHeadersStart(Call p0){
    }
    public void secureConnectEnd(Call p0,Handshake p1){
    }
    public void secureConnectStart(Call p0){
    }
}
