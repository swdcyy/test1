package com.kuaishou.merchant.krn.popupmanager.PopupManagerBridge$b;
import com.facebook.react.bridge.LifecycleEventListener;
import com.kuaishou.merchant.krn.popupmanager.PopupManagerBridge;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import ma4.e;
import ma4.c;
import ma4.d;

public class PopupManagerBridge$b implements LifecycleEventListener	// class@00186f
{
    public final PopupManagerBridge b;

    public void PopupManagerBridge$b(PopupManagerBridge p0){
       this.b = p0;
       super();
    }
    public void onHostDestroy(){
       if (PatchProxy.applyVoid(null, this, PopupManagerBridge$b.class, "1")) {
          return;
       }
       c uoc = d.a(-1103669376).k60();
       if (uoc != null) {
          uoc.e(this.b.mPopupListener);
       }
       return;
    }
    public void onHostPause(){
    }
    public void onHostResume(){
    }
}
