package com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment$c;
import uxc.a;
import com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.KwaiDialogFragment;

public final class GrowthWebViewDialogFragment$c implements a	// class@001855
{
    public final GrowthWebViewDialogFragment a;

    public void GrowthWebViewDialogFragment$c(GrowthWebViewDialogFragment p0){
       this.a = p0;
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, GrowthWebViewDialogFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.dismissAllowingStateLoss();
       return true;
    }
}
