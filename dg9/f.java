package dg9.f;
import com.kwai.camerasdk.render.VideoViewListener;
import in6.b;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.base.d;
import dg9.b;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import in6.a;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.camerasdk.q;
import android.content.Context;
import android.view.View;
import com.kwai.camerasdk.videoCapture.cameras.FlashController$FlashMode;
import com.kwai.camerasdk.videoCapture.cameras.FlashController;
import lnc.s6;
import com.yxcorp.gifshow.widget.textview.TextImageView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import pi9.i;
import android.widget.ImageView;
import dg9.a;
import android.view.View$OnClickListener;
import wd9.a;
import tg9.b;
import dg9.d;
import java.lang.Runnable;
import dg9.e;
import java.lang.Integer;
import android.content.Intent;
import ji9.b;
import dg9.c;
import erd.g;
import crd.b;

public class f extends d0 implements VideoViewListener, b	// class@001f32
{
    public View o;
    public View p;
    public boolean q;

    public void f(CameraPageType p0,b p1){
       super(p0, p1);
       this.q = false;
       this.d.n(b.class, new b(this));
    }
    public int O0(){
       return a.c(this);
    }
    public int R(){
       return 0x7f0d0172;
    }
    public int T(){
       return a.a(this);
    }
    public int Y0(){
       return 7;
    }
    public int a1(){
       return a.b(this);
    }
    public final void g2(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "9")) {
          return;
       }
       d th = this.h;
       if (th != null && th.M()) {
          if (!this.h.N(this.e)) {
             this.p.setSelected(false);
             this.h2(false);
          }else {
             boolean b = true;
             this.h2(b);
             if (p0) {
                this.p.setSelected(b);
                this.h.setFlashMode(FlashController$FlashMode.FLASH_MODE_TORCH);
             }else {
                this.p.setSelected(false);
                this.h.setFlashMode(FlashController$FlashMode.FLASH_MODE_OFF);
             }
          }
       }
       return;
    }
    public final void h2(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "8")) {
          return;
       }
       this.p.setEnabled(p0);
       return;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       super.k(p0);
       this.o = p0.findViewById(0x7f0a0614);
       this.p = p0.findViewById(0x7f0a05c7);
       if (s6.m()) {
          f tp = this.p;
          if (tp instanceof TextImageView) {
             tp.setTopDrawable(a1.f(R.drawable.arg_RES_7f08042f));
             i.b(this.p);
          }else if(tp instanceof ImageView){
             tp.setImageResource(R.drawable.arg_RES_7f08042f);
          }
       }
       this.o.setOnClickListener(new a(this));
       if (this.d.d(a.i).a != null) {
          this.o.setVisibility(8);
       }else {
          this.d.j().addView(this.p);
       }
       this.b2(new d(this));
       return;
    }
    public void nb(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       super.nb(p0);
       this.b2(new e(this, p0));
       return;
    }
    public void onPreviewSizeChange(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, f.class, "6")) {
          return;
       }
       this.g2(false);
       return;
    }
    public void t1(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       d th = this.h;
       if (th == null) {
          return;
       }
       boolean b = (th.getFlashMode() == FlashController$FlashMode.FLASH_MODE_TORCH)? true: false;
       this.g2(b);
       return;
    }
    public void w(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       this.g2(false);
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.w1(p0);
       this.d.l(b.class, new c(this));
       return;
    }
}
