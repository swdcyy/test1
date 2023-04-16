package ag.k;
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

public class k extends b	// class@0001fa
{
    public int f;
    public int g;

    public void k(int p0,int p1,int p2){
       super(p0);
       this.f = p1;
       this.g = p2;
    }
    public void b(RCTEventEmitter p0){
       k ok = k.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, "1")) {
          return;
       }
       int i = this.g();
       WritableMap writableMap = PatchProxy.apply(null, this, ok, "2");
       if (writableMap != PatchProxyResult.class) {
       }else {
          writableMap = Arguments.createMap();
          WritableMap writableMap1 = Arguments.createMap();
          writableMap1.putInt("end", this.g);
          writableMap1.putInt("start", this.f);
          writableMap.putMap("selection", writableMap1);
       }
       p0.receiveEvent(i, "topSelectionChange", writableMap);
       return;
    }
    public String e(){
       return "topSelectionChange";
    }
}
