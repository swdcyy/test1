package com.yxcorp.gifshow.ad.webview.WebViewFollowToolBarPresenter$initClickListener$5;
import msd.l;
import kotlin.jvm.internal.Lambda;
import k59.r2;
import java.lang.Object;
import android.view.View;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.User;

public final class WebViewFollowToolBarPresenter$initClickListener$5 extends Lambda implements l	// class@0018ae
{
    public final r2 this$0;

    public void WebViewFollowToolBarPresenter$initClickListener$5(r2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WebViewFollowToolBarPresenter$initClickListener$5.class, "1")) {
          return;
       }
       a.p(p0, "it");
       User user = r2.P8(this.this$0).getUser();
       a.o(user, "mPhoto.user");
       if (!user.isFollowingOrFollowRequesting()) {
          this.this$0.S8(67);
          this.this$0.Z8();
       }
       return;
    }
}
