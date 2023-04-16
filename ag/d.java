package ag.d;
import df.b;
import java.lang.String;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class d extends b	// class@0001f3
{
    public String f;
    public int g;

    public void d(int p0,String p1,int p2){
       super(p0);
       this.f = p1;
       this.g = p2;
    }
    public void b(RCTEventEmitter p0){
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uod, "1")) {
          return;
       }
       int i = this.g();
       WritableMap writableMap = PatchProxy.apply(null, this, uod, "2");
       if (writableMap != PatchProxyResult.class) {
       }else {
          writableMap = Arguments.createMap();
          writableMap.putString("text", this.f);
          writableMap.putInt("eventCount", this.g);
          writableMap.putInt("target", this.g());
       }
       p0.receiveEvent(i, "topChange", writableMap);
       return;
    }
    public String e(){
       return "topChange";
    }
}
