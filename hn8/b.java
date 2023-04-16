package hn8.b;
import df.f;
import java.lang.Double;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Set;
import java.util.Collections;
import java.util.LinkedList;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import hn8.e;
import com.facebook.react.uimanager.f;
import com.facebook.react.uimanager.UIManagerModule$a;
import df.c;
import com.facebook.react.modules.core.DeviceEventManagerModule$RCTDeviceEventEmitter;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.modules.core.ReactChoreographer;
import hn8.b$a;
import in8.n;
import in8.m;
import in8.u;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import df.b;
import java.util.Map;
import com.swmansion.reanimated.nodes.EventNode;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import hn8.b$c;
import java.util.List;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.ReactChoreographer$CallbackType;
import com.facebook.react.modules.core.a$a;
import com.facebook.react.bridge.UiThreadUtil;

public class b implements f	// class@0025b9
{
    public final SparseArray a;
    public final Map b;
    public final f c;
    public final DeviceEventManagerModule$RCTDeviceEventEmitter d;
    public final ReactChoreographer e;
    public final e f;
    public final UIManagerModule$a g;
    public final AtomicBoolean h;
    public final n i;
    public final ReactContext j;
    public final UIManagerModule k;
    public List l;
    public ConcurrentLinkedQueue m;
    public boolean n;
    public double o;
    public final e p;
    public Set q;
    public Set r;
    public Queue s;
    public static final Double t;

    static {
       b.t = Double.valueOf(0);
    }
    public void b(ReactContext p0){
       super();
       this.a = new SparseArray();
       this.b = new HashMap();
       this.h = new AtomicBoolean();
       this.l = new ArrayList();
       this.m = new ConcurrentLinkedQueue();
       this.q = Collections.emptySet();
       this.r = Collections.emptySet();
       this.s = new LinkedList();
       this.j = p0;
       UIManagerModule nativeModule = p0.getNativeModule(UIManagerModule.class);
       this.k = nativeModule;
       this.p = new e();
       this.c = nativeModule.getUIImplementation();
       this.g = nativeModule.getDirectEventNamesResolver();
       nativeModule.getEventDispatcher().b(this);
       this.d = p0.getJSModule(DeviceEventManagerModule$RCTDeviceEventEmitter.class);
       this.e = ReactChoreographer.a();
       this.f = new b$a(this, p0);
       this.i = new n(this);
    }
    public m a(int p0,Class p1){
       m om = this.a.get(p0);
       if (om == null) {
          if (p1 == m.class || p1 == u.class) {
             return this.i;
          }
          throw new IllegalArgumentException("Requested node with id "+p0+" of type "+p1+" cannot be found");
       }else if(p1.isInstance(om)){
          return om;
       }else {
          throw new IllegalArgumentException("Node with id "+p0+" is of incompatible type "+om.getClass()+", requested type was "+p1);
       }
    }
    public Object b(int p0){
       m om = this.a.get(p0);
       if (om != null) {
          return om.value();
       }
       return b.t;
    }
    public final void c(b p0){
       if (!this.b.isEmpty()) {
          EventNode uEventNode = this.b.get(p0.g()+this.g.a(p0.e()));
          if (uEventNode != null) {
             p0.b(uEventNode);
          }
       }
       return;
    }
    public void d(b$c p0){
       this.l.add(p0);
       this.f();
    }
    public void e(String p0,WritableMap p1){
       this.d.emit(p0, p1);
    }
    public final void f(){
       if (!this.h.getAndSet(true)) {
          this.e.d(ReactChoreographer$CallbackType.NATIVE_ANIMATED_MODULE, this.f);
       }
       return;
    }
    public void onEventDispatch(b p0){
       if (UiThreadUtil.isOnUiThread()) {
          this.c(p0);
       }else {
          this.m.offer(p0);
          this.f();
       }
       return;
    }
}
