package ag.l;
import df.b;
import java.lang.String;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;

public class l extends b	// class@0001fb
{
    public String f;

    public void l(int p0,String p1){
       super(p0);
       this.f = p1;
    }
    public boolean a(){
       return false;
    }
    public void b(RCTEventEmitter p0){
       l ol = l.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ol, "1")) {
          return;
       }
       int i = this.g();
       WritableMap writableMap = PatchProxy.apply(null, this, ol, "2");
       if (writableMap != PatchProxyResult.class) {
       }else {
          writableMap = Arguments.createMap();
          writableMap.putInt("target", this.g());
          writableMap.putString("text", this.f);
       }
       p0.receiveEvent(i, "topSubmitEditing", writableMap);
       return;
    }
    public String e(){
       return "topSubmitEditing";
    }
}
