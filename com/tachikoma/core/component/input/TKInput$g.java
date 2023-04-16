package com.tachikoma.core.component.input.TKInput$g;
import android.content.ClipboardManager$OnPrimaryClipChangedListener;
import com.tachikoma.core.component.input.TKInput;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Object;
import tx4.y;
import java.util.HashMap;

public class TKInput$g implements ClipboardManager$OnPrimaryClipChangedListener	// class@000d77
{
    public final TKInput a;

    public void TKInput$g(TKInput p0){
       this.a = p0;
       super();
    }
    public void onPrimaryClipChanged(){
       TKInput oncopyRef;
       HashMap hashMap;
       HashMap hashMap1;
       if (PatchProxy.applyVoid(null, this, TKInput$g.class, "1")) {
          return;
       }
       TKInput$g ta = this.a;
       String str = "type";
       if (ta.mIsClickCopy != null) {
          ta.mIsClickCopy = false;
          oncopyRef = ta.oncopyRef;
          if (oncopyRef != null && y.a(oncopyRef.get())) {
             hashMap = new HashMap();
             hashMap.put("value", this.a.getClipboardContent());
             hashMap1 = new HashMap();
             hashMap1.put("target", hashMap);
             hashMap1.put(str, "copy");
             ta = this.a;
             ta.onRefCallWithArgs(ta.oncopyRef, hashMap1);
          }
       }
       ta = this.a;
       if (ta.mIsClickCut != null) {
          ta.mIsClickCut = false;
          oncopyRef = ta.oncutRef;
          if (oncopyRef != null && y.a(oncopyRef.get())) {
             hashMap = new HashMap();
             hashMap.put("value", this.a.getClipboardContent());
             hashMap1 = new HashMap();
             hashMap1.put("target", hashMap);
             hashMap1.put(str, "cut");
             ta = this.a;
             ta.onRefCallWithArgs(ta.oncutRef, hashMap1);
          }
       }
       return;
    }
}
