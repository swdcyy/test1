package com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment$b;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.yxcorp.gifshow.detail.player.panel.ui.PhotoPlayerPanelFragment;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import androidx.fragment.app.KwaiDialogFragment;

public final class PhotoPlayerPanelFragment$b extends BottomSheetBehavior$c	// class@00164b
{
    public final PhotoPlayerPanelFragment a;

    public void PhotoPlayerPanelFragment$b(PhotoPlayerPanelFragment p0){
       this.a = p0;
       super();
    }
    public void a(View p0,float p1){
       if (PatchProxy.isSupport2(PhotoPlayerPanelFragment$b.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Float.valueOf(p1), this, PhotoPlayerPanelFragment$b.class, "2")) {
          return;
       }
       a.p(p0, "bottomSheet");
       PatchProxy.onMethodExit(PhotoPlayerPanelFragment$b.class, "2");
       return;
    }
    public void b(View p0,int p1){
       if (PatchProxy.isSupport2(PhotoPlayerPanelFragment$b.class, "1") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, PhotoPlayerPanelFragment$b.class, "1")) {
          return;
       }
       a.p(p0, "bottomSheet");
       if (p1 == 5) {
          this.a.dismiss();
       }
       PatchProxy.onMethodExit(PhotoPlayerPanelFragment$b.class, "1");
       return;
    }
}
