package com.yxcorp.gifshow.darkmode.DayNightSwitchTransitionActivity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import zf6.d;
import java.lang.ref.WeakReference;
import android.view.Window;
import android.view.View;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import android.widget.ImageView;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.view.ViewGroup;
import android.os.Handler;
import vv9.a;
import java.lang.Runnable;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.darkmode.DayNightSwitchTransitionActivity$a;
import android.animation.Animator$AnimatorListener;

public class DayNightSwitchTransitionActivity extends RxFragmentActivity	// class@0012a3
{
    public Bitmap c;

    public void DayNightSwitchTransitionActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, DayNightSwitchTransitionActivity.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DayNightSwitchTransitionActivity.class, "1")) {
          return;
       }
       super.onCreate(p0);
       d uod = d.a();
       d c = uod.c;
       Bitmap uBitmap = null;
       if (c != null && c.get() != null) {
          View decorView = uod.c.get().getWindow().getDecorView();
          View view = decorView.findViewById(0x1020002);
          int width = view.getWidth();
          uBitmap = Bitmap.createBitmap(width, view.getHeight(), Bitmap$Config.RGB_565);
          decorView.draw(new Canvas(uBitmap));
       }
    label_0054 :
       this.c = uBitmap;
       if (uBitmap == null) {
          uod.b();
          this.finish();
          return;
       }else {
          ImageView imageView = new ImageView(this);
          imageView.setImageBitmap(this.c);
          imageView.setScaleType(ImageView$ScaleType.FIT_START);
          this.getWindow().getDecorView().addView(imageView, -1, -2);
          new Handler().postDelayed(new a(uod), 50);
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(imageView, "alpha", new float[2]{0x3f800000,0});
          objectAnimat.setDuration(500);
          objectAnimat.addListener(new DayNightSwitchTransitionActivity$a(this));
          objectAnimat.start();
          return;
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, DayNightSwitchTransitionActivity.class, "2")) {
          return;
       }
       super.onDestroy();
       DayNightSwitchTransitionActivity tc = this.c;
       if (tc != null) {
          tc.recycle();
          this.c = null;
       }
       return;
    }
}
