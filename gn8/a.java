package gn8.a;
import df.b;
import z1.g;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.lang.String;
import com.facebook.react.bridge.WritableMap;
import java.lang.Object;

public class a extends b	// class@002497
{
    public WritableMap f;
    public short g;
    public static final g h;

    static {
       a.h = new g(7);
    }
    public void a(){
       super();
    }
    public boolean a(){
       return true;
    }
    public void b(RCTEventEmitter p0){
       p0.receiveEvent(this.g(), "onGestureHandlerEvent", this.f);
    }
    public short d(){
       return this.g;
    }
    public String e(){
       return "onGestureHandlerEvent";
    }
    public void j(){
       this.f = null;
       a.h.a(this);
    }
}
