package com.tkruntime.v8.V8JSONProxy$2;
import com.tkruntime.v8.JavaCallback;
import com.tkruntime.v8.V8JSONProxy;
import java.lang.Object;
import com.tkruntime.v8.V8Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonElement;
import com.google.gson.Gson;

public class V8JSONProxy$2 implements JavaCallback	// class@000fb7
{
    public final V8JSONProxy this$0;
    public final boolean val$isSerial;

    public void V8JSONProxy$2(V8JSONProxy p0,boolean p1){
       this.this$0 = p0;
       this.val$isSerial = p1;
       super();
    }
    public Object invoke(V8Object p0,Object[] p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, V8JSONProxy$2.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (this.val$isSerial == null) {
          return this.this$0.mJsonObject.toString();
       }
       if (V8JSONProxy.sGson == null) {
          V8JSONProxy.sGson = new Gson();
       }
       return V8JSONProxy.sGson.q(this.this$0.mSerial);
    }
}
