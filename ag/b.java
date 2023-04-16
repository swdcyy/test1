package ag.b;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;

public class b extends b	// class@0001f1
{
    public float f;
    public float g;

    public void b(int p0,float p1,float p2){
       super(p0);
       this.f = p1;
       this.g = p2;
    }
    public void b(RCTEventEmitter p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       int i = this.g();
       WritableMap writableMap = PatchProxy.apply(null, this, uob, "2");
       if (writableMap != PatchProxyResult.class) {
       }else {
          writableMap = Arguments.createMap();
          WritableMap writableMap1 = Arguments.createMap();
          writableMap1.putDouble("width", (double)this.f);
          writableMap1.putDouble("height", (double)this.g);
          writableMap.putMap("contentSize", writableMap1);
          writableMap.putInt("target", this.g());
       }
       p0.receiveEvent(i, "topContentSizeChange", writableMap);
       return;
    }
    public String e(){
       return "topContentSizeChange";
    }
}
