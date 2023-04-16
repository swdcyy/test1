package com.kwai.sharelib.ui.SharePanelFragment$c$a;
import android.view.View$OnClickListener;
import com.kwai.sharelib.ui.SharePanelFragment$c;
import android.widget.ImageView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import uo7.j0;
import uo7.i0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.kwai.sharelib.ui.SharePanelFragment;
import mp7.a;
import mp7.c;
import yo7.b;

public final class SharePanelFragment$c$a implements View$OnClickListener	// class@001708
{
    public final SharePanelFragment$c b;
    public final ImageView c;

    public void SharePanelFragment$c$a(SharePanelFragment$c p0,ImageView p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SharePanelFragment$c$a.class, "1")) {
          return;
       }
       int i = 0;
       this.b.d.a().get(i).execute();
       if (this.b.d.a().get(i).a().mAutoHidePanelWhenClicked != null) {
          this.b.a.i.dismiss();
       }
       SharePanelFragment$c$a tb = this.b;
       SharePanelFragment k = tb.a.k;
       if (k != null) {
          k.e(tb.d.a().get(i), this.c);
       }
       tb = this.b;
       k = tb.a.n;
       if (k != null) {
          k.d(tb.d.a().get(i), 1, 1);
       }
       PatchProxy.onMethodExit(SharePanelFragment$c$a.class, "1");
       return;
    }
}
