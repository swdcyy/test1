package okhttp3.internal.Internal;
import java.lang.Object;
import okhttp3.OkHttpClient;
import okhttp3.Headers$Builder;
import java.lang.String;
import okhttp3.ConnectionSpec;
import javax.net.ssl.SSLSocket;
import okhttp3.Response$Builder;
import okhttp3.ConnectionPool;
import okhttp3.internal.connection.RealConnection;
import okhttp3.Address;
import okhttp3.internal.connection.StreamAllocation;
import java.net.Socket;
import okhttp3.Route;
import java.lang.IllegalArgumentException;
import okhttp3.Request;
import okhttp3.Call;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.OkHttpClient$Builder;
import okhttp3.internal.cache.InternalCache;
import java.io.IOException;

public abstract class Internal	// class@00209c
{
    public static Internal instance;

    public void Internal(){
       super();
    }
    public static void initializeInstanceForTests(){
       OkHttpClient okHttpClient = new OkHttpClient();
    }
    public abstract void addLenient(Headers$Builder p0,String p1);
    public abstract void addLenient(Headers$Builder p0,String p1,String p2);
    public abstract void apply(ConnectionSpec p0,SSLSocket p1,boolean p2);
    public abstract int code(Response$Builder p0);
    public abstract boolean connectionBecameIdle(ConnectionPool p0,RealConnection p1);
    public abstract Socket deduplicate(ConnectionPool p0,Address p1,StreamAllocation p2);
    public abstract boolean equalsNonHost(Address p0,Address p1);
    public abstract RealConnection get(ConnectionPool p0,Address p1,StreamAllocation p2,Route p3);
    public abstract boolean isInvalidHttpUrlHost(IllegalArgumentException p0);
    public abstract Call newWebSocketCall(OkHttpClient p0,Request p1);
    public abstract void put(ConnectionPool p0,RealConnection p1);
    public abstract RouteDatabase routeDatabase(ConnectionPool p0);
    public abstract void setCache(OkHttpClient$Builder p0,InternalCache p1);
    public abstract StreamAllocation streamAllocation(Call p0);
    public abstract IOException timeoutExit(Call p0,IOException p1);
}
