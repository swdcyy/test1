package ag.i;
import df.b;
import java.lang.String;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class i extends b	// class@0001f8
{
    public String f;

    public void i(int p0,String p1){
       super(p0);
       this.f = p1;
    }
    public boolean a(){
       return false;
    }
    public void b(RCTEventEmitter p0){
       int i;
       i oi = i.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oi, "1")) {
          return;
       }
       i = this.g();
       WritableMap writableMap = PatchProxy.apply(null, this, oi, "2");
       if (writableMap != PatchProxyResult.class) {
       }else {
          writableMap = Arguments.createMap();
          writableMap.putString("key", this.f);
       }
       p0.receiveEvent(i, "topKeyPress", writableMap);
       return;
    }
    public String e(){
       return "topKeyPress";
    }
}
