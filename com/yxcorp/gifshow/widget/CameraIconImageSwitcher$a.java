package com.yxcorp.gifshow.widget.CameraIconImageSwitcher$a;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.widget.CameraIconImageSwitcher;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.ImageView;

public class CameraIconImageSwitcher$a extends AnimatorListenerAdapter	// class@0017fc
{
    public final View a;
    public final View b;
    public final boolean c;
    public final boolean d;
    public final CameraIconImageSwitcher e;

    public void CameraIconImageSwitcher$a(CameraIconImageSwitcher p0,View p1,View p2,boolean p3,boolean p4){
       this.e = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraIconImageSwitcher$a.class, "2")) {
          return;
       }
       CameraIconImageSwitcher$a te = this.e;
       Objects.requireNonNull(te);
       if (!PatchProxy.applyVoid(null, te, CameraIconImageSwitcher.class, "15")) {
          CameraIconImageSwitcher q = te.q;
          if (q != null) {
             te.i.U(q);
          }
          q = te.r;
          if (q != null) {
             te.k.U(q);
          }else {
             te.k.setVisibility(8);
          }
       }
       if (this.c != null && this.d == null) {
          this.b.setAlpha(0);
          this.b.setVisibility(8);
          this.a.setAlpha(0x3f800000);
          this.a.setVisibility(0);
       }
       if (this.d != null) {
          this.e.n.setVisibility(8);
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CameraIconImageSwitcher$a.class, "1")) {
          return;
       }
       this.a.setVisibility(0);
       this.b.setVisibility(0);
       return;
    }
}
