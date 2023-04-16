package com.kuaishou.live.entry.photoalbum.LiveEntryCoverCropActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.live.entry.photoalbum.LiveEntryCoverCropActivity$a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.FrameLayout;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveEntryCoverGuideConfig;
import java.lang.reflect.Type;
import wg3.a;
import pm8.a;
import java.lang.CharSequence;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kuaishou.live.entry.photoalbum.LiveEntryCoverCropActivity$b;
import java.lang.Runnable;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import t13.c;
import android.view.View$OnClickListener;
import t13.d;
import android.graphics.BitmapFactory$Options;
import java.io.File;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.yxcorp.utility.n;
import android.widget.RelativeLayout$LayoutParams;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.graphics.Rect;
import lnc.a1;
import java.lang.Math;
import java.util.Objects;
import java.lang.Integer;
import com.kuaishou.live.core.show.photoalbum.cropper.CropOverlayView;
import com.kuaishou.live.core.show.photoalbum.cropper.d;

public class LiveEntryCoverCropActivity extends GifshowActivity	// class@001b66
{
    public KwaiImageView A;
    public KwaiActionBar B;
    public Uri C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public HashMap L;
    public CropImageView y;
    public TextView z;
    public static final LiveEntryCoverCropActivity$a M;

    static {
       LiveEntryCoverCropActivity.M = new LiveEntryCoverCropActivity$a(null);
    }
    public void LiveEntryCoverCropActivity(){
       super();
       this.I = 9;
       this.J = 16;
       this.K = 85.00f;
    }
    public final void A3(boolean p0){
       LiveEntryCoverCropActivity tA;
       LiveEntryCoverCropActivity liveEntryCov = LiveEntryCoverCropActivity.class;
       if (PatchProxy.isSupport(liveEntryCov) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveEntryCov, "7")) {
          return;
       }
       int i = 4;
       int i1 = 0;
       int i2 = 8;
       if (p0) {
          tA = this.A;
          a.m(tA);
          tA.setVisibility(i1);
          tA = this.z;
          a.m(tA);
          tA.setVisibility(i);
          tA = this.y;
          a.m(tA);
          tA.setVisibility(i2);
       }else {
          tA = this.A;
          a.m(tA);
          tA.setVisibility(i2);
          tA = this.y;
          a.m(tA);
          tA.setVisibility(i1);
          LiveConfigStartupResponse$LiveEntryCoverGuideConfig liveEntryCov1 = a.m(LiveConfigStartupResponse$LiveEntryCoverGuideConfig.class);
          if (liveEntryCov1 != null && liveEntryCov1.mMaxShowEntryCropGuideCount > a.G()) {
             liveEntryCov = this.z;
             a.m(liveEntryCov);
             liveEntryCov.setText(liveEntryCov1.mEntryCropGuideText);
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putInt("liveEntryCoverCropGuideShownCount", (a.G() + 1));
             g.a(uEditor);
             tA = this.y;
             a.m(tA);
             tA.post(new LiveEntryCoverCropActivity$b(this));
          }else {
             tA = this.z;
             a.m(tA);
             tA.setVisibility(i);
          }
       }
       return;
    }
    public int M(){
       return 5;
    }
    public int P2(){
       return 2;
    }
    public String getUrl(){
       return "ks://live/entry/cover/crop";
    }
    public String o(){
       if (this.D != null) {
          return "LIVE_COVER_PREVIEW";
       }
       return "LIVE_COVER_CUT";
    }
    public void onCreate(Bundle p0){
       LiveEntryCoverCropActivity liveEntryCov1;
       int i2;
       LiveEntryCoverCropActivity tA;
       TextView titleTextVie;
       LiveEntryCoverCropActivity liveEntryCov = LiveEntryCoverCropActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveEntryCov, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d0ad8);
       Intent intent = this.getIntent();
       a.o(intent, "intent");
       Bundle extras = intent.getExtras();
       if (extras != null) {
          a.o(extras, "intent.extras ?: return");
          Uri data = intent.getData();
          if (data != null) {
             a.o(data, "intent.data ?: return");
             this.D = extras.getBoolean("KEY_PREVIEW_IMAGE_MODE");
             this.E = extras.getInt("KEY_LIVE_COVER_ORIGINAL_WIDTH");
             this.F = extras.getInt("KEY_LIVE_COVER_ORIGINAL_HEIGHT");
             this.C = extras.getParcelable("output");
             this.I = extras.getInt("KEY_LIVE_COVER_ASPECT_RATIO_X");
             this.J = extras.getInt("KEY_LIVE_COVER_ASPECT_RATIO_Y");
             this.K = extras.getFloat("KEY_LIVE_MIN_CROP_HEIGHT");
             int i = 0x7f0a3f6a;
             if (!PatchProxy.applyVoid(null, this, liveEntryCov, "2")) {
                this.y = this.findViewById(0x7f0a1bc7);
                this.z = this.findViewById(0x7f0a1bca);
                this.A = this.findViewById(0x7f0a1bd2);
                this.B = this.findViewById(i);
                liveEntryCov1 = this.B;
                a.m(liveEntryCov1);
                b.d0(LiveLogTag.LIVE_ENTRY_COVER, "initCoverCropView,", "mIsPreviewImageMode:", Boolean.valueOf(this.D), " rightButton:", liveEntryCov1.getRightButton());
                if (this.D != null) {
                   liveEntryCov1 = this.B;
                   a.m(liveEntryCov1);
                   liveEntryCov1.m(R.string.arg_RES_7f100b5d);
                   liveEntryCov1 = this.B;
                   a.m(liveEntryCov1);
                   titleTextVie = liveEntryCov1.getTitleTextView();
                   a.m(titleTextVie);
                   titleTextVie.setText(R.string.arg_RES_7f103e1c);
                }else {
                   liveEntryCov1 = this.B;
                   a.m(liveEntryCov1);
                   liveEntryCov1.m(R.string.arg_RES_7f103a83);
                   liveEntryCov1 = this.B;
                   a.m(liveEntryCov1);
                   titleTextVie = liveEntryCov1.getTitleTextView();
                   a.m(titleTextVie);
                   titleTextVie.setText(R.string.arg_RES_7f1005df);
                }
                this.A3(this.D);
                liveEntryCov1 = this.B;
                a.m(liveEntryCov1);
                liveEntryCov1.l(new c(this));
                liveEntryCov1 = this.B;
                a.m(liveEntryCov1);
                liveEntryCov1.h(new d(this));
             }
             if (!PatchProxy.applyVoidOneRefs(data, this, liveEntryCov, "3")) {
                liveEntryCov1 = 1;
                if (!PatchProxy.applyVoidOneRefs(data, this, liveEntryCov, "4")) {
                   BitmapFactory$Options options = new BitmapFactory$Options();
                   options.inJustDecodeBounds = liveEntryCov1;
                   BitmapFactory.decodeFile(new File(data.getPath()).getAbsolutePath(), options);
                   this.G = options.outHeight;
                   this.H = options.outWidth;
                }
                if (this.z3()) {
                   if (this.D != null) {
                      int i1 = n.x(this);
                      i2 = (this.G * i1) / this.H;
                      RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-1, -2);
                      layoutParams.width = i1;
                      layoutParams.height = i2;
                      layoutParams.addRule(3, i);
                      i = ((n.t(this) - i2) - n.c(this, 52.00f)) / 2;
                      if (i > 0) {
                         layoutParams.topMargin = i;
                      }
                      tA = this.A;
                      a.m(tA);
                      tA.setLayoutParams(layoutParams);
                      liveEntryCov1 = this.A;
                      a.m(liveEntryCov1);
                      tA = this.C;
                      a.m(tA);
                      liveEntryCov1.A(tA, i1, i2);
                   }else {
                      liveEntryCov = this.y;
                      a.m(liveEntryCov);
                      liveEntryCov.setImageUriAsync(data);
                      Rect rect = new Rect();
                      i2 = Math.min(a1.e(this.K), this.G);
                      tA = this.y;
                      a.m(tA);
                      int i3 = (this.I * i2) / this.J;
                      Objects.requireNonNull(tA);
                      if (!PatchProxy.isSupport(CropImageView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i3), Integer.valueOf(i2), tA, CropImageView.class, "7")) {
                         CropImageView c1 = tA.c;
                         Objects.requireNonNull(c1);
                         if (!PatchProxy.isSupport(CropOverlayView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i3), Integer.valueOf(i2), c1, CropOverlayView.class, "12")) {
                            CropOverlayView d1 = c1.d;
                            d1.g = (float)i3;
                            d1.h = (float)i2;
                         }
                      }
                      liveEntryCov = this.y;
                      a.m(liveEntryCov);
                      tA = this.G;
                      i3 = (this.I * tA) / this.J;
                      Objects.requireNonNull(liveEntryCov);
                      if (!PatchProxy.isSupport(CropImageView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i3), Integer.valueOf(tA), liveEntryCov, CropImageView.class, "8")) {
                         CropImageView c = liveEntryCov.c;
                         Objects.requireNonNull(c);
                         if (!PatchProxy.isSupport(CropOverlayView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i3), Integer.valueOf(tA), c, CropOverlayView.class, "13")) {
                            CropOverlayView d = c.d;
                            d.i = (float)i3;
                            d.j = (float)tA;
                         }
                      }
                      liveEntryCov = this.y;
                      a.m(liveEntryCov);
                      liveEntryCov.setFixedAspectRatio(liveEntryCov1);
                      liveEntryCov = this.y;
                      a.m(liveEntryCov);
                      tA = this.I;
                      LiveEntryCoverCropActivity tJ = this.J;
                      Objects.requireNonNull(liveEntryCov);
                      if (!PatchProxy.isSupport(CropImageView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(tA), Integer.valueOf(tJ), liveEntryCov, CropImageView.class, "17")) {
                         liveEntryCov.c.setAspectRatioX(tA);
                         liveEntryCov.c.setAspectRatioY(tJ);
                         liveEntryCov.setFixedAspectRatio(liveEntryCov1);
                      }
                      liveEntryCov = this.H;
                      liveEntryCov1 = this.G;
                      i = liveEntryCov1 / 3;
                      rect.set(((liveEntryCov - (i * 2)) / 2), 0, ((liveEntryCov / 2) + i), liveEntryCov1);
                      liveEntryCov = this.y;
                      a.m(liveEntryCov);
                      liveEntryCov.setCropRect(rect);
                   }
                }
             }
          }
       }
       return;
    }
    public final void u3(){
       if (PatchProxy.applyVoid(null, this, LiveEntryCoverCropActivity.class, "5")) {
          return;
       }
       this.setResult(0, new Intent());
       this.finish();
       return;
    }
    public final CropImageView v3(){
       return this.y;
    }
    public final TextView w3(){
       return this.z;
    }
    public final KwaiImageView x3(){
       return this.A;
    }
    public final KwaiActionBar y3(){
       return this.B;
    }
    public final boolean z3(){
       boolean b = (this.G > null && this.H > null)? true: false;
       return b;
    }
}
