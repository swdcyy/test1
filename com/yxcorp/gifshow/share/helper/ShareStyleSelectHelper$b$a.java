package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import ixb.z;
import com.kwai.sharelib.exception.ForwardCancelException;
import java.lang.Exception;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import uo7.k;
import java.lang.Throwable;
import yic.g;

public final class ShareStyleSelectHelper$b$a implements View$OnClickListener	// class@001b9f
{
    public final ShareStyleSelectHelper$b b;
    public final c c;

    public void ShareStyleSelectHelper$b$a(ShareStyleSelectHelper$b p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareStyleSelectHelper$b$a.class, "1")) {
          return;
       }
       p0.n = true;
       this.c.o();
       ShareStyleSelectHelper o = this.b.b.o;
       if (o != null) {
          o.cancel();
       }
       ShareStyleSelectHelper$b$a tb = this.b;
       ForwardCancelException uForwardCanc = new ForwardCancelException(null, null, null, 7, null);
       g.e(tb.d, tb.c, 2, v8);
       this.b.b.g("CANCEL_SHARE_WECHAT_TIMELINE");
       return;
    }
}
