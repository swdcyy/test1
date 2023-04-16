package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge$e;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.StringBuilder;
import yx.j0;

public final class ShowDialogBridge$e implements PopupInterface$d	// class@001825
{
    public final ShowDialogBridge a;

    public void ShowDialogBridge$e(ShowDialogBridge p0){
       this.a = p0;
       super();
    }
    public final void a(c p0,int p1){
       ShowDialogBridge$e uoe = ShowDialogBridge$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("ShowDialogBridge", "Dialog on cancel, cancelType: "+p1, objArray);
       this.a.k();
       return;
    }
}
