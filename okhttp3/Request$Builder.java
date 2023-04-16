package okhttp3.Request$Builder;
import java.lang.Object;
import java.util.Map;
import java.util.Collections;
import okhttp3.Headers$Builder;
import okhttp3.Request;
import java.util.LinkedHashMap;
import okhttp3.Headers;
import java.lang.String;
import java.lang.IllegalStateException;
import okhttp3.CacheControl;
import okhttp3.internal.Util;
import okhttp3.RequestBody;
import java.util.Objects;
import okhttp3.internal.http.HttpMethod;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Class;
import okhttp3.HttpUrl;
import java.net.URL;

public class Request$Builder	// class@00208c
{
    public RequestBody body;
    public Headers$Builder headers;
    public String method;
    public Map tags;
    public HttpUrl url;

    public void Request$Builder(){
       super();
       this.tags = Collections.emptyMap();
       this.method = "GET";
       this.headers = new Headers$Builder();
    }
    public void Request$Builder(Request p0){
       super();
       this.tags = Collections.emptyMap();
       this.url = p0.url;
       this.method = p0.method;
       this.body = p0.body;
       Map map = (p0.tags.isEmpty())? Collections.emptyMap(): new LinkedHashMap(p0.tags);
       this.tags = map;
       this.headers = p0.headers.newBuilder();
       return;
    }
    public Request$Builder addHeader(String p0,String p1){
       this.headers.add(p0, p1);
       return this;
    }
    public Request build(){
       if (this.url != null) {
          return new Request(this);
       }
       throw new IllegalStateException("url == null");
    }
    public Request$Builder cacheControl(CacheControl p0){
       String str = p0.toString();
       if (str.isEmpty()) {
          return this.removeHeader("Cache-Control");
       }
       return this.header("Cache-Control", str);
    }
    public Request$Builder delete(){
       return this.delete(Util.EMPTY_REQUEST);
    }
    public Request$Builder delete(RequestBody p0){
       return this.method("DELETE", p0);
    }
    public Request$Builder get(){
       return this.method("GET", null);
    }
    public Request$Builder head(){
       return this.method("HEAD", null);
    }
    public Request$Builder header(String p0,String p1){
       this.headers.set(p0, p1);
       return this;
    }
    public Request$Builder headers(Headers p0){
       this.headers = p0.newBuilder();
       return this;
    }
    public Request$Builder method(String p0,RequestBody p1){
       Objects.requireNonNull(p0, "method == null");
       if (!p0.length()) {
          throw new IllegalArgumentException("method.length\(\) == 0");
       }
       if (p1 != null && !HttpMethod.permitsRequestBody(p0)) {
          throw new IllegalArgumentException("method "+p0+" must not have a request body.");
       }
       if (p1 == null && HttpMethod.requiresRequestBody(p0)) {
          throw new IllegalArgumentException("method "+p0+" must have a request body.");
       }
       this.method = p0;
       this.body = p1;
       return this;
    }
    public Request$Builder patch(RequestBody p0){
       return this.method("PATCH", p0);
    }
    public Request$Builder post(RequestBody p0){
       return this.method("POST", p0);
    }
    public Request$Builder put(RequestBody p0){
       return this.method("PUT", p0);
    }
    public Request$Builder removeHeader(String p0){
       this.headers.removeAll(p0);
       return this;
    }
    public Request$Builder tag(Class p0,Object p1){
       Objects.requireNonNull(p0, "type == null");
       if (p1 == null) {
          this.tags.remove(p0);
       }else if(this.tags.isEmpty()){
          this.tags = new LinkedHashMap();
       }
       this.tags.put(p0, p0.cast(p1));
       return this;
    }
    public Request$Builder tag(Object p0){
       return this.tag(Object.class, p0);
    }
    public Request$Builder url(String p0){
       Objects.requireNonNull(p0, "url == null");
       if ((p0).regionMatches(true, 0, "ws:", 0, 3)) {
          p0 = "http:"+p0.substring(3);
       }else if((p0).regionMatches(true, 0, "wss:", 0, 4)){
          p0 = "https:"+p0.substring(4);
       }
       return this.url(HttpUrl.get(p0));
    }
    public Request$Builder url(URL p0){
       Objects.requireNonNull(p0, "url == null");
       return this.url(HttpUrl.get(p0.toString()));
    }
    public Request$Builder url(HttpUrl p0){
       Objects.requireNonNull(p0, "url == null");
       this.url = p0;
       return this;
    }
}
