package com.kwai.sharelib.ui.SharePanelFragment$c;
import wc.c;
import com.kwai.sharelib.ui.SharePanelFragment;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import android.view.View;
import uo7.j0;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.view.ViewStub;
import android.widget.ImageView;
import java.lang.Integer;
import ip7.j;
import java.lang.Number;
import com.kwai.sharelib.ui.SharePanelFragment$c$a;
import android.view.View$OnClickListener;
import com.kwai.sharelib.ui.SharePanelFragment$c$b;
import java.lang.Runnable;
import java.util.List;
import uo7.i0;
import mp7.c;
import yo7.b;

public final class SharePanelFragment$c extends c	// class@00170a
{
    public final SharePanelFragment a;
    public final ShareInitResponse$SharePanelElement b;
    public final View c;
    public final j0 d;

    public void SharePanelFragment$c(SharePanelFragment p0,ShareInitResponse$SharePanelElement p1,View p2,j0 p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SharePanelFragment$c.class, "1")) {
          return;
       }
       a.p(p0, "p0");
       this.a.Wg(this.c);
       PatchProxy.onMethodExit(SharePanelFragment$c.class, "1");
       return;
    }
    public void onNewResultImpl(Bitmap p0){
       View view;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SharePanelFragment$c.class, "2")) {
          return;
       }
       if (p0 != null) {
          boolean b = false;
          Bitmap uBitmap = p0.copy(Bitmap$Config.ARGB_8888, b);
          if (uBitmap != null) {
             ViewStub viewStub = this.c.findViewById(R.id.forward_banner);
             ImageView imageView = null;
             if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.arg_RES_7f0d1508);
                view = viewStub.inflate();
             }else {
                view = imageView;
             }
             if (view instanceof ImageView) {
                imageView = view;
             }
             if (imageView != null) {
                ShareInitResponse$SharePanelElement mBgColor = this.b.mBgColor;
                if (mBgColor != null) {
                   Integer integer = j.b(mBgColor);
                   if (integer != null) {
                      imageView.setBackgroundColor(integer.intValue());
                   }
                }
                imageView.setImageBitmap(uBitmap);
                imageView.setOnClickListener(new SharePanelFragment$c$a(this, imageView));
                imageView.post(new SharePanelFragment$c$b(this, p0, imageView));
                SharePanelFragment k = this.a.k;
                if (k != null) {
                   k.a(this.d.a().get(b), imageView);
                }
                k = this.a.n;
                if (k != null) {
                   k.h(this.d.a().get(b), 1, 1);
                }
                PatchProxy.onMethodExit(SharePanelFragment$c.class, "2");
                return;
             }else {
                PatchProxy.onMethodExit(SharePanelFragment$c.class, "2");
                return;
             }
          }
       }
       PatchProxy.onMethodExit(SharePanelFragment$c.class, "2");
       return;
    }
}
