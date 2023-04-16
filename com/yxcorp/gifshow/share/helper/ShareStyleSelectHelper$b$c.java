package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cic.c;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;

public final class ShareStyleSelectHelper$b$c implements View$OnClickListener	// class@001ba1
{
    public final ShareStyleSelectHelper$b b;
    public final c c;

    public void ShareStyleSelectHelper$b$c(ShareStyleSelectHelper$b p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareStyleSelectHelper$b$c.class, "1")) {
          return;
       }
       this.b.b.d();
       p0.p = true;
       this.c.o();
       ShareStyleSelectHelper$b b = this.b.b;
       b.n = true;
       b.g("IMAGE_SHARE_WECHAT_TIMELINE");
       return;
    }
}
