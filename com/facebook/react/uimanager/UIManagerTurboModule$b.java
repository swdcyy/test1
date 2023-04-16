package com.facebook.react.uimanager.UIManagerTurboModule$b;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.UIManagerTurboModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import com.facebook.react.uimanager.UIManagerModule$b;
import com.facebook.react.uimanager.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.UIManagerModule;

public class UIManagerTurboModule$b extends h	// class@001332
{
    public final UIManagerTurboModule t;

    public void UIManagerTurboModule$b(UIManagerTurboModule p0,ReactApplicationContext p1,List p2,UIManagerModule$b p3,g p4,int p5,int p6){
       this.t = p0;
       super(p1, p2, p3, p4, p5, p6);
    }
    public ReactApplicationContext C(){
       Object obj = PatchProxy.apply(null, this, UIManagerTurboModule$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getReactApplicationContext();
    }
    public UIManagerModule e(){
       return this.t;
    }
}
