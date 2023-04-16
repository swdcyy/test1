package pf.b;
import df.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;

public class b extends b	// class@00291a
{
    public final int f;
    public final String g;
    public final int h;
    public final int i;
    public final String j;

    public void b(int p0,int p1){
       super(p0, p1, null, 0, 0, null);
    }
    public void b(int p0,int p1,String p2,int p3,int p4){
       super(p0, p1, p2, p3, p4, null);
    }
    public void b(int p0,int p1,String p2,int p3,int p4,String p5){
       super(p0);
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       this.j = p5;
    }
    public static String k(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 != 1) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   if (p0 == 5) {
                      return "topProgress";
                   }else {
                      throw new IllegalStateException("Invalid image event: "+Integer.toString(p0));
                   }
                }else {
                   return "topLoadStart";
                }
             }else {
                return "topLoadEnd";
             }
          }else {
             return "topLoad";
          }
       }else {
          return "topError";
       }
    }
    public void b(RCTEventEmitter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       WritableMap writableMap = null;
       b uob = 1;
       String str = 2;
       if (this.g == null) {
          b tf = this.f;
          if (tf == str || tf == uob) {
          label_0018 :
             writableMap = Arguments.createMap();
             tf = this.g;
             if (tf != null) {
                writableMap.putString("uri", tf);
             }
             tf = this.f;
             if (tf == str) {
                WritableMap writableMap1 = Arguments.createMap();
                writableMap1.putDouble("width", (double)this.h);
                writableMap1.putDouble("height", (double)this.i);
                uob = this.g;
                if (uob != null) {
                   writableMap1.putString("url", uob);
                }
                writableMap.putMap("source", writableMap1);
             }else if(tf == uob){
                writableMap.putString("error", this.j);
             }
          }
       }else {
          goto label_0018 ;
       }
       p0.receiveEvent(this.g(), this.e(), writableMap);
       return;
    }
    public short d(){
       return (short)this.f;
    }
    public String e(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.k(this.f);
    }
}
