package com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView;
import ml8.d;
import android.widget.RelativeLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Double;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import java.lang.Integer;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import java.lang.Boolean;
import android.widget.SeekBar;
import com.yxcorp.gifshow.v3.widget.roundcornerprogress.BaseRoundCornerProgressBar;
import android.widget.LinearLayout;
import ekd.m1;
import com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar;
import com.yxcorp.gifshow.v3.widget.roundcornerprogress.RoundCornerProgressBar;
import com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView$a;
import com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar$b;
import android.widget.Button;
import axc.b;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.graphics.Typeface;
import jb0.a;
import com.yxcorp.gifshow.v3.widget.EditPreviewPlayControlView$b;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;

public class EditPreviewPlayControlView extends RelativeLayout implements d	// class@001636
{
    public boolean b;
    public EditPreviewProgressBar c;
    public RoundCornerProgressBar d;
    public View e;
    public Button f;
    public boolean g;
    public ViewGroup h;
    public TextView i;
    public TextView j;
    public double k;
    public double l;
    public boolean m;
    public EditPreviewPlayControlView$b n;
    public static final int o;
    public static final int p;

    static {
       EditPreviewPlayControlView.o = a1.e(40.00f);
       EditPreviewPlayControlView.p = a1.e(64.00f);
    }
    public void EditPreviewPlayControlView(Context p0){
       super(p0);
       this.l = 0;
       this.m = false;
       this.b(p0);
    }
    public void EditPreviewPlayControlView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.l = 0;
       this.m = false;
       this.b(p0);
    }
    public void EditPreviewPlayControlView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.l = 0;
       this.m = false;
       this.b(p0);
    }
    public String a(double p0){
       if (PatchProxy.isSupport(EditPreviewPlayControlView.class)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, EditPreviewPlayControlView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = (int)(p0 / 60.00f);
       Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf((int)(p0 - (double)(i * 60)))};
       return String.format(Locale.US, "%02d:%02d", objArray);
    }
    public final void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditPreviewPlayControlView.class, "9")) {
          return;
       }
       this.doBindView(a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0376, this, true));
       return;
    }
    public void c(boolean p0){
       if (PatchProxy.isSupport(EditPreviewPlayControlView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditPreviewPlayControlView.class, "11")) {
          return;
       }
       if (p0) {
          this.d.setProgress(this.c.getProgress());
       }
       EditPreviewPlayControlView tc = this.c;
       int i = 0;
       int i1 = (p0)? 4: 0;
       tc.setVisibility(i1);
       tc = this.d;
       if (!p0) {
          i = 8;
       }
       tc.setVisibility(i);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditPreviewPlayControlView.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a3809);
       this.d = m1.f(p0, 0x7f0a2fc2);
       this.e = m1.f(p0, 0x7f0a38b8);
       this.c.setMax(1000);
       this.d.setMax((float)this.c.getMax());
       this.c.setOnEditPreviewProgressBarListener(new EditPreviewPlayControlView$a(this));
       Button uButton = m1.f(p0, R.id.btn_edit_preview_play_control);
       this.f = uButton;
       uButton.setOnClickListener(new b(this));
       this.h = m1.f(p0, 0x7f0a0c99);
       this.i = m1.f(p0, 0x7f0a4173);
       this.j = m1.f(p0, 0x7f0a4174);
       this.i.setTypeface(a.c(this.getContext()));
       this.j.setTypeface(a.c(this.getContext()));
       return;
    }
    public void setActionButtonHidden(boolean p0){
       if (PatchProxy.isSupport(EditPreviewPlayControlView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditPreviewPlayControlView.class, "4")) {
          return;
       }
       if (p0) {
          this.f.setVisibility(8);
       }else {
          this.f.setVisibility(0);
       }
       return;
    }
    public void setListener(EditPreviewPlayControlView$b p0){
       this.n = p0;
    }
    public void setProgress(double p0){
       if (PatchProxy.isSupport(EditPreviewPlayControlView.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, EditPreviewPlayControlView.class, "3")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       if (!p0 - null) {
          return;
       }
       this.c.setProgress((int)(0x408f400000000000 * p0));
       double d = this.k * p0;
       this.l = d;
       this.i.setText(this.a(d));
       return;
    }
    public void setProgressTextAlwaysShow(boolean p0){
       if (PatchProxy.isSupport(EditPreviewPlayControlView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditPreviewPlayControlView.class, "5")) {
          return;
       }
       this.m = p0;
       if (p0) {
          this.h.setVisibility(0);
       }
       if (this.b == null && this.m == null) {
          this.h.setVisibility(8);
       }
       return;
    }
    public void setProgressTextShowLeft(boolean p0){
       if (PatchProxy.isSupport(EditPreviewPlayControlView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, EditPreviewPlayControlView.class, "7")) {
          return;
       }
       RelativeLayout$LayoutParams layoutParams = this.h.getLayoutParams();
       if (p0) {
          layoutParams.removeRule(14);
          layoutParams.addRule(20);
          layoutParams.leftMargin = a1.d(0x7f07034b);
          layoutParams.bottomMargin = a1.d(0x7f0702da);
       }else {
          layoutParams.removeRule(20);
          layoutParams.addRule(14);
          layoutParams.leftMargin = 0;
          if (this.b == null) {
             layoutParams.bottomMargin = a1.d(0x7f0702ef);
          }
       }
       this.h.setLayoutParams(layoutParams);
       return;
    }
    public void setTotalDuration(double p0){
       if (PatchProxy.isSupport(EditPreviewPlayControlView.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, EditPreviewPlayControlView.class, "8")) {
          return;
       }
       if (!this.k - p0) {
          return;
       }
       this.k = p0;
       this.j.setText(this.a(p0));
       return;
    }
}
