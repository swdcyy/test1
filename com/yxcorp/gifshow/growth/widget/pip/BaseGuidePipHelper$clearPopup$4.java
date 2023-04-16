package com.yxcorp.gifshow.growth.widget.pip.BaseGuidePipHelper$clearPopup$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.growth.widget.pip.BaseGuidePipHelper;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.Fragment;
import cra.w;
import java.lang.StringBuilder;
import q87.c;

public final class BaseGuidePipHelper$clearPopup$4 extends Lambda implements l	// class@0015f2
{
    public final BaseGuidePipHelper this$0;

    public void BaseGuidePipHelper$clearPopup$4(BaseGuidePipHelper p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(WeakReference p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BaseGuidePipHelper$clearPopup$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       KwaiDialogFragment kwaiDialogFr = p0.get();
       boolean b = true;
       int i = 0;
       if (kwaiDialogFr != null && kwaiDialogFr.isVisible() == b) {
          kwaiDialogFr.dismiss();
          Object[] objArray = new Object[i];
          w.C().w(this.this$0.c(), "dismiss dialog: "+kwaiDialogFr, objArray);
       }else {
          b = false;
       }
       return b;
    }
}
