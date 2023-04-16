package com.kwai.sharelib.ui.SharePanelFragment$a;
import android.view.View$OnClickListener;
import com.kwai.sharelib.ui.SharePanelFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class SharePanelFragment$a implements View$OnClickListener	// class@001706
{
    public final SharePanelFragment b;

    public void SharePanelFragment$a(SharePanelFragment p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SharePanelFragment$a.class, "1")) {
          return;
       }
       this.b.Ug();
       PatchProxy.onMethodExit(SharePanelFragment$a.class, "1");
       return;
    }
}
