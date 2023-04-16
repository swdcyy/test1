package com.kuaishou.merchant.krn.cover.LinkBridge$a;
import java.lang.Runnable;
import com.kuaishou.merchant.krn.cover.LinkBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import vx4.j;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import android.view.View;
import android.view.ViewParent;
import a2.i0;
import android.view.ViewGroup;

public class LinkBridge$a implements Runnable	// class@001860
{
    public final int b;
    public final LinkBridge c;

    public void LinkBridge$a(LinkBridge p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LinkBridge$a.class, "1")) {
          return;
       }
       j oj = d.a(-1046723924);
       try{
          oj.J2();
          LinkBridge context = this.c.context;
          if (context != null) {
             View view = context.getNativeModule(UIManagerModule.class).resolveView(this.b);
             if (view != null && (view.getParent() != null && i0.X(view))) {
                view.getParent().removeView(view);
             }
          }
       label_0043 :
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
