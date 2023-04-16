package com.yxcorp.gifshow.activity.preview.PhotoPreviewActivity$a;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.activity.preview.PhotoPreviewActivity;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Void;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import java.util.Objects;
import j8c.a;
import w46.b;
import android.content.Context;
import com.kuaishou.gifshow.files.a;
import s16.i;
import java.lang.CharSequence;
import android.text.TextUtils;
import s16.j;
import android.app.Activity;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kwai.feature.post.api.componet.prettify.makeup.model.a;
import java.lang.Boolean;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import lnc.f6;
import java.lang.Throwable;
import android.util.Log;
import com.yxcorp.gifshow.util.PostUtils;
import y26.b$a;
import y26.b;
import android.net.Uri;
import ekd.w0;
import lq.i;
import lq.e;
import tkd.b;
import tkd.d;
import w26.a;
import android.content.Intent;
import w26.c;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class PhotoPreviewActivity$a extends d	// class@00135c
{
    public final PhotoPreviewActivity y;

    public void PhotoPreviewActivity$a(PhotoPreviewActivity p0,FragmentActivity p1){
       this.y = p0;
       super(p1);
    }
    public Object b(Object[] p0){
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PhotoPreviewActivity$a obj1 = PatchProxy.applyOneRefs(p0, obj, PhotoPreviewActivity$a.class, "1");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.y;
          Objects.requireNonNull(obj1);
          Object obj2 = PatchProxy.apply(null, obj1, PhotoPreviewActivity.class, "7");
          if (obj2 != patchProxyRe) {
             obj1 = obj2;
          }else if(obj1.P == null){
             obj1 = obj1.O;
          }else {
             try{
                PhotoPreviewActivity o = obj1.O;
                if (o != null) {
                   Object[] objArray = new Object[0];
                   a.D().t("PhotoPreviewActivity", "mImageFile != null", objArray);
                }else {
                   File uFile = a.g(obj1, o);
                   String str = i.a(o.getPath());
                   if (!TextUtils.isEmpty(str)) {
                      j.i(uFile.getPath(), str);
                   }
                   f6.b(obj1.getApplicationContext(), uFile, obj1.T, obj1.S, null, null, null, null, null, null, null, true);
                   obj1 = uFile;
                }
             }catch(java.io.IOException e0){
                a.D().e("PhotoPreviewActivity", "saveimagetolocal", e0);
                PostUtils.x("saveimagetolocal", Log.getStackTraceString(e0));
             }
             obj1 = null;
          }
       }
       return obj1;
    }
    public void j(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoPreviewActivity$a.class, "2")) {
       }else if(p0 != null){
          PhotoPreviewActivity$a ty = this.y;
          Objects.requireNonNull(ty);
          if (!PatchProxy.applyVoidOneRefs(p0, ty, PhotoPreviewActivity.class, "6")) {
             b$a uoa = b.b(ty);
             uoa.p("photobeauty");
             uoa.u("new");
             uoa.t(w0.f("ks://share/new"));
             uoa.N(ty.R);
             uoa.y(ty.S);
             uoa.J(p0);
             i.m().k().x(ty.R);
             Intent intent = d.a(0x27e26f6e).Z00(uoa.g());
             if (intent != null) {
                ty.startActivityForResult(intent, 529);
                ty.overridePendingTransition(R.anim.arg_RES_7f010109, 0x7f01004c);
             }
          }
       }
       super.j(p0);
       return;
    }
}
