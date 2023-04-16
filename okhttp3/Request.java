package okhttp3.Request;
import okhttp3.Request$Builder;
import java.lang.Object;
import okhttp3.Headers;
import okhttp3.Headers$Builder;
import java.util.Map;
import okhttp3.internal.Util;
import okhttp3.RequestBody;
import okhttp3.CacheControl;
import java.lang.String;
import java.util.List;
import okhttp3.HttpUrl;
import java.lang.Class;
import java.lang.StringBuilder;

public final class Request	// class@00208d
{
    public final RequestBody body;
    public CacheControl cacheControl;
    public final Headers headers;
    public final String method;
    public final Map tags;
    public final HttpUrl url;

    public void Request(Request$Builder p0){
       super();
       this.url = p0.url;
       this.method = p0.method;
       this.headers = p0.headers.build();
       this.body = p0.body;
       this.tags = Util.immutableMap(p0.tags);
    }
    public RequestBody body(){
       return this.body;
    }
    public CacheControl cacheControl(){
       Request tcacheContro = this.cacheControl;
       if (tcacheContro != null) {
       }else {
          tcacheContro = CacheControl.parse(this.headers);
          this.cacheControl = tcacheContro;
       }
       return tcacheContro;
    }
    public String header(String p0){
       return this.headers.get(p0);
    }
    public List headers(String p0){
       return this.headers.values(p0);
    }
    public Headers headers(){
       return this.headers;
    }
    public boolean isHttps(){
       return this.url.isHttps();
    }
    public String method(){
       return this.method;
    }
    public Request$Builder newBuilder(){
       return new Request$Builder(this);
    }
    public Object tag(){
       return this.tag(Object.class);
    }
    public Object tag(Class p0){
       return p0.cast(this.tags.get(p0));
    }
    public String toString(){
       return "Request{method="+this.method+", url="+this.url+", tags="+this.tags+'}';
    }
    public HttpUrl url(){
       return this.url;
    }
}
