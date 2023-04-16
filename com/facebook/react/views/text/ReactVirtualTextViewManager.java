package com.facebook.react.views.text.ReactVirtualTextViewManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.views.text.ReactVirtualTextShadowNode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze.x;
import ze.n0;
import android.view.View;
import java.lang.IllegalStateException;

public class ReactVirtualTextViewManager extends BaseViewManager	// class@001417
{

    public void ReactVirtualTextViewManager(){
       super();
    }
    public ReactVirtualTextShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, ReactVirtualTextViewManager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ReactVirtualTextShadowNode();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public View createViewInstance(n0 p0){
       p0 = PatchProxy.applyOneRefs(p0, this, ReactVirtualTextViewManager.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }
    public String getName(){
       return "RCTVirtualText";
    }
    public Class getShadowNodeClass(){
       return ReactVirtualTextShadowNode.class;
    }
    public void updateExtraData(View p0,Object p1){
    }
}
