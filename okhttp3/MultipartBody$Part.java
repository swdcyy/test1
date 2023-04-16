package okhttp3.MultipartBody$Part;
import okhttp3.Headers;
import okhttp3.RequestBody;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.IllegalArgumentException;
import okhttp3.MediaType;
import java.lang.StringBuilder;
import okhttp3.MultipartBody;
import okhttp3.Headers$Builder;

public final class MultipartBody$Part	// class@001f53
{
    public final RequestBody body;
    public final Headers headers;

    public void MultipartBody$Part(Headers p0,RequestBody p1){
       super();
       this.headers = p0;
       this.body = p1;
    }
    public static MultipartBody$Part create(Headers p0,RequestBody p1){
       Objects.requireNonNull(p1, "body == null");
       if (p0 != null && p0.get("Content-Type") != null) {
          throw new IllegalArgumentException("Unexpected header: Content-Type");
       }
       if (p0 == null || p0.get("Content-Length") == null) {
          return new MultipartBody$Part(p0, p1);
       }
       throw new IllegalArgumentException("Unexpected header: Content-Length");
    }
    public static MultipartBody$Part create(RequestBody p0){
       return MultipartBody$Part.create(null, p0);
    }
    public static MultipartBody$Part createFormData(String p0,String p1){
       return MultipartBody$Part.createFormData(p0, null, RequestBody.create(null, p1));
    }
    public static MultipartBody$Part createFormData(String p0,String p1,RequestBody p2){
       Objects.requireNonNull(p0, "name == null");
       String str = "form-data; name=";
       MultipartBody.appendQuotedString(str, p0);
       if (p1 != null) {
          str = str+"; filename=";
          MultipartBody.appendQuotedString(str, p1);
       }
       return MultipartBody$Part.create(new Headers$Builder().addUnsafeNonAscii("Content-Disposition", str).build(), p2);
    }
    public RequestBody body(){
       return this.body;
    }
    public Headers headers(){
       return this.headers;
    }
}
