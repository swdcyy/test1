package com.facebook.react.modules.network.i;
import java.lang.Object;
import okhttp3.MediaType;
import java.io.InputStream;
import okhttp3.RequestBody;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.modules.network.i$a;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.net.URL;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Channels;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;
import okio.ByteString;
import android.content.ContentResolver;
import java.lang.StringBuilder;
import java.lang.Throwable;
import cb.a;

public class i	// class@0012da
{

    public void i(){
       super();
    }
    public static RequestBody a(MediaType p0,InputStream p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, i.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i$a(p0, p1);
    }
    public static InputStream b(Context p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, i.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       File uFile = File.createTempFile("RequestBodyUtil", "temp", p0.getApplicationContext().getCacheDir());
       uFile.deleteOnExit();
       InputStream inputStream = new URL(p1.toString()).openStream();
       ReadableByteChannel readableByte = Channels.newChannel(inputStream);
       FileOutputStream uFileOutputS = new FileOutputStream(uFile);
       uFileOutputS.getChannel().transferFrom(readableByte, 0, Long.MAX_VALUE);
       uFileOutputS.close();
       readableByte.close();
       inputStream.close();
       return new FileInputStream(uFile);
    }
    public static RequestBody c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, i.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!p0.equals("POST") && (p0.equals("PUT") || p0.equals("PATCH"))) {
          return RequestBody.create(null, ByteString.EMPTY);
       }
       return null;
    }
    public static InputStream d(Context p0,String p1){
       Uri obj = PatchProxy.applyTwoRefs(p0, p1, null, i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = Uri.parse(p1);
          if ((obj.getScheme()).startsWith("http")) {
             return i.b(p0, obj);
          }
          return p0.getContentResolver().openInputStream(obj);
       }catch(java.lang.Exception e4){
          a.h("ReactNative", "Could not retrieve file for contentUri "+p1, e4);
          return null;
       }
    }
}
