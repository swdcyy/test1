package com.facebook.react.modules.blob.BlobModule$b;
import com.facebook.react.modules.network.NetworkingModule$g;
import com.facebook.react.modules.blob.BlobModule;
import java.lang.Object;
import android.net.Uri;
import com.facebook.react.bridge.WritableMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yd.e;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import java.io.IOException;
import com.facebook.react.bridge.Arguments;
import java.lang.Boolean;

public class BlobModule$b implements NetworkingModule$g	// class@001276
{
    public final BlobModule a;

    public void BlobModule$b(BlobModule p0){
       this.a = p0;
       super();
    }
    public WritableMap a(Uri p0){
       byte[] obj = PatchProxy.applyOneRefs(p0, this, BlobModule$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e.Q && this.a.mReactApplicationContext == null) {
          throw new IOException("ReactApplicationContext is null");
       }
       obj = this.a.getBytesFromUri(p0);
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("blobId", this.a.store(obj));
       writableMap.putInt("offset", 0);
       writableMap.putInt("size", obj.length);
       writableMap.putString("type", this.a.getMimeTypeFromUri(p0));
       writableMap.putString("name", this.a.getNameFromUri(p0));
       writableMap.putDouble("lastModified", (double)this.a.getLastModifiedFromUri(p0));
       return writableMap;
    }
    public boolean b(Uri p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, BlobModule$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String scheme = p0.getScheme();
       boolean b = false;
       scheme = (("http").equals(scheme) || ("https").equals(scheme))? 1: null;
       if (!scheme && ("blob").equals(p1)) {
          b = true;
       }
       return b;
    }
}
