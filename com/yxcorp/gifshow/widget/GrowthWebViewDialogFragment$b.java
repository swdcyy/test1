package com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment$b;
import uxc.b;
import com.yxcorp.gifshow.widget.GrowthWebViewDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.fragment.app.KwaiDialogFragment;

public final class GrowthWebViewDialogFragment$b implements b	// class@001854
{
    public final GrowthWebViewDialogFragment a;

    public void GrowthWebViewDialogFragment$b(GrowthWebViewDialogFragment p0){
       this.a = p0;
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, GrowthWebViewDialogFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.a.dismissAllowingStateLoss();
       return true;
    }
}
