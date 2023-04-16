package cg.a;
import df.b;
import java.lang.Float;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class a extends b	// class@000d0a
{
    public final int f;
    public final float g;

    public void a(int p0,int p1,float p2){
       super(p0);
       this.f = p1;
       if (Float.isInfinite(p2) || Float.isNaN(p2)) {
          p2 = 0;
       }
       this.g = p2;
       return;
    }
    public void b(RCTEventEmitter p0){
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "1")) {
          return;
       }
       int i = this.g();
       WritableMap writableMap = PatchProxy.apply(null, this, uoa, "2");
       if (writableMap != PatchProxyResult.class) {
       }else {
          writableMap = Arguments.createMap();
          writableMap.putInt("position", this.f);
          writableMap.putDouble("offset", (double)this.g);
       }
       p0.receiveEvent(i, "topPageScroll", writableMap);
       return;
    }
    public String e(){
       return "topPageScroll";
    }
}
