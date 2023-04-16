package com.kuaishou.ark.rtx.widget.RTXEventCenter;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Value;
import com.tkruntime.v8.V8Object;
import java.lang.Exception;
import tx4.y;

public class RTXEventCenter extends TKBaseNativeModule	// class@000f8e
{
    public Map f;
    public Map g;

    public void RTXEventCenter(f p0){
       super(p0);
       this.f = new HashMap();
       this.g = new HashMap();
    }
    public void addListener(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RTXEventCenter.class, "2")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          Map map = this.f.get(p0);
          if (map == null) {
             map = new HashMap();
             this.f.put(p0, map);
          }
          Set set = map.get(p1);
          if (set == null) {
             set = new HashSet();
             map.put(p0, set);
          }
          if (!TextUtils.isEmpty(p2)) {
             set.add(p2);
          }
       }
    label_0049 :
       return;
    }
    public void onReceiverEvent(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, RTXEventCenter.class, "5")) {
          return;
       }
       if (TextUtils.isEmpty(p0) || (this.g.get(p0) != null && !TextUtils.isEmpty(p1))) {
          JsValueRef jsValueRef = this.g.get(p0);
          if (jsValueRef == null || (jsValueRef.get() != null && !jsValueRef.get().v8.isReleased())) {
             try{
                Object[] objArray = new Object[]{p1,p2};
                jsValueRef.get().call(null, objArray);
             }catch(java.lang.Exception e7){
                e7.printStackTrace();
             }
          }
       }
    }
    public void registerCallback(String p0,V8Function p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RTXEventCenter.class, "1")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && p1 != null) {
          y.c(this.g.get(p0));
          this.g.put(p0, y.b(p1, this));
       }
       return;
    }
    public void removeAllListeners(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RTXEventCenter.class, "4")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.f.remove(p0);
       return;
    }
    public void removeListener(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RTXEventCenter.class, "3")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && !TextUtils.isEmpty(p1)) {
          Map map = this.f.get(p0);
          if (map == null) {
             return;
          }else {
             map.remove(p1);
          }
       }
       return;
    }
}
