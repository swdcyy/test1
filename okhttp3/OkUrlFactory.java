package okhttp3.OkUrlFactory;
import java.net.URLStreamHandlerFactory;
import java.lang.Cloneable;
import okhttp3.OkHttpClient;
import java.lang.Object;
import java.lang.String;
import java.net.URLStreamHandler;
import okhttp3.OkUrlFactory$1;
import java.net.URL;
import java.net.HttpURLConnection;
import java.net.Proxy;
import okhttp3.OkHttpClient$Builder;
import okhttp3.internal.huc.OkHttpURLConnection;
import okhttp3.internal.URLFilter;
import okhttp3.internal.huc.OkHttpsURLConnection;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class OkUrlFactory implements URLStreamHandlerFactory, Cloneable	// class@001f59
{
    public OkHttpClient client;
    public URLFilter urlFilter;

    public void OkUrlFactory(OkHttpClient p0){
       super();
       this.client = p0;
    }
    public OkHttpClient client(){
       return this.client;
    }
    public Object clone(){
       return this.clone();
    }
    public OkUrlFactory clone(){
       return new OkUrlFactory(this.client);
    }
    public URLStreamHandler createURLStreamHandler(String p0){
       if (!p0.equals("http") && !p0.equals("https")) {
          return null;
       }
       return new OkUrlFactory$1(this, p0);
    }
    public HttpURLConnection open(URL p0){
       return this.open(p0, this.client.proxy());
    }
    public HttpURLConnection open(URL p0,Proxy p1){
       String protocol = p0.getProtocol();
       OkHttpClient okHttpClient = this.client.newBuilder().proxy(p1).build();
       if (protocol.equals("http")) {
          return new OkHttpURLConnection(p0, okHttpClient, this.urlFilter);
       }
       if (protocol.equals("https")) {
          return new OkHttpsURLConnection(p0, okHttpClient, this.urlFilter);
       }
       throw new IllegalArgumentException("Unexpected protocol: "+protocol);
    }
    public OkUrlFactory setClient(OkHttpClient p0){
       this.client = p0;
       return this;
    }
    public void setUrlFilter(URLFilter p0){
       this.urlFilter = p0;
    }
}
