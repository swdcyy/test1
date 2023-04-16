package com.yxcorp.gifshow.postentrance.CameraViewSwitcher$clickListener$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ezb.f;
import java.util.Objects;
import android.view.View$OnClickListener;

public final class CameraViewSwitcher$clickListener$1 extends Lambda implements l	// class@001001
{
    public final CameraViewSwitcher this$0;

    public void CameraViewSwitcher$clickListener$1(CameraViewSwitcher p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraViewSwitcher$clickListener$1.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.this$0.e());
       View$OnClickListener onClickListe = this.this$0.b();
       if (onClickListe != null) {
          onClickListe.onClick(p0);
       }
       return;
    }
}
