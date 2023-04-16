package com.facebook.react.uimanager.UIManagerBridgeModule$a;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.UIManagerBridgeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.UIManagerModule;

public class UIManagerBridgeModule$a extends h	// class@00132a
{
    public final UIManagerBridgeModule t;

    public void UIManagerBridgeModule$a(UIManagerBridgeModule p0,ReactApplicationContext p1,UIManagerModule$b p2,int p3,int p4){
       this.t = p0;
       super(p1, p2, p3, p4);
    }
    public ReactApplicationContext C(){
       Object obj = PatchProxy.apply(null, this, UIManagerBridgeModule$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getReactApplicationContext();
    }
    public UIManagerModule e(){
       return this.t;
    }
}
