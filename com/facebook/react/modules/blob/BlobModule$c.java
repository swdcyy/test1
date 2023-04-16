package com.facebook.react.modules.blob.BlobModule$c;
import com.facebook.react.modules.network.NetworkingModule$e;
import com.facebook.react.modules.blob.BlobModule;
import java.lang.Object;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import okhttp3.RequestBody;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import okhttp3.MediaType;
import java.lang.Boolean;

public class BlobModule$c implements NetworkingModule$e	// class@001277
{
    public final BlobModule a;

    public void BlobModule$c(BlobModule p0){
       this.a = p0;
       super();
    }
    public RequestBody a(ReadableMap p0,String p1){
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, BlobModule$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "type";
       if (p0.hasKey(obj) && !(p0.getString(obj)).isEmpty()) {
          p1 = p0.getString(obj);
       }
       if (p1 == null) {
          p1 = "application/octet-stream";
       }
       p0 = p0.getMap("blob");
       obj = p0.getString("blobId");
       int intx = p0.getInt("offset");
       return RequestBody.create(MediaType.parse(p1), this.a.resolve(obj, intx, p0.getInt("size")));
    }
    public boolean b(ReadableMap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlobModule$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.hasKey("blob");
    }
}
