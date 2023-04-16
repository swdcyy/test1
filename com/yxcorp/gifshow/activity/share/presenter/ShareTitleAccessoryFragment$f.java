package com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment$f;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import android.view.View;
import com.yxcorp.gifshow.activity.share.presenter.ShareTitleAccessoryFragment;
import java.lang.Object;
import com.yxcorp.gifshow.bubble.a;
import com.kwai.library.widget.popup.common.c;
import ra9.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lnc.a1;

public final class ShareTitleAccessoryFragment$f implements PostBubbleManager$c	// class@0013b7
{
    public final View a;
    public final ShareTitleAccessoryFragment b;

    public void ShareTitleAccessoryFragment$f(View p0,ShareTitleAccessoryFragment p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(a p0,c p1,int p2){
       i.a(this, p0, p1, p2);
    }
    public void b(a p0,c p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, ShareTitleAccessoryFragment$f.class, "1")) {
          return;
       }
       a.p(p0, "bubble");
       i.c(this, p0, p1);
       p0.w = a1.e(48.00f);
       PatchProxy.onMethodExit(ShareTitleAccessoryFragment$f.class, "1");
       return;
    }
    public void c(boolean p0){
       i.b(this, p0);
    }
}
