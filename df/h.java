package df.h;
import df.b;
import z1.g;
import com.facebook.react.uimanager.events.TouchEventType;
import android.view.MotionEvent;
import df.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.String;
import com.facebook.react.bridge.SoftAssertions;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.Objects;
import android.util.SparseIntArray;
import java.lang.Number;
import java.lang.Boolean;
import df.h$a;
import od.a;
import java.lang.Enum;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import df.j;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import ze.p;
import com.facebook.react.bridge.ReadableMap;

public class h extends b	// class@001e55
{
    public MotionEvent f;
    public TouchEventType g;
    public short h;
    public float i;
    public float j;
    public static final g k;

    static {
       h.k = new g(3);
    }
    public void h(){
       super();
    }
    public static h l(int p0,TouchEventType p1,MotionEvent p2,long p3,float p4,float p5,i p6){
       h obj;
       short i6;
       object oobject = p1;
       long l = p3;
       object oobject1 = p6;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       h oh = h.class;
       String str = "1";
       int i = 6;
       int i1 = 5;
       int i2 = 4;
       int i3 = 7;
       int i4 = 0;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[i3];
          objArray[i4] = Integer.valueOf(p0);
          objArray[1] = oobject;
          objArray[2] = p2;
          objArray[3] = Long.valueOf(p3);
          objArray[i2] = Float.valueOf(p4);
          objArray[i1] = Float.valueOf(p5);
          objArray[i] = oobject1;
          obj = PatchProxy.apply(objArray, null, oh, str);
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = h.k.q();
       if (obj == null) {
          obj = new h();
       }
       String str1 = "2";
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray1 = new Object[i3];
          objArray1[i4] = Integer.valueOf(p0);
          objArray1[1] = oobject;
          objArray1[2] = p2;
          objArray1[3] = Long.valueOf(p3);
          objArray1[i2] = Float.valueOf(p4);
          objArray1[5] = Float.valueOf(p5);
          objArray1[6] = oobject1;
          if (PatchProxy.applyVoid(objArray1, obj, oh, str1)) {
          label_015d :
             return obj;
          }
       }
       obj.h(p0);
       int b = (l - Long.MIN_VALUE)? true: false;
       SoftAssertions.assertCondition(b, "Gesture start time must be initialized");
       b = p2.getAction() & 0x00ff;
       if (b) {
          if (b != 1) {
             if (b != 2) {
                if (b != 3) {
                   if (b == 5 || b == 6) {
                      Objects.requireNonNull(p6);
                      if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p3), oobject1, i.class, str1)) {
                         int i5 = (int)l;
                         i6 = oobject1.a.get(i5, -1);
                         if (i6 != -1) {
                            oobject1.a.put(i5, (i6 + 1));
                         }else {
                            throw new RuntimeException("Tried to increment non-existent cookie");
                         }
                      }
                   }else {
                      throw new RuntimeException("Unhandled MotionEvent action: "+b);
                   }
                }else {
                   oobject1.a(l);
                }
             }else {
                Objects.requireNonNull(p6);
                if (PatchProxy.isSupport(i.class)) {
                   Object obj1 = PatchProxy.applyOneRefs(Long.valueOf(p3), oobject1, i.class, "3");
                   if (obj1 != patchProxyRe) {
                      i6 = obj1.shortValue();
                   label_0123 :
                      i4 = i6;
                   }
                }
                i6 = oobject1.a.get((int)l, -1);
                if (i6 != -1) {
                   i6 = (short)(i6 & 0xffff);
                   goto label_0123 ;
                }else {
                   throw new RuntimeException("Tried to get non-existent cookie");
                }
             }
          }else {
             oobject1.a(l);
          }
       }else {
          Objects.requireNonNull(p6);
          if (!PatchProxy.isSupport(i.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p3), oobject1, i.class, str)) {
             oobject1.a.put((int)l, i4);
          }
       }
       obj.g = oobject;
       obj.f = MotionEvent.obtain(p2);
       obj.h = i4;
       obj.i = p4;
       obj.j = p5;
       goto label_015d ;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       h tg = this.g;
       a.c(tg);
       int i = h$a.a[tg.ordinal()];
       boolean b = true;
       if (i == b || (i == 2 || i == 3)) {
          return false;
       }
       if (i == 4) {
          return b;
       }
       throw new RuntimeException("Unknown touch event type: "+this.g);
    }
    public void b(RCTEventEmitter p0){
       WritableArray writableArra;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "6")) {
          return;
       }
       h tg = this.g;
       a.c(tg);
       int i = this.g();
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidFourRefs(p0, tg, Integer.valueOf(i), this, null, j.class, "2")) {
          int i1 = 0;
          if (PatchProxy.isSupport(oj)) {
             writableArra = PatchProxy.applyTwoRefs(Integer.valueOf(i), this, null, oj, "1");
             if (writableArra != PatchProxyResult.class) {
             }
          }
          writableArra = Arguments.createArray();
          MotionEvent motionEvent = this.k();
          float f = motionEvent.getX() - this.i;
          float f1 = motionEvent.getY() - this.j;
          for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2 = i2 + 1) {
             WritableMap writableMap = Arguments.createMap();
             writableMap.putDouble("pageX", (double)p.a(motionEvent.getX(i2)));
             writableMap.putDouble("pageY", (double)p.a(motionEvent.getY(i2)));
             float f2 = motionEvent.getX(i2) - f;
             float f3 = motionEvent.getY(i2) - f1;
             writableMap.putDouble("locationX", (double)p.a(f2));
             writableMap.putDouble("locationY", (double)p.a(f3));
             writableMap.putInt("target", i);
             writableMap.putDouble("timestamp", (double)this.f());
             writableMap.putDouble("identifier", (double)motionEvent.getPointerId(i2));
             writableArra.pushMap(writableMap);
          }
          motionEvent = this.k();
          WritableArray writableArra1 = Arguments.createArray();
          if (tg == TouchEventType.MOVE || tg == TouchEventType.CANCEL) {
             for (; i1 < motionEvent.getPointerCount(); i1 = i1 + 1) {
                writableArra1.pushInt(i1);
             }
          }else if(tg == TouchEventType.START || tg == TouchEventType.END){
             writableArra1.pushInt(motionEvent.getActionIndex());
          }else {
             throw new RuntimeException("Unknown touch type: "+tg);
          }
          p0.receiveTouches(TouchEventType.getJSEventName(tg), writableArra, writableArra1);
       }
       return;
    }
    public short d(){
       return this.h;
    }
    public String e(){
       h obj = PatchProxy.apply(null, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       a.c(obj);
       return TouchEventType.getJSEventName(obj);
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       h tf = this.f;
       a.c(tf);
       tf.recycle();
       this.f = null;
       h.k.a(this);
       return;
    }
    public MotionEvent k(){
       Object obj = PatchProxy.apply(null, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.c(this.f);
       return this.f;
    }
}
