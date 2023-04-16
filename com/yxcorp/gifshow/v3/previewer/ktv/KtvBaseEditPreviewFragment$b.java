package com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment$b;
import android.content.DialogInterface$OnDismissListener;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvBaseEditPreviewFragment;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class KtvBaseEditPreviewFragment$b implements DialogInterface$OnDismissListener	// class@0015a8
{
    public final KtvBaseEditPreviewFragment b;

    public void KtvBaseEditPreviewFragment$b(KtvBaseEditPreviewFragment p0){
       this.b = p0;
       super();
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvBaseEditPreviewFragment$b.class, "1")) {
          return;
       }
       KtvBaseEditPreviewFragment$b tb = this.b;
       if (tb.b2 == null) {
          tb.vi();
       }
       return;
    }
}
