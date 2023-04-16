package com.facebook.react.modules.blob.BlobModule$a;
import com.facebook.react.modules.websocket.WebSocketModule$b;
import com.facebook.react.modules.blob.BlobModule;
import java.lang.Object;
import okio.ByteString;
import com.facebook.react.bridge.WritableMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;

public class BlobModule$a implements WebSocketModule$b	// class@001275
{
    public final BlobModule a;

    public void BlobModule$a(BlobModule p0){
       this.a = p0;
       super();
    }
    public void a(ByteString p0,WritableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BlobModule$a.class, "2")) {
          return;
       }
       byte[] uobyteArray = p0.toByteArray();
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("blobId", this.a.store(uobyteArray));
       writableMap.putInt("offset", 0);
       writableMap.putInt("size", uobyteArray.length);
       p1.putMap("data", writableMap);
       p1.putString("type", "blob");
       return;
    }
    public void b(String p0,WritableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BlobModule$a.class, "1")) {
          return;
       }
       p1.putString("data", p0);
       return;
    }
}
