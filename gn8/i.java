package gn8.i;
import df.b;
import z1.g;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;
import java.lang.Object;

public class i extends b	// class@0024a0
{
    public WritableMap f;
    public static final g g;

    static {
       i.g = new g(7);
    }
    public void i(){
       super();
    }
    public boolean a(){
       return false;
    }
    public void b(RCTEventEmitter p0){
       p0.receiveEvent(this.g(), "onGestureHandlerStateChange", this.f);
    }
    public short d(){
       return 0;
    }
    public String e(){
       return "onGestureHandlerStateChange";
    }
    public void j(){
       this.f = null;
       i.g.a(this);
    }
}
