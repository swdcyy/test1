package okhttp3.MultipartBody$Builder;
import java.util.UUID;
import java.lang.String;
import java.lang.Object;
import okhttp3.MultipartBody;
import java.util.ArrayList;
import okio.ByteString;
import okhttp3.MultipartBody$Part;
import okhttp3.RequestBody;
import okhttp3.Headers;
import java.util.Objects;
import java.util.List;
import okhttp3.MediaType;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class MultipartBody$Builder	// class@001f52
{
    public final ByteString boundary;
    public final List parts;
    public MediaType type;

    public void MultipartBody$Builder(){
       super(UUID.randomUUID().toString());
    }
    public void MultipartBody$Builder(String p0){
       super();
       this.type = MultipartBody.MIXED;
       this.parts = new ArrayList();
       this.boundary = ByteString.encodeUtf8(p0);
    }
    public MultipartBody$Builder addFormDataPart(String p0,String p1){
       return this.addPart(MultipartBody$Part.createFormData(p0, p1));
    }
    public MultipartBody$Builder addFormDataPart(String p0,String p1,RequestBody p2){
       return this.addPart(MultipartBody$Part.createFormData(p0, p1, p2));
    }
    public MultipartBody$Builder addPart(Headers p0,RequestBody p1){
       return this.addPart(MultipartBody$Part.create(p0, p1));
    }
    public MultipartBody$Builder addPart(MultipartBody$Part p0){
       Objects.requireNonNull(p0, "part == null");
       this.parts.add(p0);
       return this;
    }
    public MultipartBody$Builder addPart(RequestBody p0){
       return this.addPart(MultipartBody$Part.create(p0));
    }
    public MultipartBody build(){
       if (!this.parts.isEmpty()) {
          return new MultipartBody(this.boundary, this.type, this.parts);
       }
       throw new IllegalStateException("Multipart body must have at least one part.");
    }
    public MultipartBody$Builder setType(MediaType p0){
       Objects.requireNonNull(p0, "type == null");
       if (!(p0.type()).equals("multipart")) {
          throw new IllegalArgumentException("multipart != "+p0);
       }
       this.type = p0;
       return this;
    }
}
