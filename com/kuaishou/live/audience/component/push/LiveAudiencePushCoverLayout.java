package com.kuaishou.live.audience.component.push.LiveAudiencePushCoverLayout;
import com.kuaishou.live.core.show.modifycover.a;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import v21.j;
import android.view.View$OnClickListener;
import v21.k;
import lc2.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kuaishou.live.core.show.modifycover.a$a;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import java.io.File;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import android.net.Uri;
import ekd.w0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;

public class LiveAudiencePushCoverLayout extends LinearLayout implements a	// class@000bc6
{
    public KwaiImageView b;
    public TextView c;
    public a$a d;
    public File e;
    public String f;
    public static final int g;

    public void LiveAudiencePushCoverLayout(Context p0){
       super(p0, null);
    }
    public void LiveAudiencePushCoverLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveAudiencePushCoverLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = "";
       a.c(p0, R.layout.arg_RES_7f0d0a3e, this);
       this.b = m1.f(this, 0x7f0a19ae);
       this.c = m1.f(this, 0x7f0a19b2);
       m1.a(this, new j(this), R.id.live_audience_play_cover_image_view);
       m1.a(this, new k(this), R.id.live_audience_play_title_text_view);
    }
    public void a(){
       a.d(this);
    }
    public void b(String p0){
       a.c(this, p0);
    }
    public void c(){
       a.a(this);
    }
    public void d(){
       a.b(this);
    }
    public void e(){
       LiveAudiencePushCoverLayout td;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudiencePushCoverLayout.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveAudiencePushCoverLayout.class, "4")) {
          String str = "android.permission.CAMERA";
          if (PermissionUtils.a(this.getContext(), str)) {
             td = this.d;
             if (td != null) {
                td.b();
             }
          }
          Activity uActivity = a.b(this.getContext());
          if (uActivity instanceof GifshowActivity) {
             a.e(uActivity, R.string.arg_RES_7f101efd, 0x7f101efc, str).subscribe(Functions.d(), Functions.e);
          }
       }
       td = this.d;
       if (td == null) {
          return;
       }else {
          td.a();
          return;
       }
    }
    public File getCurrentCoverFile(){
       return this.e;
    }
    public String getCurrentTitle(){
       return this.f;
    }
    public View getModifyImageView(){
       return null;
    }
    public void setCaption(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudiencePushCoverLayout.class, "2")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.c.setTextColor(a1.a(R.color.arg_RES_7f0601cb));
          this.c.setText(p0);
          this.f = p0;
       }else {
          this.f = "";
          this.c.setTextColor(a1.a(R.color.arg_RES_7f061da4));
          this.c.setText(a1.p(R.string.arg_RES_7f102875));
       }
       return;
    }
    public void setListener(a$a p0){
       this.d = p0;
    }
    public void setLiveCover(File p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudiencePushCoverLayout.class, "1")) {
          return;
       }
       if (p0 != null && p0.exists()) {
          this.e = p0;
          this.b.L(w0.c(p0).toString());
       }
       return;
    }
}
