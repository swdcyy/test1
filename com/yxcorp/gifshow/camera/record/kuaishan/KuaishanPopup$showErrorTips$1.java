package com.yxcorp.gifshow.camera.record.kuaishan.KuaishanPopup$showErrorTips$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import xd9.f;
import android.view.View;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.i7;

public final class KuaishanPopup$showErrorTips$1 extends Lambda implements l	// class@000e10
{
    public final View $tipsContainer;
    public final f this$0;

    public void KuaishanPopup$showErrorTips$1(f p0,View p1){
       this.this$0 = p0;
       this.$tipsContainer = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KuaishanPopup$showErrorTips$1.class, "1")) {
          return;
       }
       a.p(p0, "it");
       i7.a.a(this.$tipsContainer, p0);
       this.this$0.k(this.$tipsContainer);
       return;
    }
}
