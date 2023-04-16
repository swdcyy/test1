package com.yxcorp.gifshow.ad.tachikoma.bridge.ad.ShowDialogBridge$d;
import com.kwai.library.widget.popup.common.PopupInterface$b;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.d;

public final class ShowDialogBridge$d implements PopupInterface$b	// class@001824
{
    public static final ShowDialogBridge$d a;

    static {
       ShowDialogBridge$d.a = new ShowDialogBridge$d();
    }
    public void ShowDialogBridge$d(){
       super();
    }
    public final Animator a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ShowDialogBridge$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(p0);
    }
}
