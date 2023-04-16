package com.facebook.react.modules.blob.BlobModule$d;
import com.facebook.react.modules.network.NetworkingModule$f;
import com.facebook.react.modules.blob.BlobModule;
import java.lang.Object;
import okhttp3.ResponseBody;
import com.facebook.react.bridge.WritableMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.Arguments;
import java.lang.Boolean;

public class BlobModule$d implements NetworkingModule$f	// class@001278
{
    public final BlobModule a;

    public void BlobModule$d(BlobModule p0){
       this.a = p0;
       super();
    }
    public WritableMap a(ResponseBody p0){
       WritableMap obj = PatchProxy.applyOneRefs(p0, this, BlobModule$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       byte[] uobyteArray = p0.bytes();
       obj = Arguments.createMap();
       obj.putString("blobId", this.a.store(uobyteArray));
       obj.putInt("offset", 0);
       obj.putInt("size", uobyteArray.length);
       return obj;
    }
    public boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BlobModule$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ("blob").equals(p0);
    }
}
