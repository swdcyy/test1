package cg.b;
import df.b;
import java.lang.String;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class b extends b	// class@000d0b
{
    public final String f;

    public void b(int p0,String p1){
       super(p0);
       this.f = p1;
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
          writableMap.putString("pageScrollState", this.f);
       }
       p0.receiveEvent(i, "topPageScrollStateChanged", writableMap);
       return;
    }
    public String e(){
       return "topPageScrollStateChanged";
    }
}
