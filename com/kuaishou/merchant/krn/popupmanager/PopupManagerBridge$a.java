package com.kuaishou.merchant.krn.popupmanager.PopupManagerBridge$a;
import ma4.d;
import com.kuaishou.merchant.krn.popupmanager.PopupManagerBridge;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class PopupManagerBridge$a implements d	// class@00186e
{
    public final PopupManagerBridge a;

    public void PopupManagerBridge$a(PopupManagerBridge p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PopupManagerBridge$a.class, "1")) {
          return;
       }
       this.a.publishEvent(true, p0, p1);
       return;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PopupManagerBridge$a.class, "2")) {
          return;
       }
       this.a.publishEvent(false, p0, p1);
       return;
    }
}
