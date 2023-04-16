package ag.f;
import df.b;
import java.lang.String;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class f extends b	// class@0001f5
{
    public String f;

    public void f(int p0,String p1){
       super(p0);
       this.f = p1;
    }
    public boolean a(){
       return false;
    }
    public void b(RCTEventEmitter p0){
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uof, "1")) {
          return;
       }
       int i = this.g();
       WritableMap writableMap = PatchProxy.apply(null, this, uof, "2");
       if (writableMap != PatchProxyResult.class) {
       }else {
          writableMap = Arguments.createMap();
          writableMap.putInt("target", this.g());
          writableMap.putString("text", this.f);
       }
       p0.receiveEvent(i, "topEndEditing", writableMap);
       return;
    }
    public String e(){
       return "topEndEditing";
    }
}
