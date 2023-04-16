package com.kuaishou.live.entry.photoalbum.LiveEntryCoverCropActivity$b;
import java.lang.Runnable;
import com.kuaishou.live.entry.photoalbum.LiveEntryCoverCropActivity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.a1;
import android.widget.TextView;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import com.kuaishou.live.core.show.photoalbum.cropper.CropImageView;
import android.widget.FrameLayout;

public final class LiveEntryCoverCropActivity$b implements Runnable	// class@001b65
{
    public final LiveEntryCoverCropActivity b;

    public void LiveEntryCoverCropActivity$b(LiveEntryCoverCropActivity p0){
       this.b = p0;
       super();
    }
    public final void run(){
       TextView textView1;
       if (PatchProxy.applyVoid(null, this, LiveEntryCoverCropActivity$b.class, "1")) {
          return;
       }
       if (!this.b.z3()) {
          return;
       }
       LiveEntryCoverCropActivity$b tb = this.b;
       int i = (n.x(this.b) * tb.G) / tb.H;
       int i1 = 0x7f070634;
       TextView textView = this.b.w3();
       a.m(textView);
       int i2 = (a1.d(i1) + a1.d(0x7f070633)) + textView.getHeight();
       textView = this.b.w3();
       a.m(textView);
       ViewGroup$LayoutParams layoutParams = textView.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       CropImageView uCropImageVi = this.b.v3();
       a.m(uCropImageVi);
       ViewGroup$LayoutParams layoutParams1 = uCropImageVi.getLayoutParams();
       Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
       CropImageView uCropImageVi1 = this.b.v3();
       a.m(uCropImageVi1);
       if ((uCropImageVi1.getHeight() - i) < (i2 * 2)) {
          layoutParams.topMargin = a1.d(i1);
          layoutParams1.topMargin = i2;
       }else {
          CropImageView uCropImageVi3 = this.b.v3();
          a.m(uCropImageVi3);
          textView1 = this.b.w3();
          a.m(textView1);
          layoutParams.topMargin = (((uCropImageVi3.getHeight() - i) / 2) - textView1.getHeight()) - a1.d(0x7f070633);
          layoutParams1.topMargin = 0;
       }
       textView1 = this.b.w3();
       a.m(textView1);
       textView1.setVisibility(0);
       textView1 = this.b.w3();
       a.m(textView1);
       textView1.setLayoutParams(layoutParams);
       CropImageView uCropImageVi2 = this.b.v3();
       a.m(uCropImageVi2);
       uCropImageVi2.setLayoutParams(layoutParams1);
       return;
    }
}
