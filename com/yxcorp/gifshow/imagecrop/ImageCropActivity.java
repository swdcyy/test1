package com.yxcorp.gifshow.imagecrop.ImageCropActivity;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.base.BaseKsaActivity;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity$a;
import nsd.u;
import android.graphics.Bitmap$CompressFormat;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity$mImageView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity$mCropOverlayView$2;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity$mImageReverseLayout$2;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity$mReverseIv$2;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity$mReverseCancelTv$2;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity$b;
import tyc.q0;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import android.app.Activity;
import java.io.Closeable;
import kotlin.jvm.internal.a;
import com.kwai.moved.ks_page.fragment.AttrAnimProgressFragment;
import com.albinmathew.photocrop.cropoverlay.CropOverlayView;
import com.yxcorp.gifshow.album.imageloader.CompatZoomImageView;
import android.graphics.Bitmap;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.Boolean;
import com.yxcorp.utility.RomUtils;
import android.net.Uri;
import java.io.File;
import java.io.OutputStream;
import android.content.ContentResolver;
import java.io.IOException;
import android.graphics.Rect;
import com.yxcorp.gifshow.albumcontrol.a;
import v79.a;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity$c;
import android.widget.ImageView;
import android.view.ViewPropertyAnimator;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import o79.q;
import ekd.j0;
import fc7.a;
import android.widget.TextView;
import ekd.i;
import kotlin.TypeCastException;
import jc7.h;
import g79.a;
import w69.l;
import java.lang.Throwable;
import ic7.d;
import com.yxcorp.gifshow.imagecrop.ImageCropActivity$d;
import android.view.View$OnLayoutChangeListener;
import f79.c$a;
import android.content.Context;
import o79.k;
import android.view.MenuItem;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentActivity;

public final class ImageCropActivity extends BaseKsaActivity implements View$OnClickListener	// class@001955
{
    public Bitmap$CompressFormat e;
    public final p f;
    public final p g;
    public final p h;
    public final p i;
    public final p j;
    public String k;
    public Uri l;
    public File m;
    public ContentResolver n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public boolean t;
    public String u;
    public boolean v;
    public NoBackProgressFragment w;
    public final ImageCropActivity$b x;
    public final q0 y;
    public HashMap z;
    public static final String A = "ImageCropActivity";
    public static final int B = 90;
    public static final int C = 360;
    public static final ImageCropActivity$a D;

