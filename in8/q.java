package in8.q;
import in8.j;
import in8.m;
import com.facebook.react.bridge.ReadableMap;
import hn8.b;
import com.facebook.react.uimanager.f;
import java.lang.String;
import java.util.Map;
import hn8.f;
import com.facebook.react.bridge.JavaOnlyMap;
import ze.z;
import com.facebook.react.bridge.WritableMap;
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Boolean;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.ReadableArray;
import java.lang.IllegalStateException;
import com.facebook.react.bridge.Arguments;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Class;
import in8.s;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import in8.q$a;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import hn8.b$b;
import java.util.Queue;

public class q extends m implements j	// class@0026e6
{
    public final Map a;
    public final f b;
    public int c;
    public final JavaOnlyMap d;
    public final z e;

    public void q(int p0,ReadableMap p1,b p2,f p3){
       super(p0, p1, p2);
       this.c = -1;
       this.a = f.b(p1.getMap("props"));
       this.b = p3;
       JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
       this.d = javaOnlyMap;
       this.e = new z(javaOnlyMap);
    }
    public static void b(WritableMap p0,String p1,Object p2){
       if (p2 == null) {
          p0.putNull(p1);
       }else if(p2 instanceof Double){
          p0.putDouble(p1, p2.doubleValue());
       }else if(p2 instanceof Integer){
          p0.putInt(p1, p2.intValue());
       }else if(p2 instanceof Number){
          p0.putDouble(p1, p2.doubleValue());
       }else if(p2 instanceof Boolean){
          p0.putBoolean(p1, p2.booleanValue());
       }else if(p2 instanceof String){
          p0.putString(p1, p2);
       }else if(p2 instanceof WritableArray){
          p0.putArray(p1, p2);
       }else if(p2 instanceof WritableMap){
          p0.putMap(p1, p2);
       }else {
          throw new IllegalStateException("Unknown type of animated value");
       }
       return;
    }
    public void c(){
       if (this.c == -1) {
          return;
       }
       this.value();
       return;
    }
    public Object evaluate(){
       int i1;
       WritableMap writableMap3;
       WritableMap writableMap = Arguments.createMap();
       WritableMap writableMap1 = Arguments.createMap();
       Iterator iterator = this.a.entrySet().iterator();
       q oq = null;
       int i = 1;
       q oq1 = null;
       q oq2 = null;
       while (true) {
          if (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             m om = this.mNodesManager.a(uEntry.getValue().intValue(), m.class);
             if (om instanceof s) {
                WritableMap writableMap2 = om.value();
                ReadableMapKeySetIterator readableMapK = writableMap2.keySetIterator();
                while (true) {
                   if (readableMapK.hasNextKey()) {
                      String str = readableMapK.nextKey();
                      if (this.mNodesManager.q.contains(str)) {
                         oq = this.d;
                         i1 = oq2;
                         oq2 = oq1;
                         oq1 = 1;
                      }else if(this.mNodesManager.r.contains(str)){
                         oq1 = oq;
                         i1 = oq2;
                         oq2 = 1;
                         writableMap3 = writableMap1;
                      }else {
                         oq2 = oq1;
                         i1 = 1;
                         oq1 = oq;
                         writableMap3 = writableMap;
                      }
                      ReadableType type = writableMap2.getType(str);
                      int i2 = q$a.a[type.ordinal()];
                      if (i2 != i) {
                         if (i2 != 2) {
                            if (i2 == 3) {
                               oq.putArray(str, writableMap2.getArray(str));
                            }else {
                               throw new IllegalArgumentException("Unexpected type "+type);
                            }
                         }else {
                            oq.putString(str, writableMap2.getString(str));
                         }
                      }else {
                         oq.putDouble(str, writableMap2.getDouble(str));
                      }
                      oq = oq1;
                      oq1 = oq2;
                      oq2 = i1;
                   }else {
                      continue ;
                   }
                }
             }else {
                String key = uEntry.getKey();
                Object obj = om.value();
                if (this.mNodesManager.q.contains(key)) {
                   q.b(this.d, key, obj);
                   oq = 1;
                }else {
                   q.b(writableMap1, key, obj);
                   oq1 = 1;
                }
             }
          }else {
             q tc = this.c;
             if (tc != -1) {
                if (oq != null) {
                   this.b.B(tc, this.e);
                }
                if (oq1 != null) {
                   m tmNodesManag = this.mNodesManager;
                   tmNodesManag.s.add(new b$b(tmNodesManag, this.c, writableMap1));
                }
                if (oq2 != null) {
                   writableMap1 = Arguments.createMap();
                   writableMap1.putInt("viewTag", this.c);
                   writableMap1.putMap("props", writableMap);
                   this.mNodesManager.e("onReanimatedPropsChange", writableMap1);
                   break ;
                }
             }
             break ;
          }
       }
       return m.ZERO;
    }
}
