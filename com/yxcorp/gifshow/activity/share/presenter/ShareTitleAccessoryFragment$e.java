package com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$e;
import com.yxcorp.gifshow.bubble.b$b;
import android.view.View;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment;
import java.lang.Object;
import com.yxcorp.gifshow.widget.popup.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import zw8.z3;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.bubble.a$c;
import android.view.ViewGroup;
import java.lang.NullPointerException;

public final class ShareTitleAccessoryFragment$e implements b$b	// class@0013b6
{
    public final View a;
    public final ShareTitleAccessoryFragment b;

    public void ShareTitleAccessoryFragment$e(View p0,ShareTitleAccessoryFragment p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ShareTitleAccessoryFragment$e.class, "1")) {
          return;
       }
       p0.x(a1.e(10.00f));
       p0.L(z3.b);
       ShareTitleAccessoryFragment$e ta = this.a;
       if (ta != null) {
          p0.C(ta);
          PatchProxy.onMethodExit(ShareTitleAccessoryFragment$e.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(ShareTitleAccessoryFragment$e.class, "1");
          throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
       }
    }
}
