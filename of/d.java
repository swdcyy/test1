package of.d;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class d extends b	// class@002787
{
    public final int f;

    public void d(int p0,int p1){
       super(p0);
       this.f = p1;
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
          writableMap.putDouble("drawerState", (double)this.f);
       }
       p0.receiveEvent(i, "topDrawerStateChanged", writableMap);
       return;
    }
    public short d(){
       return 0;
    }
    public String e(){
       return "topDrawerStateChanged";
    }
}
