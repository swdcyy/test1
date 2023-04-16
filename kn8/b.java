package kn8.b;
import df.b;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import java.lang.String;

public class b extends b	// class@002bc6
{

    public void b(int p0){
       super(p0);
    }
    public void b(RCTEventEmitter p0){
       p0.receiveEvent(this.g(), "topAppear", Arguments.createMap());
    }
    public short d(){
       return 0;
    }
    public String e(){
       return "topAppear";
    }
}
