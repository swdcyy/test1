package com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity;
import android.view.View$OnClickListener;
import ml8.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$a;
import nsd.u;
import android.graphics.Bitmap$CompressFormat;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$mImageView$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$mCropOverlayView$2;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$f;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$d;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.app.Activity;
import lnc.e;
import android.view.View;
import android.widget.TextView;
import ekd.i;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import android.graphics.Bitmap;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import android.os.Parcelable;
import x79.g;
import crd.b;
import gp.a;
import q87.c;
import java.lang.Runnable;
import brd.t;
import x79.m;
import io.reactivex.g;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$h;
import erd.g;
import com.kwai.moved.ks_page.fragment.AttrAnimProgressFragment;
import com.yxcorp.gifshow.imagecrop.NoBackProgressFragment;
import java.lang.CharSequence;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.AlbumKwaiDialogFragment;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import ekd.m1;
import android.widget.ImageView;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.image.KwaiZoomImageView;
import android.view.ViewPropertyAnimator;
import x79.i;
import android.animation.Animator$AnimatorListener;
import android.view.Window;
import android.content.ContentResolver;
import com.albinmathew.photocrop.cropoverlay.CropOverlayView;
import java.lang.Boolean;
import wkd.b;
import j80.c;
import java.io.File;
import java.lang.StringBuilder;
import java.io.IOException;
import kotlin.Result;
import qkd.b;
import qrd.l1;
import qrd.j0;
import android.net.Uri;
import ekd.w0;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$g;
import android.view.View$OnLayoutChangeListener;
import kxa.c$a;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$b;
import android.view.Menu;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;
import java.util.Objects;
import android.view.MenuItem;
import java.io.Closeable;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.gifshow.albumwrapper.ImageCropGifshowActivity$c;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;

public class ImageCropGifshowActivity extends GifshowActivity implements View$OnClickListener, d	// class@001b53
{
    public final p A;
    public final p B;
    public View C;
    public ImageView D;
    public TextView E;
    public View F;
    public String G;
    public Uri H;
    public File I;
    public ContentResolver J;
    public int K;
    public int L;
    public int M;
    public int N;
    public float O;
    public float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public String T;
    public boolean U;
    public final ImageCropGifshowActivity$d U0;
    public NoBackProgressFragment V;
    public final ImageCropGifshowActivity$e V0;
    public final Handler W;
    public HashMap W0;
    public final Runnable X;
    public b Y;
    public g Z;
    public final long y;
    public Bitmap$CompressFormat z;
    public static final String X0;
    public static final int Y0;
    public static final int Z0;
    public static final ImageCropGifshowActivity$a a1;

