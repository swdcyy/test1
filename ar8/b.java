package ar8.b;
import df.b;
import ar8.a;
import ar8.c;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import ze.p;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;

public class b extends b	// class@000312
{
    public a f;
    public c g;

    public void b(int p0,a p1,c p2){
       super(p0);
       this.f = p1;
       this.g = p2;
    }
    public void b(RCTEventEmitter p0){
       WritableMap writableMap = Arguments.createMap();
       b tf = this.f;
       WritableMap writableMap1 = Arguments.createMap();
       writableMap1.putDouble("top", (double)p.a(tf.a));
       writableMap1.putDouble("right", (double)p.a(tf.b));
       writableMap1.putDouble("bottom", (double)p.a(tf.c));
       writableMap1.putDouble("left", (double)p.a(tf.d));
       writableMap.putMap("insets", writableMap1);
       tf = this.g;
       writableMap1 = Arguments.createMap();
       writableMap1.putDouble("x", (double)p.a(tf.a));
       writableMap1.putDouble("y", (double)p.a(tf.b));
       writableMap1.putDouble("width", (double)p.a(tf.c));
       writableMap1.putDouble("height", (double)p.a(tf.d));
       writableMap.putMap("frame", writableMap1);
       p0.receiveEvent(this.g(), "topInsetsChange", writableMap);
    }
    public String e(){
       return "topInsetsChange";
    }
}
