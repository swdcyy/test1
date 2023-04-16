package com.yxcorp.gifshow.v3.widget.EditPreviewControllerView;
import ml8.d;
import tyc.a2;
import android.widget.FrameLayout;
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
import ekd.m1;
import com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar;
import android.widget.SeekBar;
import com.yxcorp.gifshow.v3.widget.EditPreviewControllerView$a;
import com.yxcorp.gifshow.v3.widget.EditPreviewProgressBar$b;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.widget.EditPreviewControllerView$b;
import android.os.Build$VERSION;
import java.lang.CharSequence;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.util.Objects;

public class EditPreviewControllerView extends FrameLayout implements d, a2	// class@001633
{
    public boolean b;
    public EditPreviewProgressBar c;
    public ViewGroup d;
    public TextView e;
    public TextView f;
    public double g;
    public double h;
    public int i;
    public EditPreviewControllerView$b j;

    public void EditPreviewControllerView(Context p0){
       super(p0);
       this.h = 0;
       this.i = 0;
       this.b(p0);
    }
    public void EditPreviewControllerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.h = 0;
       this.i = 0;
       this.b(p0);
    }
    public void EditPreviewControllerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.h = 0;
       this.i = 0;
       this.b(p0);
    }
    public String a(double p0){
       if (PatchProxy.isSupport(EditPreviewControllerView.class)) {
          Object obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, EditPreviewControllerView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = (int)(p0 / 60.00f);
       Object[] objArray = new Object[]{Integer.valueOf(i),Integer.valueOf((int)(p0 - (double)(i * 60)))};
       return String.format(Locale.US, "%02d:%02d", objArray);
    }
    public final void b(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditPreviewControllerView.class, "2")) {
          return;
       }
       this.doBindView(a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0375, this, true));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditPreviewControllerView.class, "1")) {
          return;
       }
       EditPreviewProgressBar uEditPreview = m1.f(p0, R.id.seek_bar);
       this.c = uEditPreview;
       uEditPreview.setMax(100);
       this.c.setOnEditPreviewProgressBarListener(new EditPreviewControllerView$a(this));
       this.d = m1.f(p0, 0x7f0a0c99);
       this.e = m1.f(p0, 0x7f0a4173);
       this.f = m1.f(p0, 0x7f0a4174);
       return;
    }
    public int getLevel(){
       return 10;
    }
    public double getTotalDuration(){
       return this.g;
    }
    public boolean i(){
       return false;
    }
    public void setListener(EditPreviewControllerView$b p0){
       this.j = p0;
    }
    public void setProgress(double p0){
       if (PatchProxy.isSupport(EditPreviewControllerView.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, EditPreviewControllerView.class, "5")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       if (!p0) {
          return;
       }
       double d = 100.00f;
       if (Build$VERSION.SDK_INT >= 24) {
          this.c.setProgress((int)(d * p0), true);
       }else {
          this.c.setProgress((int)(d * p0));
       }
       double d1 = this.g * p0;
       this.h = d1;
       this.e.setText(this.a(d1));
       return;
    }
    public void setTotalDuration(double p0){
       if (PatchProxy.isSupport(EditPreviewControllerView.class) && PatchProxy.applyVoidOneRefs(Double.valueOf(p0), this, EditPreviewControllerView.class, "4")) {
          return;
       }
       if (!this.g - p0) {
          return;
       }
       this.g = p0;
       this.f.setText(this.a(p0));
       return;
    }
    public boolean t(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EditPreviewControllerView obj = PatchProxy.applyOneRefs(p0, this, EditPreviewControllerView.class, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.c;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, EditPreviewProgressBar.class, "2");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          obj.e = true;
          boolean b1 = obj.onTouchEvent(p0);
          b = (!p0.getAction())? false: b1;
       }
       return b;
    }
}
