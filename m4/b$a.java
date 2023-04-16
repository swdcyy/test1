package m4.b$a;
import okio.n;
import m4.b;
import java.lang.Object;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;
import java.io.FileOutputStream;
import okio.b;
import java.io.InputStream;
import okhttp3.ResponseBody;
import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.RNFetchBlob.RNFetchBlobReq;
import okio.o;

public class b$a implements n	// class@0025aa
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public final void a(String p0,long p1,long p2){
       WritableMap writableMap = Arguments.createMap();
       writableMap.putString("taskId", p0);
       writableMap.putString("written", String.valueOf(p1));
       writableMap.putString("total", String.valueOf(p2));
       this.b.f.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("RNFetchBlobProgress", writableMap);
    }
    public void close(){
       this.b.g.close();
    }
    public long read(b p0,long p1){
       float f;
       b$a b1;
       b$a uoa = this;
       int i = (int)p1;
       int i1 = -1;
       try{
          byte[] uobyteArray = new byte[i];
          int i2 = 0;
          long l = (long)uoa.b.c.byteStream().read(uobyteArray, i2, i);
          b$a b = uoa.b;
          b e = b.e;
          long l1 = ((v2 = l) > 0)? l: 0;
          b.e = e + l1;
          if (v2 > 0) {
             b.g.write(uobyteArray, i2, (int)l);
          }else if(!b.contentLength() - i1 && !l - i1){
             uoa.b.h = true;
          }
          RNFetchBlobProgressConfig rNFetchBlobP = RNFetchBlobReq.d(uoa.b.b);
          if (uoa.b.contentLength()) {
             if (uoa.b.contentLength() - i1) {
                b = uoa.b;
                f = (float)(b.e / b.contentLength());
             }else {
                f = (float)uoa.b.h;
             }
             if (rNFetchBlobP != null && rNFetchBlobP.a(f)) {
                if (uoa.b.contentLength() - i1) {
                   b1 = uoa.b;
                   long l2 = b1.contentLength();
                   this.a(b1.b, b1.e, l2);
                }else {
                   b1 = uoa.b;
                   if (b1.h == null) {
                      this.a(b1.b, 0, b1.contentLength());
                   }else {
                      e = b1.e;
                      this.a(b1.b, e, e);
                   }
                }
             }
          }
       label_00a9 :
          return l;
       }catch(java.lang.Exception e0){
          return i1;
       }
    }
    public o timeout(){
       return null;
    }
}
