package com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$setToLiveDialog$1;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor;
import android.os.Bundle;
import java.lang.String;
import com.kwai.android.register.core.notification.NotificationChain;
import com.yxcorp.gifshow.matrix.dialog.live.LiveFragmentDialog;
import com.yxcorp.gifshow.push.model.KwaiPushMsgData;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import m0d.l;
import android.graphics.Bitmap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.kwai.android.common.bean.PushData;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.matrix.dialog.focus.DialogPushTypeInterceptor$setToLiveDialog$1$onCompletedBitmap$1;
import com.kwai.lib.BaseSpringDialogFragment;
import msd.l;
import com.kwai.lib.Spring;

public final class DialogPushTypeInterceptor$setToLiveDialog$1 implements ImageCallback	// class@001ce7
{
    public final DialogPushTypeInterceptor b;
    public final Bundle c;
    public final String d;
    public final NotificationChain e;
    public final LiveFragmentDialog f;
    public final KwaiPushMsgData g;
    public final int h;

    public void DialogPushTypeInterceptor$setToLiveDialog$1(DialogPushTypeInterceptor p0,Bundle p1,String p2,NotificationChain p3,LiveFragmentDialog p4,KwaiPushMsgData p5,int p6){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       super();
    }
    public void onCompleted(Drawable p0){
       l.a(this, p0);
    }
    public void onCompletedBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogPushTypeInterceptor$setToLiveDialog$1.class, "1")) {
          return;
       }
       if (p0 != null) {
          this.c.putString("image_uri", this.d);
       }
       PushData pushId = this.g.pushId;
       a.o(pushId, "data.pushId");
       Spring.c(this.e.getContext(), this.f, pushId, this.b.o(), new DialogPushTypeInterceptor$setToLiveDialog$1$onCompletedBitmap$1(this));
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}
