package com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionView;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import ebc.a;
import android.content.Context;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionInterval;
import com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionInterpolation;
import java.util.Objects;
import java.lang.Integer;
import java.util.WeakHashMap;
import java.util.Map;
import ekd.q;
import com.facebook.react.bridge.ReadableMap;
import java.util.HashMap;
import fg6.a;
import com.google.gson.Gson;
import com.facebook.react.bridge.ReadableArray;
import java.util.List;
import com.yxcorp.gifshow.relation.intimate.rn.motion.IntMotionView$a;
import java.lang.reflect.Type;
import el.a;
import java.util.Collection;

public class IntMotionView extends ReactViewGroup	// class@001927
{
    public final a b;
    public IntMotionInterval c;
    public final List d;
    public final WeakReference e;

    public void IntMotionView(ReactContext p0,ViewGroupManager p1,a p2){
       super(p0);
       this.d = new ArrayList();
       this.setId(ViewGroup.generateViewId());
       this.e = new WeakReference(p1);
       this.b = p2;
    }
    public final boolean h(float p0){
       IntMotionView obj;
       if (PatchProxy.isSupport(IntMotionView.class)) {
          obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, IntMotionView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.c;
       boolean b = true;
       if (obj == null) {
          return b;
       }else {
          IntMotionInterval min = obj.min;
          if (min != null && obj.max != null) {
             if (p0 - min.floatValue() < 0 || p0 - this.c.max.floatValue() > 0) {
                b = false;
             }
             return b;
          }else if(min != null){
             if (p0 - min.floatValue() < 0) {
                b = false;
             }
             return b;
          }else {
             IntMotionInterval max = obj.max;
             if (max != null && p0 - max.floatValue() > 0) {
                b = false;
             }
             return b;
          }
       }
    }
    public final float i(IntMotionInterpolation p0,float p1){
       return ((p1 * p0.coefficient) + p0.offset);
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, IntMotionView.class, "6")) {
          return;
       }
       super.onAttachedToWindow();
       IntMotionView tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(this, tb, a.class, "1")) {
          tb.g.put(this, Integer.valueOf(this.getId()));
          tb.b();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, IntMotionView.class, "7")) {
          return;
       }
       super.onDetachedFromWindow();
       IntMotionView tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(this, tb, a.class, "2")) {
          tb.g.remove(this);
          if (q.h(tb.g)) {
             tb.c();
          }
       }
       return;
    }
    public void setInterval(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntMotionView.class, "2")) {
          return;
       }
       try{
          Gson a = a.a;
          this.c = a.h(a.q(p0.toHashMap()), IntMotionInterval.class);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void setOptions(ReadableArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntMotionView.class, "1")) {
          return;
       }
       IntMotionView td = this.d;
       try{
          td.clear();
          Gson a = a.a;
          this.d.addAll(a.i(a.q(p0.toArrayList()), new IntMotionView$a(this).getType()));
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
