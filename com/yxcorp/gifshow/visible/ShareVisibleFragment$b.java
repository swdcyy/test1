package com.yxcorp.gifshow.visible.ShareVisibleFragment$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.visible.ShareVisibleFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public final class ShareVisibleFragment$b extends m	// class@0016b6
{
    public final ShareVisibleFragment c;

    public void ShareVisibleFragment$b(ShareVisibleFragment p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareVisibleFragment$b.class, "1")) {
          return;
       }
       this.c.dismissAllowingStateLoss();
       return;
    }
}
