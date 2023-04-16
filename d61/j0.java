package d61.j0;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import d61.j0$a;
import android.view.ViewOutlineProvider;
import java.lang.Integer;
import android.view.ViewParent;
import d61.j0$b;
import java.lang.Runnable;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import android.view.View$MeasureSpec;
import java.lang.StringBuilder;
import k2b.u1;
import android.graphics.Bitmap$Config;
import java.lang.Math;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import lnc.a1;
import android.view.Window;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.app.Dialog;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class j0	// class@001f26
{

    public void j0(){
       super();
    }
    public static void a(View p0,float p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), null, oj0, "3")) {
          return;
       }
       p0.setClipToOutline(true);
       p0.setOutlineProvider(new j0$a(p1));
       return;
    }
    public static void b(View p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oj0, "9")) {
          return;
       }
       View parent = p0.getParent();
       parent.post(new j0$b(p0, p1, parent));
       return;
    }
    public static Bitmap c(View p0,float p1){
       Bitmap uBitmap;
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Float.valueOf(p1), null, oj0, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       p0.measure(View$MeasureSpec.makeMeasureSpec(i, i), View$MeasureSpec.makeMeasureSpec(i, i));
       int measuredHeig = p0.getMeasuredHeight();
       int measuredWidt = p0.getMeasuredWidth();
       if (measuredWidt > (measuredHeig * 5)) {
          u1.R("FansGroupGetDrawable", "bitmapWidth: "+measuredWidt, 3);
          return Bitmap.createBitmap(1, 1, Bitmap$Config.ARGB_8888);
       }else if(!p1 - 0x3f800000){
          uBitmap = Bitmap.createBitmap(measuredWidt, measuredHeig, Bitmap$Config.ARGB_8888);
       }else {
          uBitmap = Bitmap.createBitmap((int)Math.ceil((double)((float)measuredWidt * p1)), (int)Math.ceil((double)((float)measuredHeig * p1)), Bitmap$Config.ARGB_8888);
       }
       Canvas uCanvas = new Canvas(uBitmap);
       uCanvas.scale(p1, p1);
       p0.layout(i, i, p0.getMeasuredWidth(), p0.getMeasuredHeight());
       p0.draw(uCanvas);
       return uBitmap;
    }
    public static BitmapDrawable d(View p0){
       BitmapDrawable uBitmapDrawa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       j0 oj0 = j0.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, oj0, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (PatchProxy.isSupport(oj0)) {
          uBitmapDrawa = PatchProxy.applyTwoRefs(p0, Float.valueOf(0x3f800000), null, oj0, "2");
          if (uBitmapDrawa != patchProxyRe) {
          }else {
          label_0027 :
             Bitmap uBitmap = j0.c(p0, 0x3f800000);
             uBitmapDrawa = (uBitmap.getWidth() == 1)? new BitmapDrawable(uBitmap): new BitmapDrawable(a1.m(), uBitmap);
          }
       }else {
          goto label_0027 ;
       }
       return uBitmapDrawa;
    }
    public static void e(Window p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j0.class, "8")) {
          return;
       }
       int i = 3846;
       try{
          p0.getDecorView().setSystemUiVisibility(i);
       }catch(java.lang.Exception e3){
          ExceptionHandler.handleCaughtException(e3);
       }
       return;
    }
    public static void f(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j0.class, "7")) {
          return;
       }
       try{
          if (p0 != null && p0.isShowing()) {
             p0.dismiss();
          }
       }catch(java.lang.Exception e3){
          b.I(LiveLogTag.LIVE_EXCEPTION, "dismissDialog", e3);
       }
       return;
    }
    public static void g(KwaiDialogFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j0.class, "6")) {
          return;
       }
       try{
          if (p0 != null && (p0.isAdded() && p0.getFragmentManager() != null)) {
             p0.dismissAllowingStateLoss();
          }
       }catch(java.lang.Exception e3){
          b.I(LiveLogTag.LIVE_EXCEPTION, "dismissDialog", e3);
       }
       return;
    }
    public static void h(View p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oj0, "13")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams instanceof ViewGroup$MarginLayoutParams && layoutParams.bottomMargin != p1) {
          layoutParams.bottomMargin = p1;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public static void i(View p0,int p1){
       j0 oj0 = j0.class;
       if (PatchProxy.isSupport(oj0) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), null, oj0, "12")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams.height != p1) {
          layoutParams.height = p1;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
}
