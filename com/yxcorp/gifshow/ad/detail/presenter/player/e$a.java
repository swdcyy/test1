package com.yxcorp.gifshow.ad.detail.presenter.player.e$a;
import com.kwai.library.widget.imageview.scale.ScaleHelpView$a;
import com.yxcorp.gifshow.ad.detail.presenter.player.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;
import android.view.MotionEvent;
import java.lang.Boolean;
import com.facebook.drawee.view.DraweeView;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.ad.detail.presenter.player.e$b;
import android.widget.ImageView;
import uh5.e;
import ekd.y0;
import android.os.Looper;
import d19.f;
import java.lang.Runnable;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;

public class e$a implements ScaleHelpView$a	// class@001679
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "4")) {
          return;
       }
       this.a.s.getLocationOnScreen(p0);
       p0[2] = this.a.s.getMeasuredWidth();
       p0[3] = this.a.s.getMeasuredHeight();
       return;
    }
    public void b(MotionEvent p0,boolean p1){
       e$a uoa = e$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (!p1) {
          this.a.r.onTouchEvent(p0);
       }
       return;
    }
    public void c(MotionEvent p0){
       e$a ta;
       e uoe = e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (this.a.u.isImageType()) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(objArray, ta, uoe, "3")) {
             RxBus.f.b(new e$b(false));
             ta.r.setVisibility(8);
          }
       }else if(e.f()){
          this.a.p.setBackgroundColor(0xff000000);
       }else {
          this.a.p.setBackgroundColor(-1);
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, uoe, "7")) {
          if (ta.t == null) {
             ta.t = new y0(Looper.getMainLooper(), 33, new f(ta));
          }
          ta.t.d();
       }
       return;
    }
    public void d(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "3")) {
          return;
       }
       if (this.a.u.isImageType()) {
          e$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, e.class, "4")) {
             RxBus.f.b(new e$b(true));
             ta.r.setVisibility(0);
          }
       }else {
          this.a.p.setBackgroundColor(0);
          this.a.R8();
       }
       return;
    }
    public Bitmap getBitmap(){
       Object obj = PatchProxy.apply(null, this, e$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.P8();
    }
}
