package com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.LayoutShadowNode;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ze.x;
import android.view.View;

public abstract class SimpleViewManager extends BaseViewManager	// class@001329
{

    public void SimpleViewManager(){
       super();
    }
    public LayoutShadowNode createShadowNodeInstance(){
       Object obj = PatchProxy.apply(null, this, SimpleViewManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LayoutShadowNode();
    }
    public x createShadowNodeInstance(){
       return this.createShadowNodeInstance();
    }
    public Class getShadowNodeClass(){
       return LayoutShadowNode.class;
    }
    public void updateExtraData(View p0,Object p1){
    }
}
