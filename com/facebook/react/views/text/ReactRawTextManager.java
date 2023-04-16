package com.facebook.react.views.text.ReactRawTextManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.text.ReactRawTextShadowNode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze.x;
import ze.n0;
import android.view.View;
import com.facebook.react.views.text.ReactTextView;
import java.lang.IllegalStateException;

public class ReactRawTextManager extends ViewManager	// class@001406
{

    public void ReactRawTextManager(){
       super();
    }
    public ReactRawTextShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ReactRawTextManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactRawTextShadowNode();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactTextView createViewInstance(n0 p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ReactRawTextManager.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }
    public String getName(){
       return "RCTRawText";
    }
    public Class getShadowNodeClass(){
       return ReactRawTextShadowNode.class;
    }
    public void updateExtraData(View p0,Object p1){
    }
}