    static {
       ImageCropActivity.D = new ImageCropActivity$a(null);
       ImageCropActivity.A = "ImageCropActivity";
       ImageCropActivity.B = 90;
       ImageCropActivity.C = 360;
    }
    public void ImageCropActivity(){
       super();
       this.e = Bitmap$CompressFormat.JPEG;
       this.f = s.c(new ImageCropActivity$mImageView$2(this));
       this.g = s.c(new ImageCropActivity$mCropOverlayView$2(this));
       this.h = s.c(new ImageCropActivity$mImageReverseLayout$2(this));
       this.i = s.c(new ImageCropActivity$mReverseIv$2(this));
       this.j = s.c(new ImageCropActivity$mReverseCancelTv$2(this));
       this.o = 1;
       this.p = 1;
       this.s = 0x3f800000;
       this.x = new ImageCropActivity$b();
       this.y = new q0();
    }
    public View G2(int p0){
       View obj;
       if (PatchProxy.isSupport(ImageCropActivity.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ImageCropActivity.class, "23");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.z == null) {
          this.z = new HashMap();
       }
       obj = this.z.get(Integer.valueOf(p0));
       if (obj == null) {
          obj = this.findViewById(p0);
          this.z.put(Integer.valueOf(p0), obj);
       }
       return obj;
    }
    public final void H2(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropActivity.class, "17")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.close();
       return;
    }
    public final void L2(){
       if (PatchProxy.applyVoid(null, this, ImageCropActivity.class, "9")) {
          return;
       }
       ImageCropActivity tw = this.w;
       if (tw != null) {
          if (tw == null) {
             a.L();
          }
          tw.dismiss();
          this.w = null;
       }
       return;
    }
    public final CropOverlayView M2(){
       Object obj = PatchProxy.apply(null, this, ImageCropActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final CompatZoomImageView N2(){
       Object obj = PatchProxy.apply(null, this, ImageCropActivity.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final void O2(Bitmap p0){
       boolean b;
       ImageCropActivity tl;
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropActivity.class, "11")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       try{
          Intent intent = this.getIntent();
          a.h(intent, "intent");
          Bundle extras = intent.getExtras();
          if (extras != null) {
             String str = "data";
             if (extras.getParcelable(str) != null || extras.getBoolean("return-data")) {
                extras = new Bundle();
                extras.putParcelable(str, p0);
                this.setResult(-1, new Intent().setAction("inline-data").putExtras(extras));
             }else {
             label_004a :
                extras = new Bundle();
                extras.putInt("outputX", p0.getWidth());
                extras.putInt("outputY", p0.getHeight());
                ImageCropActivity obj = PatchProxy.applyOneRefs(p0, this, ImageCropActivity.class, "16");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(this.l != null){
                   OutputStream outputStream = null;
                   try{
                      if (RomUtils.q()) {
                         tl = this.l;
                         if (tl == null) {
                            a.L();
                         }
                         String path = tl.getPath();
                         if (path != null) {
                            File uFile = new File(path);
                            if (uFile.exists()) {
                               uFile.delete();
                               uFile.createNewFile();
                            }
                         }
                      }
                   label_009e :
                      tl = this.n;
                      if (tl == null) {
                         a.L();
                      }
                      ImageCropActivity tl1 = this.l;
                      if (tl1 == null) {
                         a.L();
                      }
                      outputStream = tl.openOutputStream(tl1);
                      if (outputStream != null) {
                         p0.compress(this.e, 90, outputStream);
                      }
                      this.H2(outputStream);
                      b = true;
                   }catch(java.io.IOException e4){
                      e4.printStackTrace();
                      this.H2(outputStream);
                   }
                   b = false;
                }else {
                   goto label_00cc ;
                }
                if (b) {
                   obj = this.l;
                   if (obj == null) {
                      a.L();
                   }
                   this.setResult(-1, new Intent(obj.toString()).putExtras(extras));
                }else {
                   str = this.M2().getImageBounds().toString();
                   extras.putString("rect", str);
                   ContentResolver contentResol = this.getContentResolver();
                   a.h(contentResol, "contentResolver");
                   this.setResult(-1, new Intent().setAction(a.b.d("post_asset_picker", contentResol, p0, "Cropped", "Cropped").a()).putExtras(extras));
                }
             }
          }else {
             goto label_004a ;
          }
          this.finish();
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ImageCropActivity.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropActivity.class, "21")) {
          return;
       }
       a.q(p0, "v");
       if (p0.getId() == 0x7f0a3643) {
          this.y.a(p0, new ImageCropActivity$c(this));
       }else if(p0.getId() == 0x7f0a1716){
          if (!PatchProxy.applyVoid(null, this, ImageCropActivity.class, "18")) {
             this.setResult(0, new Intent());
             this.finish();
          }
       }else if(p0.getId() == 0x7f0a1377){
          if (!PatchProxy.applyVoid(null, this, ImageCropActivity.class, "19")) {
             this.N2().setPivotX((float)(this.N2().getWidth() / 2));
             this.N2().setPivotY((float)(this.N2().getHeight() / 2));
             this.N2().animate().rotationBy((float)ImageCropActivity.B);
             this.N2().t0();
          }
       }else if(p0.getId() != 0x7f0a1378 || PatchProxy.applyVoid(null, this, ImageCropActivity.class, "20")){
          this.N2().animate().rotationBy(((- this.N2().getRotation()) % (float)ImageCropActivity.C));
          this.N2().setRotation(0);
          this.N2().t0();
       }
       return;
    }
    public void onCreate(Bundle p0){
       ImageCropActivity tm;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropActivity.class, "6")) {
          return;
       }
       super.onCreate(p0);
       if (!q.b(this)) {
          return;
       }
       this.setContentView(R.layout.arg_RES_7f0d06e6);
       this.n = this.getContentResolver();
       boolean b = false;
       boolean b1 = j0.a(this.getIntent(), "darkTheme", b);
       this.v = b1;
       int i = 8;
       int i1 = 0x7f1018b8;
       int i2 = -1;
       if (b1) {
          a.a.a(this, R.drawable.arg_RES_7f080fc4, 0x7f080fc8, i1);
          i1 = 0xff000000;
          this.findViewById(R.id.title_root).setBackgroundColor(i1);
          this.findViewById(R.id.root).setBackgroundColor(i1);
          View view = this.findViewById(R.id.title_tv);
          if (view != null) {
             view.setTextColor(i2);
             view = this.findViewById(R.id.divider);
             a.h(view, "findViewById<View>\(R.id.divider\)");
             view.setVisibility(i);
             i.i(this, i1, b, b);
          }else {
             throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
          }
       }else {
          a.a.a(this, R.drawable.arg_RES_7f080fc3, 0x7f080fc7, i1);
          i.i(this, i2, 1, b);
       }
       Object[] objArray = null;
       ImageView imageView = PatchProxy.apply(objArray, this, ImageCropActivity.class, "4");
       if (imageView == patchProxyRe) {
          imageView = this.i.getValue();
       }
       imageView.setOnClickListener(this);
       TextView textView = PatchProxy.apply(objArray, this, ImageCropActivity.class, "5");
       if (textView == patchProxyRe) {
          textView = this.j.getValue();
       }
       textView.setOnClickListener(this);
       b1 = j0.b(this.getIntent(), "margin_side", i2);
       if (b1 != i2) {
          this.M2().setMarginSide(b1);
       }
       this.o = j0.b(this.getIntent(), "aspectX", 1);
       this.p = j0.b(this.getIntent(), "aspectY", 1);
       b1 = j0.a(this.getIntent(), "imageReverse", b);
       this.M2().setRectRatio((((float)this.p * 0x3f800000) / (float)this.o));
       View view1 = PatchProxy.apply(objArray, this, ImageCropActivity.class, "3");
       if (view1 == patchProxyRe) {
          view1 = this.h.getValue();
       }
       if (b1) {
          i = 0;
       }
       view1.setVisibility(i);
       b1 = PatchProxy.apply(objArray, this, ImageCropActivity.class, "12");
       if (b1 != patchProxyRe) {
          b = b1.booleanValue();
       }else {
          try{
             h oh = h.c();
             a.h(oh, "KsAlbumFileManager.getInstance\(\)");
             this.m = File.createTempFile("temp_photo", "jpg", oh.d());
             b = true;
          }catch(java.io.IOException e9){
             e9.printStackTrace();
             a.c.c().onException(e9);
          }
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ImageCropActivity.class, "10")) {
          return;
       }
       super.onDestroy();
       k.a(this);
       return;
    }
    public boolean onOptionsItemSelected(MenuItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ImageCropActivity.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.q(p0, "item");
       if (p0.getItemId() != 0x102002c) {
          return super.onOptionsItemSelected(p0);
       }
       super.onBackPressed();
       return true;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropActivity.class, "13")) {
          return;
       }
       a.q(p0, "savedInstanceState");
       super.onSaveInstanceState(p0);
       p0.putBoolean("restoreState", true);
       return;
    }
}
