package lf.a;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class a extends b	// class@00254f
{
    public final boolean f;

    public void a(int p0,boolean p1){
       super(p0);
       this.f = p1;
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
          writableMap.putInt("target", this.g());
          writableMap.putBoolean("value", this.f);
       }
       p0.receiveEvent(i, "topChange", writableMap);
       return;
    }
    public short d(){
       return 0;
    }
    public String e(){
       return "topChange";
    }
}
