package com.tachikoma.core.component.text.SpanItem;
import com.tachikoma.core.component.TKBaseNativeModule;
import gx4.f;
import com.tkruntime.v8.V8Function;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tkruntime.v8.JsValueRef;
import com.tkruntime.v8.V8Value;
import tx4.y;

public class SpanItem extends TKBaseNativeModule	// class@000d8c
{
    public String color;
    public int end;
    public String fontFamily;
    public int imageHeight;
    public String imagePlaceholder;
    public String imageUrl;
    public int imageWidth;
    public int index;
    public JsValueRef mV8FunctionRef;
    public float marginLeft;
    public float marginRight;
    public int offsetX;
    public float offsetY;
    public int size;
    public String spanType;
    public int start;
    public String textStyle;
    public String url;

    public void SpanItem(f p0){
       super(p0);
    }
    public V8Function getV8Function(){
       Object[] objArray = null;
       SpanItem obj = PatchProxy.apply(objArray, this, SpanItem.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mV8FunctionRef;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public void setColor(String p0){
       this.color = p0;
    }
    public void setSpanOnClickListener(V8Function p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SpanItem.class, "1")) {
          return;
       }
       y.c(this.mV8FunctionRef);
       this.mV8FunctionRef = y.b(p0, this);
       return;
    }
    public void unRetainAllJsObj(){
       if (PatchProxy.applyVoid(null, this, SpanItem.class, "3")) {
          return;
       }
       y.c(this.mV8FunctionRef);
       return;
    }
}
