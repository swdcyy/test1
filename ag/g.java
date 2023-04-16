package ag.g;
import df.b;
import java.lang.String;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;

public class g extends b	// class@0001f6
{
    public String f;
    public String g;
    public int h;
    public int i;

    public void g(int p0,String p1,String p2,int p3,int p4){
       super(p0);
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
    }
    public boolean a(){
       return false;
    }
    public void b(RCTEventEmitter p0){
       g og = g.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, og, "1")) {
          return;
       }
       int i = this.g();
       WritableMap writableMap = PatchProxy.apply(null, this, og, "2");
       if (writableMap != PatchProxyResult.class) {
       }else {
          writableMap = Arguments.createMap();
          WritableMap writableMap1 = Arguments.createMap();
          writableMap1.putDouble("start", (double)this.h);
          writableMap1.putDouble("end", (double)this.i);
          writableMap.putString("text", this.f);
          writableMap.putString("previousText", this.g);
          writableMap.putMap("range", writableMap1);
          writableMap.putInt("target", this.g());
       }
       p0.receiveEvent(i, "topTextInput", writableMap);
       return;
    }
    public String e(){
       return "topTextInput";
    }
}
