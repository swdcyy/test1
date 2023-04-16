package com.facebook.react.uimanager.UIManagerTurboModule$a;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.UIManagerTurboModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.UIManagerModule$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.UIManagerModule;

public class UIManagerTurboModule$a extends h	// class@001331
{
    public final UIManagerTurboModule t;

    public void UIManagerTurboModule$a(UIManagerTurboModule p0,ReactApplicationContext p1,UIManagerModule$b p2,int p3,int p4){
       this.t = p0;
       super(p1, p2, p3, p4);
    }
    public ReactApplicationContext C(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getReactApplicationContext();
    }
    public UIManagerModule e(){
       return this.t;
    }
}
