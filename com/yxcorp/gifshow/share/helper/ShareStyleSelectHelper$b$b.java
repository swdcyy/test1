package com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper$b;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.gifshow.share.helper.ShareStyleSelectHelper;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import nsd.r0;
import uo7.k;
import cic.c;
import android.app.Activity;
import android.content.res.Resources;
import java.util.Arrays;
import java.lang.CharSequence;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.photo.download.task.b;
import android.content.pm.PackageManager;
import android.content.Intent;
import java.lang.Exception;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;
import yic.g;

public final class ShareStyleSelectHelper$b$b implements View$OnClickListener	// class@001ba0
{
    public final ShareStyleSelectHelper$b b;
    public final c c;

    public void ShareStyleSelectHelper$b$b(ShareStyleSelectHelper$b p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShareStyleSelectHelper$b$b.class, "1")) {
          return;
       }
       ShareStyleSelectHelper$b b = this.b.b;
       ShareStyleSelectHelper$b$b tc = this.c;
       a.o(tc, "dialog");
       Objects.requireNonNull(b);
       ShareStyleSelectHelper shareStyleSe = ShareStyleSelectHelper.class;
       if (!PatchProxy.applyVoidOneRefs(tc, b, shareStyleSe, "3")) {
          int i = 1;
          Drawable uDrawable = null;
          if (b.m != null) {
             ShareStyleSelectHelper f = b.f;
             if (f == null) {
                a.S("progressBar");
             }
             f.setVisibility(0);
             f = b.g;
             String str = "progressText";
             if (f == null) {
                a.S(str);
             }
             f.setCompoundDrawables(uDrawable, uDrawable, uDrawable, uDrawable);
             f = b.g;
             if (f == null) {
                a.S(str);
             }
             str = b.b().k().getResources().getString(R.string.arg_RES_7f10503a);
             a.o(str, "conf.mCurrentActivity.re¡­      .video_downloading\)");
             Object[] objArray = new Object[i];
             objArray[0] = "0";
             String str1 = String.format(str, Arrays.copyOf(objArray, i));
             a.o(str1, "java.lang.String.format\(format, *args\)");
             f.setText(str1);
             b.m = false;
             View view = tc.z();
             a.m(view);
             view = view.findViewById(R.id.share_video_area);
             a.o(view, "dialog.popupView!!.findV¡­t>\(R.id.share_video_area\)");
             view.setEnabled(0);
             if (!PatchProxy.applyVoid(uDrawable, b, shareStyleSe, "6")) {
                ShareStyleSelectHelper o = b.o;
                if (o != null) {
                   o.start();
                }
             }
             b.h("DOWNLOAD_SHARE_WECHAT_TIMELINE", "RETRY_DOWNLOAD");
          }else {
             try{
                b.p = i;
                tc.o();
                b.n = i;
                if (!PatchProxy.applyVoid(uDrawable, b, shareStyleSe, "5")) {
                   Intent launchIntent = b.b().k().getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
                   if (launchIntent != null) {
                      launchIntent.addFlags(0x10000000);
                   }
                   if (launchIntent != null) {
                      b.b().k().startActivity(launchIntent);
                   }
                }
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
             g.f(b.c(), b.b(), 2, null, 8, null);
             b.h("DOWNLOAD_SHARE_WECHAT_TIMELINE", "DOWNLOAD_SHARE");
          }
       }
       return;
    }
}