    static {
       ImageCropGifshowActivity.a1 = new ImageCropGifshowActivity$a(null);
       ImageCropGifshowActivity.X0 = "ImageCropActivity";
       ImageCropGifshowActivity.Y0 = 90;
       ImageCropGifshowActivity.Z0 = 360;
    }
    public void ImageCropGifshowActivity(){
       super();
       this.y = 0x2710;
       this.z = Bitmap$CompressFormat.JPEG;
       this.A = s.c(new ImageCropGifshowActivity$mImageView$2(this));
       this.B = s.c(new ImageCropGifshowActivity$mCropOverlayView$2(this));
       this.K = 1;
       this.L = 1;
       this.O = 0x3f800000;
       this.W = new Handler(Looper.getMainLooper());
       this.X = new ImageCropGifshowActivity$f(this);
       this.U0 = new ImageCropGifshowActivity$d();
       this.V0 = new ImageCropGifshowActivity$e(this);
    }
    public void A3(){
       if (PatchProxy.applyVoid(null, this, ImageCropGifshowActivity.class, "5")) {
          return;
       }
       boolean booleanExtra = this.getIntent().getBooleanExtra("darkTheme", false);
       this.U = booleanExtra;
       int i = -1;
       int i1 = 0x7f103c3c;
       if (booleanExtra) {
          e.a(this, R.drawable.arg_RES_7f080fc4, 0x7f080fc8, i1);
          View view = this.findViewById(R.id.title_root);
          if (view != null) {
             view.setBackgroundColor(0xff000000);
          }
          view = this.findViewById(R.id.root);
          if (view != null) {
             view.setBackgroundColor(0xff000000);
          }
          TextView textView = this.findViewById(R.id.title_tv);
          if (textView != null) {
             textView.setTextColor(i);
          }
          view = this.findViewById(R.id.divider);
          if (view != null) {
             view.setVisibility(8);
          }
          i.i(this, 0xff000000, false, false);
       }else {
          e.a(this, R.drawable.arg_RES_7f080fc3, 0x7f080fc7, i1);
          i.i(this, i, true, false);
       }
       return;
    }
    public final float B3(float p0,float p1){
       if (PatchProxy.isSupport(ImageCropGifshowActivity.class)) {
          Object obj = PatchProxy.applyTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, ImageCropGifshowActivity.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       if (p1 - (float)0 > 0) {
          p0 = Math.min(p0, p1);
       }
       return p0;
    }
    public void C3(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropGifshowActivity.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       Intent intent = this.getIntent();
       a.o(intent, "intent");
       Bundle extras = intent.getExtras();
       if (extras != null) {
          String str = "data";
          if (extras.getParcelable(str) != null || extras.getBoolean("return-data")) {
             ImageCropGifshowActivity tZ = this.Z;
             if (tZ != null && tZ.d(p0)) {
                this.setResult(-1, new Intent().setAction("bitmap.completed"));
                this.finish();
                return;
             }else {
                extras = new Bundle();
                extras.putParcelable(str, p0);
                this.setResult(-1, new Intent().setAction("inline-data").putExtras(extras));
                this.finish();
             label_00db :
                return;
             }
          }
       }
       extras = new Bundle();
       extras.putInt("outputX", p0.getWidth());
       extras.putInt("outputY", p0.getHeight());
       ImageCropGifshowActivity tY = this.Y;
       if (tY != null) {
          a.m(tY);
          if (!tY.isDisposed()) {
             Object[] objArray = new Object[0];
             a.C().t(ImageCropGifshowActivity.X0, "saveCroppedImage not disposed", objArray);
             return;
          }
       }
       this.E3();
       this.W.postDelayed(this.X, this.y);
       t ot = PatchProxy.applyOneRefs(p0, this, ImageCropGifshowActivity.class, "18");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new m(this, p0)).subscribeOn(d.c).observeOn(d.a);
          a.o(ot, "Observable.create<Boolea¡­veOn\(KwaiSchedulers.MAIN\)");
       }
       this.Y = ot.subscribe(new ImageCropGifshowActivity$h(this, p0, extras));
       goto label_00db ;
    }
    public final void D3(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropGifshowActivity.class, "21")) {
          return;
       }
       a.p(p0, "callback");
       this.Z = p0;
       return;
    }
    public final void E3(){
       if (PatchProxy.applyVoid(null, this, ImageCropGifshowActivity.class, "7")) {
          return;
       }
       ImageCropGifshowActivity tV = this.V;
       if (tV != null) {
          a.m(tV);
          tV.dismiss();
          this.V = null;
       }
       NoBackProgressFragment noBackProgre = new NoBackProgressFragment();
       this.V = noBackProgre;
       a.m(noBackProgre);
       noBackProgre.kh("");
       tV = this.V;
       a.m(tV);
       boolean b = false;
       tV.setCancelable(b);
       tV = this.V;
       a.m(tV);
       try{
          tV.ih(b);
          tV = this.V;
          a.m(tV);
          tV.show(this.getSupportFragmentManager(), "loading");
       }catch(java.lang.Exception e0){
          this.V = null;
          e0.printStackTrace();
          ExceptionHandler.handleCaughtException(e0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropGifshowActivity.class, "1")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a1379);
       this.D = m1.f(p0, 0x7f0a1377);
       this.E = m1.f(p0, 0x7f0a1378);
       this.F = m1.f(p0, 0x7f0a1377);
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, ImageCropGifshowActivity.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://image_crop";
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropGifshowActivity.class, "26")) {
          return;
       }
       a.p(p0, "v");
       if (p0.getId() == 0x7f0a3643) {
          this.w3();
          if (!PatchProxy.applyVoid(null, this, ImageCropGifshowActivity.class, "27")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action = 828;
             ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
             urlPackage.page = 187;
             u1.A(urlPackage, "", 1, uElementPack, null);
          }
       }else if(p0.getId() == 0x7f0a1716){
          if (!PatchProxy.applyVoid(null, this, ImageCropGifshowActivity.class, "20")) {
             this.setResult(0, new Intent());
             this.finish();
          }
       }else if(p0.getId() == 0x7f0a1377){
          if (!PatchProxy.applyVoid(null, this, ImageCropGifshowActivity.class, "22")) {
             this.z3().setPivotX((float)(this.z3().getWidth() / 2));
             this.z3().setPivotY((float)(this.z3().getHeight() / 2));
             this.z3().animate().rotationBy((- (float)ImageCropGifshowActivity.Y0)).setListener(new i(this));
             this.z3().o0();
          }
       }else if(p0.getId() != 0x7f0a1378 || PatchProxy.applyVoid(null, this, ImageCropGifshowActivity.class, "25")){
          this.z3().animate().rotationBy(((- this.z3().getRotation()) % (float)ImageCropGifshowActivity.Z0));
          this.z3().setRotation(0);
          this.z3().o0();
       }
       return;
    }
    public void onCreate(Bundle p0){
       CropOverlayView uCropOverlay;
       CropOverlayView uCropOverlay1;
       KwaiZoomImageView kwaiZoomImag;
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropGifshowActivity.class, "4")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(this.x3());
       Window window = this.getWindow();
       a.o(window, "window");
       this.doBindView(window.getDecorView());
       this.J = this.getContentResolver();
       this.A3();
       ImageCropGifshowActivity tD = this.D;
       if (tD != null) {
          tD.setOnClickListener(this);
       }
       tD = this.E;
       if (tD != null) {
          tD.setOnClickListener(this);
       }
       boolean i = -1;
       int intExtra = this.getIntent().getIntExtra("margin_side", i);
       if (intExtra != i) {
          uCropOverlay = this.y3();
          if (uCropOverlay != null) {
             uCropOverlay.setMarginSide(intExtra);
          }
       }
       i = false;
       this.Q = this.getIntent().getBooleanExtra("out_crop_rect", i);
       this.K = this.getIntent().getIntExtra("aspectX", 1);
       this.L = this.getIntent().getIntExtra("aspectY", 1);
       intExtra = this.getIntent().getBooleanExtra("imageReverse", i);
       uCropOverlay = this.y3();
       if (uCropOverlay != null) {
          uCropOverlay.setRectRatio((((float)this.L * 0x3f800000) / (float)this.K));
       }
       ImageCropGifshowActivity tC = this.C;
       if (tC != null) {
          intExtra = (intExtra)? 0: 8;
          tC.setVisibility(intExtra);
       }
       intExtra = PatchProxy.apply(null, this, ImageCropGifshowActivity.class, "11");
       if (intExtra != PatchProxyResult.class) {
          i = intExtra.booleanValue();
       }else {
          intExtra = -1504323719;
          try{
             File uFile = b.a(intExtra).o();
             uFile.mkdirs();
             Object[] objArray = new Object[i];
             a.C().w(ImageCropGifshowActivity.X0, "tmpDir="+uFile+", exist = "+uFile.exists()+", "+"writeable = "+uFile.canWrite()+", readable = "+uFile.canRead(), objArray);
             this.I = File.createTempFile("temp_photo", "jpg", uFile);
             i = true;
          }catch(java.io.IOException e0){
             e0.printStackTrace();
             ExceptionHandler.handleCaughtException(e0);
             String x0 = ImageCropGifshowActivity.X0;
             a.C().e(x0, "createTempFile failed", e0);
             Object[] objArray1 = new Object[i];
             a.C().t(x0, "createTempFile availableSpace = "+b.a(b.a(intExtra).o().getCanonicalPath()), objArray1);
             Result.constructor-impl(l1.a);
          }
       }
    }
    public boolean onCreateOptionsMenu(Menu p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ImageCropGifshowActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "menu");
       return super.onCreateOptionsMenu(p0);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ImageCropGifshowActivity.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w(ImageCropGifshowActivity.X0, "onDestroy", objArray);
       if (this.z3().getDrawable() != null && this.z3().getDrawable() instanceof BitmapDrawable) {
          Drawable drawable = this.z3().getDrawable();
          Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
          Bitmap bitmap = drawable.getBitmap();
          if (bitmap != null && !bitmap.isRecycled()) {
             bitmap.recycle();
          }
       }
       super.onDestroy();
       return;
    }
    public boolean onOptionsItemSelected(MenuItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ImageCropGifshowActivity.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "item");
       if (p0.getItemId() != 0x102002c) {
          return super.onOptionsItemSelected(p0);
       }
       super.onBackPressed();
       return true;
    }
    public void onSaveInstanceState(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropGifshowActivity.class, "12")) {
          return;
       }
       a.p(p0, "savedInstanceState");
       super.onSaveInstanceState(p0);
       p0.putBoolean("restoreState", true);
       return;
    }
    public final void u3(Closeable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImageCropGifshowActivity.class, "19")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.close();
       return;
    }
    public final void v3(){
       if (PatchProxy.applyVoid(null, this, ImageCropGifshowActivity.class, "8")) {
          return;
       }
       ImageCropGifshowActivity tV = this.V;
       if (tV != null) {
          a.m(tV);
          tV.dismiss();
          this.V = null;
       }
       return;
    }
    public final void w3(){
       if (PatchProxy.applyVoid(null, this, ImageCropGifshowActivity.class, "13")) {
          return;
       }
       a.d(ImageRequestBuilder.k(w0.c(new File(this.T))).a(), new ImageCropGifshowActivity$c(this));
       return;
    }
    public int x3(){
       return 0x7f0d06e7;
    }
    public final CropOverlayView y3(){
       Object obj = PatchProxy.apply(null, this, ImageCropGifshowActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public final KwaiZoomImageView z3(){
       Object obj = PatchProxy.apply(null, this, ImageCropGifshowActivity.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.A.getValue();
    }
}
