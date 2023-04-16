package ag.h;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class h extends b	// class@0001f7
{

    public void h(int p0){
       super(p0);
    }
    public boolean a(){
       return false;
    }
    public void b(RCTEventEmitter p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "1")) {
          return;
       }
       int i = this.g();
       WritableMap writableMap = PatchProxy.apply(null, this, oh, "2");
       if (writableMap != PatchProxyResult.class) {
       }else {
          writableMap = Arguments.createMap();
          writableMap.putInt("target", this.g());
       }
       p0.receiveEvent(i, "topFocus", writableMap);
       return;
    }
    public String e(){
       return "topFocus";
    }
}
