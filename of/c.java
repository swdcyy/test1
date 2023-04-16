package of.c;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class c extends b	// class@002786
{
    public final float f;

    public void c(int p0,float p1){
       super(p0);
       this.f = p1;
    }
    public void b(RCTEventEmitter p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "1")) {
          return;
       }
       int i = this.g();
       WritableMap writableMap = PatchProxy.apply(null, this, uoc, "2");
       if (writableMap != PatchProxyResult.class) {
       }else {
          writableMap = Arguments.createMap();
          writableMap.putDouble("offset", (double)this.f);
       }
       p0.receiveEvent(i, "topDrawerSlide", writableMap);
       return;
    }
    public short d(){
       return 0;
    }
    public String e(){
       return "topDrawerSlide";
    }
}
