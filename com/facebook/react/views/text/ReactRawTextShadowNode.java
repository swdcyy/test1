package com.facebook.react.views.text.ReactRawTextShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ReactRawTextShadowNode extends ReactShadowNodeImpl	// class@001408
{
    public String b;

    public void ReactRawTextShadowNode(){
       super();
       this.b = null;
    }
    public String b(){
       return this.b;
    }
    public boolean isVirtual(){
       return true;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactRawTextShadowNode.class, "1")) {
          return;
       }
       this.b = p0;
       this.markUpdated();
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ReactRawTextShadowNode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getViewClass()+" [text: "+this.b+"]";
    }
}
