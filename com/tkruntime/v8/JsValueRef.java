package com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Value;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class JsValueRef	// class@000f9e
{
    public boolean mIsWeak;
    public WeakReference mOwner;
    public V8Value mVal;

    public void JsValueRef(V8Value p0,Object p1){
       super();
       this.mVal = null;
       this.mOwner = null;
       this.mIsWeak = false;
       this.mVal = p0;
       p0.addRef();
       this.mOwner = new WeakReference(p1);
    }
    public Object get(){
       JsValueRef tmVal = this.mVal;
       if (tmVal == null) {
          tmVal = null;
       }
       return tmVal;
    }
    public Object getOwner(){
       JsValueRef obj = PatchProxy.apply(null, this, JsValueRef.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mOwner;
       if (obj == null) {
          return null;
       }
       return obj.get();
    }
    public void setWeak(){
       if (PatchProxy.applyVoid(null, this, JsValueRef.class, "2")) {
          return;
       }
       if (this.mIsWeak != null) {
          return;
       }
       this.mIsWeak = true;
       this.mVal.releaseRef();
       if (!this.mVal.isReleased()) {
          this.mVal.setWeak();
       }
       return;
    }
}
