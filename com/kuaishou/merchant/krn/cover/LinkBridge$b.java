package com.kuaishou.merchant.krn.cover.LinkBridge$b;
import java.lang.Runnable;
import com.kuaishou.merchant.krn.cover.LinkBridge;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
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

public class LinkBridge$b implements Runnable	// class@001861
{
    public final String b;
    public final int c;
    public final LinkBridge d;

    public void LinkBridge$b(LinkBridge p0,String p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, LinkBridge$b.class, "1")) {
          return;
       }
       j oj = d.a(-1046723924);
       LinkBridge$b tb = this.b;
       try{
          oj.Tx(tb);
          LinkBridge context = this.d.context;
          if (context != null) {
             View view = context.getNativeModule(UIManagerModule.class).resolveView(this.c);
             if (view != null && (view.getParent() != null && i0.X(view))) {
                view.getParent().removeView(view);
             }
          }
       label_0045 :
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
