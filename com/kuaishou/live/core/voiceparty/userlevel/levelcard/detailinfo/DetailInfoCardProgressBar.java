package com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import android.widget.TextView;
import d61.f0;
import java.lang.Float;
import com.kuaishou.live.core.voiceparty.userlevel.levelcard.detailinfo.DetailInfoCardProgressBar$a;
import java.lang.Runnable;
import java.lang.Integer;
import ekd.r;
import ox2.a;
import android.graphics.drawable.Drawable;

public final class DetailInfoCardProgressBar extends ConstraintLayout	// class@001aad
{
    public View B;
    public KwaiImageView C;
    public KwaiImageView D;
    public ImageView E;
    public ImageView F;
    public TextView G;
    public TextView H;
    public ConstraintLayout I;
    public float J;
    public HashMap K;

    public void DetailInfoCardProgressBar(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void DetailInfoCardProgressBar(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void DetailInfoCardProgressBar(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       if (PatchProxy.applyVoidOneRefs(p0, this, DetailInfoCardProgressBar.class, "1")) {
       }else {
          View view = a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0e5e, this, true);
          a.o(view, "LayoutInflater.from\(cont¡­,\n      this,\n      true\)");
          this.B = view;
          view = this.getRootView().findViewById(R.id.left_badge_icon);
          a.o(view, "rootView.findViewById\(R.id.left_badge_icon\)");
          this.C = view;
          view = this.getRootView().findViewById(R.id.right_badge_icon);
          a.o(view, "rootView.findViewById\(R.id.right_badge_icon\)");
          this.D = view;
          view = this.getRootView().findViewById(R.id.left_progress);
          a.o(view, "rootView.findViewById\(R.id.left_progress\)");
          this.E = view;
          view = this.getRootView().findViewById(R.id.right_progress);
          a.o(view, "rootView.findViewById\(R.id.right_progress\)");
          this.F = view;
          view = this.getRootView().findViewById(R.id.current_exp);
          a.o(view, "rootView.findViewById\(R.id.current_exp\)");
          this.G = view;
          view = this.getRootView().findViewById(R.id.target_exp);
          a.o(view, "rootView.findViewById\(R.id.target_exp\)");
          this.H = view;
          view = this.getRootView().findViewById(R.id.progress_container);
          a.o(view, "rootView.findViewById\(R.id.progress_container\)");
          this.I = view;
          DetailInfoCardProgressBar tG = this.G;
          if (tG == null) {
             a.S("currentExpTextView");
          }
          f0.i(tG, p0);
          tG = this.H;
          if (tG == null) {
             a.S("targetExpTextView");
          }
          f0.i(tG, p0);
       }
       return;
    }
    public void DetailInfoCardProgressBar(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public static final ImageView L(DetailInfoCardProgressBar p0){
       p0 = p0.E;
       if (p0 == null) {
          a.S("leftProgressImageView");
       }
       return p0;
    }
    public static final ConstraintLayout M(DetailInfoCardProgressBar p0){
       p0 = p0.I;
       if (p0 == null) {
          a.S("progressContainer");
       }
       return p0;
    }
    public final float getScale(){
       return this.J;
    }
    public final void setProgress(float p0){
       if (PatchProxy.isSupport(DetailInfoCardProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, DetailInfoCardProgressBar.class, "2")) {
          return;
       }
       if (p0 - (float)0 < 0) {
          p0 = 0;
       }
       this.post(new DetailInfoCardProgressBar$a(this, p0));
       return;
    }
    public final void setScale(float p0){
       this.J = p0;
    }
    public final void setThemeColor(int p0){
       a a;
       if (PatchProxy.isSupport(DetailInfoCardProgressBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, DetailInfoCardProgressBar.class, "3")) {
          return;
       }
       int i = r.d((int)102.00f, p0);
       DetailInfoCardProgressBar tE = this.E;
       if (tE == null) {
          a.S("leftProgressImageView");
       }
       a = a.a;
       tE.setImageDrawable(a.b(a, p0, 0, 2, null));
       tE = this.F;
       if (tE == null) {
          a.S("rightProgressImageView");
       }
       tE.setImageDrawable(a.b(a, i, 0, 2, null));
       DetailInfoCardProgressBar tG = this.G;
       if (tG == null) {
          a.S("currentExpTextView");
       }
       tG.setBackground(a.b(a, p0, 0, 2, null));
       tG = this.H;
       if (tG == null) {
          a.S("targetExpTextView");
       }
       tG.setTextColor(p0);
       return;
    }
}
