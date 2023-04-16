package m4.a$a;
import okio.n;
import m4.a;
import okio.d;
import java.lang.Object;
import okio.b;
import java.lang.String;
import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.RNFetchBlob.RNFetchBlobReq;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.nio.charset.Charset;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import java.lang.Class;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactContext;
import okio.o;

public class a$a implements n	// class@0025a8
{
    public d b;
    public long c;
    public final a d;

    public void a$a(a p0,d p1){
       this.d = p0;
       super();
       this.c = 0;
       this.b = p1;
    }
    public void close(){
    }
    public long read(b p0,long p1){
       p1 = this.b.read(p0, p1);
       a$a tc = this.c;
       String str = null;
       long l = (p1 - str > 0)? p1: str;
       this.c = tc + l;
       RNFetchBlobProgressConfig rNFetchBlobP = RNFetchBlobReq.d(this.d.b);
       l = this.d.contentLength();
       if (rNFetchBlobP != null && (l - str && rNFetchBlobP.a((float)(this.c / this.d.contentLength())))) {
          WritableMap writableMap = Arguments.createMap();
          writableMap.putString("taskId", this.d.b);
          writableMap.putString("written", String.valueOf(this.c));
          writableMap.putString("total", String.valueOf(this.d.contentLength()));
          if (this.d.e != null) {
             writableMap.putString("chunk", p0.readString(Charset.defaultCharset()));
          }else {
             writableMap.putString("chunk", "");
          }
          this.d.c.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class).emit("RNFetchBlobProgress", writableMap);
       }
    label_0089 :
       return p1;
    }
    public o timeout(){
       return null;
    }
}
