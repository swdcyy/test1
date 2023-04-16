package com.tachikoma.core.component.text.TKSpan;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import com.tachikoma.core.component.text.c;
import gx4.e;
import android.content.Context;
import java.lang.String;
import java.util.ArrayList;
import com.tkruntime.v8.V8Object;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gx4.c;
import java.util.List;
import java.util.Objects;
import java.util.Iterator;
import android.widget.TextView;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.bridge.d;
import com.tachikoma.core.component.text.SpanItem;
import java.util.Set;
import java.util.Map;
import java.util.Map$Entry;
import com.tkruntime.v8.JsValueRef;
import tx4.y;

public class TKSpan extends TKBaseNativeModule	// class@000d8f
{
    public final c f;
    public final List g;

    public void TKSpan(f p0){
       super(p0);
       this.f = new c(this.getTKContext().getContext(), this.getRootDir());
       this.g = new ArrayList();
    }
    public void addSpan(V8Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TKSpan.class, "1")) {
          return;
       }
       this.f.a(this.getNativeModule(p0));
       this.g.add(p0);
       return;
    }
    public void clearSpan(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKSpan.class, "2")) {
          return;
       }
       TKSpan tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, c.class, "3")) {
          tf.c.clear();
          tf.d.clear();
       }
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          this.f.a(this.getNativeModule(iterator.next()));
       }
       return;
    }
    public CharSequence getSpannableString(String p0,TextView p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TKSpan.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.b(p0, p1, this.getTKJSContext());
    }
    public void unRetainAllJsObj(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, TKSpan.class, "3")) {
          return;
       }
       super.unRetainAllJsObj();
       TKSpan tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, c.class, "4")) {
          Iterator iterator = tf.a.iterator();
          while (iterator.hasNext()) {
             SpanItem spanItem = iterator.next();
             if (spanItem != null) {
                spanItem.unRetainJsObj();
             }
          }
          tf.a.clear();
          iterator = tf.b.entrySet().iterator();
          while (iterator.hasNext()) {
             y.c(iterator.next().getValue());
          }
          tf.b.clear();
       }
       return;
    }
}
